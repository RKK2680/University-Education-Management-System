package Home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class FeeDetails2 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblBachelorssOfArts;

	/**
	 * Launch the application.
	 */
	public static void Fee2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeDetails2 frame = new FeeDetails2();
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
	public FeeDetails2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\eclipse-workspace\\Education Management System\\img\\pyemnt.png"));
		setTitle("Fee Details Page 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1312, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new LineBorder(new Color(255, 140, 0), 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(960, 570, 108, 41);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeDetails.Fee();
				dispose();
			}
		}); 
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBack.setBackground(new Color(233, 150, 122));
		btnBack.setBounds(266, 570, 108, 41);
		contentPane.add(btnBack);
		
		panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(84, 137, 1169, 95);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblBachelorssOfArts = new JLabel("Bachelors's Of Arts");
		lblBachelorssOfArts.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssOfArts.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBachelorssOfArts.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssOfArts.setBackground(new Color(211, 211, 211));
		lblBachelorssOfArts.setBounds(84, 26, 254, 26);
		panel.add(lblBachelorssOfArts);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(204, 153, 204));
		btnNewButton_1.setBounds(622, 123, 89, 24);
		panel.add(btnNewButton_1);
		
		JLabel lblCourceFee_5 = new JLabel("Cource Fee");
		lblCourceFee_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_5.setBackground(new Color(211, 211, 211));
		lblCourceFee_5.setBounds(84, 58, 131, 26);
		panel.add(lblCourceFee_5);
		
		JLabel lblCourceFee_6_2_3_2 = new JLabel("Examination Fee");
		lblCourceFee_6_2_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_3_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_3_2.setBounds(404, 58, 153, 26);
		panel.add(lblCourceFee_6_2_3_2);
		
		JLabel lblCourceFee_6_2_4_5_1 = new JLabel("Total Fee");
		lblCourceFee_6_2_4_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5_1.setBounds(799, 58, 118, 26);
		panel.add(lblCourceFee_6_2_4_5_1);
		
		JLabel lblCourceFee_6_2_4_6_4_1 = new JLabel("Total Fee / Year");
		lblCourceFee_6_2_4_6_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_4_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_4_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_4_1.setBounds(760, 26, 153, 26);
		panel.add(lblCourceFee_6_2_4_6_4_1);
		
		JLabel lblCourceFee_6_2_4_5 = new JLabel("10000");
		lblCourceFee_6_2_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5.setBounds(636, 58, 153, 26);
		panel.add(lblCourceFee_6_2_4_5);
		
		JLabel lblCourceFee_5_1_1_1 = new JLabel("20000");
		lblCourceFee_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_5_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_5_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_5_1_1_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_5_1_1_1.setBounds(251, 62, 131, 26);
		panel.add(lblCourceFee_5_1_1_1);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2_2 = new JLabel("30000");
		lblCourceFee_6_2_4_6_5_5_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2_2.setBounds(954, 58, 153, 26);
		panel.add(lblCourceFee_6_2_4_6_5_5_1_2_2);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2_1_1 = new JLabel("90000/Year");
		lblCourceFee_6_2_4_6_5_5_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2_1_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2_1_1.setBounds(954, 26, 153, 26);
		panel.add(lblCourceFee_6_2_4_6_5_5_1_2_1_1);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 255));
		panel_1.setBounds(84, 242, 1169, 110);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCourceFee_5_1 = new JLabel("Cource Fee");
		lblCourceFee_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_5_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_5_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_5_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_5_1.setBounds(87, 42, 131, 26);
		panel_1.add(lblCourceFee_5_1);
		
		JLabel lblCourceFee_6_2_3_2_1 = new JLabel("Examination Fee");
		lblCourceFee_6_2_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_3_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_3_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_3_2_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_3_2_1.setBounds(407, 42, 153, 26);
		panel_1.add(lblCourceFee_6_2_3_2_1);
		
		JLabel lblCourceFee_6_2_4_5_1_1 = new JLabel("Total Fee");
		lblCourceFee_6_2_4_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5_1_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5_1_1.setBounds(802, 42, 118, 26);
		panel_1.add(lblCourceFee_6_2_4_5_1_1);
		
		JLabel lblCourceFee_6_2_4_6_4_1_1 = new JLabel("Total Fee / Year");
		lblCourceFee_6_2_4_6_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_4_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_4_1_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_4_1_1.setBounds(763, 10, 153, 26);
		panel_1.add(lblCourceFee_6_2_4_6_4_1_1);
		
		JLabel lblCourceFee_6_2_4_5_2 = new JLabel("10000");
		lblCourceFee_6_2_4_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5_2.setBounds(639, 42, 153, 26);
		panel_1.add(lblCourceFee_6_2_4_5_2);
		
		JLabel lblBachelorOfPhysiotherapy = new JLabel("Bachelor of Physiotherapy");
		lblBachelorOfPhysiotherapy.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorOfPhysiotherapy.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBachelorOfPhysiotherapy.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorOfPhysiotherapy.setBackground(new Color(211, 211, 211));
		lblBachelorOfPhysiotherapy.setBounds(78, 6, 254, 26);
		panel_1.add(lblBachelorOfPhysiotherapy);
		
		JLabel lblCourceFee_5_1_1 = new JLabel("70000");
		lblCourceFee_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_5_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_5_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_5_1_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_5_1_1.setBounds(251, 42, 131, 26);
		panel_1.add(lblCourceFee_5_1_1);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2 = new JLabel("320000");
		lblCourceFee_6_2_4_6_5_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2.setBounds(958, 42, 153, 26);
		panel_1.add(lblCourceFee_6_2_4_6_5_5_1_2);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2_1 = new JLabel("80000/year");
		lblCourceFee_6_2_4_6_5_5_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2_1.setBounds(958, 10, 153, 26);
		panel_1.add(lblCourceFee_6_2_4_6_5_5_1_2_1);
		
		JLabel lblFeeDetailsPage = new JLabel("Fee Details page 2");
		lblFeeDetailsPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeDetailsPage.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblFeeDetailsPage.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblFeeDetailsPage.setBackground(new Color(211, 211, 211));
		lblFeeDetailsPage.setBounds(347, 87, 564, 36);
		contentPane.add(lblFeeDetailsPage);
	}
}
