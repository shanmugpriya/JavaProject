import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contact extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact frame = new Contact();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Contact() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1000,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contact Us");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Gabriola", Font.BOLD, 70));
		lblNewLabel.setBounds(330, 57, 311, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("9426712398");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Gabriola", Font.BOLD, 45));
		lblNewLabel_2.setBounds(341, 185, 211, 40);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("transit.passapp@gmail.com");
		lblNewLabel_4.setFont(new Font("Gabriola", Font.BOLD, 45));
		lblNewLabel_4.setBounds(341, 347, 447, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel(" Central offices, NGO Colony, Shanti Nagar, Bengaluru, Karnataka 560027");
		lblNewLabel_6.setFont(new Font("Gabriola", Font.BOLD, 24));
		lblNewLabel_6.setBounds(341, 475, 629, 65);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Homepage window = new Homepage();
				window.frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Gabriola", Font.BOLD, 30));
		btnNewButton.setBounds(12, 51, 114, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("images/call1.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(188, 170, 95, 98);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("images/mail1.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));
		lblNewLabel_3.setBounds(188, 315, 98, 92);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("images/loc1.jpg")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img2));
		lblNewLabel_5.setBounds(188, 466, 95, 98);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("images/bb1.jpg")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img3));
		lblNewLabel_7.setBounds(0, 0, 982, 703);
		contentPane.add(lblNewLabel_7);
	}
}
