import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Homepage {

	JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Homepage() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(199, 21, 133));
		frame.setSize(1000,750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRANSIT PASS APPLICATION");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(255, 204, 153));
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.BOLD, 80));
		lblNewLabel.setBounds(78, 13, 853, 64);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Admin Login");
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Adminlog AdminLogin = new Adminlog();
				AdminLogin.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Gabriola", Font.BOLD, 45));
		btnNewButton.setBounds(668, 91, 272, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setForeground(new Color(0, 100, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Homepage Homepage = new Homepage();
				Homepage.setVisible(true);
			}
		});
		
		
		btnNewButton_1.setFont(new Font("Gabriola", Font.BOLD, 42));
		btnNewButton_1.setBounds(33, 119, 133, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("STUDENT PASS");
		btnNewButton_3.setForeground(new Color(0, 100, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Studentnextpage Studentnextpage = new Studentnextpage();
				Studentnextpage.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Gabriola", Font.BOLD, 42));
		btnNewButton_3.setBounds(33, 339, 301, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("CONTACT US");
		btnNewButton_6.setForeground(new Color(0, 100, 0));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				Contact Contact = new Contact();
				Contact.setVisible(true);
				
				
			}
		});
		btnNewButton_6.setFont(new Font("Gabriola", Font.BOLD, 42));
		btnNewButton_6.setBounds(33, 449, 241, 50);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_2 = new JButton("ABOUT US");
		btnNewButton_2.setForeground(new Color(0, 100, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				About About = new About();
				About.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Gabriola", Font.BOLD, 42));
		btnNewButton_2.setBounds(33, 226, 214, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("images/Picture2.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(0, 0, 982, 703);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}

	protected void setVisible(boolean b) {
		
	}
}
