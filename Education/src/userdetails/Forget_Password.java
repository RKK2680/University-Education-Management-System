package userdetails;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.SwingConstants;

public class Forget_Password extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textemailid;
	private JTextField txtForgetPassword;
	private JPasswordField textpass;
	private JTextField textphon;
	private JPasswordField textcpass;
	Conn conn = new Conn();
	
	public static void ForP() {
		try {
			Forget_Password dialog = new Forget_Password();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	 
	public Forget_Password() {
		setType(Type.UTILITY);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\eclipse-workspace\\Education Management System\\img\\dialog-error-icon.png"));
		setBounds(100, 100, 507, 390);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 153, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textemailid = new JTextField();
			textemailid.setForeground(new Color(147, 112, 219));
			textemailid.setBounds(239, 91, 217, 28);
			contentPanel.add(textemailid);
			textemailid.setColumns(10);
		}
		
		txtForgetPassword = new JTextField();
		txtForgetPassword.setEditable(false);
		txtForgetPassword.setBackground(SystemColor.info);
		txtForgetPassword.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtForgetPassword.setText("      Forget Password");
		txtForgetPassword.setColumns(10);
		txtForgetPassword.setBounds(111, 23, 271, 43);
		contentPanel.add(txtForgetPassword);
		
		textpass = new JPasswordField();
		textpass.setForeground(new Color(186, 85, 211));
		textpass.setBounds(239, 167, 217, 28);
		contentPanel.add(textpass);
		
		textphon = new JTextField();
		textphon.setForeground(new Color(147, 112, 219));
		textphon.setBounds(239, 129, 217, 28);
		contentPanel.add(textphon);
		textphon.setColumns(10);
		
		JButton btnNewButton = new JButton(" Passwoard Create");
		btnNewButton.setBackground(new Color(102, 153, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email=textemailid.getText();
				String phone=textphon.getText();
	    		String npass=textpass.getText();
	    		String cpass=textcpass.getText();
	    		try {
	    			Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
	    			Statement st=conn.createStatement();
	    			ResultSet rs=st.executeQuery("select * from Registretion1 where Email='"+email+"' and Mobile='"+phone+"' ");
	    			if (npass.equals(cpass)) {
	    				//JOptionPane.showMessageDialog(null, "Enter New password and Conform Password ");
					} else {
						JOptionPane.showMessageDialog(null, "New Password And Conform Password is Not matched ");
						conn.close();
					}
	    			if (npass.equals(cpass)) {
	    				JOptionPane.showMessageDialog(null, "Enter New password and Conform Password ");
					} else {
						
						conn.close();
					}
	    			if (rs.next()) {
						st.executeUpdate("update Registretion1 set Pass='"+npass+"' where Email='"+email+"' and Mobile='"+phone+"'");
						JOptionPane.showMessageDialog(null, "Password is Succesfully UPDATED.... ");
						setVisible(false);
						new Login().setVisible(true);
						
					} else {
						JOptionPane.showMessageDialog(null, "Plase Fil Corect Details ");
						conn.close();
						rs.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
	    		
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(47, 287, 168, 28);
		contentPanel.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBackground(new Color(255, 0, 0));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				dispose();
			}
		});
		btnClose.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnClose.setBounds(284, 287, 143, 28);
		contentPanel.add(btnClose);
		
		textcpass = new JPasswordField();
		textcpass.setForeground(new Color(147, 112, 219));
		textcpass.setBounds(239, 205, 217, 28);
		contentPanel.add(textcpass);
		
		JLabel lblEmail = new JLabel("Email ID");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEmail.setBounds(97, 91, 142, 21);
		contentPanel.add(lblEmail);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPhoneNo.setBounds(97, 129, 142, 21);
		contentPanel.add(lblPhoneNo);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewPassword.setBounds(97, 172, 142, 21);
		contentPanel.add(lblNewPassword);
		
		JLabel lblConformPassword = new JLabel("Conform Password");
		lblConformPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblConformPassword.setBounds(97, 207, 138, 21);
		contentPanel.add(lblConformPassword);
	}
}
