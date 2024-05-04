package Payment;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class AdminSection extends JFrame {
	static AdminSection frame;
	private JPanel contentPane;
	JScrollPane sp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminSection();
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
	public AdminSection() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		setTitle("Payment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 389);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(38, 20, 596, 294);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(152, 251, 152));
		btnLogout.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(102, 255, 255), new Color(204, 204, 102), new Color(255, 255, 51), new Color(153, 153, 153)));
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogout.setBounds(168, 199, 263, 34);
		panel.add(btnLogout);
		
		JButton btnViewAccountant = new JButton("View Accountant");
		btnViewAccountant.setBackground(new Color(221, 160, 221));
		btnViewAccountant.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(102, 0, 102), new Color(51, 102, 102), new Color(51, 0, 204), new Color(0, 255, 153)));
		btnViewAccountant.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnViewAccountant.setBounds(329, 117, 150, 34);
		panel.add(btnViewAccountant);
		
		JButton btnAddAccountant = new JButton("Add Accountant");
		btnAddAccountant.setBackground(new Color(221, 160, 221));
		btnAddAccountant.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 0, 0), new Color(102, 0, 204), new Color(0, 204, 0), new Color(51, 0, 102)));
		btnAddAccountant.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnAddAccountant.setBounds(90, 117, 167, 34);
		panel.add(btnAddAccountant);
		
		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminSection.setBounds(71, 20, 408, 34);
		panel.add(lblAdminSection);
		lblAdminSection.setForeground(Color.DARK_GRAY);
		lblAdminSection.setFont(new Font("Times New Roman", Font.BOLD, 35));
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAccountant.main(new String[]{});
				frame.dispose();
			}
		});
		btnViewAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAccountant.main(new String[]{});
			}
		});
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(null);
				dispose();
			}
		});
	}

}
