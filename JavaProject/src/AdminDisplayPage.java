import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public final class AdminDisplayPage extends JPanel 
{
	private static final long serialVersionUID = 1L;

public AdminDisplayPage() {
	 super(new CardLayout());
	 Connection con = null;
	ResultSet rs;
	Statement st=null;
	 int rows = 0;
	Object data1[][]=new Object[rows][15];
	
	 Object[] columnNames={"usn","student_category","name","gender",
			 "dob", "student_contact_number", "email_id", "house_address", "institute_address", "from_loc", "transit_loc", "to_loc", "pass_type","pass_status","Button"};
	try{
		
		con = DatabaseConnection.getConnection();
		

	st = con.createStatement ();



    rs=st.executeQuery("select usn,student_category,name,gender,dob,student_contact_number,email_id,house_address,institute_address,from_loc,transit_loc,to_loc,pass_type,pass_status from student");
	while(rs!=null && rs.next())
	{
	  rows++;
	
	}  
	
		data1=new Object[rows][15];
		
		 rs=st.executeQuery("select usn,student_category,name,gender,dob,student_contact_number,email_id,house_address,institute_address,from_loc,transit_loc,to_loc,pass_type,pass_status from student");
		
		for(int i1=0;i1<rows;i1++)
		{
			
				rs.next();
			    for(int j1=0;j1<15;j1++)
				{
			    	if(j1==13)
			    	{
			    		int status_id = rs.getInt(j1+1);
			    		if(status_id==1)
			    			{
			    			data1[i1][j1]="Pending";
			    			}
			    		else if(status_id==2)
			    		{
			    			data1[i1][j1]="Approved";
			    		}
			    		else if(status_id==3)
			    		{
			    			data1[i1][j1]="Rejected";
			    		}
			    		
			    	}
			    	else if(j1==14)
			    		{
			    		
						data1[i1][j1] = 0;
			    		}
			    	else
			    	{
						data1[i1][j1]=rs.getString(j1+1);
			    	}
					
				}
					
				
		}
	}
		catch(Exception e)
		{
			
		}
		System.out.println("kkkkkkkk ");
    DefaultTableModel model = new DefaultTableModel(data1, columnNames) {
		private static final long serialVersionUID = 1L;

	@Override public Class<?> getColumnClass(int column) {
        return getValueAt(0, column).getClass();
      }
      
    };
    JTable table = new JTable(model) {
		private static final long serialVersionUID = 1L;

	@Override public void updateUI() {
        super.updateUI();
        setRowHeight(35);
        setAutoCreateRowSorter(true);

        TableColumn column = getColumnModel().getColumn(14);
        column.setCellRenderer(new ButtonsRenderer());
        column.setCellEditor(new ButtonsEditor(this));
      }
    };

    add(new JScrollPane(table));
    setPreferredSize(new Dimension(2500, 500));
  }
  
 

  public static void main(String... args) {
	    EventQueue.invokeLater(new Runnable() {
	      @Override public void run() {
	       createAndShowGui();
	      }
	    });
	  }

  public static void createAndShowGui() {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
      ex.printStackTrace();
    }
  
    JFrame frame = new JFrame("StudentBusPassDetails");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new AdminDisplayPage());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class ButtonsPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public final List<JButton> buttons = Arrays.asList(new JButton("Approve"), new JButton("Reject"));

	  protected ButtonsPanel() {
	    super();
	    setOpaque(true);
	    for (JButton b: buttons) {
	      b.setFocusable(false);
	      b.setRolloverEnabled(false);
	      add(b);
	    }
	  }
	}

class ButtonsRenderer implements TableCellRenderer {
  private final ButtonsPanel panel = new ButtonsPanel() {
	private static final long serialVersionUID = 1L;

	@Override public void updateUI() {
      super.updateUI();
      setName("Table.cellRenderer");
    }
  };

  @Override public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    panel.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
    return panel;
  }
}

class ViewAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
private final JTable table;

  protected ViewAction(JTable table) {
    super("Approve");
    this.table = table;
  }

  @Override public void actionPerformed(ActionEvent e) {
	  int row = table.convertRowIndexToModel(table.getEditingRow());
	    Object userName = table.getModel().getValueAt(row, 2);
	    Object emailId = table.getModel().getValueAt(row, 6);
	    Object usn = table.getModel().getValueAt(row, 0);
	    String stringusn = usn.toString();
	    int i =Integer.parseInt(stringusn);
    JOptionPane.showMessageDialog(table, "Approved"+userName+","+emailId);
    ViewAction.updateStatus(i);
    ViewAction.mailSending(emailId.toString(), userName.toString());
  }
  
  public static void updateStatus(int usn)
  {
	  Connection con=null;
	  try{
			con = DatabaseConnection.getConnection();
			 String sql="update student set pass_status = 2 where usn="+usn;
			 PreparedStatement ps = con.prepareStatement(sql);
			 ps.executeUpdate();
	}catch(Exception e){e.printStackTrace();}

	 
  }
  
  public static void mailSending(String reciever,String user)
	 {
		
		 String subject="Bus Pass Registration";
		 String sender="transit.passapp@gmail.com";
		 String password="transit123#";
		 String message = "Hello "+user+" !!\r\n" + 
		 		"Your Registration form has been approved.\r\n" + 
		 		"Please proceed for payment by\r\n" + 
		 		"Clicking  on Track Student Pass in the website\r\n" + 
		 		"Username(your name)\r\n" + 
		 		"Password(your id)\r\n" + 
		 		"Thank You!!";
	     Mailer.send(sender,password,reciever,subject,message);
	 }
}

class EditAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
private final JTable table;

  protected EditAction(JTable table) {
    super("Reject");
    this.table = table;
  }

  @Override public void actionPerformed(ActionEvent e) {
    int row = table.convertRowIndexToModel(table.getEditingRow());
    
    Object userName = table.getModel().getValueAt(row, 2);
    Object emailId = table.getModel().getValueAt(row, 6);
    Object usn = table.getModel().getValueAt(row, 0);
    String stringusn = usn.toString();
    int i =Integer.parseInt(stringusn);
	JOptionPane.showMessageDialog(table, "Rejected"+userName+","+emailId);
	EditAction.updateStatus(i);
	EditAction.mailSending(emailId.toString(), userName.toString());
  }
  
  public static void updateStatus(int usn)
  {
	  Connection con=null;
	  try{
			con = DatabaseConnection.getConnection();
			 String sql="update student set pass_status = 3 where usn="+usn;
			 PreparedStatement ps = con.prepareStatement(sql);
			 ps.executeUpdate();
	}catch(Exception e){e.printStackTrace();}

	 
  }
  
  public static void mailSending(String reciever,String user)
	 {
		
		 String subject="Bus Pass Registration";
		 String sender="transit.passapp@gmail.com";
		 String password="transit123#";
		 String message = "Hello "+user+" !!\r\n" + 
		 		"Your Registration form has been Rejected.\r\n" + 
		 		"Please register once again. \r\n" + 
		 		"Thank You!!";
	     Mailer.send(sender,password,reciever,subject,message);
	 }
}
class ButtonsEditor extends AbstractCellEditor implements TableCellEditor {
	private static final long serialVersionUID = 1L;
protected final ButtonsPanel panel = new ButtonsPanel();
  protected final JTable table;

  private class EditingStopHandler extends MouseAdapter implements ActionListener {
    @Override public void mousePressed(MouseEvent e) {
      Object o = e.getSource();
      if (o instanceof TableCellEditor) {
        actionPerformed(null);
      } else if (o instanceof JButton) {
        ButtonModel m = ((JButton) e.getComponent()).getModel();
        if (m.isPressed() && table.isRowSelected(table.getEditingRow()) && e.isControlDown()) {
          panel.setBackground(table.getBackground());
        }
      }
    }

    @Override public void actionPerformed(ActionEvent e) {
      EventQueue.invokeLater(() -> fireEditingStopped());
    }
  }

  protected ButtonsEditor(JTable table) {
    super();
    this.table = table;
    panel.buttons.get(0).setAction(new ViewAction(table));
    panel.buttons.get(1).setAction(new EditAction(table));

    EditingStopHandler handler = new EditingStopHandler();
    for (JButton b: panel.buttons) {
      b.addMouseListener(handler);
      b.addActionListener(handler);
    }
    panel.addMouseListener(handler);
  }

  @Override public Component getTableCellEditorComponent(JTable tbl, Object value, boolean isSelected, int row, int column) {
    panel.setBackground(tbl.getSelectionBackground());
    return panel;
  }

  @Override public Object getCellEditorValue() {
    return "";
  }
}

