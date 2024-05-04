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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class AddAccountant extends JFrame {
	static AddAccountant frame;
	private JPanel contentPane;
	private JTextField textname;
	private JPasswordField textpassword;
	private JTextField textEmail;
	private JTextField textContact;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddAccountant();
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
	public AddAccountant() {
		setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		setTitle("Add Accountant");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 516);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 102));
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 204, 102));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(44, 30, 810, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(192, 113, 95, 21);
		panel.add(lblName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(192, 150, 113, 21);
		panel.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEmail.setBounds(205, 181, 82, 27);
		panel.add(lblEmail);
		
		JLabel lblContactNo = new JLabel("Contact No:");
		lblContactNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblContactNo.setBounds(205, 218, 82, 27);
		panel.add(lblContactNo);
		
		JButton btnAddAccountant = new JButton("Add Accountant");
		btnAddAccountant.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(153, 102, 0), new Color(153, 0, 51), new Color(204, 0, 51), new Color(204, 0, 102)));
		btnAddAccountant.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnAddAccountant.setBounds(192, 323, 175, 38);
		panel.add(btnAddAccountant);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(153, 0, 255), new Color(153, 102, 0), new Color(255, 102, 0), new Color(255, 255, 0)));
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnBack.setBounds(554, 327, 95, 30);
		panel.add(btnBack);
		
		textContact = new JTextField();
		textContact.setForeground(new Color(102, 51, 255));
		textContact.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textContact.setBounds(331, 218, 232, 21);
		panel.add(textContact);
		textContact.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setForeground(new Color(51, 51, 204));
		textEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textEmail.setBounds(331, 185, 232, 21);
		panel.add(textEmail);
		textEmail.setColumns(10);
		
		textpassword = new JPasswordField();
		textpassword.setForeground(new Color(51, 51, 204));
		textpassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textpassword.setBounds(331, 150, 232, 24);
		panel.add(textpassword);
		
		textname = new JTextField();
		textname.setForeground(new Color(51, 51, 204));
		textname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textname.setBounds(331, 113, 232, 24);
		panel.add(textname);
		textname.setColumns(10);
		
		JLabel lblAddAccountant = new JLabel("Add Accountant");
		lblAddAccountant.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddAccountant.setBounds(192, 10, 402, 38);
		panel.add(lblAddAccountant);
		lblAddAccountant.setForeground(Color.DARK_GRAY);
		lblAddAccountant.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection.main(new String[]{});
				frame.dispose();
			}
		});
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textname.getText();
				char ch[]=textpassword.getPassword();
				String password=String.valueOf(ch);
				String email=textEmail.getText();
				String contactno=textContact.getText();
				
				Accountant a=new Accountant(name,password,email,contactno);
				int status=AccountantDetails.save(a);
				
				if(status>0){
					JOptionPane.showMessageDialog(AddAccountant.this,"Accountant added successfully!");
					textname.setText("");textEmail.setText("");textContact.setText("");
					textpassword.setText("");
				}else{
					JOptionPane.showMessageDialog(AddAccountant.this,"Sorry, Unable to add Accountant!");
				}
				FeePayment.main(new String[]{});
				frame.dispose();
			}
		});
	}
}
