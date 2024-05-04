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

public class Nursing extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtYear;
	private JTextField txtHindi;
	private JTextField txtOnly;
	private JTextField txtSemester;
	private JTextField txtEnglish;
	private JButton Sumbit_Details;
	private JPanel panel;
	private JLabel lblIntake;
	private JLabel lblFeeStucture;
	private JLabel lblMedium;
	private JLabel lblDuration;
	private JLabel lblNewLabel;
	private JLabel lblTotalFee;
	private JLabel lblOnly;
	private JLabel lblBachelorssNursingbscNursing;

	/**
	 * Launch the application.
	 */
	public static void Nurs() {
		try {
			Nursing dialog = new Nursing();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Nursing() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
		setBounds(100, 100, 812, 472);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 250, 205));
		contentPanel.setBorder(new LineBorder(new Color(204, 255, 255), 7));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtYear = new JTextField();
		txtYear.setBackground(new Color(255, 255, 255));
		txtYear.setEditable(false);
		txtYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtYear.setText("4 Year");
		txtYear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtYear.setColumns(10);
		txtYear.setBounds(217, 173, 133, 20);
		contentPanel.add(txtYear);
		
		txtHindi = new JTextField();
		txtHindi.setBackground(new Color(255, 255, 255));
		txtHindi.setEditable(false);
		txtHindi.setHorizontalAlignment(SwingConstants.CENTER);
		txtHindi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtHindi.setText("Hindi");
		txtHindi.setColumns(10);
		txtHindi.setBounds(346, 173, 128, 20);
		contentPanel.add(txtHindi);
		
		txtOnly = new JTextField();
		txtOnly.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtOnly.setText("120 only");
		txtOnly.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnly.setBackground(new Color(255, 255, 255));
		txtOnly.setEditable(false);
		txtOnly.setColumns(10);
		txtOnly.setBounds(618, 173, 128, 43);
		contentPanel.add(txtOnly);
		
		txtSemester = new JTextField();
		txtSemester.setBackground(new Color(255, 255, 255));
		txtSemester.setEditable(false);
		txtSemester.setText("8 Semester");
		txtSemester.setHorizontalAlignment(SwingConstants.CENTER);
		txtSemester.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtSemester.setColumns(10);
		txtSemester.setBounds(217, 196, 133, 20);
		contentPanel.add(txtSemester);
		
		JTextArea txtrPcmpcbAny = new JTextArea();
		txtrPcmpcbAny.setEditable(false);
		txtrPcmpcbAny.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrPcmpcbAny.setText("10+2 PCM/PCB\r\nany institute/Board");
		txtrPcmpcbAny.setToolTipText("");
		txtrPcmpcbAny.setBounds(80, 172, 133, 55);
		contentPanel.add(txtrPcmpcbAny);
		
		txtEnglish = new JTextField();
		txtEnglish.setBackground(new Color(255, 255, 255));
		txtEnglish.setEditable(false);
		txtEnglish.setText("English");
		txtEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnglish.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtEnglish.setColumns(10);
		txtEnglish.setBounds(346, 196, 128, 20);
		contentPanel.add(txtEnglish);
		
		JTextArea txtryearsemester = new JTextArea();
		txtryearsemester.setEditable(false);
		txtryearsemester.setToolTipText("");
		txtryearsemester.setText("80000/Year\r\n40000/Semester");
		txtryearsemester.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtryearsemester.setBounds(478, 172, 133, 44);
		contentPanel.add(txtryearsemester);
		
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
		Sumbit_Details.setBounds(700, 0, 98, 35);
		contentPanel.add(Sumbit_Details);
		
		panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(36, 100, 732, 258);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		lblIntake = new JLabel("INTAKE");
		lblIntake.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntake.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblIntake.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblIntake.setBackground(new Color(211, 211, 211));
		lblIntake.setBounds(582, 39, 126, 27);
		panel.add(lblIntake);
		
		lblFeeStucture = new JLabel("Fee Stucture");
		lblFeeStucture.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeStucture.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblFeeStucture.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblFeeStucture.setBackground(new Color(211, 211, 211));
		lblFeeStucture.setBounds(439, 39, 133, 27);
		panel.add(lblFeeStucture);
		
		lblMedium = new JLabel("MEDIUM");
		lblMedium.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedium.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMedium.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblMedium.setBackground(new Color(211, 211, 211));
		lblMedium.setBounds(316, 39, 120, 27);
		panel.add(lblMedium);
		
		lblDuration = new JLabel("DURATION");
		lblDuration.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuration.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDuration.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblDuration.setBackground(new Color(211, 211, 211));
		lblDuration.setBounds(177, 39, 136, 27);
		panel.add(lblDuration);
		
		lblNewLabel = new JLabel("ELIGIBILITY");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblNewLabel.setBackground(new Color(211, 211, 211));
		lblNewLabel.setBounds(36, 39, 136, 27);
		panel.add(lblNewLabel);
		
		lblTotalFee = new JLabel("Total Fee 4 Year");
		lblTotalFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalFee.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTotalFee.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblTotalFee.setBackground(new Color(211, 211, 211));
		lblTotalFee.setBounds(90, 162, 267, 36);
		panel.add(lblTotalFee);
		
		lblOnly = new JLabel("320000 Only");
		lblOnly.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnly.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblOnly.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblOnly.setBackground(new Color(211, 211, 211));
		lblOnly.setBounds(411, 162, 267, 36);
		panel.add(lblOnly);
		
		lblBachelorssNursingbscNursing = new JLabel("Bachelors's Nursing(B.sc Nursing)");
		lblBachelorssNursingbscNursing.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssNursingbscNursing.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBachelorssNursingbscNursing.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssNursingbscNursing.setBackground(new Color(211, 211, 211));
		lblBachelorssNursingbscNursing.setBounds(109, 45, 564, 36);
		contentPanel.add(lblBachelorssNursingbscNursing);
	}
}
