package Home;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class HomeM extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtHome;

	/**
	 * Launch the application.
	 */
	public static void home() {
		try {
			HomeM dialog = new HomeM();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HomeM() {
		setBackground(new Color(0, 255, 0));
		setTitle("Home");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\eclipse-workspace\\Education Management System\\img\\home-icon.png"));
		setBounds(100, 100, 169, 246);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(205, 133, 63));
		contentPanel.setBorder(new EmptyBorder(0, 0, 18, 60));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtHome = new JTextField();
			txtHome.setBackground(new Color(255, 228, 225));
			txtHome.setEnabled(false);
			txtHome.setEditable(false);
			txtHome.setHorizontalAlignment(SwingConstants.CENTER);
			txtHome.setFont(new Font("Times New Roman", Font.BOLD, 18));
			txtHome.setText("HOME");
			txtHome.setBounds(26, 11, 95, 29);
			contentPanel.add(txtHome);
			txtHome.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Admission");
			btnNewButton.setBackground(new Color(135, 206, 235));
			btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Admission1.main(null);
					dispose();
				} 
			});
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnNewButton.setBounds(10, 51, 133, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnCourse = new JButton("Course");
			btnCourse.setBackground(new Color(173, 216, 230));
			btnCourse.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			btnCourse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Cource cource=new Cource();
					cource.CU();
				}
			});
			btnCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnCourse.setBounds(10, 85, 133, 23);
			contentPanel.add(btnCourse);
		}
		{
			JButton btnFeeDetails = new JButton("Fee Details");
			btnFeeDetails.setBackground(new Color(173, 216, 230));
			btnFeeDetails.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			btnFeeDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FeeDetails oDetails =new FeeDetails();
					oDetails.Fee();
				}
			});
			btnFeeDetails.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnFeeDetails.setBounds(10, 119, 133, 23);
			contentPanel.add(btnFeeDetails);
		}
		{
			JButton btnCourse = new JButton("Photos");
			btnCourse.setBackground(new Color(173, 216, 230));
			btnCourse.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			btnCourse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Photo oph=new Photo();
					oph.main(null);
				}
			});
			btnCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnCourse.setBounds(10, 153, 133, 23);
			contentPanel.add(btnCourse);
		}
	}

}
