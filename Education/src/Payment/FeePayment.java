package Payment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;

import userdetails.project;

public class FeePayment extends JFrame {
	static FeePayment frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new FeePayment();
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
	public FeePayment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Payment");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		setBounds(100, 100, 685, 473);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(153, 255, 204));
		panel.setBounds(33, 20, 597, 389);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFeeReport = new JLabel("Fee Payment");
		lblFeeReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeReport.setBounds(105, 10, 390, 36);
		panel.add(lblFeeReport);
		lblFeeReport.setFont(new Font("Times New Roman", Font.BOLD, 35));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1_1.setBackground(new Color(204, 255, 153));
		panel_1_1.setBounds(280, 88, 247, 262);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnAccountantLogin = new JButton("Accountant Login");
		btnAccountantLogin.setForeground(new Color(153, 0, 204));
		btnAccountantLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAccountantLogin.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAccountantLogin.setBounds(38, 143, 173, 32);
		panel_1_1.add(btnAccountantLogin);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAdminLogin.setForeground(new Color(204, 102, 102));
		btnAdminLogin.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAdminLogin.setBounds(63, 49, 132, 32);
		panel_1_1.add(btnAdminLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\Client_Male_Light.png"));
		lblNewLabel.setBounds(49, 73, 239, 262);
		panel.add(lblNewLabel);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
				project.main(null);
				dispose();
			}	
		});
		btnExit.setBackground(new Color(255, 69, 0));
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit.setBounds(514, 10, 73, 32);
		panel.add(btnExit);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnAccountantLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AccountantLogin.main(new String[]{});
				frame.dispose();
			}
		});
	}
}
