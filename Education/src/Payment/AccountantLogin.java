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

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class AccountantLogin extends JFrame {
	static AccountantLogin frame;
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
					frame = new AccountantLogin();
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
	public AccountantLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		setTitle("AccountantLogin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(35, 27, 776, 457);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAccountantLogin = new JLabel("Accountant Login");
		lblAccountantLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountantLogin.setBounds(186, 34, 355, 46);
		panel.add(lblAccountantLogin);
		lblAccountantLogin.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblAccountantLogin.setForeground(Color.DARK_GRAY);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(279, 152, 132, 25);
		panel.add(lblName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(267, 187, 154, 32);
		panel.add(lblPassword);
		
		textName = new JTextField();
		textName.setBounds(431, 152, 220, 28);
		panel.add(textName);
		textName.setColumns(10);
		
		textpassword = new JPasswordField();
		textpassword.setBounds(431, 190, 220, 27);
		panel.add(textpassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(102, 153, 255), new Color(204, 204, 153)));
		btnLogin.setForeground(new Color(0, 153, 0));
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLogin.setBounds(353, 287, 132, 32);
		panel.add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeePayment.main(null);
				dispose();
			}
		});
		btnBack.setBorder(new CompoundBorder(new MatteBorder(5, 7, 6, 7, (Color) new Color(255, 255, 153)), null));
		btnBack.setForeground(new Color(255, 153, 102));
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnBack.setBounds(573, 287, 132, 32);
		panel.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\Client_Male_Light.png"));
		lblNewLabel.setBounds(81, 138, 220, 247);
		panel.add(lblNewLabel);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String name=textName.getText();
			String password=String.valueOf(textpassword.getPassword());
			boolean status=AccountantDetails.validate(name, password);
			if(status){
				AccountantSection.main(new String[]{});
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(AccountantLogin.this,"Sorry, username or password error!","Login error!",JOptionPane.ERROR_MESSAGE);
			}
			}
		});
	}
}
