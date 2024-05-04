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

public class BA extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtYear;
	private JTextField txtHindi;
	private JTextField txtOnly;
	private JTextField txtSemester;
	private JTextField txtEnglish;
	private JButton btnNewButton;
	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void ba() {
		try {
			BA dialog = new BA();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BA() {
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
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(692, 10, 106, 27);
		contentPanel.add(btnNewButton);
		
		panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(26, 124, 747, 233);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ELIGIBILITY");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblNewLabel.setBackground(new Color(211, 211, 211));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(49, 30, 136, 27);
		panel.add(lblNewLabel);
		
		JLabel lblDuration = new JLabel("DURATION");
		lblDuration.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuration.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDuration.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblDuration.setBackground(new Color(211, 211, 211));
		lblDuration.setBounds(189, 30, 136, 27);
		panel.add(lblDuration);
		
		JLabel lblMedium = new JLabel("MEDIUM");
		lblMedium.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedium.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMedium.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblMedium.setBackground(new Color(211, 211, 211));
		lblMedium.setBounds(328, 30, 120, 27);
		panel.add(lblMedium);
		
		JLabel lblFeeStucture = new JLabel("Fee Stucture");
		lblFeeStucture.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeStucture.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblFeeStucture.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblFeeStucture.setBackground(new Color(211, 211, 211));
		lblFeeStucture.setBounds(451, 30, 133, 27);
		panel.add(lblFeeStucture);
		
		JLabel lblIntake = new JLabel("INTAKE");
		lblIntake.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntake.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblIntake.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblIntake.setBackground(new Color(211, 211, 211));
		lblIntake.setBounds(594, 30, 126, 27);
		panel.add(lblIntake);
		
		JLabel lblTotalFee = new JLabel("Total Fee 3 Year");
		lblTotalFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalFee.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTotalFee.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblTotalFee.setBackground(new Color(211, 211, 211));
		lblTotalFee.setBounds(98, 146, 277, 36);
		panel.add(lblTotalFee);
		
		JLabel lblOnly = new JLabel("90000 Only");
		lblOnly.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnly.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblOnly.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblOnly.setBackground(new Color(211, 211, 211));
		lblOnly.setBounds(412, 146, 277, 36);
		panel.add(lblOnly);
		
		JTextArea txtrPcmpcbAny = new JTextArea();
		txtrPcmpcbAny.setBounds(59, 62, 133, 55);
		panel.add(txtrPcmpcbAny);
		txtrPcmpcbAny.setEditable(false);
		txtrPcmpcbAny.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrPcmpcbAny.setText("10+2 Only\r\nany institute/Board");
		txtrPcmpcbAny.setToolTipText("");
		
		txtSemester = new JTextField();
		txtSemester.setBounds(196, 86, 133, 20);
		panel.add(txtSemester);
		txtSemester.setBackground(new Color(255, 255, 255));
		txtSemester.setEditable(false);
		txtSemester.setText("6 Semester");
		txtSemester.setHorizontalAlignment(SwingConstants.CENTER);
		txtSemester.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtSemester.setColumns(10);
		
		txtYear = new JTextField();
		txtYear.setBounds(196, 63, 133, 20);
		panel.add(txtYear);
		txtYear.setBackground(new Color(255, 255, 255));
		txtYear.setEditable(false);
		txtYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtYear.setText("3 Year");
		txtYear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtYear.setColumns(10);
		
		txtEnglish = new JTextField();
		txtEnglish.setBounds(325, 86, 128, 20);
		panel.add(txtEnglish);
		txtEnglish.setBackground(new Color(255, 255, 255));
		txtEnglish.setEditable(false);
		txtEnglish.setText("English");
		txtEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnglish.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtEnglish.setColumns(10);
		
		txtHindi = new JTextField();
		txtHindi.setBounds(325, 63, 128, 20);
		panel.add(txtHindi);
		txtHindi.setBackground(new Color(255, 255, 255));
		txtHindi.setEditable(false);
		txtHindi.setHorizontalAlignment(SwingConstants.CENTER);
		txtHindi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtHindi.setText("Hindi");
		txtHindi.setColumns(10);
		
		JTextArea txtryearsemester = new JTextArea();
		txtryearsemester.setBounds(457, 62, 133, 44);
		panel.add(txtryearsemester);
		txtryearsemester.setEditable(false);
		txtryearsemester.setToolTipText("");
		txtryearsemester.setText("30000/Year\r\n15000/Semester");
		txtryearsemester.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		txtOnly = new JTextField();
		txtOnly.setBounds(597, 63, 128, 43);
		panel.add(txtOnly);
		txtOnly.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtOnly.setText("80 only");
		txtOnly.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnly.setBackground(new Color(255, 255, 255));
		txtOnly.setEditable(false);
		txtOnly.setColumns(10);
		
		JLabel lblBachelorssOfArts = new JLabel("Bachelors's Of Arts");
		lblBachelorssOfArts.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssOfArts.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBachelorssOfArts.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssOfArts.setBackground(new Color(211, 211, 211));
		lblBachelorssOfArts.setBounds(185, 56, 421, 36);
		contentPanel.add(lblBachelorssOfArts);
	}
}
