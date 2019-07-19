import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class Stutrackpass extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField_1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stutrackpass frame = new Stutrackpass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Stutrackpass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1000,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Track Your Pass....");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Gabriola", Font.BOLD, 80));
		lblNewLabel.setBounds(198, 47, 592, 77);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setFont(new Font("Gabriola", Font.BOLD, 45));
		lblNewLabel_1.setBounds(198, 318, 222, 39);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(424, 318, 160, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setForeground(new Color(255, 215, 0));
		lblNewLabel_2.setFont(new Font("Gabriola", Font.BOLD, 45));
		lblNewLabel_2.setBounds(198, 416, 199, 39);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(424, 416, 160, 31);
		contentPane.add(passwordField);

		
	
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Gabriola", Font.BOLD, 30));
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{
				TrackedInfoPage.setValues(textField_1.getText(), Integer.parseInt(passwordField.getText()));
				TrackedInfoPage lr = new TrackedInfoPage();
				lr.setVisible(true);

			}
		});
		btnNewButton.setBounds(454, 564, 130, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Gabriola", Font.BOLD, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Studentnextpage window = new Studentnextpage();
				window.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(12, 50, 124, 39);
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
		chckbxNewCheckBox.setBounds(424, 492, 148, 25);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("images/log.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		lblNewLabel_3.setBounds(326, 123, 192, 182);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("images/back1.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img1));
		lblNewLabel_4.setBounds(0, -4, 982, 707);
		contentPane.add(lblNewLabel_4);
		
		
		
			}
}
