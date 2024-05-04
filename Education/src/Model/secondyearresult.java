package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import userdetails.project;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class secondyearresult extends JFrame {

	private JPanel contentPane;
	private String path;
	private JTextField Enrollmentno;
	private JTextField Name;
	private JTextField Rollno;
	private JTextField Fathername;
	private JTextField textF3E_DB;
	private JTextField textF3E_CN;
	private JTextField textF3E_JP;
	private JTextField textF3E_POBM;
	private JTextField textF3E_SE;
	private JTextField textF3E_P_DB;
	private JTextField textF3E_P_JP;
	private JTextField textF3I_DB;
	private JTextField textF3I_CN;
	private JTextField textF3I_JP;
	private JTextField textF3I_POBM;
	private JTextField textF3I_SE;
	private JTextField textF3I_P_DB;
	private JTextField textF3i_P_JP;
	private JTextField textS4E_WN;
	private JTextField textS4E_ptytnon;
	private JTextField textS4E_ADvjava;
	private JTextField textS4E_ACC;
	private JTextField textS4E_DM;
	private JTextField textS4EA_L_Pyth;
	private JTextField textS4I_WN;
	private JTextField textS4I_Python;
	private JTextField textS4I_advjava;
	private JTextField textS4i_ACC;
	private JTextField textS4i_DM;
	private JTextField textS4IA_L_Pyth;
	private JLabel lblT_DB;
	private JLabel lblT_CN;
	private JLabel lblT_JP;
	private JLabel lblT_POBM;
	private JLabel lblT_SE;
	private JLabel lblT_P_DB;
	private JLabel lblT_L_JP;
	private JLabel lblT_WN;
	private double total;
	private double avg;
	private String result;
	private JLabel lblResult;
	private JLabel lblT_Python;
	private JLabel lblT_Advajava;
	private JLabel lblT_ACC;
	private JLabel LblT_L_Pyth;
	private JLabel lblResult2;
	private JLabel lblMarksObt_2_1;
	private JLabel lblfinalResult;
	private JLabel lblMarks;
	private JLabel lblT_DM;
	private JLabel lblMarksObt_2;
	private JLabel lblMarks2;
	private JPanel panel;
	private JTextField textS4EA_ADjava;
	private JTextField textS4IA_ADjava;
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondyearresult frame = new secondyearresult();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public secondyearresult() {
		setTitle("Result");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1554, 961);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 153), 2));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		panel.setBounds(0, 10, 1413, 825);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(0, 0, 1411, 115);
		panel.add(panel_3);
		
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
		
		JLabel lblFacultyOfScience = new JLabel("Faculty Of Science");
		lblFacultyOfScience.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacultyOfScience.setForeground(new Color(0, 102, 153));
		lblFacultyOfScience.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblFacultyOfScience.setBounds(447, 114, 361, 35);
		panel.add(lblFacultyOfScience);
		
		JLabel lblBachelorssInComputer = new JLabel("Bachelors's in Computer Application Second  Year Examination 2022");
		lblBachelorssInComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssInComputer.setForeground(new Color(0, 102, 153));
		lblBachelorssInComputer.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBachelorssInComputer.setBounds(264, 139, 742, 35);
		panel.add(lblBachelorssInComputer);
		
		JLabel lblEnrollmentNo = new JLabel("Enrollment No");
		lblEnrollmentNo.setForeground(new Color(0, 0, 0));
		lblEnrollmentNo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEnrollmentNo.setBounds(20, 184, 137, 35);
		panel.add(lblEnrollmentNo);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 153));
		separator.setForeground(new Color(0, 0, 153));
		separator.setBounds(0, 184, 1411, 14);
		panel.add(separator);
		
		Enrollmentno = new JTextField();
		Enrollmentno.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		Enrollmentno.setBackground(new Color(135, 206, 250));
		Enrollmentno.setForeground(new Color(0, 0, 0));
		Enrollmentno.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Enrollmentno.setBounds(180, 196, 214, 19);
		panel.add(Enrollmentno);
		Enrollmentno.setColumns(10);
		
		Name = new JTextField();
		Name.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		Name.setBackground(new Color(135, 206, 250));
		Name.setForeground(new Color(0, 0, 0));
		Name.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Name.setColumns(10);
		Name.setBounds(180, 226, 214, 19);
		panel.add(Name);
		
		JLabel lblNameOfStudent = new JLabel("Name Of Student");
		lblNameOfStudent.setForeground(Color.BLACK);
		lblNameOfStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNameOfStudent.setBounds(10, 216, 160, 35);
		panel.add(lblNameOfStudent);
		
		JLabel lblFatherName = new JLabel("Father Name");
		lblFatherName.setForeground(Color.BLACK);
		lblFatherName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFatherName.setBounds(968, 218, 112, 35);
		panel.add(lblFatherName);
		
		JLabel lblRollNo = new JLabel("Roll No");
		lblRollNo.setForeground(Color.BLACK);
		lblRollNo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRollNo.setBounds(969, 188, 86, 35);
		panel.add(lblRollNo);
		
		Rollno = new JTextField();
		Rollno.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		Rollno.setBackground(new Color(135, 206, 250));
		Rollno.setForeground(new Color(0, 0, 0));
		Rollno.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Rollno.setColumns(10);
		Rollno.setBounds(1090, 196, 190, 19);
		panel.add(Rollno);
		
		Fathername = new JTextField();
		Fathername.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		Fathername.setBackground(new Color(135, 206, 250));
		Fathername.setForeground(new Color(0, 0, 0));
		Fathername.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Fathername.setColumns(10);
		Fathername.setBounds(1090, 226, 214, 19);
		panel.add(Fathername);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 153));
		separator_1.setBackground(new Color(0, 0, 153));
		separator_1.setBounds(0, 258, 1411, 14);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 153));
		separator_2.setBackground(new Color(0, 0, 153));
		separator_2.setBounds(20, 282, 1370, 14);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 0, 153));
		separator_3.setBackground(new Color(0, 0, 153));
		separator_3.setBounds(20, 307, 1370, 14);
		panel.add(separator_3);
		
		JLabel lblFistSemester = new JLabel("Therad Semester");
		lblFistSemester.setForeground(Color.BLACK);
		lblFistSemester.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblFistSemester.setBounds(151, 282, 123, 26);
		panel.add(lblFistSemester);
		
		JLabel lblSecondsemester = new JLabel("Fourth Semester");
		lblSecondsemester.setForeground(Color.BLACK);
		lblSecondsemester.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblSecondsemester.setBounds(775, 282, 123, 26);
		panel.add(lblSecondsemester);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(new Color(0, 0, 153));
		separator_2_1.setBackground(new Color(0, 0, 153));
		separator_2_1.setBounds(20, 610, 1370, 7);
		panel.add(separator_2_1);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_2.setForeground(new Color(0, 0, 153));
		separator_3_2.setBackground(new Color(0, 0, 153));
		separator_3_2.setBounds(20, 282, 9, 330);
		panel.add(separator_3_2);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setOrientation(SwingConstants.VERTICAL);
		separator_2_2.setForeground(new Color(0, 0, 153));
		separator_2_2.setBackground(new Color(0, 0, 153));
		separator_2_2.setBounds(1392, 282, 9, 330);
		panel.add(separator_2_2);
		
		JSeparator separator_3_2_1 = new JSeparator();
		separator_3_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_1.setForeground(new Color(0, 0, 153));
		separator_3_2_1.setBackground(new Color(0, 0, 153));
		separator_3_2_1.setBounds(719, 258, 9, 354);
		panel.add(separator_3_2_1);
		
		JSeparator separator_3_2_2 = new JSeparator();
		separator_3_2_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_2.setForeground(new Color(0, 0, 153));
		separator_3_2_2.setBackground(new Color(0, 0, 153));
		separator_3_2_2.setBounds(538, 287, 9, 322);
		panel.add(separator_3_2_2);
		
		JSeparator separator_3_2_3 = new JSeparator();
		separator_3_2_3.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_3.setForeground(new Color(0, 0, 153));
		separator_3_2_3.setBackground(new Color(0, 0, 153));
		separator_3_2_3.setBounds(401, 282, 9, 330);
		panel.add(separator_3_2_3);
		
		JSeparator separator_3_2_4 = new JSeparator();
		separator_3_2_4.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_4.setForeground(new Color(0, 0, 153));
		separator_3_2_4.setBackground(new Color(0, 0, 153));
		separator_3_2_4.setBounds(1200, 306, 9, 303);
		panel.add(separator_3_2_4);
		
		JSeparator separator_3_2_5 = new JSeparator();
		separator_3_2_5.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_5.setForeground(new Color(0, 0, 153));
		separator_3_2_5.setBackground(new Color(0, 0, 153));
		separator_3_2_5.setBounds(1046, 306, 9, 303);
		panel.add(separator_3_2_5);
		
		JSeparator separator_3_3 = new JSeparator();
		separator_3_3.setForeground(new Color(0, 0, 153));
		separator_3_3.setBackground(new Color(0, 0, 153));
		separator_3_3.setBounds(20, 355, 1370, 7);
		panel.add(separator_3_3);
		
		JLabel lblNameOfSubject = new JLabel("Name Of Subject");
		lblNameOfSubject.setForeground(Color.BLACK);
		lblNameOfSubject.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNameOfSubject.setBounds(135, 318, 160, 35);
		panel.add(lblNameOfSubject);
		
		JLabel lblNameOfSubject_1 = new JLabel("Name Of Subject");
		lblNameOfSubject_1.setForeground(Color.BLACK);
		lblNameOfSubject_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNameOfSubject_1.setBounds(738, 318, 160, 35);
		panel.add(lblNameOfSubject_1);
		
		JLabel lblMaxmimumMaks = new JLabel("Maxmimum Maks");
		lblMaxmimumMaks.setForeground(Color.BLACK);
		lblMaxmimumMaks.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMaxmimumMaks.setBounds(401, 306, 137, 26);
		panel.add(lblMaxmimumMaks);
		
		JLabel lblMinimumMaks = new JLabel("Minimum Maks");
		lblMinimumMaks.setForeground(Color.BLACK);
		lblMinimumMaks.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMinimumMaks.setBounds(553, 306, 137, 22);
		panel.add(lblMinimumMaks);
		
		JLabel lblMaxmimumMaks_1 = new JLabel("Maxmimum Maks");
		lblMaxmimumMaks_1.setForeground(Color.BLACK);
		lblMaxmimumMaks_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMaxmimumMaks_1.setBounds(1064, 306, 137, 26);
		panel.add(lblMaxmimumMaks_1);
		
		JLabel lblMinimumMaks_1 = new JLabel("Minimum Maks");
		lblMinimumMaks_1.setForeground(Color.BLACK);
		lblMinimumMaks_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMinimumMaks_1.setBounds(1249, 306, 137, 26);
		panel.add(lblMinimumMaks_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(0, 0, 153));
		separator_4.setBackground(new Color(0, 0, 153));
		separator_4.setBounds(403, 331, 317, 14);
		panel.add(separator_4);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setForeground(new Color(0, 0, 153));
		separator_4_1.setBackground(new Color(0, 0, 153));
		separator_4_1.setBounds(1046, 331, 344, 14);
		panel.add(separator_4_1);
		
		JLabel lblEa = new JLabel("EA");
		lblEa.setForeground(Color.BLACK);
		lblEa.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa.setBounds(401, 331, 32, 26);
		panel.add(lblEa);
		
		JLabel lblIa = new JLabel("IA");
		lblIa.setForeground(Color.BLACK);
		lblIa.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIa.setBounds(443, 331, 21, 26);
		panel.add(lblIa);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setForeground(Color.BLACK);
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal.setBounds(485, 331, 49, 26);
		panel.add(lblTotal);
		
		JLabel lblEa_1 = new JLabel("EA");
		lblEa_1.setForeground(Color.BLACK);
		lblEa_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_1.setBounds(557, 327, 32, 26);
		panel.add(lblEa_1);
		
		JLabel lblIa_1 = new JLabel("IA");
		lblIa_1.setForeground(Color.BLACK);
		lblIa_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIa_1.setBounds(599, 327, 21, 26);
		panel.add(lblIa_1);
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setForeground(Color.BLACK);
		lblTotal_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_1.setBounds(641, 327, 49, 26);
		panel.add(lblTotal_1);
		
		JLabel lblEa_2 = new JLabel("EA");
		lblEa_2.setForeground(Color.BLACK);
		lblEa_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_2.setBounds(1053, 331, 32, 26);
		panel.add(lblEa_2);
		
		JLabel lblIa_2 = new JLabel("IA");
		lblIa_2.setForeground(Color.BLACK);
		lblIa_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIa_2.setBounds(1099, 331, 21, 26);
		panel.add(lblIa_2);
		
		JLabel lblTotal_2 = new JLabel("Total");
		lblTotal_2.setForeground(Color.BLACK);
		lblTotal_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_2.setBounds(1141, 331, 49, 26);
		panel.add(lblTotal_2);
		
		JLabel lblEa_3 = new JLabel("EA");
		lblEa_3.setForeground(Color.BLACK);
		lblEa_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_3.setBounds(1249, 331, 32, 26);
		panel.add(lblEa_3);
		
		JLabel lblIa_3 = new JLabel("IA");
		lblIa_3.setForeground(Color.BLACK);
		lblIa_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIa_3.setBounds(1291, 331, 21, 26);
		panel.add(lblIa_3);
		
		JLabel lblTotal_3 = new JLabel("Total");
		lblTotal_3.setForeground(Color.BLACK);
		lblTotal_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_3.setBounds(1333, 331, 49, 26);
		panel.add(lblTotal_3);
		
		JLabel lblProfessionalCommunication = new JLabel("Database Managment System (CA304)");
		lblProfessionalCommunication.setForeground(Color.BLACK);
		lblProfessionalCommunication.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProfessionalCommunication.setBounds(30, 363, 300, 26);
		panel.add(lblProfessionalCommunication);
		
		JLabel lblProfessionalCommunicationms = new JLabel("  Computer Network (CA302)");
		lblProfessionalCommunicationms.setForeground(Color.BLACK);
		lblProfessionalCommunicationms.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProfessionalCommunicationms.setBounds(20, 385, 374, 26);
		panel.add(lblProfessionalCommunicationms);
		
		JLabel lblIntroductionOfComputer = new JLabel("Java Programming(CA303)");
		lblIntroductionOfComputer.setForeground(Color.BLACK);
		lblIntroductionOfComputer.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroductionOfComputer.setBounds(30, 410, 349, 26);
		panel.add(lblIntroductionOfComputer);
		
		JLabel lblProgrammingInC = new JLabel("Principsl of Managment And Bussnes(CA305)");
		lblProgrammingInC.setForeground(Color.BLACK);
		lblProgrammingInC.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProgrammingInC.setBounds(29, 434, 362, 24);
		panel.add(lblProgrammingInC);
		
		JLabel lblCbnstmt = new JLabel("Sofftwere Enggniring(CA301)");
		lblCbnstmt.setForeground(Color.BLACK);
		lblCbnstmt.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCbnstmt.setBounds(28, 457, 246, 26);
		panel.add(lblCbnstmt);
		
		JLabel lblPractical = new JLabel("Practical");
		lblPractical.setForeground(Color.BLACK);
		lblPractical.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPractical.setBounds(162, 485, 88, 26);
		panel.add(lblPractical);
		
		JLabel lblComputerApplicationLabcap = new JLabel("Database Managment System Lab (CAP104)");
		lblComputerApplicationLabcap.setForeground(Color.BLACK);
		lblComputerApplicationLabcap.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblComputerApplicationLabcap.setBounds(30, 510, 349, 26);
		panel.add(lblComputerApplicationLabcap);
		
		JLabel lblCProgrammingLab = new JLabel("Java Programming Lab(CSE301)");
		lblCProgrammingLab.setForeground(Color.BLACK);
		lblCProgrammingLab.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCProgrammingLab.setBounds(30, 546, 349, 26);
		panel.add(lblCProgrammingLab);
		
		JLabel lblEa_4 = new JLabel("70");
		lblEa_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4.setForeground(Color.BLACK);
		lblEa_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4.setBounds(401, 363, 32, 19);
		panel.add(lblEa_4);
		
		JLabel lblEa_4_1 = new JLabel("70");
		lblEa_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_1.setForeground(Color.BLACK);
		lblEa_4_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_1.setBounds(401, 385, 32, 26);
		panel.add(lblEa_4_1);
		
		JLabel lblEa_4_2 = new JLabel("70");
		lblEa_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_2.setForeground(Color.BLACK);
		lblEa_4_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_2.setBounds(401, 410, 32, 26);
		panel.add(lblEa_4_2);
		
		JLabel lblEa_4_3 = new JLabel("70");
		lblEa_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_3.setForeground(Color.BLACK);
		lblEa_4_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_3.setBounds(401, 434, 32, 26);
		panel.add(lblEa_4_3);
		
		JLabel lblEa_4_4 = new JLabel("70");
		lblEa_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_4.setForeground(Color.BLACK);
		lblEa_4_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_4.setBounds(401, 457, 32, 26);
		panel.add(lblEa_4_4);
		
		JLabel lblEa_4_5 = new JLabel("50");
		lblEa_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_5.setForeground(Color.BLACK);
		lblEa_4_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_5.setBounds(401, 510, 32, 26);
		panel.add(lblEa_4_5);
		
		JLabel lblEa_4_6 = new JLabel("50");
		lblEa_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6.setForeground(Color.BLACK);
		lblEa_4_6.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6.setBounds(401, 546, 32, 26);
		panel.add(lblEa_4_6);
		
		JLabel lblEa_4_7 = new JLabel("30");
		lblEa_4_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7.setForeground(Color.BLACK);
		lblEa_4_7.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7.setBounds(432, 362, 32, 19);
		panel.add(lblEa_4_7);
		
		JLabel lblEa_4_7_1 = new JLabel("30");
		lblEa_4_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_1.setForeground(Color.BLACK);
		lblEa_4_7_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_1.setBounds(432, 387, 32, 24);
		panel.add(lblEa_4_7_1);
		
		JLabel lblEa_4_7_2 = new JLabel("30");
		lblEa_4_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_2.setForeground(Color.BLACK);
		lblEa_4_7_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_2.setBounds(432, 410, 32, 26);
		panel.add(lblEa_4_7_2);
		
		JLabel lblEa_4_7_3 = new JLabel("30");
		lblEa_4_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_3.setForeground(Color.BLACK);
		lblEa_4_7_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_3.setBounds(432, 439, 32, 19);
		panel.add(lblEa_4_7_3);
		
		JLabel lblEa_4_7_4 = new JLabel("30");
		lblEa_4_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_4.setForeground(Color.BLACK);
		lblEa_4_7_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_4.setBounds(432, 459, 32, 26);
		panel.add(lblEa_4_7_4);
		
		JLabel lblEa_4_5_1 = new JLabel("50");
		lblEa_4_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_5_1.setForeground(Color.BLACK);
		lblEa_4_5_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_5_1.setBounds(432, 510, 32, 26);
		panel.add(lblEa_4_5_1);
		
		JLabel lblEa_4_6_1 = new JLabel("50");
		lblEa_4_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6_1.setForeground(Color.BLACK);
		lblEa_4_6_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6_1.setBounds(432, 546, 32, 26);
		panel.add(lblEa_4_6_1);
		
		JLabel lblTotal_4 = new JLabel("100");
		lblTotal_4.setForeground(Color.BLACK);
		lblTotal_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4.setBounds(485, 363, 49, 14);
		panel.add(lblTotal_4);
		
		JLabel lblTotal_4_1 = new JLabel("100");
		lblTotal_4_1.setForeground(Color.BLACK);
		lblTotal_4_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_1.setBounds(485, 385, 49, 26);
		panel.add(lblTotal_4_1);
		
		JLabel lblTotal_4_2 = new JLabel("100");
		lblTotal_4_2.setForeground(Color.BLACK);
		lblTotal_4_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_2.setBounds(485, 410, 49, 26);
		panel.add(lblTotal_4_2);
		
		JLabel lblTotal_4_3 = new JLabel("100");
		lblTotal_4_3.setForeground(Color.BLACK);
		lblTotal_4_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_3.setBounds(485, 434, 49, 26);
		panel.add(lblTotal_4_3);
		
		JLabel lblTotal_4_4 = new JLabel("100");
		lblTotal_4_4.setForeground(Color.BLACK);
		lblTotal_4_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_4.setBounds(485, 457, 49, 26);
		panel.add(lblTotal_4_4);
		
		JLabel lblTotal_4_5 = new JLabel("100");
		lblTotal_4_5.setForeground(Color.BLACK);
		lblTotal_4_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_5.setBounds(485, 510, 49, 26);
		panel.add(lblTotal_4_5);
		
		JLabel lblTotal_4_6 = new JLabel("100");
		lblTotal_4_6.setForeground(Color.BLACK);
		lblTotal_4_6.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_6.setBounds(485, 546, 49, 26);
		panel.add(lblTotal_4_6);
		
		JLabel lblTotal_4_7 = new JLabel("700");
		lblTotal_4_7.setForeground(Color.BLACK);
		lblTotal_4_7.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_7.setBounds(485, 582, 49, 26);
		panel.add(lblTotal_4_7);
		
		JLabel lblTotal_4_8 = new JLabel("250");
		lblTotal_4_8.setForeground(Color.BLACK);
		lblTotal_4_8.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_8.setBounds(442, 582, 49, 26);
		panel.add(lblTotal_4_8);
		
		JLabel lblTotal_4_9 = new JLabel("450");
		lblTotal_4_9.setForeground(Color.BLACK);
		lblTotal_4_9.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_9.setBounds(401, 582, 49, 26);
		panel.add(lblTotal_4_9);
		
		textF3E_DB = new JTextField();
		textF3E_DB.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3E_DB.setBackground(new Color(135, 206, 235));
		textF3E_DB.setHorizontalAlignment(SwingConstants.CENTER);
		textF3E_DB.setForeground(new Color(51, 51, 0));
		textF3E_DB.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3E_DB.setColumns(10);
		textF3E_DB.setBounds(548, 367, 41, 19);
		panel.add(textF3E_DB);
		
		textF3E_CN = new JTextField();
		textF3E_CN.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3E_CN.setBackground(new Color(135, 206, 235));
		textF3E_CN.setHorizontalAlignment(SwingConstants.CENTER);
		textF3E_CN.setForeground(new Color(51, 51, 0));
		textF3E_CN.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3E_CN.setColumns(10);
		textF3E_CN.setBounds(548, 391, 41, 19);
		panel.add(textF3E_CN);
		
		textF3E_JP = new JTextField();
		textF3E_JP.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3E_JP.setBackground(new Color(135, 206, 235));
		textF3E_JP.setHorizontalAlignment(SwingConstants.CENTER);
		textF3E_JP.setForeground(new Color(51, 51, 0));
		textF3E_JP.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3E_JP.setColumns(10);
		textF3E_JP.setBounds(548, 416, 41, 19);
		panel.add(textF3E_JP);
		
		textF3E_POBM = new JTextField();
		textF3E_POBM.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3E_POBM.setBackground(new Color(135, 206, 235));
		textF3E_POBM.setHorizontalAlignment(SwingConstants.CENTER);
		textF3E_POBM.setForeground(new Color(51, 51, 0));
		textF3E_POBM.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3E_POBM.setColumns(10);
		textF3E_POBM.setBounds(548, 439, 41, 19);
		panel.add(textF3E_POBM);
		
		textF3E_SE = new JTextField();
		textF3E_SE.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3E_SE.setBackground(new Color(135, 206, 235));
		textF3E_SE.setHorizontalAlignment(SwingConstants.CENTER);
		textF3E_SE.setForeground(new Color(51, 51, 0));
		textF3E_SE.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3E_SE.setColumns(10);
		textF3E_SE.setBounds(548, 463, 41, 19);
		panel.add(textF3E_SE);
		
		textF3E_P_DB = new JTextField();
		textF3E_P_DB.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3E_P_DB.setBackground(new Color(135, 206, 235));
		textF3E_P_DB.setHorizontalAlignment(SwingConstants.CENTER);
		textF3E_P_DB.setForeground(new Color(51, 51, 0));
		textF3E_P_DB.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3E_P_DB.setColumns(10);
		textF3E_P_DB.setBounds(548, 514, 41, 19);
		panel.add(textF3E_P_DB);
		
		textF3E_P_JP = new JTextField();
		textF3E_P_JP.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3E_P_JP.setBackground(new Color(135, 206, 235));
		textF3E_P_JP.setHorizontalAlignment(SwingConstants.CENTER);
		textF3E_P_JP.setForeground(new Color(51, 51, 0));
		textF3E_P_JP.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3E_P_JP.setColumns(10);
		textF3E_P_JP.setBounds(548, 550, 41, 19);
		panel.add(textF3E_P_JP);
		
		textF3I_DB = new JTextField();
		textF3I_DB.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3I_DB.setBackground(new Color(135, 206, 235));
		textF3I_DB.setHorizontalAlignment(SwingConstants.CENTER);
		textF3I_DB.setForeground(new Color(51, 51, 0));
		textF3I_DB.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3I_DB.setColumns(10);
		textF3I_DB.setBounds(599, 367, 41, 19);
		panel.add(textF3I_DB);
		
		textF3I_CN = new JTextField();
		textF3I_CN.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3I_CN.setBackground(new Color(135, 206, 235));
		textF3I_CN.setHorizontalAlignment(SwingConstants.CENTER);
		textF3I_CN.setForeground(new Color(51, 51, 0));
		textF3I_CN.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3I_CN.setColumns(10);
		textF3I_CN.setBounds(600, 394, 41, 19);
		panel.add(textF3I_CN);
		
		textF3I_JP = new JTextField();
		textF3I_JP.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3I_JP.setBackground(new Color(135, 206, 235));
		textF3I_JP.setHorizontalAlignment(SwingConstants.CENTER);
		textF3I_JP.setForeground(new Color(51, 51, 0));
		textF3I_JP.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3I_JP.setColumns(10);
		textF3I_JP.setBounds(599, 414, 41, 19);
		panel.add(textF3I_JP);
		
		textF3I_POBM = new JTextField();
		textF3I_POBM.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3I_POBM.setBackground(new Color(135, 206, 235));
		textF3I_POBM.setHorizontalAlignment(SwingConstants.CENTER);
		textF3I_POBM.setForeground(new Color(51, 51, 0));
		textF3I_POBM.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3I_POBM.setColumns(10);
		textF3I_POBM.setBounds(600, 442, 41, 19);
		panel.add(textF3I_POBM);
		
		textF3I_SE = new JTextField();
		textF3I_SE.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3I_SE.setBackground(new Color(135, 206, 235));
		textF3I_SE.setHorizontalAlignment(SwingConstants.CENTER);
		textF3I_SE.setForeground(new Color(51, 51, 0));
		textF3I_SE.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3I_SE.setColumns(10);
		textF3I_SE.setBounds(600, 466, 41, 19);
		panel.add(textF3I_SE);
		
		textF3I_P_DB = new JTextField();
		textF3I_P_DB.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3I_P_DB.setBackground(new Color(135, 206, 235));
		textF3I_P_DB.setHorizontalAlignment(SwingConstants.CENTER);
		textF3I_P_DB.setForeground(new Color(51, 51, 0));
		textF3I_P_DB.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3I_P_DB.setColumns(10);
		textF3I_P_DB.setBounds(599, 514, 41, 19);
		panel.add(textF3I_P_DB);
		
		textF3i_P_JP = new JTextField();
		textF3i_P_JP.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3i_P_JP.setBackground(new Color(135, 206, 235));
		textF3i_P_JP.setHorizontalAlignment(SwingConstants.CENTER);
		textF3i_P_JP.setForeground(new Color(51, 51, 0));
		textF3i_P_JP.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3i_P_JP.setColumns(10);
		textF3i_P_JP.setBounds(600, 553, 41, 19);
		panel.add(textF3i_P_JP);
		
		JButton buttonEITotal3 = new JButton("");
		buttonEITotal3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textF3E_DB.getText());
				int b=Integer.parseInt(textF3I_DB.getText());
				int c=Integer.parseInt(textF3E_CN.getText());
				int d=Integer.parseInt(textF3I_CN.getText());
				int g=Integer.parseInt(textF3E_JP.getText());
				int h=Integer.parseInt(textF3I_JP.getText());
				int f=Integer.parseInt(textF3E_POBM.getText());
				int x=Integer.parseInt(textF3I_POBM.getText());
				int y=Integer.parseInt(textF3E_SE.getText());
				int z=Integer.parseInt(textF3I_SE.getText());
				int u=Integer.parseInt(textF3E_P_JP.getText());
				int v=Integer.parseInt(textF3i_P_JP.getText());
				int w=Integer.parseInt(textF3E_P_DB.getText());
				int o=Integer.parseInt(textF3I_P_DB.getText());
				buttonEITotal3.setText(" "+(a+b+c+d+g+h+f+x+y+z+u+v+w+o)+" ");
			}
		});
		
		buttonEITotal3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonEITotal3.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonEITotal3.setBackground(new Color(135, 206, 250));
		buttonEITotal3.setBounds(661, 582, 54, 26);
		panel.add(buttonEITotal3);
		
		JButton buttonEATotal3 = new JButton("");
		buttonEATotal3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textF3E_DB.getText());
				int c=Integer.parseInt(textF3E_CN.getText());
				int g=Integer.parseInt(textF3E_JP.getText());
				int f=Integer.parseInt(textF3E_POBM.getText());
				int y=Integer.parseInt(textF3E_SE.getText());
				int u=Integer.parseInt(textF3E_P_JP.getText());
				int w=Integer.parseInt(textF3E_P_DB.getText());
				buttonEATotal3.setText(" "+(a+c+g+f+y+u+w)+" ");
			}
		});
		buttonEATotal3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonEATotal3.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonEATotal3.setBackground(new Color(135, 206, 250));
		buttonEATotal3.setBounds(548, 582, 49, 26);
		panel.add(buttonEATotal3);
		
		JButton buttonIATotal3 = new JButton("");
		buttonIATotal3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b=Integer.parseInt(textF3I_DB.getText());
				int d=Integer.parseInt(textF3I_CN.getText());
				int h=Integer.parseInt(textF3I_JP.getText());
				int x=Integer.parseInt(textF3I_POBM.getText());
				int z=Integer.parseInt(textF3I_SE.getText());
				int v=Integer.parseInt(textF3i_P_JP.getText());
				int o=Integer.parseInt(textF3I_P_DB.getText());
				buttonIATotal3.setText(" "+(b+d+h+x+z+v+o)+" ");
			}
		});
		buttonIATotal3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonIATotal3.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonIATotal3.setBackground(new Color(135, 206, 250));
		buttonIATotal3.setBounds(599, 582, 58, 26);
		panel.add(buttonIATotal3);
		
		JLabel lblTotal_4_9_1 = new JLabel("400");
		lblTotal_4_9_1.setForeground(Color.BLACK);
		lblTotal_4_9_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_9_1.setBounds(1053, 574, 49, 26);
		panel.add(lblTotal_4_9_1);
		
		JLabel lblEa_4_6_2 = new JLabel("50");
		lblEa_4_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6_2.setForeground(Color.BLACK);
		lblEa_4_6_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6_2.setBounds(1046, 546, 32, 26);
		panel.add(lblEa_4_6_2);
		
		JLabel lblEa_4_4_1 = new JLabel("70");
		lblEa_4_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_4_1.setForeground(Color.BLACK);
		lblEa_4_4_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_4_1.setBounds(1053, 449, 32, 26);
		panel.add(lblEa_4_4_1);
		
		JLabel lblEa_4_3_1 = new JLabel("70");
		lblEa_4_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_3_1.setForeground(Color.BLACK);
		lblEa_4_3_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_3_1.setBounds(1053, 426, 32, 26);
		panel.add(lblEa_4_3_1);
		
		JLabel lblEa_4_2_1 = new JLabel("70 ");
		lblEa_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_2_1.setForeground(Color.BLACK);
		lblEa_4_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_2_1.setBounds(1053, 402, 32, 26);
		panel.add(lblEa_4_2_1);
		
		JLabel lblEa_4_1_1 = new JLabel("70");
		lblEa_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_1_1.setForeground(Color.BLACK);
		lblEa_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_1_1.setBounds(1053, 377, 32, 26);
		panel.add(lblEa_4_1_1);
		
		JLabel lblEa_4_8 = new JLabel("70");
		lblEa_4_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_8.setForeground(Color.BLACK);
		lblEa_4_8.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_8.setBounds(1053, 355, 32, 19);
		panel.add(lblEa_4_8);
		
		JLabel lblEa_4_7_5 = new JLabel("30");
		lblEa_4_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_5.setForeground(Color.BLACK);
		lblEa_4_7_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_5.setBounds(1090, 354, 32, 19);
		panel.add(lblEa_4_7_5);
		
		JLabel lblEa_4_7_1_1 = new JLabel("30");
		lblEa_4_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_1_1.setForeground(Color.BLACK);
		lblEa_4_7_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_1_1.setBounds(1090, 379, 32, 24);
		panel.add(lblEa_4_7_1_1);
		
		JLabel lblEa_4_7_2_1 = new JLabel("30");
		lblEa_4_7_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_2_1.setForeground(Color.BLACK);
		lblEa_4_7_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_2_1.setBounds(1090, 402, 32, 26);
		panel.add(lblEa_4_7_2_1);
		
		JLabel lblEa_4_7_3_1 = new JLabel("30");
		lblEa_4_7_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_3_1.setForeground(Color.BLACK);
		lblEa_4_7_3_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_3_1.setBounds(1090, 431, 32, 19);
		panel.add(lblEa_4_7_3_1);
		
		JLabel lblEa_4_7_4_1 = new JLabel("30");
		lblEa_4_7_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_4_1.setForeground(Color.BLACK);
		lblEa_4_7_4_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_4_1.setBounds(1090, 451, 32, 26);
		panel.add(lblEa_4_7_4_1);
		
		JLabel lblEa_4_6_1_1 = new JLabel("50");
		lblEa_4_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6_1_1.setForeground(Color.BLACK);
		lblEa_4_6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6_1_1.setBounds(1090, 546, 32, 26);
		panel.add(lblEa_4_6_1_1);
		
		JLabel lblTotal_4_8_1 = new JLabel("200");
		lblTotal_4_8_1.setForeground(Color.BLACK);
		lblTotal_4_8_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_8_1.setBounds(1100, 574, 49, 26);
		panel.add(lblTotal_4_8_1);
		
		JLabel lblTotal_4_10 = new JLabel("100");
		lblTotal_4_10.setForeground(Color.BLACK);
		lblTotal_4_10.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_10.setBounds(1151, 355, 49, 14);
		panel.add(lblTotal_4_10);
		
		JLabel lblTotal_4_1_1 = new JLabel("100");
		lblTotal_4_1_1.setForeground(Color.BLACK);
		lblTotal_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_1_1.setBounds(1151, 377, 49, 26);
		panel.add(lblTotal_4_1_1);
		
		JLabel lblTotal_4_2_1 = new JLabel("100");
		lblTotal_4_2_1.setForeground(Color.BLACK);
		lblTotal_4_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_2_1.setBounds(1151, 402, 49, 26);
		panel.add(lblTotal_4_2_1);
		
		JLabel lblTotal_4_3_1 = new JLabel("100");
		lblTotal_4_3_1.setForeground(Color.BLACK);
		lblTotal_4_3_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_3_1.setBounds(1151, 426, 49, 26);
		panel.add(lblTotal_4_3_1);
		
		JLabel lblTotal_4_4_1 = new JLabel("100");
		lblTotal_4_4_1.setForeground(Color.BLACK);
		lblTotal_4_4_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_4_1.setBounds(1151, 449, 49, 26);
		panel.add(lblTotal_4_4_1);
		
		JLabel lblTotal_4_6_1 = new JLabel("100");
		lblTotal_4_6_1.setForeground(Color.BLACK);
		lblTotal_4_6_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_6_1.setBounds(1160, 546, 49, 26);
		panel.add(lblTotal_4_6_1);
		
		JLabel lblTotal_4_7_1 = new JLabel("600");
		lblTotal_4_7_1.setForeground(Color.BLACK);
		lblTotal_4_7_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_7_1.setBounds(1151, 574, 49, 26);
		panel.add(lblTotal_4_7_1);
		
		textS4E_WN = new JTextField();
		textS4E_WN.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4E_WN.setBackground(new Color(135, 206, 235));
		textS4E_WN.setHorizontalAlignment(SwingConstants.CENTER);
		textS4E_WN.setForeground(new Color(51, 51, 0));
		textS4E_WN.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4E_WN.setColumns(10);
		textS4E_WN.setBounds(1217, 359, 41, 19);
		panel.add(textS4E_WN);
		
		textS4E_ptytnon = new JTextField();
		textS4E_ptytnon.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4E_ptytnon.setBackground(new Color(135, 206, 235));
		textS4E_ptytnon.setHorizontalAlignment(SwingConstants.CENTER);
		textS4E_ptytnon.setForeground(new Color(51, 51, 0));
		textS4E_ptytnon.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4E_ptytnon.setColumns(10);
		textS4E_ptytnon.setBounds(1217, 383, 41, 19);
		panel.add(textS4E_ptytnon);
		
		textS4E_ADvjava = new JTextField();
		textS4E_ADvjava.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4E_ADvjava.setBackground(new Color(135, 206, 235));
		textS4E_ADvjava.setHorizontalAlignment(SwingConstants.CENTER);
		textS4E_ADvjava.setForeground(new Color(51, 51, 0));
		textS4E_ADvjava.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4E_ADvjava.setColumns(10);
		textS4E_ADvjava.setBounds(1217, 408, 41, 19);
		panel.add(textS4E_ADvjava);
		
		textS4E_ACC = new JTextField();
		textS4E_ACC.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4E_ACC.setBackground(new Color(135, 206, 235));
		textS4E_ACC.setHorizontalAlignment(SwingConstants.CENTER);
		textS4E_ACC.setForeground(new Color(51, 51, 0));
		textS4E_ACC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4E_ACC.setColumns(10);
		textS4E_ACC.setBounds(1217, 431, 41, 19);
		panel.add(textS4E_ACC);
		
		textS4E_DM = new JTextField();
		textS4E_DM.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4E_DM.setBackground(new Color(135, 206, 235));
		textS4E_DM.setHorizontalAlignment(SwingConstants.CENTER);
		textS4E_DM.setForeground(new Color(51, 51, 0));
		textS4E_DM.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4E_DM.setColumns(10);
		textS4E_DM.setBounds(1217, 455, 41, 19);
		panel.add(textS4E_DM);
		
		textS4EA_L_Pyth = new JTextField();
		textS4EA_L_Pyth.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4EA_L_Pyth.setBackground(new Color(135, 206, 235));
		textS4EA_L_Pyth.setHorizontalAlignment(SwingConstants.CENTER);
		textS4EA_L_Pyth.setForeground(new Color(51, 51, 0));
		textS4EA_L_Pyth.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4EA_L_Pyth.setColumns(10);
		textS4EA_L_Pyth.setBounds(1217, 542, 41, 19);
		panel.add(textS4EA_L_Pyth);
		
		JButton button_EA_Total4 = new JButton("");
		button_EA_Total4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						int a=Integer.parseInt(textS4E_WN.getText());						
						int c=Integer.parseInt(textS4E_ptytnon.getText());					
						int f=Integer.parseInt(textS4E_ADvjava.getText());
						int h=Integer.parseInt(textS4E_ACC.getText());
						int j=Integer.parseInt(textS4E_DM.getText());
						int l=Integer.parseInt(textS4EA_L_Pyth.getText());
						int n=Integer.parseInt(textS4EA_ADjava.getText());
						
						button_EA_Total4.setText(" "+(a+c+f+h+j+l+n)+" ");
					}
				});
		button_EA_Total4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_EA_Total4.setBorder(new LineBorder(new Color(135, 206, 235)));
		button_EA_Total4.setBackground(new Color(135, 206, 250));
		button_EA_Total4.setBounds(1211, 582, 49, 26);
		panel.add(button_EA_Total4);
		
		textS4I_WN = new JTextField();
		textS4I_WN.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4I_WN.setBackground(new Color(135, 206, 235));
		textS4I_WN.setHorizontalAlignment(SwingConstants.CENTER);
		textS4I_WN.setForeground(new Color(51, 51, 0));
		textS4I_WN.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4I_WN.setColumns(10);
		textS4I_WN.setBounds(1271, 360, 41, 22);
		panel.add(textS4I_WN);
		
		textS4I_Python = new JTextField();
		textS4I_Python.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4I_Python.setBackground(new Color(135, 206, 235));
		textS4I_Python.setHorizontalAlignment(SwingConstants.CENTER);
		textS4I_Python.setForeground(new Color(51, 51, 0));
		textS4I_Python.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4I_Python.setColumns(10);
		textS4I_Python.setBounds(1269, 386, 41, 19);
		panel.add(textS4I_Python);
		
		textS4I_advjava = new JTextField();
		textS4I_advjava.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4I_advjava.setBackground(new Color(135, 206, 235));
		textS4I_advjava.setHorizontalAlignment(SwingConstants.CENTER);
		textS4I_advjava.setForeground(new Color(51, 51, 0));
		textS4I_advjava.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4I_advjava.setColumns(10);
		textS4I_advjava.setBounds(1269, 411, 41, 19);
		panel.add(textS4I_advjava);
		
		textS4i_ACC = new JTextField();
		textS4i_ACC.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4i_ACC.setBackground(new Color(135, 206, 235));
		textS4i_ACC.setHorizontalAlignment(SwingConstants.CENTER);
		textS4i_ACC.setForeground(new Color(51, 51, 0));
		textS4i_ACC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4i_ACC.setColumns(10);
		textS4i_ACC.setBounds(1269, 434, 41, 19);
		panel.add(textS4i_ACC);
		
		textS4i_DM = new JTextField();
		textS4i_DM.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4i_DM.setBackground(new Color(135, 206, 235));
		textS4i_DM.setHorizontalAlignment(SwingConstants.CENTER);
		textS4i_DM.setForeground(new Color(51, 51, 0));
		textS4i_DM.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4i_DM.setColumns(10);
		textS4i_DM.setBounds(1269, 458, 41, 19);
		panel.add(textS4i_DM);
		
		textS4IA_L_Pyth = new JTextField();
		textS4IA_L_Pyth.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4IA_L_Pyth.setBackground(new Color(135, 206, 235));
		textS4IA_L_Pyth.setHorizontalAlignment(SwingConstants.CENTER);
		textS4IA_L_Pyth.setForeground(new Color(51, 51, 0));
		textS4IA_L_Pyth.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4IA_L_Pyth.setColumns(10);
		textS4IA_L_Pyth.setBounds(1269, 545, 41, 19);
		panel.add(textS4IA_L_Pyth);
		
		JButton button_IA_Total4 = new JButton("");
		button_IA_Total4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
						int b=Integer.parseInt(textS4I_WN.getText());						
						int d=Integer.parseInt(textS4I_Python.getText());					
						int g=Integer.parseInt(textS4I_advjava.getText());					
						int i=Integer.parseInt(textS4i_ACC.getText());					
						int k=Integer.parseInt(textS4i_DM.getText());			
						int m=Integer.parseInt(textS4IA_L_Pyth.getText());
						int o=Integer.parseInt(textS4IA_ADjava.getText());
						button_IA_Total4.setText(" "+(b+d+g+i+k+m+o)+" ");
					}
				});
		
		
		button_IA_Total4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_IA_Total4.setBorder(new LineBorder(new Color(135, 206, 235)));
		button_IA_Total4.setBackground(new Color(135, 206, 250));
		button_IA_Total4.setBounds(1268, 582, 58, 26);
		panel.add(button_IA_Total4);
		
		JButton buttonTotal4 = new JButton("");
		buttonTotal4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textS4E_WN.getText());
				int b=Integer.parseInt(textS4I_WN.getText());
				int c=Integer.parseInt(textS4E_ptytnon.getText());
				int d=Integer.parseInt(textS4I_Python.getText());
				int f=Integer.parseInt(textS4E_ADvjava.getText());
				int g=Integer.parseInt(textS4I_advjava.getText());
				int h=Integer.parseInt(textS4E_ACC.getText());
				int i=Integer.parseInt(textS4i_ACC.getText());
				int j=Integer.parseInt(textS4E_DM.getText());
				int k=Integer.parseInt(textS4i_DM.getText());
				int l=Integer.parseInt(textS4EA_L_Pyth.getText());
				int m=Integer.parseInt(textS4IA_L_Pyth.getText());
				int n=Integer.parseInt(textS4EA_ADjava.getText());
				int o=Integer.parseInt(textS4IA_ADjava.getText());
				buttonTotal4.setText(" "+(a+b+c+d+f+g+h+i+j+k+l+m+n+o)+" ");
			}
		});
		buttonTotal4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonTotal4.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonTotal4.setBackground(new Color(135, 206, 250));
		buttonTotal4.setBounds(1332, 582, 58, 26);
		panel.add(buttonTotal4);
		
		JLabel lblSystemAnalysisAnd = new JLabel("wirless Network(CA205)");
		lblSystemAnalysisAnd.setForeground(Color.BLACK);
		lblSystemAnalysisAnd.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblSystemAnalysisAnd.setBounds(736, 355, 300, 19);
		panel.add(lblSystemAnalysisAnd);
		
		JLabel lblOperatingSystem = new JLabel("Python Programming(CA201)");
		lblOperatingSystem.setForeground(Color.BLACK);
		lblOperatingSystem.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblOperatingSystem.setBounds(738, 372, 224, 26);
		panel.add(lblOperatingSystem);
		
		JLabel lblDataStructureUsing = new JLabel("Adv.  java Programming");
		lblDataStructureUsing.setForeground(Color.BLACK);
		lblDataStructureUsing.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblDataStructureUsing.setBounds(738, 398, 256, 26);
		panel.add(lblDataStructureUsing);
		
		JLabel lblGraphTheory = new JLabel("Accounting &finacial Managmante  ");
		lblGraphTheory.setForeground(Color.BLACK);
		lblGraphTheory.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblGraphTheory.setBounds(737, 427, 289, 19);
		panel.add(lblGraphTheory);
		
		JLabel lblAdvancedProfessionalCommunication = new JLabel("Discreate Mathmatic(CA203)");
		lblAdvancedProfessionalCommunication.setForeground(Color.BLACK);
		lblAdvancedProfessionalCommunication.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblAdvancedProfessionalCommunication.setBounds(736, 445, 300, 26);
		panel.add(lblAdvancedProfessionalCommunication);
		
		JLabel lblPractical_1 = new JLabel("Practical");
		lblPractical_1.setForeground(Color.BLACK);
		lblPractical_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPractical_1.setBounds(797, 485, 88, 26);
		panel.add(lblPractical_1);
		
		JLabel lblDataStructureUsing_1 = new JLabel("Python Programming Lab");
		lblDataStructureUsing_1.setForeground(Color.BLACK);
		lblDataStructureUsing_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblDataStructureUsing_1.setBounds(738, 538, 298, 26);
		panel.add(lblDataStructureUsing_1);
		
		JLabel lblPractical_1_1 = new JLabel("Total");
		lblPractical_1_1.setForeground(Color.BLACK);
		lblPractical_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPractical_1_1.setBounds(345, 582, 58, 26);
		panel.add(lblPractical_1_1);
		
		JLabel lblPractical_1_1_1 = new JLabel("Total");
		lblPractical_1_1_1.setForeground(Color.BLACK);
		lblPractical_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPractical_1_1_1.setBounds(985, 574, 58, 26);
		panel.add(lblPractical_1_1_1);
		
		JSeparator separator_3_2_1_1 = new JSeparator();
		separator_3_2_1_1.setForeground(new Color(0, 0, 153));
		separator_3_2_1_1.setBackground(new Color(0, 0, 153));
		separator_3_2_1_1.setBounds(401, 574, 989, 14);
		panel.add(separator_3_2_1_1);
		
		JSeparator separator_3_2_1_1_1 = new JSeparator();
		separator_3_2_1_1_1.setForeground(new Color(0, 0, 153));
		separator_3_2_1_1_1.setBackground(new Color(0, 0, 153));
		separator_3_2_1_1_1.setBounds(162, 627, 996, 14);
		panel.add(separator_3_2_1_1_1);
		
		JSeparator separator_3_2_1_1_1_1 = new JSeparator();
		separator_3_2_1_1_1_1.setForeground(new Color(0, 0, 153));
		separator_3_2_1_1_1_1.setBackground(new Color(0, 0, 153));
		separator_3_2_1_1_1_1.setBounds(160, 785, 1003, 14);
		panel.add(separator_3_2_1_1_1_1);
		
		JSeparator separator_3_2_1_1_1_2 = new JSeparator();
		separator_3_2_1_1_1_2.setForeground(new Color(0, 0, 153));
		separator_3_2_1_1_1_2.setBackground(new Color(0, 0, 153));
		separator_3_2_1_1_1_2.setBounds(160, 673, 998, 14);
		panel.add(separator_3_2_1_1_1_2);
		
		JSeparator separator_3_2_1_1_1_3 = new JSeparator();
		separator_3_2_1_1_1_3.setForeground(new Color(0, 0, 153));
		separator_3_2_1_1_1_3.setBackground(new Color(0, 0, 153));
		separator_3_2_1_1_1_3.setBounds(162, 723, 996, 14);
		panel.add(separator_3_2_1_1_1_3);
		
		JSeparator separator_3_2_3_1 = new JSeparator();
		separator_3_2_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_3_1.setForeground(new Color(0, 0, 153));
		separator_3_2_3_1.setBackground(new Color(0, 0, 153));
		separator_3_2_3_1.setBounds(161, 627, 9, 160);
		panel.add(separator_3_2_3_1);
		
		JSeparator separator_3_2_3_1_1 = new JSeparator();
		separator_3_2_3_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_3_1_1.setForeground(new Color(0, 0, 153));
		separator_3_2_3_1_1.setBackground(new Color(0, 0, 153));
		separator_3_2_3_1_1.setBounds(1160, 627, 32, 160);
		panel.add(separator_3_2_3_1_1);
		
		JSeparator separator_3_2_3_1_2 = new JSeparator();
		separator_3_2_3_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_3_1_2.setForeground(new Color(0, 0, 153));
		separator_3_2_3_1_2.setBackground(new Color(0, 0, 153));
		separator_3_2_3_1_2.setBounds(525, 627, 9, 160);
		panel.add(separator_3_2_3_1_2);
		
		JSeparator separator_3_2_3_1_3 = new JSeparator();
		separator_3_2_3_1_3.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_3_1_3.setForeground(new Color(0, 0, 153));
		separator_3_2_3_1_3.setBackground(new Color(0, 0, 153));
		separator_3_2_3_1_3.setBounds(858, 627, 9, 160);
		panel.add(separator_3_2_3_1_3);
		
		JLabel lblFistSemester_1 = new JLabel("Theard Semester");
		lblFistSemester_1.setForeground(Color.BLACK);
		lblFistSemester_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFistSemester_1.setBounds(262, 628, 160, 35);
		panel.add(lblFistSemester_1);
		
		JLabel lblFistSemester_1_1 = new JLabel("Fourth Semester");
		lblFistSemester_1_1.setForeground(Color.BLACK);
		lblFistSemester_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFistSemester_1_1.setBounds(604, 628, 160, 35);
		panel.add(lblFistSemester_1_1);
		
		JLabel lblFistSemester_1_2 = new JLabel("Gread Total");
		lblFistSemester_1_2.setForeground(Color.BLACK);
		lblFistSemester_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFistSemester_1_2.setBounds(968, 627, 160, 35);
		panel.add(lblFistSemester_1_2);
		
		JLabel lblMarksObt = new JLabel("/ 700");
		lblMarksObt.setForeground(Color.BLACK);
		lblMarksObt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarksObt.setBounds(330, 687, 49, 26);
		panel.add(lblMarksObt);
		
	 lblResult = new JLabel("Result");
		lblResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				result();
				
			}
		});
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblResult.setBounds(298, 736, 152, 26);
		panel.add(lblResult);
		
		 lblMarks = new JLabel("700");
		lblMarks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF3E_DB.getText());
				int b=Integer.parseInt(textF3I_DB.getText());
				int c=Integer.parseInt(textF3E_CN.getText());
				int d=Integer.parseInt(textF3I_CN.getText());
				int g=Integer.parseInt(textF3E_JP.getText());
				int h=Integer.parseInt(textF3I_JP.getText());
				int f=Integer.parseInt(textF3E_POBM.getText());
				int x=Integer.parseInt(textF3I_POBM.getText());
				int y=Integer.parseInt(textF3E_SE.getText());
				int z=Integer.parseInt(textF3I_SE.getText());
				int u=Integer.parseInt(textF3E_P_JP.getText());
				int v=Integer.parseInt(textF3i_P_JP.getText());
				int w=Integer.parseInt(textF3E_P_DB.getText());
				int o=Integer.parseInt(textF3I_P_DB.getText());
				lblMarks.setText(" "+(a+b+c+d+g+h+f+x+y+z+u+v+w+o)+" ");
				
			}
		});
		lblMarks.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarks.setForeground(Color.BLACK);
		lblMarks.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarks.setBounds(264, 687, 58, 26);
		panel.add(lblMarks);
		
		 lblMarks2 = new JLabel("600");
		lblMarks2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					int a=Integer.parseInt(textS4E_WN.getText());
					int b=Integer.parseInt(textS4I_WN.getText());
					int c=Integer.parseInt(textS4E_ptytnon.getText());
					int d=Integer.parseInt(textS4I_Python.getText());
					int f=Integer.parseInt(textS4E_ADvjava.getText());
					int g=Integer.parseInt(textS4I_advjava.getText());
					int h=Integer.parseInt(textS4E_ACC.getText());
					int i=Integer.parseInt(textS4i_ACC.getText());
					int j=Integer.parseInt(textS4E_DM.getText());
					int k=Integer.parseInt(textS4i_DM.getText());
					int l=Integer.parseInt(textS4EA_L_Pyth.getText());
					int m=Integer.parseInt(textS4IA_L_Pyth.getText());
					int n=Integer.parseInt(textS4EA_ADjava.getText());
					int o=Integer.parseInt(textS4IA_ADjava.getText());
					lblMarks2.setText(" "+(a+b+c+d+f+g+h+i+j+k+l+m+n+o)+" ");
				
				
			}
		});
		lblMarks2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarks2.setForeground(Color.BLACK);
		lblMarks2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarks2.setBounds(613, 687, 58, 26);
		panel.add(lblMarks2);
		
		 lblMarksObt_2 = new JLabel("/ 700");
		lblMarksObt_2.setForeground(Color.BLACK);
		lblMarksObt_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarksObt_2.setBounds(679, 687, 49, 26);
		panel.add(lblMarksObt_2);
		
		 lblT_DB = new JLabel("0");
		lblT_DB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF3E_DB.getText());
				int b=Integer.parseInt(textF3I_DB.getText());
				lblT_DB.setText(" "+(a+b)+" ");
			}
		});
		lblT_DB.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_DB.setForeground(Color.BLACK);
		lblT_DB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_DB.setBounds(651, 365, 58, 22);
		panel.add(lblT_DB);
		
		lblT_CN = new JLabel("0");
		lblT_CN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF3E_CN.getText());
				int b=Integer.parseInt(textF3I_CN.getText());
				lblT_CN.setText(" "+(a+b)+" ");
			}
		});
		lblT_CN.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_CN.setForeground(Color.BLACK);
		lblT_CN.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_CN.setBounds(651, 394, 58, 22);
		panel.add(lblT_CN);
		
		 lblT_JP = new JLabel("0");
		lblT_JP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF3E_JP.getText());
				int b=Integer.parseInt(textF3I_JP.getText());
				lblT_JP.setText(" "+(a+b)+" ");
			}
		});
		lblT_JP.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_JP.setForeground(Color.BLACK);
		lblT_JP.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_JP.setBounds(651, 419, 58, 22);
		panel.add(lblT_JP);
		
		 lblT_POBM = new JLabel("0");
		lblT_POBM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF3E_POBM.getText());
				int b=Integer.parseInt(textF3I_POBM.getText());
				lblT_POBM.setText(" "+(a+b)+" ");
			}
		});
		lblT_POBM.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_POBM.setForeground(Color.BLACK);
		lblT_POBM.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_POBM.setBounds(651, 442, 58, 22);
		panel.add(lblT_POBM);
		
		 lblT_SE = new JLabel("0");
		lblT_SE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF3E_SE.getText());
				int b=Integer.parseInt(textF3I_SE.getText());
				lblT_SE.setText(" "+(a+b)+" ");
			}
		});
		lblT_SE.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_SE.setForeground(Color.BLACK);
		lblT_SE.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_SE.setBounds(651, 466, 58, 22);
		panel.add(lblT_SE);
		
		 lblT_P_DB = new JLabel("0");
		lblT_P_DB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF3E_P_DB.getText());
				int b=Integer.parseInt(textF3I_P_DB.getText());
				lblT_P_DB.setText(" "+(a+b)+" ");
			}
		});
		lblT_P_DB.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_P_DB.setForeground(Color.BLACK);
		lblT_P_DB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_P_DB.setBounds(650, 512, 58, 22);
		panel.add(lblT_P_DB);
		
		 lblT_L_JP = new JLabel("0");
		lblT_L_JP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF3E_P_JP.getText());
				int b=Integer.parseInt(textF3i_P_JP.getText());
				lblT_L_JP.setText(" "+(a+b)+" ");
			}
		});
		lblT_L_JP.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_L_JP.setForeground(Color.BLACK);
		lblT_L_JP.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_L_JP.setBounds(651, 550, 58, 22);
		panel.add(lblT_L_JP);
		
		 lblT_WN = new JLabel("0");
		lblT_WN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textS4E_WN.getText());
				int b=Integer.parseInt(textS4I_WN.getText());
				lblT_WN.setText(" "+(a+b)+" ");
			}
		});
		
		
		lblT_WN.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_WN.setForeground(Color.BLACK);
		lblT_WN.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_WN.setBounds(1332, 365, 58, 22);
		panel.add(lblT_WN);
		
		 lblT_Python = new JLabel("0");
		lblT_Python.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int c=Integer.parseInt(textS4E_ptytnon.getText());
				int d=Integer.parseInt(textS4I_Python.getText());
				lblT_Python.setText(" "+(c+d)+" ");
			}
		});
		lblT_Python.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_Python.setForeground(Color.BLACK);
		lblT_Python.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_Python.setBounds(1333, 389, 58, 19);
		panel.add(lblT_Python);
		
		 lblT_Advajava = new JLabel("0");
		lblT_Advajava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int f=Integer.parseInt(textS4E_ADvjava.getText());
				int g=Integer.parseInt(textS4I_advjava.getText());
				lblT_Advajava.setText(" "+(f+g)+" ");
			}
		});
		lblT_Advajava.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_Advajava.setForeground(Color.BLACK);
		lblT_Advajava.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_Advajava.setBounds(1332, 412, 58, 22);
		panel.add(lblT_Advajava);
		
	 lblT_ACC = new JLabel("0");
		lblT_ACC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int h=Integer.parseInt(textS4E_ACC.getText());
				int i=Integer.parseInt(textS4i_ACC.getText());
				lblT_ACC.setText(" "+(h+i)+" ");
			}
		});
		lblT_ACC.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_ACC.setForeground(Color.BLACK);
		lblT_ACC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_ACC.setBounds(1332, 437, 58, 19);
		panel.add(lblT_ACC);
		
		 lblT_DM = new JLabel("0");
		lblT_DM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int j=Integer.parseInt(textS4E_DM.getText());
				int k=Integer.parseInt(textS4i_DM.getText());
				lblT_DM.setText(" "+(j+k)+" ");
			}
		});
		lblT_DM.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_DM.setForeground(Color.BLACK);
		lblT_DM.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_DM.setBounds(1332, 461, 58, 19);
		panel.add(lblT_DM);
		
		 LblT_L_Pyth = new JLabel("0");
		LblT_L_Pyth.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int l=Integer.parseInt(textS4EA_L_Pyth.getText());
				int m=Integer.parseInt(textS4IA_L_Pyth.getText());
				LblT_L_Pyth.setText(" "+(l+m)+" ");
			}
		});
		LblT_L_Pyth.setHorizontalAlignment(SwingConstants.CENTER);
		LblT_L_Pyth.setForeground(Color.BLACK);
		LblT_L_Pyth.setFont(new Font("Times New Roman", Font.BOLD, 20));
		LblT_L_Pyth.setBounds(1332, 546, 58, 19);
		panel.add(LblT_L_Pyth);
		
		 
		
		 lblResult2 = new JLabel("Result");
		lblResult2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultsem4();
			}
		});
		lblResult2.setForeground(Color.BLACK);
		lblResult2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblResult2.setBounds(612, 736, 152, 26);
		panel.add(lblResult2);
		
		 lblMarksObt_2_1 = new JLabel("/ 1400");
		lblMarksObt_2_1.setForeground(Color.BLACK);
		lblMarksObt_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarksObt_2_1.setBounds(1031, 687, 71, 26);
		panel.add(lblMarksObt_2_1);
		
		JLabel lblMarksf = new JLabel("1400");
		lblMarksf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int a=Integer.parseInt(textS4E_WN.getText());
				int b=Integer.parseInt(textS4I_WN.getText());
				int c=Integer.parseInt(textS4E_ptytnon.getText());
				int d=Integer.parseInt(textS4I_Python.getText());
				int f=Integer.parseInt(textS4E_ADvjava.getText());
				int g=Integer.parseInt(textS4I_advjava.getText());
				int h=Integer.parseInt(textS4E_ACC.getText());
				int i=Integer.parseInt(textS4i_ACC.getText());
				int j=Integer.parseInt(textS4E_DM.getText());
				int k=Integer.parseInt(textS4i_DM.getText());
				int l=Integer.parseInt(textS4EA_L_Pyth.getText());
				int m=Integer.parseInt(textS4IA_L_Pyth.getText());
				int B=Integer.parseInt(textS4EA_ADjava.getText());
				int C=Integer.parseInt(textS4IA_ADjava.getText());
				int n=Integer.parseInt(textF3E_DB.getText());
				int o=Integer.parseInt(textF3I_DB.getText());
				int p=Integer.parseInt(textF3E_CN.getText());
				int q=Integer.parseInt(textF3I_CN.getText());
				int r=Integer.parseInt(textF3E_JP.getText());
				int s=Integer.parseInt(textF3I_JP.getText());
				int t=Integer.parseInt(textF3E_POBM.getText());
				int u=Integer.parseInt(textF3I_POBM.getText());
				int v=Integer.parseInt(textF3E_SE.getText());
				int w=Integer.parseInt(textF3I_SE.getText());
				int x=Integer.parseInt(textF3E_P_JP.getText());
				int y=Integer.parseInt(textF3i_P_JP.getText());
				int z=Integer.parseInt(textF3E_P_DB.getText());
				int A=Integer.parseInt(textF3I_P_DB.getText());
				lblMarksf.setText(" "+(a+b+c+d+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z+A+B+C)+" ");
			}
		});
		lblMarksf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarksf.setForeground(Color.BLACK);
		lblMarksf.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarksf.setBounds(968, 687, 58, 26);
		panel.add(lblMarksf);
		
		 lblfinalResult = new JLabel("Result");
		 lblfinalResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblfinalResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				finalresultse();
			}
		});
		lblfinalResult.setForeground(Color.BLACK);
		lblfinalResult.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblfinalResult.setBounds(914, 747, 214, 26);
		panel.add(lblfinalResult);
		
		JLabel lblDataStructureUsing_1_1 = new JLabel("Adv. java Programming Lab(CAP102)");
		lblDataStructureUsing_1_1.setForeground(Color.BLACK);
		lblDataStructureUsing_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblDataStructureUsing_1_1.setBounds(738, 510, 298, 26);
		panel.add(lblDataStructureUsing_1_1);
		
		JLabel lblEa_4_6_2_1 = new JLabel("50");
		lblEa_4_6_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6_2_1.setForeground(Color.BLACK);
		lblEa_4_6_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6_2_1.setBounds(1046, 510, 32, 26);
		panel.add(lblEa_4_6_2_1);
		
		JLabel lblEa_4_6_1_1_1 = new JLabel("50");
		lblEa_4_6_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6_1_1_1.setForeground(Color.BLACK);
		lblEa_4_6_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6_1_1_1.setBounds(1090, 510, 32, 26);
		panel.add(lblEa_4_6_1_1_1);
		
		JLabel lblTotal_4_6_1_1 = new JLabel("100");
		lblTotal_4_6_1_1.setForeground(Color.BLACK);
		lblTotal_4_6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_6_1_1.setBounds(1160, 510, 41, 26);
		panel.add(lblTotal_4_6_1_1);
		
		textS4EA_ADjava = new JTextField();
		textS4EA_ADjava.setHorizontalAlignment(SwingConstants.CENTER);
		textS4EA_ADjava.setForeground(new Color(51, 51, 0));
		textS4EA_ADjava.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4EA_ADjava.setColumns(10);
		textS4EA_ADjava.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4EA_ADjava.setBackground(new Color(135, 206, 235));
		textS4EA_ADjava.setBounds(1219, 514, 41, 19);
		panel.add(textS4EA_ADjava);
		
		textS4IA_ADjava = new JTextField();
		textS4IA_ADjava.setHorizontalAlignment(SwingConstants.CENTER);
		textS4IA_ADjava.setForeground(new Color(51, 51, 0));
		textS4IA_ADjava.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS4IA_ADjava.setColumns(10);
		textS4IA_ADjava.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS4IA_ADjava.setBackground(new Color(135, 206, 235));
		textS4IA_ADjava.setBounds(1271, 514, 41, 19);
		panel.add(textS4IA_ADjava);
		
		JLabel lblT_L_Adjava_1 = new JLabel("0");
		lblT_L_Adjava_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int l=Integer.parseInt(textS4EA_ADjava.getText());
				int m=Integer.parseInt(textS4IA_ADjava.getText());
				lblT_L_Adjava_1.setText(" "+(l+m)+" ");
			}
		});
		lblT_L_Adjava_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_L_Adjava_1.setForeground(Color.BLACK);
		lblT_L_Adjava_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_L_Adjava_1.setBounds(1332, 519, 58, 19);
		panel.add(lblT_L_Adjava_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		panel_1.setBounds(1413, 10, 117, 825);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondyearResult();
			}
		});
		btnCreate.setBounds(10, 480, 97, 33);
		btnCreate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCreate.setBorder(new LineBorder(new Color(255, 228, 196), 2));
		btnCreate.setBackground(new Color(221, 160, 221));
		panel_1.add(btnCreate);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondyearResultupdate();
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnUpdate.setBorder(new LineBorder(new Color(255, 228, 196), 2));
		btnUpdate.setBackground(new Color(221, 160, 221));
		btnUpdate.setBounds(10, 560, 97, 33);
		panel_1.add(btnUpdate);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrinterJob job = PrinterJob.getPrinterJob();
	            job.setJobName("Print Data");
	            
	            job.setPrintable(new Printable(){
	            public int print(Graphics pg,PageFormat pf, int pageNum){
	                    pf.setOrientation(PageFormat.LANDSCAPE);
	                 if(pageNum > 0){
	                    return Printable.NO_SUCH_PAGE;
	                }
	                
	                Graphics2D g2 = (Graphics2D)pg;
	                g2.translate(pf.getImageableX(), pf.getImageableY());
	                g2.scale(0.47,0.47);
	                
	                panel.print(g2);
	         
	               
	                return Printable.PAGE_EXISTS;
	                         
	                
	            }
	    });
	            boolean ok = job.printDialog();
	        if(ok){
	        try{
	            
	        job.print();
	        }
	        catch (PrinterException ex){
		ex.printStackTrace();
	}
	        }


				}
			});
		
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnPrint.setBorder(new LineBorder(new Color(255, 228, 196), 2));
		btnPrint.setBackground(new Color(221, 160, 221));
		btnPrint.setBounds(10, 415, 97, 33);
		panel_1.add(btnPrint);
		
		JButton btnView = new JButton("VIew");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultview.main(null);
			}
		});
		btnView.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView.setBorder(new LineBorder(new Color(255, 228, 196), 2));
		btnView.setBackground(new Color(221, 160, 221));
		btnView.setBounds(10, 204, 97, 33);
		panel_1.add(btnView);
		
		JButton btnView_1_2 = new JButton("Back");
		btnView_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FistyearResult.main(null);
				dispose();
			}
		});
		btnView_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 0, 0), new Color(255, 51, 204), new Color(51, 255, 51)));
		btnView_1_2.setBackground(new Color(0, 204, 204));
		btnView_1_2.setBounds(10, 0, 100, 40);
		panel_1.add(btnView_1_2);
	}
	public void result() {
		
		 double a,b,c,d,f,g,h,i,j,k,l,m,n,o;
		     a=Integer.parseInt(textF3E_DB.getText());
			 b=Integer.parseInt(textF3I_DB.getText());
			 c=Integer.parseInt(textF3E_CN.getText());
			 d=Integer.parseInt(textF3I_CN.getText());
			 g=Integer.parseInt(textF3E_JP.getText());
			 h=Integer.parseInt(textF3I_JP.getText());
			 f=Integer.parseInt(textF3E_POBM.getText());
			 i=Integer.parseInt(textF3I_POBM.getText());
			 j=Integer.parseInt(textF3E_SE.getText());
			 k=Integer.parseInt(textF3I_SE.getText());
			 l=Integer.parseInt(textF3E_P_JP.getText());
			 m=Integer.parseInt(textF3i_P_JP.getText());
			 n=Integer.parseInt(textF3E_P_DB.getText());
			 o=Integer.parseInt(textF3I_P_DB.getText());
		
		  total = a+b+c+d+f+g+h+i+j+k+l+m+n+o;
		  
		  avg=total/7;
		  
		if (avg >=99) {
			
			result = "Pass";
			}
		else if (avg>=33) {
			result="pass";
		}
		else {
			result="Fail";
		}
		lblResult.setText(String.valueOf(result));
	}
	public void resultsem4() {
		
		 double a,b,c,d,f,g,h,i,j,k,l,m,n,o;
			 a=Integer.parseInt(textS4E_WN.getText());
			 b=Integer.parseInt(textS4I_WN.getText());
			 c=Integer.parseInt(textS4E_ptytnon.getText());
			 d=Integer.parseInt(textS4I_Python.getText());
			 f=Integer.parseInt(textS4E_ADvjava.getText());
			 g=Integer.parseInt(textS4I_advjava.getText());
			 h=Integer.parseInt(textS4E_ACC.getText());
			 i=Integer.parseInt(textS4i_ACC.getText());
			 j=Integer.parseInt(textS4E_DM.getText());
			 k=Integer.parseInt(textS4i_DM.getText());
			 l=Integer.parseInt(textS4EA_L_Pyth.getText());
			 m=Integer.parseInt(textS4IA_L_Pyth.getText());
			 n=Integer.parseInt(textS4EA_ADjava.getText());
			o=Integer.parseInt(textS4IA_ADjava.getText());
		
		  total = a+b+c+d+f+g+h+i+j+k+l+m+n+o;
		  
		  avg=total/7;
		  
		if (avg >=99) {
			
			result = "Pass";
			}
		else if (avg>=33) {
			result="pass";
		}
		else {
			result="Fail";
		}
		lblResult2.setText(String.valueOf(result));
	}
	public void finalresultse() {
		
		 double a,b,c,d,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C;
		     a=Integer.parseInt(textS4E_WN.getText());
			 b=Integer.parseInt(textS4I_WN.getText());
			 c=Integer.parseInt(textS4E_ptytnon.getText());
			 d=Integer.parseInt(textS4I_Python.getText());
			 f=Integer.parseInt(textS4E_ADvjava.getText());
			 g=Integer.parseInt(textS4I_advjava.getText());
			 h=Integer.parseInt(textS4E_ACC.getText());
			 i=Integer.parseInt(textS4i_ACC.getText());
			 j=Integer.parseInt(textS4E_DM.getText());
			 k=Integer.parseInt(textS4i_DM.getText());
			 l=Integer.parseInt(textS4EA_L_Pyth.getText());
			 m=Integer.parseInt(textS4IA_L_Pyth.getText());
			 B=Integer.parseInt(textS4EA_ADjava.getText());
			 C=Integer.parseInt(textS4IA_ADjava.getText());
			 n=Integer.parseInt(textF3E_DB.getText());
			 o=Integer.parseInt(textF3I_DB.getText());
			 p=Integer.parseInt(textF3E_CN.getText());
		     q=Integer.parseInt(textF3I_CN.getText());
			 r=Integer.parseInt(textF3E_JP.getText());
			 s=Integer.parseInt(textF3I_JP.getText());
			 t=Integer.parseInt(textF3E_POBM.getText());
			 u=Integer.parseInt(textF3I_POBM.getText());
			 v=Integer.parseInt(textF3E_SE.getText());
			 w=Integer.parseInt(textF3I_SE.getText());
			 x=Integer.parseInt(textF3E_P_JP.getText());
			 y=Integer.parseInt(textF3i_P_JP.getText());
			 z=Integer.parseInt(textF3E_P_DB.getText());
			 A=Integer.parseInt(textF3I_P_DB.getText());
			 
		
		  total = a+b+c+d+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z+A+B+C;
		  
		  avg=total/14;
		  
		if (avg >=45) {
			
			result = "Pass";
			}
		
		else if (avg>=40){
			result="Pass With BCP";
		}
		else if(avg<=33){
			result="Fail";
		}
		lblfinalResult.setText(String.valueOf(result));
	}
	public void secondyearResultupdate() {
		
		 try {
	 			Class.forName("com.mysql.cj.jdbc.Driver");
		    		Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
		    		String sql="update SecondyearResult set Roll=?,Name=?,Enrollmentno=?,Fathername=?,ThardSemesterMaks=?,ThardSemesterResult=?,FurthSemesterMaks=? ,FurthSemesterResult=? ,FinalResult=? where Roll = ?";
		    		PreparedStatement PS=conn.prepareStatement(sql);
		    		PS.setString(1,Rollno.getText());
					 PS.setString(2, Name.getText());
					 PS.setString(3,Enrollmentno.getText());
					 PS.setString(4, Fathername.getText());
					 PS.setString(5,lblMarks.getText());
					 PS.setString(6, lblResult.getText());
					 PS.setString(7,lblMarks2.getText());
					 PS.setString(8, lblResult2.getText());
					 PS.setString(9,lblfinalResult.getText());
					 PS.setString(10,Rollno.getText());
					 
					 PS.executeUpdate();
	 		JOptionPane.showMessageDialog(null, "Second year Marksheet is Updeted Sucsesfuly....");
	 		conn.close();
	 		}
		    	  catch (Exception e2) {
					e2.printStackTrace();
				}

	}
	public void secondyearResult() {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
				 String query = "INSERT INTO SecondyearResult values (?,?,?,?,?,?,?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				 PS.setString(1,Rollno.getText());
				 PS.setString(2, Name.getText());
				 PS.setString(3,Enrollmentno.getText());
				 PS.setString(4, Fathername.getText());
				 PS.setString(5,lblMarks.getText());
				 PS.setString(6, lblResult.getText());
				 PS.setString(7,lblMarks2.getText());
				 PS.setString(8, lblResult2.getText());
				 PS.setString(9,lblfinalResult.getText());
				 
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(null, "second year Marksheet Redy to print");
				 PS.close();
				 connection.close();
				 
			}
			catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
				/*if (rdbtnNewRadioButtonMale.isSelected()) 
					 	PS.setString(3, rdbtnNewRadioButtonMale.getText());
				 else 
					 	PS.setString(3, rdbtnFemale.getText());*/
			}
		   
	}
}
