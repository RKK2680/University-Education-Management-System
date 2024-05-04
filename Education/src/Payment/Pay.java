package Payment;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class Pay extends JFrame {
	private JLabel Photo;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pay frame = new Pay();
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
	public static String path;
	private JLabel lblQrCode;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JSeparator separator_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_1_1;
	private JLabel lblNewLabel_2_1_1_1;
	private JLabel lblNewLabel_2_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_1;
	private JLabel lblNewLabel_2_1_1_2_1;
	private JLabel lblNewLabel_2_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_2_2;
	private JLabel lblNewLabel_2_1_1_1_1_1;
	private JLabel lblNewLabel_2_1_1_2_1_1;
	private JLabel lblNewLabel_2_1_1_3;
	private JLabel lblNewLabel_2_1_1_3_1;
	private JButton btnNewButton;
	private JLabel lblfistPaymentFor;
	private JLabel lblfistPaymentFor_2;

	public  Pay() {
		setTitle("Pyment");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 626);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 51), 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Photo = new JLabel("");
		Photo.setBounds(67, 139, 277, 260);
		path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\or.png";
		contentPane.add(Photo);
		ImageIcon imageIcon=new ImageIcon(path);
		Image imgImage=imageIcon.getImage();
		Image newiImage=imgImage.getScaledInstance(Photo.getWidth(), Photo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image=new ImageIcon(newiImage);
		Photo.setIcon(image);
		
		lblQrCode = new JLabel("QR  Code Scan");
		lblQrCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblQrCode.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblQrCode.setBounds(67, 409, 267, 32);
		contentPane.add(lblQrCode);
		
		lblNewLabel = new JLabel(" * Scan QR Code Accept All Payments Method");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 51));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(60, 464, 316, 26);
		contentPane.add(lblNewLabel);
		
		separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 128));
		separator_1.setBorder(null);
		separator_1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		separator_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		separator_1.setBounds(42, 500, 868, 10);
		contentPane.add(separator_1);
		
		lblNewLabel_2 = new JLabel("Education Management System ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 51, 204));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setBounds(412, 122, 441, 34);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_2_1 = new JLabel("Online Payment Info..");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(0, 0, 51));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(469, 166, 220, 26);
		contentPane.add(lblNewLabel_2_1);
		
		lblNewLabel_2_1_1 = new JLabel("Bank Account Name:");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(new Color(0, 0, 51));
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(432, 202, 176, 26);
		contentPane.add(lblNewLabel_2_1_1);
		
		lblNewLabel_2_1_1_1 = new JLabel("Bank Account NO:");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setForeground(new Color(0, 0, 51));
		lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_1.setBounds(417, 238, 220, 26);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		lblNewLabel_2_1_1_2 = new JLabel("\r\n \t\tTo Use Online Payment System ");
		lblNewLabel_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_2.setForeground(new Color(153, 0, 102));
		lblNewLabel_2_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_2.setBounds(478, 446, 358, 44);
		contentPane.add(lblNewLabel_2_1_1_2);
		
		lblNewLabel_2_1_1_1_1 = new JLabel("IFSC Code NO:");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setForeground(new Color(0, 0, 51));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_1_1.setBounds(432, 273, 176, 26);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		lblNewLabel_2_1_1_2_1 = new JLabel("Payment UPI ID:");
		lblNewLabel_2_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_2_1.setForeground(new Color(0, 0, 51));
		lblNewLabel_2_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_2_1.setBounds(417, 309, 220, 26);
		contentPane.add(lblNewLabel_2_1_1_2_1);
		
		lblNewLabel_2_1_1_1_2 = new JLabel("Paytm Payment Bank");
		lblNewLabel_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_2.setForeground(new Color(0, 0, 204));
		lblNewLabel_2_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_1_2.setBounds(618, 202, 176, 26);
		contentPane.add(lblNewLabel_2_1_1_1_2);
		
		lblNewLabel_2_1_1_2_2 = new JLabel("918009992680");
		lblNewLabel_2_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_2_2.setForeground(new Color(0, 0, 204));
		lblNewLabel_2_1_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1_1_2_2.setBounds(593, 238, 220, 26);
		contentPane.add(lblNewLabel_2_1_1_2_2);
		
		lblNewLabel_2_1_1_1_1_1 = new JLabel("8009992680@paytm");
		lblNewLabel_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1.setForeground(new Color(0, 0, 204));
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_1_1_1.setBounds(618, 309, 176, 26);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		lblNewLabel_2_1_1_2_1_1 = new JLabel("Paytm0123456");
		lblNewLabel_2_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_2_1_1.setForeground(new Color(0, 0, 204));
		lblNewLabel_2_1_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_2_1_1.setBounds(593, 274, 220, 26);
		contentPane.add(lblNewLabel_2_1_1_2_1_1);
		
		lblNewLabel_2_1_1_3 = new JLabel("\tThank You \r\n \t");
		lblNewLabel_2_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_3.setForeground(new Color(153, 0, 102));
		lblNewLabel_2_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_3.setBounds(417, 387, 113, 32);
		contentPane.add(lblNewLabel_2_1_1_3);
		
		lblNewLabel_2_1_1_3_1 = new JLabel("\t \r\n \tVisiting To Education Management System\r\n \t\t");
		lblNewLabel_2_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_3_1.setForeground(new Color(153, 0, 102));
		lblNewLabel_2_1_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_3_1.setBounds(446, 414, 407, 44);
		contentPane.add(lblNewLabel_2_1_1_3_1);
		
		lblfistPaymentFor = new JLabel(" *Fist Payment For Student =Rs.10");
		lblfistPaymentFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblfistPaymentFor.setForeground(new Color(255, 0, 51));
		lblfistPaymentFor.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblfistPaymentFor.setBounds(42, 514, 316, 26);
		contentPane.add(lblfistPaymentFor);
		
		lblfistPaymentFor_2 = new JLabel(" *Fist Payment For Feculty and Exzaminer =Rs.50");
		lblfistPaymentFor_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblfistPaymentFor_2.setForeground(new Color(255, 0, 51));
		lblfistPaymentFor_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblfistPaymentFor_2.setBounds(42, 540, 316, 26);
		contentPane.add(lblfistPaymentFor_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(0, 4, 939, 115);
		contentPane.add(panel_3);
		
		JLabel EraLogo = new JLabel();
		path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
	    EraLogo.setBounds(42, 10, 173, 95);
	    ImageIcon imageIcon1=new ImageIcon(path);
		Image imgImage1=imageIcon1.getImage();
		Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image1=new ImageIcon(newiImage1);
		EraLogo.setIcon(image1);
		panel_3.add(EraLogo);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Era University Lucknow");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setForeground(new Color(0, 0, 153));
		lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_2_1_2.setBounds(246, 10, 530, 35);
		panel_3.add(lblNewLabel_2_1_2);
		
		JLabel lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
		lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
		lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSarfarazganjHardoiRoad.setBounds(231, 42, 547, 35);
		panel_3.add(lblSarfarazganjHardoiRoad);
		
		lblNewLabel_1 = new JLabel("Online Payment ");
		lblNewLabel_1.setBounds(258, 73, 493, 42);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		
		btnNewButton = new JButton("Exit");
		btnNewButton.setBounds(844, 10, 85, 32);
		panel_3.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantSection.main(null);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 127, 80));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
	}
}
