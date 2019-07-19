import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;

public class Adminlog extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminlog frame = new Adminlog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Adminlog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 484);
		setSize(1000,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("VIEW STUDENT DETAILS");
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Gabriola", Font.BOLD, 70));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Studlog StudLogin = new Studlog();
				StudLogin.setVisible(true);
			}
		});
		btnNewButton.setBounds(131, 268, 740, 88);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.setFont(new Font("Gabriola", Font.BOLD, 30));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Homepage window = new Homepage();
				window.frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(12, 60, 123, 45);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Gabriola", Font.BOLD, 70));
		Image img1 = new ImageIcon(this.getClass().getResource("images/about.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(0, 0, 982, 703);
		contentPane.add(lblNewLabel_1);
		
	}

}
