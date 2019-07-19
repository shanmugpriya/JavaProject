import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.sql.*;
public class TrackedInfoPage extends JFrame{
	private static final long serialVersionUID = 1L;
	PreparedStatement ps;
	Connection con;
	ResultSet rs;
	Statement st;
	JLabel l1;
	static String username="";
	static int password=0;
    JLabel lb, lb1, lb2, lb3, lb4,lb5,lb6,lb7,lbTotal,lb8;
    JTextField tf1, tf2, tf3, tf4,tf5,tf6,tf7,tf8;
    
    public static void setValues(String user,int usn)
    {
    	username = user;
    	password = usn;
    }
    TrackedInfoPage() {
        super("Student Information");
 
        lb = new JLabel("View of Student Details ");
        lb.setBounds(35, 55, 435,60);
        lb.setForeground(Color.black);
        lb.setFont(new Font("Gabriola", Font.BOLD, 35));
       
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        lb1 = new JLabel("Usn:");
        lb1.setBounds(50, 105, 100, 20);
        tf1 = new JTextField(50);
        tf1.setBounds(160, 105, 100, 20);
        
        lb2 = new JLabel("Name:");
        lb2.setBounds(50, 135, 100, 20);
        tf2 = new JTextField(100);
        tf2.setBounds(160, 135, 200, 20);
        
        lb3 = new JLabel("Gender:");
        lb3.setBounds(50, 165, 100, 20);
        tf3 = new JTextField(50);
        tf3.setBounds(160, 165, 100, 20);
        
        lb4 = new JLabel("Student Contact Number:");
        lb4.setBounds(50, 200, 100, 20);
        tf4 = new JTextField(50);
        tf4.setBounds(160, 200, 100, 20);
        
        lb5 = new JLabel("Email Id:");
        lb5.setBounds(50, 235, 100, 20);
        tf5 = new JTextField(50);
        tf5.setBounds(160, 235, 200, 20);
        
        lb6 = new JLabel("House Address:");
        lb6.setBounds(50, 265, 100, 20);
        tf6 = new JTextField(50);
        tf6.setBounds(160, 265, 350, 20);
        
        lb7 = new JLabel("Status:");
        lb7.setBounds(50, 300, 100, 20);
        tf7 = new JTextField(50);
        tf7.setBounds(160, 300, 100, 20);
        
        setLayout(null);
        add(lb);
        
        add(lb1);
        add(tf1);
        
        add(lb2);
        add(tf2);
        
        add(lb3);
        add(tf3);
        
        add(lb4);
        add(tf4);
      
        add(lb5);
        add(tf5);
        add(lb6);
        add(tf6);
        add(lb7);
        add(tf7);
        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        
        tf4.setEditable(false);
       
       tf5.setEditable(false);
        tf6.setEditable(false);
        tf7.setEditable(false);
      
        try {
            String stat = "";
            System.out.println("value of username "+username);
            System.out.println("value of usn ="+password);
            Connection con = DatabaseConnection.getConnection();
            String sql = "select * from student where name='"+username+"' and usn="+password+" ";
           System.out.println("value of test "+sql);
           Statement st = con.createStatement();
            
            int total =0;
            String passType ="";
            ResultSet rs = st.executeQuery(sql);
            while (rs!=null && rs.next()) {
                Integer s = rs.getInt("Usn");
                String sr = s.toString();
                String s1 = rs.getString("name");
                String s2 = rs.getString("gender");
                long s3 = rs.getLong("student_contact_number");
                String s4 = rs.getString("email_id");
                String s5 = rs.getString("house_address");
                String studentCat = rs.getString("Student_Category");
                passType = rs.getString("Pass_Type");
                Integer s6 = rs.getInt("pass_status");
         
                String statusSql = "select pass_status from pass_status where pid="+s6;
                Statement st1 = con.createStatement();
                
               
                ResultSet rsStatus = st1.executeQuery(statusSql); 
                while (rsStatus!=null && rsStatus.next()) {
                   stat = rsStatus.getString("pass_status");
                 }
               
                PreparedStatement st2 = con.prepareStatement(" select monthly,yearly from studpass where student_category=?");
                st2.setString(1,studentCat);
               
                ResultSet rsStudentPass = st2.executeQuery(); 
                while (rsStudentPass!=null && rsStudentPass.next()) {
                	System.out.println("studentCat            "+studentCat);
                	
                	if(passType.equals("Monthly"))
                	{
                		total = rsStudentPass.getInt("monthly");
                	}
                	else
                	{
                		total = rsStudentPass.getInt("yearly");
                	}
                	System.out.println("total            "+total);
                 }
                
                tf1.setText(sr);
                tf2.setText(s1);
                tf3.setText(s2);
                tf4.setText(s3+"");
                tf5.setText(s4);
                tf6.setText(s5);
                tf7.setText(stat);
               
            }
            
            if(stat!=null && stat.equals("Approved"))
            {
            	 lb8 = new JLabel("Your "+passType+" pass amount is:");
                 lb8.setBounds(100, 350, 200, 60);
                 lb8.setForeground(Color.blue);
                 tf8 = new JTextField(50);
                 tf8.setBounds(300, 370, 100, 20);
                 
                 add(lb8);
                 add(tf8);
                 tf8.setText(total+"");
                 tf8.setEditable(false);
                 
                 JButton b = new JButton("Proceed");
                 b.setBounds(80, 400, 100, 30);
                 b.addActionListener(new ActionListener() {
     				public void actionPerformed(ActionEvent e) {
     					payment window = new payment();
     					window.setVisible(true);
     					dispose();
     					
     				}
     			});
                 
                 add(b);
                 
                 add(lbTotal);
      
            }
        } 
        
        
        catch (Exception ex) {
            System.out.println(ex);
        }
        
        JButton btnNewButton = new JButton("Click Here!!");
		btnNewButton.setFont(new Font("Microsoft Himalaya", Font.BOLD, 28));
    }

 
    public static void main(String args[]) {
        new TrackedInfoPage();
    }
    
    
    
 public static void main()
 {
	
 }
}
