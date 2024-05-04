package Payment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class AdminLogin extends JFrame {
	static AdminLogin frame;
	private JPanel contentPane;
	private JTextField textName;
	private JPasswordField textpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("AdminLogin");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(25, 20, 750, 396);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setBounds(107, 28, 507, 25);
		panel.add(lblAdminLogin);
		lblAdminLogin.setForeground(Color.DARK_GRAY);
		lblAdminLogin.setFont(new Font("Times New Roman", Font.BOLD, 35));
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(297, 136, 86, 16);
		panel.add(lblName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(297, 182, 86, 16);
		panel.add(lblPassword);
		
		textName = new JTextField();
		textName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textName.setForeground(new Color(102, 51, 204));
		textName.setBounds(423, 136, 211, 25);
		panel.add(textName);
		textName.setColumns(10);
		
		textpassword = new JPasswordField();
		textpassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textpassword.setForeground(new Color(51, 51, 204));
		textpassword.setBounds(423, 176, 211, 25);
		panel.add(textpassword);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setBackground(new Color(144, 238, 144));
		btnLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 153, 204), new Color(255, 255, 51), new Color(255, 0, 51), new Color(255, 0, 153)));
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogin.setBounds(409, 264, 180, 33);
		panel.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\Client_Male_Light.png"));
		lblNewLabel.setBounds(69, 94, 198, 240);
		panel.add(lblNewLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeePayment.main(null);
				dispose();
			}
		});
		btnBack.setBackground(new Color(255, 99, 71));
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBack.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 153, 204), new Color(255, 255, 51), new Color(255, 0, 51), new Color(255, 0, 153)));
		btnBack.setBounds(654, 10, 86, 33);
		panel.add(btnBack);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textName.getText();
			char ch[]=textpassword.getPassword();
			String password=String.valueOf(ch);
			if(name.equals("Ramkumar")&&password.equals("Ram1230")){
				String s[]={};
				AdminSection.main(s);
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this,"Sorry, username or password error!");
				textName.setText("");textpassword.setText("");
			}
			}
		});
	}
}
