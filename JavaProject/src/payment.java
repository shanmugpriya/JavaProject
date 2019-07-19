import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

public class payment extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	   PreparedStatement ps;
		Connection con = null;
		ResultSet rs;
		Statement st=null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment frame = new payment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public payment()
	{
		Container contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1000,750);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setFont(new Font("Gabriola", Font.BOLD, 30));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Stutrackpass window = new Stutrackpass();
				window.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(22, 28, 114, 40);
		contentPane.add(btnNewButton_2);
		 
		
		JLabel lblNewLabel = new JLabel("Choose the Payment Mode");
		lblNewLabel.setFont(new Font("Gabriola", Font.BOLD, 70));
		lblNewLabel.setBounds(159, 104, 685, 68);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("CREDIT CARD");
		btnNewButton.setFont(new Font("Gabriola", Font.BOLD, 45));
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == btnNewButton)  
		         {  
					payment p = new payment();
					p.CreditCardpayment();
					p.setVisible(true);
		         }
			}
			});
		
		btnNewButton.setBounds(271, 248, 298, 51);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("DEBIT CARD");
		btnNewButton_1.setFont(new Font("Gabriola", Font.BOLD, 45));
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == btnNewButton_1)  
		         {  
					 System.out.println("Hello");
					payment p = new payment();
					p.debitCardpayment();
					p.setVisible(true);
		         }
			}
			});
		btnNewButton_1.setBounds(271, 396, 298, 51);
		contentPane.add(btnNewButton_1);
	}

	/**
	 * Create the frame.
	 */
	public  void CreditCardpayment() {
		 Container contentPane1 = getContentPane();

		contentPane1 = new JPanel();
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Fill in the Card Details");
		lblNewLabel_1.setBounds(250, 130, 470, 45);
		lblNewLabel_1.setFont(new Font("Microsoft Himalaya", Font.BOLD, 60));
        contentPane1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Card Number");
		lblNewLabel_2.setBounds(314, 200, 200, 50);
		lblNewLabel_2.setFont(new Font("Gabriola", Font.BOLD, 27));
		contentPane1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(311, 250, 194, 22);
		contentPane1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Card Holder's Name");
		lblNewLabel_3.setBounds(314, 300, 250, 25);
		lblNewLabel_3.setFont(new Font("Gabriola", Font.BOLD, 27));
		contentPane1.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(314, 335, 170, 22);
		contentPane1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Expiry");
		lblNewLabel_4.setBounds(314, 380, 70, 22);
		lblNewLabel_4.setFont(new Font("Gabriola", Font.BOLD, 27));
		contentPane1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MM");
		lblNewLabel_5.setBounds(322, 423, 31, 16);
		lblNewLabel_4.setFont(new Font("Gabriola", Font.BOLD, 20));
		contentPane1.add(lblNewLabel_5);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(365, 422, 111, 22);
		contentPane1.add(monthChooser);
		
		JLabel lblNewLabel_6 = new JLabel("YYYY");
		lblNewLabel_6.setBounds(507, 423, 56, 16);
		lblNewLabel_4.setFont(new Font("Gabriola", Font.BOLD, 20));
		contentPane1.add(lblNewLabel_6);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(543, 422, 51, 22);
		contentPane1.add(yearChooser);
		
		  JButton b = new JButton("Pay");
          b.setBounds(350, 520, 120, 30);
          b.setFont(new Font("Gabriola", Font.BOLD, 35));
          b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Paid Successfully"); 
				}
			});
          contentPane1.add(b);
	}
	public  void debitCardpayment() {
		 Container contentPane1 = getContentPane();

		contentPane1 = new JPanel();
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Fill in the Card Details");
		lblNewLabel_1.setBounds(250, 130, 470, 45);
		lblNewLabel_1.setFont(new Font("Microsoft Himalaya", Font.BOLD, 60));
		contentPane1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Card Number");
		lblNewLabel_2.setBounds(314, 200, 200, 50);
		lblNewLabel_2.setFont(new Font("Gabriola", Font.BOLD, 27));
		contentPane1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(311, 250, 194, 22);
		contentPane1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Card Holder's Name");
		lblNewLabel_3.setBounds(314, 300, 250, 25);
		lblNewLabel_3.setFont(new Font("Gabriola", Font.BOLD, 27));
		contentPane1.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(314, 335, 170, 22);
		contentPane1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Expiry");
		lblNewLabel_4.setBounds(314, 380, 70, 22);
		lblNewLabel_4.setFont(new Font("Gabriola", Font.BOLD, 27));
		contentPane1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MM");
		lblNewLabel_5.setBounds(322, 423, 31, 16);
		lblNewLabel_4.setFont(new Font("Gabriola", Font.BOLD, 20));
		contentPane1.add(lblNewLabel_5);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(365, 422, 111, 22);
		contentPane1.add(monthChooser);
		
		JLabel lblNewLabel_6 = new JLabel("YYYY");
		lblNewLabel_6.setBounds(507, 423, 56, 16);
		lblNewLabel_4.setFont(new Font("Gabriola", Font.BOLD, 20));
		contentPane1.add(lblNewLabel_6);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(543, 422, 51, 22);
		contentPane1.add(yearChooser);
		
		JLabel lblNewLabel_7 = new JLabel("CVV");
		lblNewLabel_7.setBounds(320, 480, 147, 16);
		lblNewLabel_4.setFont(new Font("Gabriola", Font.BOLD, 20));
		contentPane1.add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(390, 475, 116, 22);
		contentPane1.add(textField_2);
		textField_2.setColumns(10);
		
		  JButton b = new JButton("Pay");
		  b.setBounds(350, 550, 120, 30);
          b.setFont(new Font("Gabriola", Font.BOLD, 35));
          b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Paid Successfully");
					
					
				}
			});
          contentPane1.add(b);
	}
}
