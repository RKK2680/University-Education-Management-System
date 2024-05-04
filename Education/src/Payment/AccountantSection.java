package Payment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class AccountantSection extends JFrame {
	static AccountantSection frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AccountantSection();
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
	public AccountantSection() {
		setBackground(new Color(0, 204, 51));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		setTitle("Accountant Section");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 559);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 51));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(255, 204, 153));
		panel.setBounds(42, 24, 703, 450);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAccountantSection = new JLabel("Accountant Section");
		lblAccountantSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountantSection.setBounds(92, 39, 483, 36);
		panel.add(lblAccountantSection);
		lblAccountantSection.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblAccountantSection.setForeground(Color.DARK_GRAY);
		
		JButton btnNewButton = new JButton("Online Payment Details");
		btnNewButton.setBackground(new Color(0, 204, 51));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(204, 51, 0), new Color(102, 204, 51), new Color(255, 204, 0)));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(382, 229, 170, 36);
		panel.add(btnNewButton);
		
		JButton btnViewStudent = new JButton("Offline Payment Details");
		btnViewStudent.setBackground(new Color(0, 204, 51));
		btnViewStudent.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 0, 51), new Color(204, 204, 153), new Color(204, 255, 102), new Color(153, 51, 204)));
		btnViewStudent.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnViewStudent.setBounds(463, 148, 180, 36);
		panel.add(btnViewStudent);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(255, 127, 80));
		btnLogout.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(102, 51, 204), new Color(0, 255, 204), new Color(51, 153, 255), new Color(102, 255, 102)));
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLogout.setBounds(205, 318, 271, 36);
		panel.add(btnLogout);
		
		JButton btnViewStudent_1 = new JButton("Online Pay");
		btnViewStudent_1.setBackground(new Color(0, 204, 51));
		btnViewStudent_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pay py=new Pay();
				frame.setVisible(true);
				py.main(null);
			}
		});
		btnViewStudent_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnViewStudent_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 0, 51), new Color(204, 204, 153), new Color(204, 255, 102), new Color(153, 51, 204)));
		btnViewStudent_1.setBounds(56, 148, 158, 36);
		panel.add(btnViewStudent_1);
		
		JButton btnViewStudent_1_1 = new JButton("Offline Pay");
		btnViewStudent_1_1.setBackground(new Color(0, 204, 51));
		btnViewStudent_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OfflinePay OP=new OfflinePay();
				OP.main(null);
			}
		});
		btnViewStudent_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnViewStudent_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 0, 51), new Color(204, 204, 153), new Color(204, 255, 102), new Color(153, 51, 204)));
		btnViewStudent_1_1.setBounds(262, 148, 158, 36);
		panel.add(btnViewStudent_1_1);
		
		JButton btnPaymentRecipt = new JButton("Online Payment Recipt");
		btnPaymentRecipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnlineRecipt.main(null);
				dispose();
			}
		});
		btnPaymentRecipt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnPaymentRecipt.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 255), new Color(255, 153, 0), new Color(153, 102, 102), new Color(0, 0, 51)));
		btnPaymentRecipt.setBackground(new Color(0, 204, 51));
		btnPaymentRecipt.setBounds(116, 229, 186, 36);
		panel.add(btnPaymentRecipt);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FeePayment.main(new String[]{});
				frame.dispose();
			}
		});
		btnViewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStudent.main(new String[]{});
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnlinePDetails.main(new String[]{});
				frame.disable();
				
			}
		});
	}

}
