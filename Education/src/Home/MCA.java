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
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class MCA extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtYear;
	private JTextField txtHindi;
	private JTextField txtOnly;
	private JTextField txtSemester;
	private JTextField txtEnglish;
	private JButton Sumbit_Details;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblDuration;
	private JLabel lblMedium;
	private JLabel lblFeeStucture;
	private JLabel lblIntake;
	private JLabel lblTotalFee_1;
	private JLabel lblOnly_1;
	private JLabel lblBachelorssInComputer;
	private JLabel lblMasterssInComputer;

	/**
	 * Launch the application.
	 */
	public static void m() {
		try {
			MCA dialog = new MCA();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MCA() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
		setBounds(100, 100, 812, 472);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 204));
		contentPanel.setBorder(new LineBorder(new Color(204, 255, 255), 7));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		Sumbit_Details = new JButton("Back");
		Sumbit_Details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeDetails.Fee();
				dispose();
			}
		});
		Sumbit_Details.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Sumbit_Details.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 153, 51), new Color(204, 0, 255), new Color(255, 0, 0), new Color(204, 0, 0)));
		Sumbit_Details.setBackground(new Color(255, 69, 0));
		Sumbit_Details.setBounds(690, 10, 98, 35);
		contentPanel.add(Sumbit_Details);
		
		panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(25, 142, 741, 240);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("ELIGIBILITY");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblNewLabel.setBackground(new Color(211, 211, 211));
		lblNewLabel.setBounds(41, 31, 136, 27);
		panel.add(lblNewLabel);
		
		lblDuration = new JLabel("DURATION");
		lblDuration.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuration.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDuration.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblDuration.setBackground(new Color(211, 211, 211));
		lblDuration.setBounds(182, 31, 136, 27);
		panel.add(lblDuration);
		
		lblMedium = new JLabel("MEDIUM");
		lblMedium.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedium.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMedium.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblMedium.setBackground(new Color(211, 211, 211));
		lblMedium.setBounds(321, 31, 120, 27);
		panel.add(lblMedium);
		
		lblFeeStucture = new JLabel("Fee Stucture");
		lblFeeStucture.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeStucture.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblFeeStucture.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblFeeStucture.setBackground(new Color(211, 211, 211));
		lblFeeStucture.setBounds(444, 31, 133, 27);
		panel.add(lblFeeStucture);
		
		lblIntake = new JLabel("INTAKE");
		lblIntake.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntake.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblIntake.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblIntake.setBackground(new Color(211, 211, 211));
		lblIntake.setBounds(587, 31, 126, 27);
		panel.add(lblIntake);
		
		lblTotalFee_1 = new JLabel("Total Fee 2 Year");
		lblTotalFee_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalFee_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTotalFee_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblTotalFee_1.setBackground(new Color(211, 211, 211));
		lblTotalFee_1.setBounds(77, 162, 267, 36);
		panel.add(lblTotalFee_1);
		
		lblOnly_1 = new JLabel("120000 Only");
		lblOnly_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnly_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblOnly_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblOnly_1.setBackground(new Color(211, 211, 211));
		lblOnly_1.setBounds(398, 162, 267, 36);
		panel.add(lblOnly_1);
		
		JTextArea txtrPcmpcbAny = new JTextArea();
		txtrPcmpcbAny.setBounds(51, 68, 133, 55);
		panel.add(txtrPcmpcbAny);
		txtrPcmpcbAny.setEditable(false);
		txtrPcmpcbAny.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrPcmpcbAny.setText("BCA/B.sc in \r\nComputer Science\r\nany institute/Board");
		txtrPcmpcbAny.setToolTipText("");
		
		txtYear = new JTextField();
		txtYear.setBounds(188, 69, 133, 20);
		panel.add(txtYear);
		txtYear.setBackground(new Color(255, 255, 255));
		txtYear.setEditable(false);
		txtYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtYear.setText("2 Year");
		txtYear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtYear.setColumns(10);
		
		txtSemester = new JTextField();
		txtSemester.setBounds(188, 92, 133, 20);
		panel.add(txtSemester);
		txtSemester.setBackground(new Color(255, 255, 255));
		txtSemester.setEditable(false);
		txtSemester.setText("4 Semester");
		txtSemester.setHorizontalAlignment(SwingConstants.CENTER);
		txtSemester.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtSemester.setColumns(10);
		
		txtHindi = new JTextField();
		txtHindi.setBounds(317, 69, 128, 20);
		panel.add(txtHindi);
		txtHindi.setBackground(new Color(255, 255, 255));
		txtHindi.setEditable(false);
		txtHindi.setHorizontalAlignment(SwingConstants.CENTER);
		txtHindi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtHindi.setText("Hindi");
		txtHindi.setColumns(10);
		
		txtEnglish = new JTextField();
		txtEnglish.setBounds(317, 92, 128, 20);
		panel.add(txtEnglish);
		txtEnglish.setBackground(new Color(255, 255, 255));
		txtEnglish.setEditable(false);
		txtEnglish.setText("English");
		txtEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnglish.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtEnglish.setColumns(10);
		
		JTextArea txtryearsemester = new JTextArea();
		txtryearsemester.setBounds(449, 68, 133, 44);
		panel.add(txtryearsemester);
		txtryearsemester.setEditable(false);
		txtryearsemester.setToolTipText("");
		txtryearsemester.setText("60000/Year\r\n30000/Semester");
		txtryearsemester.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		txtOnly = new JTextField();
		txtOnly.setBounds(589, 69, 128, 43);
		panel.add(txtOnly);
		txtOnly.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtOnly.setText("30 only");
		txtOnly.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnly.setBackground(new Color(255, 255, 255));
		txtOnly.setEditable(false);
		txtOnly.setColumns(10);
		
		lblBachelorssInComputer = new JLabel("Bachelors's in Computer Application");
		lblBachelorssInComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssInComputer.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBachelorssInComputer.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssInComputer.setBackground(new Color(211, 211, 211));
		lblBachelorssInComputer.setBounds(62, -95, 564, 36);
		contentPanel.add(lblBachelorssInComputer);
		
		lblMasterssInComputer = new JLabel("Masters's in Computer Application");
		lblMasterssInComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblMasterssInComputer.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblMasterssInComputer.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblMasterssInComputer.setBackground(new Color(211, 211, 211));
		lblMasterssInComputer.setBounds(91, 62, 564, 36);
		contentPanel.add(lblMasterssInComputer);
	}
}
