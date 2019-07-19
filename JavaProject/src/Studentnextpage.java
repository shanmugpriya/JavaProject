import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Studentnextpage extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentnextpage frame = new Studentnextpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Studentnextpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 491);
		setSize(1000,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT PASS ");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.BOLD, 80));
		lblNewLabel.setBounds(244, 76, 491, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To Apply for Student Pass");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Gabriola", Font.BOLD, 48));
		lblNewLabel_1.setBounds(63, 208, 460, 51);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Click Here!!");
		btnNewButton.setFont(new Font("Gabriola", Font.BOLD, 28));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Studform studform1 = new Studform();
				studform1.setVisible(true);
			}
			
		});
		btnNewButton.setBounds(570, 208, 165, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("To Track Your Pass");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Gabriola", Font.BOLD, 48));
		lblNewLabel_2.setBounds(75, 354, 359, 59);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Click Here!!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Stutrackpass Stutrackpass = new Stutrackpass();
				Stutrackpass.setVisible(true);

			}
		});
		
		btnNewButton_1.setFont(new Font("Gabriola", Font.BOLD, 28));
		btnNewButton_1.setBounds(457, 354, 165, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setFont(new Font("Gabriola", Font.BOLD, 30));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Homepage window = new Homepage();
				window.frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(12, 57, 114, 40);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("images/bb1.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		lblNewLabel_3.setBounds(0, 0, 982, 703);
		contentPane.add(lblNewLabel_3);
		 
	}
}
