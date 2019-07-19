import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Studlog extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studlog frame = new Studlog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Studlog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 485);
		setSize(1000,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Gabriola", Font.BOLD, 50));
		lblNewLabel.setBounds(143, 246, 227, 50);
		contentPane.add(lblNewLabel);
		textField_1 = new JTextField();
		textField_1.setBounds(421, 246, 162, 41);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setFont(new Font("Gabriola", Font.BOLD, 50));
		lblNewLabel_1.setBounds(143, 378, 227, 50);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(421, 369, 195, 46);
		contentPane.add(passwordField);
		
	
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(new Color(178, 34, 34));
		btnNewButton.setFont(new Font("Gabriola", Font.BOLD, 25));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String uname=textField_1.getText();
				@SuppressWarnings("deprecation")
				String psd=passwordField.getText();
				
				if(uname.equals("Admin") && psd.equals("Student"))
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Logged in Successfully"); 
					 new MyFrame().setVisible(true);
					//AdminDisplayPage r = new AdminDisplayPage();
					//r.setVisible(true);
				}
				
				else
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Login Unsuccessful");
					
				}
			}
		});
		
		btnNewButton.setBounds(448, 508, 132, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Gabriola", Font.BOLD, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Adminlog frame = new Adminlog();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(35, 52, 114, 41);
		contentPane.add(btnNewButton_1);
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("show password");
		chckbxNewCheckBox.setFont(new Font("Gabriola", Font.BOLD, 21));
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(chckbxNewCheckBox.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}
		else
		{
			passwordField.setEchoChar('*');
		}
			}
		});
		chckbxNewCheckBox.setBounds(431, 444, 152, 25);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("images/log.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(368, 39, 195, 194);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("images/back1.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));
		lblNewLabel_3.setBounds(0, 0, 982, 703);
		contentPane.add(lblNewLabel_3);
		
		
		
				
	}
}
