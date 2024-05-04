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
import java.awt.Toolkit;

public class Biotech extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtYear;
	private JTextField txtOnly;
	private JTextField txtSemester;
	private JTextField txtEnglish;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblDuration;
	private JLabel lblMedium;
	private JLabel lblFeeStucture;
	private JLabel lblIntake;
	private JPanel panel;
	private JLabel lblTotalFee;
	private JLabel lblOnly_1;
	private JLabel lblBiotechnologybscBio;

	/**
	 * Launch the application.
	 */
	public static void Bi0t() {
		try {
			Biotech dialog = new Biotech();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Biotech() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
		setBounds(100, 100, 812, 472);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 204));
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
		panel.setBounds(33, 131, 740, 223);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("ELIGIBILITY");
		lblNewLabel.setBounds(36, 38, 136, 27);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblNewLabel.setBackground(new Color(211, 211, 211));
		
		lblDuration = new JLabel("DURATION");
		lblDuration.setBounds(177, 38, 136, 27);
		panel.add(lblDuration);
		lblDuration.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuration.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDuration.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblDuration.setBackground(new Color(211, 211, 211));
		
		lblMedium = new JLabel("MEDIUM");
		lblMedium.setBounds(316, 38, 120, 27);
		panel.add(lblMedium);
		lblMedium.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedium.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMedium.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblMedium.setBackground(new Color(211, 211, 211));
		
		lblFeeStucture = new JLabel("Fee Stucture");
		lblFeeStucture.setBounds(439, 38, 133, 27);
		panel.add(lblFeeStucture);
		lblFeeStucture.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeStucture.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblFeeStucture.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblFeeStucture.setBackground(new Color(211, 211, 211));
		
		lblIntake = new JLabel("INTAKE");
		lblIntake.setBounds(582, 38, 126, 27);
		panel.add(lblIntake);
		lblIntake.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntake.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblIntake.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblIntake.setBackground(new Color(211, 211, 211));
		
		txtOnly = new JTextField();
		txtOnly.setBounds(580, 75, 128, 43);
		panel.add(txtOnly);
		txtOnly.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtOnly.setText("60 only");
		txtOnly.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnly.setBackground(new Color(255, 255, 255));
		txtOnly.setEditable(false);
		txtOnly.setColumns(10);
		
		JTextArea txtryearsemester = new JTextArea();
		txtryearsemester.setBounds(440, 74, 133, 44);
		panel.add(txtryearsemester);
		txtryearsemester.setEditable(false);
		txtryearsemester.setToolTipText("");
		txtryearsemester.setText("80000/Year\r\n40000/Semester");
		txtryearsemester.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		txtEnglish = new JTextField();
		txtEnglish.setBounds(320, 75, 116, 43);
		panel.add(txtEnglish);
		txtEnglish.setBackground(new Color(255, 255, 255));
		txtEnglish.setEditable(false);
		txtEnglish.setText("Only English");
		txtEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnglish.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtEnglish.setColumns(10);
		
		txtSemester = new JTextField();
		txtSemester.setBounds(179, 98, 133, 20);
		panel.add(txtSemester);
		txtSemester.setBackground(new Color(255, 255, 255));
		txtSemester.setEditable(false);
		txtSemester.setText("8 Semester");
		txtSemester.setHorizontalAlignment(SwingConstants.CENTER);
		txtSemester.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtSemester.setColumns(10);
		
		txtYear = new JTextField();
		txtYear.setBounds(179, 75, 133, 20);
		panel.add(txtYear);
		txtYear.setBackground(new Color(255, 255, 255));
		txtYear.setEditable(false);
		txtYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtYear.setText("4 Year");
		txtYear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtYear.setColumns(10);
		
		JTextArea txtrPcmpcbAny = new JTextArea();
		txtrPcmpcbAny.setBounds(42, 74, 133, 55);
		panel.add(txtrPcmpcbAny);
		txtrPcmpcbAny.setEditable(false);
		txtrPcmpcbAny.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrPcmpcbAny.setText("10+2 PCB/PCM\r\nany institute/Board");
		txtrPcmpcbAny.setToolTipText("");
		
		lblTotalFee = new JLabel("Total Fee 3 Year");
		lblTotalFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalFee.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTotalFee.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblTotalFee.setBackground(new Color(211, 211, 211));
		lblTotalFee.setBounds(71, 154, 267, 36);
		panel.add(lblTotalFee);
		
		lblOnly_1 = new JLabel("320000 Only");
		lblOnly_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnly_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblOnly_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblOnly_1.setBackground(new Color(211, 211, 211));
		lblOnly_1.setBounds(392, 154, 267, 36);
		panel.add(lblOnly_1);
		
		lblBiotechnologybscBio = new JLabel("Biotechnology (B.sc Bio tech)");
		lblBiotechnologybscBio.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiotechnologybscBio.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBiotechnologybscBio.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBiotechnologybscBio.setBackground(new Color(211, 211, 211));
		lblBiotechnologybscBio.setBounds(98, 42, 564, 36);
		contentPanel.add(lblBiotechnologybscBio);
	}
}
