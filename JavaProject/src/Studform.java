	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	
	import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
	import javax.swing.JTextField;
	import javax.swing.JRadioButton;
	import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.awt.event.ActionEvent;
	import com.toedter.calendar.JDateChooser;
import java.awt.Color;
	
	public class Studform extends JFrame implements ActionListener {
		private static final long serialVersionUID = 1L;
		
		 private JPanel contentPane;
		private JTextField textField_4;
		private JTextField textField_7;
		private JTextField textField_8; 
		private JTextField textField_9;
		private JTextField textField_10;
		private JTextField textField_11;
		ButtonGroup buttonGroup;
		JButton btnNewButton;
		private JTextField textField_1;
		private JTextField textField_3;
		private JTextField textField_12;
		private JTextField textField_13;
		private JTextField textField;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Studform frame = new Studform();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		
	
		public Studform() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 781, 491);
			setSize(1000,750);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Please Fill in the Below Details");
			lblNewLabel.setFont(new Font("Gabriola", Font.BOLD, 40));
			lblNewLabel.setBounds(10, 27, 372, 30);
			contentPane.add(lblNewLabel);
			
			
			
			JLabel lblNewLabel_2 = new JLabel("Student Category");
			lblNewLabel_2.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_2.setBounds(186, 70, 152, 30);
			contentPane.add(lblNewLabel_2);
			
			JComboBox<String> comboBox1 = new JComboBox<String>();
			comboBox1.addItem("School");
			comboBox1.addItem("Puc");
			comboBox1.addItem("College");
			comboBox1.setBounds(350, 70, 134, 30);
			contentPane.add(comboBox1);
			
			
			
			JLabel lblNewLabel_3 = new JLabel("Name");
			lblNewLabel_3.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_3.setBounds(531, 68, 81, 30);
			contentPane.add(lblNewLabel_3);
			
			textField_12 = new JTextField();
			textField_12.setBounds(624, 70, 196, 30);
			contentPane.add(textField_12);
			textField_12.setColumns(10);
			
			buttonGroup=new ButtonGroup();
			
			JLabel lblNewLabel_4 = new JLabel("Gender");
			lblNewLabel_4.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_4.setBounds(10, 158, 78, 30);
			contentPane.add(lblNewLabel_4);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
			rdbtnNewRadioButton.setFont(new Font("Gabriola", Font.BOLD, 18));
			rdbtnNewRadioButton.setBounds(85, 158, 60, 23);
			rdbtnNewRadioButton.setActionCommand("Male");
			contentPane.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
			rdbtnNewRadioButton_1.setFont(new Font("Gabriola", Font.BOLD, 18));
			rdbtnNewRadioButton_1.setBounds(85, 187, 81, 23);
			rdbtnNewRadioButton_1.setActionCommand("Female");
			contentPane.add(rdbtnNewRadioButton_1);
			
			JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Others");
			rdbtnNewRadioButton_2.setFont(new Font("Gabriola", Font.BOLD, 18));
			rdbtnNewRadioButton_2.setBounds(85, 215, 81, 23);
			rdbtnNewRadioButton_2.setActionCommand("Others");
			contentPane.add(rdbtnNewRadioButton_2);
			
			buttonGroup=new ButtonGroup();
	        buttonGroup.add(rdbtnNewRadioButton);
	        buttonGroup.add(rdbtnNewRadioButton_1);
	        buttonGroup.add(rdbtnNewRadioButton_2);
			
			JLabel lblNewLabel_5 = new JLabel("Date of Birth");
			lblNewLabel_5.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_5.setBounds(206, 158, 124, 30);
			contentPane.add(lblNewLabel_5);
			
			
			//initialize();
			
			JLabel lblNewLabel_6 = new JLabel("Student Contact Number");
			lblNewLabel_6.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_6.setBounds(522, 158, 237, 30);
			contentPane.add(lblNewLabel_6);
			
			textField_4 = new JTextField();
			textField_4.setBounds(771, 158, 169, 30);
			contentPane.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_9 = new JLabel("House Address");
			lblNewLabel_9.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_9.setBounds(335, 270, 134, 23);
			contentPane.add(lblNewLabel_9);
			
			textField = new JTextField();
			textField.setBounds(479, 250, 167, 63);
			contentPane.add(textField);
			textField.setColumns(10);
		
			
			JLabel lblNewLabel_10 = new JLabel("Father Name");
			lblNewLabel_10.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_10.setBounds(658, 264, 117, 30);
			contentPane.add(lblNewLabel_10);
			
			textField_7 = new JTextField();
			textField_7.setBounds(787, 263, 168, 30);
			contentPane.add(textField_7);
			textField_7.setColumns(10);
			
			JLabel lblNewLabel_11 = new JLabel("Father Contact Number");
			lblNewLabel_11.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_11.setBounds(10, 355, 221, 25);
			contentPane.add(lblNewLabel_11);
			
			textField_8 = new JTextField();
			textField_8.setBounds(243, 352, 168, 30);
			contentPane.add(textField_8);
			textField_8.setColumns(10);
			
			JLabel lblNewLabel_12 = new JLabel("Institute Address");
			lblNewLabel_12.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_12.setBounds(456, 353, 156, 25);
			contentPane.add(lblNewLabel_12);
			
			textField_9 = new JTextField();
			textField_9.setBounds(634, 336, 187, 65);
			contentPane.add(textField_9);
			textField_9.setColumns(10);
			
			JLabel lblNewLabel_13 = new JLabel("From Location");
			lblNewLabel_13.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_13.setBounds(10, 452, 135, 23);
			contentPane.add(lblNewLabel_13);
			
			textField_10 = new JTextField();
			textField_10.setBounds(157, 448, 144, 30);
			contentPane.add(textField_10);
			textField_10.setColumns(10);
			
			JLabel lblNewLabel_14 = new JLabel("Transit Location");
			lblNewLabel_14.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_14.setBounds(335, 450, 167, 23);
			contentPane.add(lblNewLabel_14);
			
			textField_11 = new JTextField();
			textField_11.setBounds(500, 448, 146, 30);
			contentPane.add(textField_11);
			textField_11.setColumns(10);
			
			
			
			JLabel lblNewLabel_16 = new JLabel("To Location");
			lblNewLabel_16.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_16.setBounds(686, 448, 108, 30);
			contentPane.add(lblNewLabel_16);
			
			textField_3 = new JTextField();
			textField_3.setBounds(817, 450, 138, 27);
			contentPane.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel lblNewLabel_7 = new JLabel("Qualification");
			lblNewLabel_7.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_7.setBounds(10, 544, 135, 23);
			contentPane.add(lblNewLabel_7);
			
			JComboBox<String> comboBoxq = new JComboBox<String>();
			comboBoxq.addItem("8th");
			comboBoxq.addItem("9th");
			comboBoxq.addItem("10th");
			comboBoxq.addItem("1st PUC");
			comboBoxq.addItem("2nd PUC");
			comboBoxq.addItem("BE");
			comboBoxq.addItem("BSC");
			comboBoxq.addItem("BBA");
			comboBoxq.addItem("BA");
			comboBoxq.addItem("B.COM");
			comboBoxq.addItem("M.TECH");
			comboBoxq.addItem("MBA");
			comboBoxq.addItem("M.COM");
			comboBoxq.setBounds(149, 540, 94, 30);
			contentPane.add(comboBoxq);
			
			
			
			JLabel lblNewLabel_15 = new JLabel("Pass Type");
			lblNewLabel_15.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_15.setBounds(317, 544, 94, 23);
			contentPane.add(lblNewLabel_15);
			
			JComboBox<String> comboBoxp = new JComboBox<String>();
			comboBoxp.addItem("Monthly");
			comboBoxp.addItem("Yearly");
			comboBoxp.setBounds(435, 540, 117, 26);
			contentPane.add(comboBoxp);
			
			JLabel lblNewLabel_1 = new JLabel("Usn");
			lblNewLabel_1.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_1.setBounds(10, 73, 46, 24);
			contentPane.add(lblNewLabel_1);
			
			textField_1 = new JTextField();
			textField_1.setBounds(65, 74, 81, 23);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Email id");
			lblNewLabel_8.setFont(new Font("Gabriola", Font.BOLD, 25));
			lblNewLabel_8.setBounds(10, 270, 97, 23);
			contentPane.add(lblNewLabel_8);
			
			textField_13 = new JTextField();
			textField_13.setBounds(119, 266, 182, 30);
			contentPane.add(textField_13);
			textField_13.setColumns(10);
			System.out.println(textField_13.getText()); 
			
			JDateChooser dateChooser = new JDateChooser();
			dateChooser.setBounds(335, 158, 149, 30);
			contentPane.add(dateChooser);
			
			JButton btnNewButton = new JButton("SUBMIT");
			btnNewButton.setBackground(new Color(224, 255, 255));
			btnNewButton.setFont(new Font("Gabriola", Font.BOLD, 30));
			btnNewButton.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent e) {
						
				        if (e.getSource() == btnNewButton)  
				         {  
				            int x = 0;  
				            String Name = textField_12.getText();  
				            String Student_Contact_Number = textField_4.getText(); 
							String House_Address = textField.getText();
				            String Email_id = textField_13.getText();
				            String Usn = textField_1.getText();
				            String Institute_Address = textField_9.getText();
				            String Father_Name = textField_7.getText();
				            String Father_Contact_Number = textField_8.getText();  
				            String From_Loc = textField_10.getText();
				            String Transit_Loc = textField_11.getText();
				            String To_Loc = textField_3.getText(); 
				            String Student_Category = comboBox1.getSelectedItem().toString();
							String Qualification = comboBoxq.getSelectedItem().toString();
				            String Pass_Type = comboBoxp.getSelectedItem().toString();
				            String Gender = buttonGroup.getSelection().getActionCommand();
				            String Dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
				          
				            Studform s = new Studform();
				            if(Dob!=null)
			            	{
			            		Dob = s.convertDate(Dob);
			            	}
				            
				                Connection con;
				                try  
				                {  
				                	con = DatabaseConnection.getConnection();
									PreparedStatement ps = con.prepareStatement("insert into student(usn,student_category,name,gender,dob,student_contact_number,email_id,house_address,qualification,father_name,father_contact_number,institute_address,from_loc,transit_loc,to_loc,pass_type,pass_status) values ('"+Usn+"','"+Student_Category+"','"+Name+"','"+Gender+"','"+Dob+"','"+Student_Contact_Number+"','"+Email_id+"',"+ "'"+House_Address+"','"+Qualification+"','"+Father_Name+"','"+Father_Contact_Number+"',"+ "'"+Institute_Address+"','"+From_Loc+"','"+Transit_Loc+"','"+To_Loc+"','"+Pass_Type+"','1')");  
				                   
				                    ps.execute();
				                    
				                    x++;  
				                    if (x > 0)   
				                    {  
				                        JOptionPane.showMessageDialog(btnNewButton, "Data Saved Successfully"); 
				                        Studform.mailSending(Email_id,Name);
				                    }  
				                }  
				                catch (Exception ex)   
				                {  
				                    System.out.println(ex); 
				                }  
				            }  
				            else  
				            {  
				                JOptionPane.showMessageDialog(btnNewButton, "Password Does Not Match");  
				            }   
				          }   
				          
					
					});
			btnNewButton.setBounds(795, 624, 125, 36);
			contentPane.add(btnNewButton);
			
			
			JButton btnNewButton_1 = new JButton("BACK");
			btnNewButton_1.setBackground(new Color(224, 255, 255));
			btnNewButton_1.setFont(new Font("Gabriola", Font.BOLD, 30));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					Studentnextpage window = new Studentnextpage();
					//homepage1 window = new homepage1();
					window.setVisible(true);
					dispose();
					
					//dispose();
				}
			});
			btnNewButton_1.setBounds(823, 11, 117, 36);
			contentPane.add(btnNewButton_1);
			
			JLabel lblNewLabel_17 = new JLabel("");
			Image img = new ImageIcon(this.getClass().getResource("images/form5.jpg")).getImage();
			lblNewLabel_17.setIcon(new ImageIcon(img));
			lblNewLabel_17.setBounds(0, 0, 982, 703);
			contentPane.add(lblNewLabel_17);
			
			
			/*JDateChooser dateChooser = new JDateChooser();
			
					
				}
			});
			dateChooser.setBounds(273, 144, 91, 20);
			contentPane.add(dateChooser);*/
			
			
			
			
			
			
			
			
		}
		 public String convertDate(String strDate)
		 { 
		    try
		    {
		      //create SimpleDateFormat object with source string date format
		      SimpleDateFormat sdfSource = new SimpleDateFormat("dd MMM,yyyy");
		      
		      //parse the string into Date object
		      Date date = sdfSource.parse(strDate);
		      
		      //create SimpleDateFormat object with desired date format
		      SimpleDateFormat sdfDestination = new SimpleDateFormat("yyyy-MM-dd");
		      
		      //parse the date into another format
		      strDate = sdfDestination.format(date);
		     
		     // return strDate;
		    }
		    catch(ParseException pe)
		    { 
		      System.out.println("Parse Exception : " + pe);
		    }
		    return strDate;
		  }
		 
		 public static void mailSending(String reciever,String user)
		 {
			
			 String subject="Bus Pass Registration";
			 String sender="transit.passapp@gmail.com";
			 String password="transit123#";
			 String message = "Hello "+user+" !!\r\n" + 
			 		"Your Registration form for the Bus Pass is Accepted.\r\n" + 
			 		"To Track your Pass and know the details for it,\r\n" + 
			 		"Click on Track Student Pass in the website and enter,\r\n" + 
			 		"Username(your name)\r\n" + 
			 		"Password(your id)\r\n" + 
			 		"Thank You!!";
		     Mailer.send(sender,password,reciever,subject,message);
		 }
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
		
		
		