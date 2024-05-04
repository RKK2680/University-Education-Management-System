package Home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import userdetails.project;

import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class FeeDetails extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;

	/**
	 * Launch the application.
	 */
	public static void Fee() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeDetails frame = new FeeDetails();
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
	public FeeDetails() {
		setFont(new Font("Dialog", Font.BOLD, 15));
		setTitle("\r\nFee Details");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\eclipse-workspace\\Education Management System\\img\\pyemnt.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1333, 788);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 224));
		contentPane.setBorder(new LineBorder(new Color(255, 165, 0), 6));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeDetails2 oDetails2=new FeeDetails2();
				oDetails2.Fee2();
			}
		});
		btnNewButton.setBackground(new Color(51, 255, 153));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(1102, 703, 132, 27);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setBackground(new Color(204, 153, 204));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				project.main(null);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(743, 704, 89, 24);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				project.main(null);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(255, 99, 71));
		btnNewButton_2.setBounds(1203, 10, 106, 27);
		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(99, 84, 1164, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBachelorsOfComputer = new JLabel("Bachelors of Computer Aplication(BCA)");
		lblBachelorsOfComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorsOfComputer.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBachelorsOfComputer.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorsOfComputer.setBackground(new Color(211, 211, 211));
		lblBachelorsOfComputer.setBounds(31, 10, 328, 26);
		panel.add(lblBachelorsOfComputer);
		
		JLabel lblCourceFee = new JLabel("Cource Fee");
		lblCourceFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee.setBackground(new Color(211, 211, 211));
		lblCourceFee.setBounds(118, 52, 131, 26);
		panel.add(lblCourceFee);
		
		JLabel lblCourceFee_6 = new JLabel("50000");
		lblCourceFee_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6.setBackground(new Color(211, 211, 211));
		lblCourceFee_6.setBounds(279, 52, 131, 26);
		panel.add(lblCourceFee_6);
		
		JLabel lblCourceFee_6_2 = new JLabel("Examination Fee");
		lblCourceFee_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2.setBounds(432, 52, 153, 26);
		panel.add(lblCourceFee_6_2);
		
		JLabel lblCourceFee_6_2_4 = new JLabel("10000");
		lblCourceFee_6_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4.setBounds(649, 52, 153, 26);
		panel.add(lblCourceFee_6_2_4);
		
		JLabel lblCourceFee_6_2_4_6 = new JLabel("Total Fee / Year");
		lblCourceFee_6_2_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6.setBounds(785, 19, 153, 26);
		panel.add(lblCourceFee_6_2_4_6);
		
		JLabel lblCourceFee_6_2_4_5_1_5 = new JLabel("Total Fee");
		lblCourceFee_6_2_4_5_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5_1_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5_1_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5_1_5.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5_1_5.setBounds(812, 52, 118, 26);
		panel.add(lblCourceFee_6_2_4_5_1_5);
		
		JLabel lblCourceFee_6_2_4_6_5 = new JLabel("60000/Year");
		lblCourceFee_6_2_4_6_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5.setBounds(946, 19, 153, 26);
		panel.add(lblCourceFee_6_2_4_6_5);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2_3 = new JLabel("180000/Year");
		lblCourceFee_6_2_4_6_5_5_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2_3.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2_3.setBounds(940, 52, 153, 26);
		panel.add(lblCourceFee_6_2_4_6_5_5_1_2_3);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 255));
		panel_1.setBounds(99, 195, 1164, 94);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMastorsOfComputer = new JLabel("Mastors of Computer Aplication(MCA)");
		lblMastorsOfComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblMastorsOfComputer.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblMastorsOfComputer.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblMastorsOfComputer.setBackground(new Color(211, 211, 211));
		lblMastorsOfComputer.setBounds(22, 0, 328, 26);
		panel_1.add(lblMastorsOfComputer);
		
		JLabel lblCourceFee_1 = new JLabel("Cource Fee");
		lblCourceFee_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_1.setBounds(118, 36, 131, 26);
		panel_1.add(lblCourceFee_1);
		
		JLabel lblCourceFee_6_1 = new JLabel("50000");
		lblCourceFee_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_1.setBounds(276, 36, 131, 26);
		panel_1.add(lblCourceFee_6_1);
		
		JLabel lblCourceFee_6_2_1 = new JLabel("Examination Fee");
		lblCourceFee_6_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_1.setBounds(427, 36, 153, 26);
		panel_1.add(lblCourceFee_6_2_1);
		
		JLabel lblCourceFee_6_2_4_1 = new JLabel("10000");
		lblCourceFee_6_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_1.setBounds(645, 36, 153, 26);
		panel_1.add(lblCourceFee_6_2_4_1);
		
		JLabel lblCourceFee_6_2_4_6_1 = new JLabel("Total Fee / Year");
		lblCourceFee_6_2_4_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_1.setBounds(780, 0, 153, 26);
		panel_1.add(lblCourceFee_6_2_4_6_1);
		
		JLabel lblCourceFee_6_2_4_5_1_4 = new JLabel("Total Fee");
		lblCourceFee_6_2_4_5_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5_1_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5_1_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5_1_4.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5_1_4.setBounds(808, 36, 118, 26);
		panel_1.add(lblCourceFee_6_2_4_5_1_4);
		
		JLabel lblCourceFee_6_2_4_6_5_1 = new JLabel("60000/Year");
		lblCourceFee_6_2_4_6_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_1.setBounds(943, 0, 153, 26);
		panel_1.add(lblCourceFee_6_2_4_6_5_1);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2_2 = new JLabel("120000/Year");
		lblCourceFee_6_2_4_6_5_5_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2_2.setBounds(943, 36, 153, 26);
		panel_1.add(lblCourceFee_6_2_4_6_5_5_1_2_2);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 255));
		panel_2.setBounds(99, 296, 1164, 94);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblBiotechnologybioTech = new JLabel("Biotechnology(Bio tech)");
		lblBiotechnologybioTech.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiotechnologybioTech.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBiotechnologybioTech.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBiotechnologybioTech.setBackground(new Color(211, 211, 211));
		lblBiotechnologybioTech.setBounds(20, 8, 328, 26);
		panel_2.add(lblBiotechnologybioTech);
		
		JLabel lblCourceFee_2 = new JLabel("Cource Fee");
		lblCourceFee_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_2.setBounds(118, 38, 131, 26);
		panel_2.add(lblCourceFee_2);
		
		JLabel lblCourceFee_6_2_2 = new JLabel("Examination Fee");
		lblCourceFee_6_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_2.setBounds(429, 38, 153, 26);
		panel_2.add(lblCourceFee_6_2_2);
		
		JLabel lblCourceFee_6_2_4_2 = new JLabel("10000");
		lblCourceFee_6_2_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_2.setBounds(651, 38, 153, 26);
		panel_2.add(lblCourceFee_6_2_4_2);
		
		JLabel lblCourceFee_6_2_4_6_2 = new JLabel("Total Fee / Year");
		lblCourceFee_6_2_4_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_2.setBounds(782, 8, 153, 26);
		panel_2.add(lblCourceFee_6_2_4_6_2);
		
		JLabel lblCourceFee_6_2_4_5_1_3 = new JLabel("Total Fee");
		lblCourceFee_6_2_4_5_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5_1_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5_1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5_1_3.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5_1_3.setBounds(814, 38, 118, 26);
		panel_2.add(lblCourceFee_6_2_4_5_1_3);
		
		JLabel lblCourceFee_6_2_4_6_5_2 = new JLabel("80000/Year");
		lblCourceFee_6_2_4_6_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_2.setBounds(948, 8, 153, 26);
		panel_2.add(lblCourceFee_6_2_4_6_5_2);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2_1 = new JLabel("320000/Year");
		lblCourceFee_6_2_4_6_5_5_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2_1.setBounds(948, 38, 153, 26);
		panel_2.add(lblCourceFee_6_2_4_6_5_5_1_2_1);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2_4 = new JLabel("70000");
		lblCourceFee_6_2_4_6_5_5_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2_4.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2_4.setBounds(266, 38, 153, 26);
		panel_2.add(lblCourceFee_6_2_4_6_5_5_1_2_4);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 255, 255));
		panel_3.setBounds(99, 398, 1164, 94);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblFoodNutrition = new JLabel("Food & Nutrition");
		lblFoodNutrition.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoodNutrition.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblFoodNutrition.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblFoodNutrition.setBackground(new Color(211, 211, 211));
		lblFoodNutrition.setBounds(22, 8, 328, 26);
		panel_3.add(lblFoodNutrition);
		
		JLabel lblCourceFee_3 = new JLabel("Cource Fee");
		lblCourceFee_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_3.setBackground(new Color(211, 211, 211));
		lblCourceFee_3.setBounds(114, 39, 131, 26);
		panel_3.add(lblCourceFee_3);
		
		JLabel lblCourceFee_6_2_3 = new JLabel("Examination Fee");
		lblCourceFee_6_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_3.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_3.setBounds(428, 39, 153, 26);
		panel_3.add(lblCourceFee_6_2_3);
		
		JLabel lblCourceFee_6_2_4_3 = new JLabel("10000");
		lblCourceFee_6_2_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_3.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_3.setBounds(654, 39, 153, 26);
		panel_3.add(lblCourceFee_6_2_4_3);
		
		JLabel lblCourceFee_6_2_4_6_3 = new JLabel("Total Fee / Year");
		lblCourceFee_6_2_4_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_3.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_3.setBounds(784, 8, 153, 26);
		panel_3.add(lblCourceFee_6_2_4_6_3);
		
		JLabel lblCourceFee_6_2_4_5_1_2 = new JLabel("Total Fee");
		lblCourceFee_6_2_4_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5_1_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5_1_2.setBounds(817, 39, 118, 26);
		panel_3.add(lblCourceFee_6_2_4_5_1_2);
		
		JLabel lblCourceFee_6_2_4_6_5_3 = new JLabel("50000/Year");
		lblCourceFee_6_2_4_6_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_3.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_3.setBounds(947, 8, 153, 26);
		panel_3.add(lblCourceFee_6_2_4_6_5_3);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_1 = new JLabel("150000/Year");
		lblCourceFee_6_2_4_6_5_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_1.setBounds(945, 39, 153, 26);
		panel_3.add(lblCourceFee_6_2_4_6_5_5_1_1);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2_4_2 = new JLabel("40000");
		lblCourceFee_6_2_4_6_5_5_1_2_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2_4_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2_4_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2_4_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2_4_2.setBounds(265, 39, 153, 26);
		panel_3.add(lblCourceFee_6_2_4_6_5_5_1_2_4_2);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 255, 255));
		panel_4.setBounds(99, 500, 1164, 94);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblBachelorssNursing = new JLabel("Bachelors's Nursing");
		lblBachelorssNursing.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssNursing.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBachelorssNursing.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssNursing.setBackground(new Color(211, 211, 211));
		lblBachelorssNursing.setBounds(25, 0, 328, 26);
		panel_4.add(lblBachelorssNursing);
		
		JLabel lblCourceFee_4 = new JLabel("Cource Fee");
		lblCourceFee_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_4.setBackground(new Color(211, 211, 211));
		lblCourceFee_4.setBounds(105, 36, 131, 26);
		panel_4.add(lblCourceFee_4);
		
		JLabel lblCourceFee_6_2_3_1 = new JLabel("Examination Fee");
		lblCourceFee_6_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_3_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_3_1.setBounds(430, 36, 153, 26);
		panel_4.add(lblCourceFee_6_2_3_1);
		
		JLabel lblCourceFee_6_2_4_4 = new JLabel("10000");
		lblCourceFee_6_2_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_4.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_4.setBounds(656, 36, 153, 26);
		panel_4.add(lblCourceFee_6_2_4_4);
		
		JLabel lblCourceFee_6_2_4_6_4 = new JLabel("Total Fee / Year");
		lblCourceFee_6_2_4_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_4.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_4.setBounds(781, 9, 153, 26);
		panel_4.add(lblCourceFee_6_2_4_6_4);
		
		JLabel lblCourceFee_6_2_4_5_1_1 = new JLabel("Total Fee");
		lblCourceFee_6_2_4_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5_1_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5_1_1.setBounds(819, 36, 118, 26);
		panel_4.add(lblCourceFee_6_2_4_5_1_1);
		
		JLabel lblCourceFee_6_2_4_6_5_4 = new JLabel("80000/Year");
		lblCourceFee_6_2_4_6_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_4.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_4.setBounds(944, 9, 153, 26);
		panel_4.add(lblCourceFee_6_2_4_6_5_4);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2 = new JLabel("320000/Year");
		lblCourceFee_6_2_4_6_5_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2.setBounds(947, 36, 153, 26);
		panel_4.add(lblCourceFee_6_2_4_6_5_5_1_2);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2_4_1 = new JLabel("70000");
		lblCourceFee_6_2_4_6_5_5_1_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2_4_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2_4_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2_4_1.setBounds(258, 36, 153, 26);
		panel_4.add(lblCourceFee_6_2_4_6_5_5_1_2_4_1);
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(204, 255, 255));
		panel_5.setBounds(99, 599, 1164, 94);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblBachelorssOfPharmecy = new JLabel("Bachelors's Of  Pharmecy");
		lblBachelorssOfPharmecy.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssOfPharmecy.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBachelorssOfPharmecy.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssOfPharmecy.setBackground(new Color(211, 211, 211));
		lblBachelorssOfPharmecy.setBounds(27, 8, 328, 26);
		panel_5.add(lblBachelorssOfPharmecy);
		
		JLabel lblCourceFee_5 = new JLabel("Cource Fee");
		lblCourceFee_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_5.setBackground(new Color(211, 211, 211));
		lblCourceFee_5.setBounds(106, 40, 131, 26);
		panel_5.add(lblCourceFee_5);
		
		JLabel lblCourceFee_6_2_3_2 = new JLabel("Examination Fee");
		lblCourceFee_6_2_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_3_2.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_3_2.setBounds(426, 40, 153, 26);
		panel_5.add(lblCourceFee_6_2_3_2);
		
		JLabel lblCourceFee_6_2_4_5 = new JLabel("10000");
		lblCourceFee_6_2_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5.setBounds(658, 40, 153, 26);
		panel_5.add(lblCourceFee_6_2_4_5);
		
		JLabel lblCourceFee_6_2_4_5_1 = new JLabel("Total Fee");
		lblCourceFee_6_2_4_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_5_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_5_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_5_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_5_1.setBounds(821, 40, 118, 26);
		panel_5.add(lblCourceFee_6_2_4_5_1);
		
		JLabel lblCourceFee_6_2_4_6_4_1 = new JLabel("Total Fee / Year");
		lblCourceFee_6_2_4_6_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_4_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_4_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_4_1.setBounds(782, 8, 153, 26);
		panel_5.add(lblCourceFee_6_2_4_6_4_1);
		
		JLabel lblCourceFee_6_2_4_6_5_5 = new JLabel("50000/Year");
		lblCourceFee_6_2_4_6_5_5.setBounds(945, 8, 153, 26);
		panel_5.add(lblCourceFee_6_2_4_6_5_5);
		lblCourceFee_6_2_4_6_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5.setBackground(new Color(211, 211, 211));
		
		JLabel lblCourceFee_6_2_4_6_5_5_1 = new JLabel("150000/Year");
		lblCourceFee_6_2_4_6_5_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1.setBounds(949, 40, 153, 26);
		panel_5.add(lblCourceFee_6_2_4_6_5_5_1);
		
		JLabel lblCourceFee_6_2_4_6_5_5_1_2_4_2_1 = new JLabel("40000");
		lblCourceFee_6_2_4_6_5_5_1_2_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceFee_6_2_4_6_5_5_1_2_4_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCourceFee_6_2_4_6_5_5_1_2_4_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblCourceFee_6_2_4_6_5_5_1_2_4_2_1.setBackground(new Color(211, 211, 211));
		lblCourceFee_6_2_4_6_5_5_1_2_4_2_1.setBounds(263, 40, 153, 26);
		panel_5.add(lblCourceFee_6_2_4_6_5_5_1_2_4_2_1);
		
		JLabel lblFeeDetails = new JLabel("Fee Details");
		lblFeeDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeDetails.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblFeeDetails.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblFeeDetails.setBackground(new Color(211, 211, 211));
		lblFeeDetails.setBounds(426, 38, 564, 36);
		contentPane.add(lblFeeDetails);
	}
}
