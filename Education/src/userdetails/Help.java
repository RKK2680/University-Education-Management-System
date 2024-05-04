package userdetails;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;

public class Help extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private String path;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Help dialog = new Help();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Help() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education Management System\\img\\dialog-error-icon.png"));
		setBounds(100, 100, 1049, 513);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 240, 245));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(0, 0, 1058, 115);
		contentPanel.add(panel_3);
		
		JLabel EraLogo = new JLabel();
		path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
	    EraLogo.setBounds(42, 10, 158, 95);
	    ImageIcon imageIcon1=new ImageIcon(path);
		Image imgImage1=imageIcon1.getImage();
		Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image1=new ImageIcon(newiImage1);
		EraLogo.setIcon(image1);
		panel_3.add(EraLogo);
		
		JLabel lblNewLabel_2_1 = new JLabel("Era University Lucknow");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(0, 0, 153));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 60));
		lblNewLabel_2_1.setBounds(266, 0, 782, 62);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
		lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
		lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSarfarazganjHardoiRoad.setBounds(252, 54, 783, 35);
		panel_3.add(lblSarfarazganjHardoiRoad);
		
		JLabel lblQuery = new JLabel("I Help You");
		lblQuery.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuery.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblQuery.setBounds(396, 150, 175, 35);
		contentPanel.add(lblQuery);
		
		JLabel lblSarfarazganjHardoiRoad_1 = new JLabel("Sarfarazganj Hardoi Road Balaganj Lucknow");
		lblSarfarazganjHardoiRoad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazganjHardoiRoad_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSarfarazganjHardoiRoad_1.setBounds(386, 392, 428, 35);
		contentPanel.add(lblSarfarazganjHardoiRoad_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(90, 203, 881, 247);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblSearch = new JLabel("Name");
		lblSearch.setBounds(182, 37, 89, 35);
		panel.add(lblSearch);
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblWhatsappNo = new JLabel("Whatsapp No");
		lblWhatsappNo.setBounds(182, 100, 134, 35);
		panel.add(lblWhatsappNo);
		lblWhatsappNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhatsappNo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setBounds(192, 129, 89, 35);
		panel.add(lblEmailId);
		lblEmailId.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailId.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(182, 164, 89, 35);
		panel.add(lblAdress);
		lblAdress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdress.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setBounds(192, 68, 89, 35);
		panel.add(lblMobileNo);
		lblMobileNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileNo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblRamkumarkashyapgmailcom = new JLabel("RamkumarKashyap57@gmail.com");
		lblRamkumarkashyapgmailcom.setBounds(343, 129, 286, 35);
		panel.add(lblRamkumarkashyapgmailcom);
		lblRamkumarkashyapgmailcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblRamkumarkashyapgmailcom.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblSarfarazganjHardoiRoad_1_1 = new JLabel("Era universty Lucknow");
		lblSarfarazganjHardoiRoad_1_1.setBounds(233, 164, 428, 35);
		panel.add(lblSarfarazganjHardoiRoad_1_1);
		lblSarfarazganjHardoiRoad_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazganjHardoiRoad_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblRamkumarKashyap_2 = new JLabel("8009992680");
		lblRamkumarKashyap_2.setBounds(326, 100, 191, 35);
		panel.add(lblRamkumarKashyap_2);
		lblRamkumarKashyap_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRamkumarKashyap_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblRamkumarKashyap_1 = new JLabel("8707678331");
		lblRamkumarKashyap_1.setBounds(326, 68, 191, 35);
		panel.add(lblRamkumarKashyap_1);
		lblRamkumarKashyap_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRamkumarKashyap_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblRamkumarKashyap = new JLabel("Ramkumar Kashyap");
		lblRamkumarKashyap.setBounds(343, 37, 191, 35);
		panel.add(lblRamkumarKashyap);
		lblRamkumarKashyap.setHorizontalAlignment(SwingConstants.CENTER);
		lblRamkumarKashyap.setFont(new Font("Times New Roman", Font.BOLD, 18));
	}
}