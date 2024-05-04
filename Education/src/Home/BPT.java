package Home;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class BPT extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtYear;
	private JTextField txtHindi;
	private JTextField txtOnly;
	private JTextField txtSemester;
	private JTextField txtEnglish;
	private JButton btnNewButton;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblDuration;
	private JLabel lblMedium;
	private JLabel lblFeeStucture;
	private JLabel lblIntake;
	private JLabel lblTotalFee_1;
	private JLabel lblOnly_1;
	private JLabel lblBachelorOfPhysiotherapybpt;

	/**
	 * Launch the application.
	 */
	public static void Bpt() {
		try {
			BPT dialog = new BPT();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BPT() {
		setBounds(100, 100, 812, 472);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 250, 205));
		contentPanel.setBorder(new LineBorder(new Color(204, 255, 255), 7));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cource.CU();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.setBounds(682, 10, 106, 27);
		contentPanel.add(btnNewButton);
		
		panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(51, 104, 718, 242);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("ELIGIBILITY");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblNewLabel.setBackground(new Color(211, 211, 211));
		lblNewLabel.setBounds(25, 34, 136, 27);
		panel.add(lblNewLabel);
		
		lblDuration = new JLabel("DURATION");
		lblDuration.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuration.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDuration.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblDuration.setBackground(new Color(211, 211, 211));
		lblDuration.setBounds(166, 34, 136, 27);
		panel.add(lblDuration);
		
		lblMedium = new JLabel("MEDIUM");
		lblMedium.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedium.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMedium.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblMedium.setBackground(new Color(211, 211, 211));
		lblMedium.setBounds(305, 34, 120, 27);
		panel.add(lblMedium);
		
		lblFeeStucture = new JLabel("Fee Stucture");
		lblFeeStucture.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeStucture.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblFeeStucture.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblFeeStucture.setBackground(new Color(211, 211, 211));
		lblFeeStucture.setBounds(428, 34, 133, 27);
		panel.add(lblFeeStucture);
		
		lblIntake = new JLabel("INTAKE");
		lblIntake.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntake.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblIntake.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblIntake.setBackground(new Color(211, 211, 211));
		lblIntake.setBounds(571, 34, 126, 27);
		panel.add(lblIntake);
		
		JTextArea txtrPcmpcbAny = new JTextArea();
		txtrPcmpcbAny.setBounds(35, 79, 133, 55);
		panel.add(txtrPcmpcbAny);
		txtrPcmpcbAny.setEditable(false);
		txtrPcmpcbAny.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrPcmpcbAny.setText("10+2 PCM/PCB\r\nany institute/Board");
		txtrPcmpcbAny.setToolTipText("");
		
		txtYear = new JTextField();
		txtYear.setBounds(172, 80, 133, 20);
		panel.add(txtYear);
		txtYear.setBackground(new Color(255, 255, 255));
		txtYear.setEditable(false);
		txtYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtYear.setText("4 Year");
		txtYear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtYear.setColumns(10);
		
		txtSemester = new JTextField();
		txtSemester.setBounds(172, 103, 133, 20);
		panel.add(txtSemester);
		txtSemester.setBackground(new Color(255, 255, 255));
		txtSemester.setEditable(false);
		txtSemester.setText("8 Semester");
		txtSemester.setHorizontalAlignment(SwingConstants.CENTER);
		txtSemester.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtSemester.setColumns(10);
		
		txtEnglish = new JTextField();
		txtEnglish.setBounds(301, 103, 128, 20);
		panel.add(txtEnglish);
		txtEnglish.setBackground(new Color(255, 255, 255));
		txtEnglish.setEditable(false);
		txtEnglish.setText("English");
		txtEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnglish.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtEnglish.setColumns(10);
		
		txtHindi = new JTextField();
		txtHindi.setBounds(301, 80, 128, 20);
		panel.add(txtHindi);
		txtHindi.setBackground(new Color(255, 255, 255));
		txtHindi.setEditable(false);
		txtHindi.setHorizontalAlignment(SwingConstants.CENTER);
		txtHindi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtHindi.setText("Hindi");
		txtHindi.setColumns(10);
		
		JTextArea txtryearsemester = new JTextArea();
		txtryearsemester.setBounds(433, 79, 133, 44);
		panel.add(txtryearsemester);
		txtryearsemester.setEditable(false);
		txtryearsemester.setToolTipText("");
		txtryearsemester.setText("80000/Year\r\n40000/Semester");
		txtryearsemester.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		txtOnly = new JTextField();
		txtOnly.setBounds(573, 80, 128, 43);
		panel.add(txtOnly);
		txtOnly.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtOnly.setText("45 only");
		txtOnly.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnly.setBackground(new Color(255, 255, 255));
		txtOnly.setEditable(false);
		txtOnly.setColumns(10);
		
		lblTotalFee_1 = new JLabel("Total Fee 4 Year");
		lblTotalFee_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalFee_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTotalFee_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblTotalFee_1.setBackground(new Color(211, 211, 211));
		lblTotalFee_1.setBounds(66, 164, 267, 36);
		panel.add(lblTotalFee_1);
		
		lblOnly_1 = new JLabel("320000 Only");
		lblOnly_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnly_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblOnly_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblOnly_1.setBackground(new Color(211, 211, 211));
		lblOnly_1.setBounds(387, 164, 267, 36);
		panel.add(lblOnly_1);
		
		lblBachelorOfPhysiotherapybpt = new JLabel("Bachelor of Physiotherapy(BPT)");
		lblBachelorOfPhysiotherapybpt.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorOfPhysiotherapybpt.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBachelorOfPhysiotherapybpt.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorOfPhysiotherapybpt.setBackground(new Color(211, 211, 211));
		lblBachelorOfPhysiotherapybpt.setBounds(86, 47, 564, 36);
		contentPanel.add(lblBachelorOfPhysiotherapybpt);
	}
}

