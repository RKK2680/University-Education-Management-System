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

public class FistyearResult extends JFrame {

	private JPanel contentPane;
	private String path;
	private JTextField Enrollmentno;
	private JTextField Name;
	private JTextField Rollno;
	private JTextField Fathername;
	private JTextField textF1EPC;
	private JTextField textF1EEVS;
	private JTextField textF1ECF;
	private JTextField textF1EC;
	private JTextField textF1Ecbnst;
	private JTextField textF1EP_ca;
	private JTextField textF1EP_c;
	private JTextField textF1IPC;
	private JTextField textF1IEVS;
	private JTextField textF1ICF;
	private JTextField textF1IC;
	private JTextField textF1Icbnst;
	private JTextField textF1IP_ca;
	private JTextField textF1iP_c;
	private JTextField textS2E_sys_ana;
	private JTextField textS2E_os;
	private JTextField textS2E_Da;
	private JTextField textS2E_Gt;
	private JTextField textS2E_APC;
	private JTextField textS2EP_Da;
	private JTextField textS2I_sys_ana;
	private JTextField textS2I_os;
	private JTextField textS2I_Da;
	private JTextField textS2i_gt;
	private JTextField textS2i_APC;
	private JTextField textS2IP_Da;
	private JLabel lblT_PC;
	private JLabel lblT_EVS;
	private JLabel lblT_CF;
	private JLabel lblT_C;
	private JLabel lblT_Cbnst;
	private JLabel lblT_Ca;
	private JLabel lblT_L_C;
	private JLabel lblT_Sys_ana;
	private double total;
	private double avg;
	private String result;
	private JLabel lblResult;
	private JLabel lblT_OS;
	private JLabel lblT_Da;
	private JLabel lblT_gt;
	private JLabel lblT_L_Da;
	private JLabel lblResult2;
	private JLabel lblMarksObt_2_1;
	private JLabel lblfinalResult;
	private JLabel lblMarks;
	private JLabel lblT_APC;
	private JLabel lblMarksObt_2;
	private JLabel lblMarks2;
	private JPanel panel;
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FistyearResult frame = new FistyearResult();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FistyearResult() {
		setTitle("Result");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 1554, 961);
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
		
		JLabel lblBachelorssInComputer = new JLabel("Bachelors's in Computer Application Fist Year Examination 2022");
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
		
		JLabel lblFistSemester = new JLabel("Fist Semester");
		lblFistSemester.setForeground(Color.BLACK);
		lblFistSemester.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblFistSemester.setBounds(151, 282, 123, 26);
		panel.add(lblFistSemester);
		
		JLabel lblSecondsemester = new JLabel("SecondSemester");
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
		
		JLabel lblProfessionalCommunication = new JLabel("Professional communication (MS101)");
		lblProfessionalCommunication.setForeground(Color.BLACK);
		lblProfessionalCommunication.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProfessionalCommunication.setBounds(30, 363, 300, 26);
		panel.add(lblProfessionalCommunication);
		
		JLabel lblProfessionalCommunicationms = new JLabel("  Fundamentals of Environmental Science (EVS101)");
		lblProfessionalCommunicationms.setForeground(Color.BLACK);
		lblProfessionalCommunicationms.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProfessionalCommunicationms.setBounds(20, 385, 374, 26);
		panel.add(lblProfessionalCommunicationms);
		
		JLabel lblIntroductionOfComputer = new JLabel("introduction of computer fundamental(CA102)");
		lblIntroductionOfComputer.setForeground(Color.BLACK);
		lblIntroductionOfComputer.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroductionOfComputer.setBounds(30, 410, 349, 26);
		panel.add(lblIntroductionOfComputer);
		
		JLabel lblProgrammingInC = new JLabel("Programming in C(CA101)");
		lblProgrammingInC.setForeground(Color.BLACK);
		lblProgrammingInC.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProgrammingInC.setBounds(29, 434, 214, 24);
		panel.add(lblProgrammingInC);
		
		JLabel lblCbnstmt = new JLabel("CBNST(MT103)");
		lblCbnstmt.setForeground(Color.BLACK);
		lblCbnstmt.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCbnstmt.setBounds(28, 457, 190, 26);
		panel.add(lblCbnstmt);
		
		JLabel lblPractical = new JLabel("Practical");
		lblPractical.setForeground(Color.BLACK);
		lblPractical.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPractical.setBounds(162, 485, 88, 26);
		panel.add(lblPractical);
		
		JLabel lblComputerApplicationLabcap = new JLabel(" Computer Application Lab(CAP 104)");
		lblComputerApplicationLabcap.setForeground(Color.BLACK);
		lblComputerApplicationLabcap.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblComputerApplicationLabcap.setBounds(30, 510, 349, 26);
		panel.add(lblComputerApplicationLabcap);
		
		JLabel lblCProgrammingLab = new JLabel("C Programming Lab (CAP103)");
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
		
		textF1EPC = new JTextField();
		textF1EPC.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1EPC.setBackground(new Color(135, 206, 235));
		textF1EPC.setHorizontalAlignment(SwingConstants.CENTER);
		textF1EPC.setForeground(new Color(51, 51, 0));
		textF1EPC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1EPC.setColumns(10);
		textF1EPC.setBounds(548, 367, 41, 19);
		panel.add(textF1EPC);
		
		textF1EEVS = new JTextField();
		textF1EEVS.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1EEVS.setBackground(new Color(135, 206, 235));
		textF1EEVS.setHorizontalAlignment(SwingConstants.CENTER);
		textF1EEVS.setForeground(new Color(51, 51, 0));
		textF1EEVS.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1EEVS.setColumns(10);
		textF1EEVS.setBounds(548, 391, 41, 19);
		panel.add(textF1EEVS);
		
		textF1ECF = new JTextField();
		textF1ECF.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1ECF.setBackground(new Color(135, 206, 235));
		textF1ECF.setHorizontalAlignment(SwingConstants.CENTER);
		textF1ECF.setForeground(new Color(51, 51, 0));
		textF1ECF.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1ECF.setColumns(10);
		textF1ECF.setBounds(548, 416, 41, 19);
		panel.add(textF1ECF);
		
		textF1EC = new JTextField();
		textF1EC.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1EC.setBackground(new Color(135, 206, 235));
		textF1EC.setHorizontalAlignment(SwingConstants.CENTER);
		textF1EC.setForeground(new Color(51, 51, 0));
		textF1EC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1EC.setColumns(10);
		textF1EC.setBounds(548, 439, 41, 19);
		panel.add(textF1EC);
		
		textF1Ecbnst = new JTextField();
		textF1Ecbnst.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1Ecbnst.setBackground(new Color(135, 206, 235));
		textF1Ecbnst.setHorizontalAlignment(SwingConstants.CENTER);
		textF1Ecbnst.setForeground(new Color(51, 51, 0));
		textF1Ecbnst.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1Ecbnst.setColumns(10);
		textF1Ecbnst.setBounds(548, 463, 41, 19);
		panel.add(textF1Ecbnst);
		
		textF1EP_ca = new JTextField();
		textF1EP_ca.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1EP_ca.setBackground(new Color(135, 206, 235));
		textF1EP_ca.setHorizontalAlignment(SwingConstants.CENTER);
		textF1EP_ca.setForeground(new Color(51, 51, 0));
		textF1EP_ca.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1EP_ca.setColumns(10);
		textF1EP_ca.setBounds(548, 514, 41, 19);
		panel.add(textF1EP_ca);
		
		textF1EP_c = new JTextField();
		textF1EP_c.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1EP_c.setBackground(new Color(135, 206, 235));
		textF1EP_c.setHorizontalAlignment(SwingConstants.CENTER);
		textF1EP_c.setForeground(new Color(51, 51, 0));
		textF1EP_c.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1EP_c.setColumns(10);
		textF1EP_c.setBounds(548, 550, 41, 19);
		panel.add(textF1EP_c);
		
		textF1IPC = new JTextField();
		textF1IPC.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1IPC.setBackground(new Color(135, 206, 235));
		textF1IPC.setHorizontalAlignment(SwingConstants.CENTER);
		textF1IPC.setForeground(new Color(51, 51, 0));
		textF1IPC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1IPC.setColumns(10);
		textF1IPC.setBounds(599, 367, 41, 19);
		panel.add(textF1IPC);
		
		textF1IEVS = new JTextField();
		textF1IEVS.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1IEVS.setBackground(new Color(135, 206, 235));
		textF1IEVS.setHorizontalAlignment(SwingConstants.CENTER);
		textF1IEVS.setForeground(new Color(51, 51, 0));
		textF1IEVS.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1IEVS.setColumns(10);
		textF1IEVS.setBounds(600, 394, 41, 19);
		panel.add(textF1IEVS);
		
		textF1ICF = new JTextField();
		textF1ICF.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1ICF.setBackground(new Color(135, 206, 235));
		textF1ICF.setHorizontalAlignment(SwingConstants.CENTER);
		textF1ICF.setForeground(new Color(51, 51, 0));
		textF1ICF.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1ICF.setColumns(10);
		textF1ICF.setBounds(599, 414, 41, 19);
		panel.add(textF1ICF);
		
		textF1IC = new JTextField();
		textF1IC.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1IC.setBackground(new Color(135, 206, 235));
		textF1IC.setHorizontalAlignment(SwingConstants.CENTER);
		textF1IC.setForeground(new Color(51, 51, 0));
		textF1IC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1IC.setColumns(10);
		textF1IC.setBounds(600, 442, 41, 19);
		panel.add(textF1IC);
		
		textF1Icbnst = new JTextField();
		textF1Icbnst.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1Icbnst.setBackground(new Color(135, 206, 235));
		textF1Icbnst.setHorizontalAlignment(SwingConstants.CENTER);
		textF1Icbnst.setForeground(new Color(51, 51, 0));
		textF1Icbnst.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1Icbnst.setColumns(10);
		textF1Icbnst.setBounds(600, 466, 41, 19);
		panel.add(textF1Icbnst);
		
		textF1IP_ca = new JTextField();
		textF1IP_ca.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1IP_ca.setBackground(new Color(135, 206, 235));
		textF1IP_ca.setHorizontalAlignment(SwingConstants.CENTER);
		textF1IP_ca.setForeground(new Color(51, 51, 0));
		textF1IP_ca.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1IP_ca.setColumns(10);
		textF1IP_ca.setBounds(599, 514, 41, 19);
		panel.add(textF1IP_ca);
		
		textF1iP_c = new JTextField();
		textF1iP_c.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF1iP_c.setBackground(new Color(135, 206, 235));
		textF1iP_c.setHorizontalAlignment(SwingConstants.CENTER);
		textF1iP_c.setForeground(new Color(51, 51, 0));
		textF1iP_c.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF1iP_c.setColumns(10);
		textF1iP_c.setBounds(600, 553, 41, 19);
		panel.add(textF1iP_c);
		
		JButton buttonEITotal = new JButton("");
		buttonEITotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textF1EPC.getText());
				int b=Integer.parseInt(textF1IPC.getText());
				int c=Integer.parseInt(textF1EEVS.getText());
				int d=Integer.parseInt(textF1IEVS.getText());
				int g=Integer.parseInt(textF1ECF.getText());
				int h=Integer.parseInt(textF1ICF.getText());
				int f=Integer.parseInt(textF1EC.getText());
				int x=Integer.parseInt(textF1IC.getText());
				int y=Integer.parseInt(textF1Ecbnst.getText());
				int z=Integer.parseInt(textF1Icbnst.getText());
				int u=Integer.parseInt(textF1EP_c.getText());
				int v=Integer.parseInt(textF1iP_c.getText());
				int w=Integer.parseInt(textF1EP_ca.getText());
				int o=Integer.parseInt(textF1IP_ca.getText());
				buttonEITotal.setText(" "+(a+b+c+d+g+h+f+x+y+z+u+v+w+o)+" ");
			}
		});
		
		buttonEITotal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonEITotal.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonEITotal.setBackground(new Color(135, 206, 250));
		buttonEITotal.setBounds(661, 582, 54, 26);
		panel.add(buttonEITotal);
		
		JButton buttonEATotal = new JButton("");
		buttonEATotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textF1EPC.getText());
				int c=Integer.parseInt(textF1EEVS.getText());
				int g=Integer.parseInt(textF1ECF.getText());
				int f=Integer.parseInt(textF1EC.getText());
				int y=Integer.parseInt(textF1Ecbnst.getText());
				int u=Integer.parseInt(textF1EP_c.getText());
				int w=Integer.parseInt(textF1EP_ca.getText());
				buttonEATotal.setText(" "+(a+c+g+f+y+u+w)+" ");
			}
		});
		buttonEATotal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonEATotal.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonEATotal.setBackground(new Color(135, 206, 250));
		buttonEATotal.setBounds(548, 582, 49, 26);
		panel.add(buttonEATotal);
		
		JButton buttonIATotal = new JButton("");
		buttonIATotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b=Integer.parseInt(textF1IPC.getText());
				int d=Integer.parseInt(textF1IEVS.getText());
				int h=Integer.parseInt(textF1ICF.getText());
				int x=Integer.parseInt(textF1IC.getText());
				int z=Integer.parseInt(textF1Icbnst.getText());
				int v=Integer.parseInt(textF1iP_c.getText());
				int o=Integer.parseInt(textF1IP_ca.getText());
				buttonIATotal.setText(" "+(b+d+h+x+z+v+o)+" ");
			}
		});
		buttonIATotal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonIATotal.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonIATotal.setBackground(new Color(135, 206, 250));
		buttonIATotal.setBounds(599, 582, 58, 26);
		panel.add(buttonIATotal);
		
		JLabel lblTotal_4_9_1 = new JLabel("400");
		lblTotal_4_9_1.setForeground(Color.BLACK);
		lblTotal_4_9_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_9_1.setBounds(1053, 574, 49, 26);
		panel.add(lblTotal_4_9_1);
		
		JLabel lblEa_4_6_2 = new JLabel("50");
		lblEa_4_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6_2.setForeground(Color.BLACK);
		lblEa_4_6_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6_2.setBounds(1053, 538, 32, 26);
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
		lblEa_4_6_1_1.setBounds(1090, 538, 32, 26);
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
		lblTotal_4_6_1.setBounds(1151, 538, 49, 26);
		panel.add(lblTotal_4_6_1);
		
		JLabel lblTotal_4_7_1 = new JLabel("600");
		lblTotal_4_7_1.setForeground(Color.BLACK);
		lblTotal_4_7_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_7_1.setBounds(1151, 574, 49, 26);
		panel.add(lblTotal_4_7_1);
		
		textS2E_sys_ana = new JTextField();
		textS2E_sys_ana.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2E_sys_ana.setBackground(new Color(135, 206, 235));
		textS2E_sys_ana.setHorizontalAlignment(SwingConstants.CENTER);
		textS2E_sys_ana.setForeground(new Color(51, 51, 0));
		textS2E_sys_ana.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2E_sys_ana.setColumns(10);
		textS2E_sys_ana.setBounds(1217, 359, 41, 19);
		panel.add(textS2E_sys_ana);
		
		textS2E_os = new JTextField();
		textS2E_os.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2E_os.setBackground(new Color(135, 206, 235));
		textS2E_os.setHorizontalAlignment(SwingConstants.CENTER);
		textS2E_os.setForeground(new Color(51, 51, 0));
		textS2E_os.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2E_os.setColumns(10);
		textS2E_os.setBounds(1217, 383, 41, 19);
		panel.add(textS2E_os);
		
		textS2E_Da = new JTextField();
		textS2E_Da.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2E_Da.setBackground(new Color(135, 206, 235));
		textS2E_Da.setHorizontalAlignment(SwingConstants.CENTER);
		textS2E_Da.setForeground(new Color(51, 51, 0));
		textS2E_Da.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2E_Da.setColumns(10);
		textS2E_Da.setBounds(1217, 408, 41, 19);
		panel.add(textS2E_Da);
		
		textS2E_Gt = new JTextField();
		textS2E_Gt.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2E_Gt.setBackground(new Color(135, 206, 235));
		textS2E_Gt.setHorizontalAlignment(SwingConstants.CENTER);
		textS2E_Gt.setForeground(new Color(51, 51, 0));
		textS2E_Gt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2E_Gt.setColumns(10);
		textS2E_Gt.setBounds(1217, 431, 41, 19);
		panel.add(textS2E_Gt);
		
		textS2E_APC = new JTextField();
		textS2E_APC.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2E_APC.setBackground(new Color(135, 206, 235));
		textS2E_APC.setHorizontalAlignment(SwingConstants.CENTER);
		textS2E_APC.setForeground(new Color(51, 51, 0));
		textS2E_APC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2E_APC.setColumns(10);
		textS2E_APC.setBounds(1217, 455, 41, 19);
		panel.add(textS2E_APC);
		
		textS2EP_Da = new JTextField();
		textS2EP_Da.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2EP_Da.setBackground(new Color(135, 206, 235));
		textS2EP_Da.setHorizontalAlignment(SwingConstants.CENTER);
		textS2EP_Da.setForeground(new Color(51, 51, 0));
		textS2EP_Da.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2EP_Da.setColumns(10);
		textS2EP_Da.setBounds(1217, 542, 41, 19);
		panel.add(textS2EP_Da);
		
		JButton button_EA_Total = new JButton("");
		button_EA_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						int a=Integer.parseInt(textS2E_sys_ana.getText());						
						int c=Integer.parseInt(textS2E_os.getText());					
						int f=Integer.parseInt(textS2E_Da.getText());
						int h=Integer.parseInt(textS2E_Gt.getText());
						int j=Integer.parseInt(textS2E_APC.getText());
						int l=Integer.parseInt(textS2EP_Da.getText());
						
						button_EA_Total.setText(" "+(a+c+f+h+j+l)+" ");
					}
				});
		button_EA_Total.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_EA_Total.setBorder(new LineBorder(new Color(135, 206, 235)));
		button_EA_Total.setBackground(new Color(135, 206, 250));
		button_EA_Total.setBounds(1211, 582, 49, 26);
		panel.add(button_EA_Total);
		
		textS2I_sys_ana = new JTextField();
		textS2I_sys_ana.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2I_sys_ana.setBackground(new Color(135, 206, 235));
		textS2I_sys_ana.setHorizontalAlignment(SwingConstants.CENTER);
		textS2I_sys_ana.setForeground(new Color(51, 51, 0));
		textS2I_sys_ana.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2I_sys_ana.setColumns(10);
		textS2I_sys_ana.setBounds(1271, 360, 41, 22);
		panel.add(textS2I_sys_ana);
		
		textS2I_os = new JTextField();
		textS2I_os.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2I_os.setBackground(new Color(135, 206, 235));
		textS2I_os.setHorizontalAlignment(SwingConstants.CENTER);
		textS2I_os.setForeground(new Color(51, 51, 0));
		textS2I_os.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2I_os.setColumns(10);
		textS2I_os.setBounds(1269, 386, 41, 19);
		panel.add(textS2I_os);
		
		textS2I_Da = new JTextField();
		textS2I_Da.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2I_Da.setBackground(new Color(135, 206, 235));
		textS2I_Da.setHorizontalAlignment(SwingConstants.CENTER);
		textS2I_Da.setForeground(new Color(51, 51, 0));
		textS2I_Da.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2I_Da.setColumns(10);
		textS2I_Da.setBounds(1269, 411, 41, 19);
		panel.add(textS2I_Da);
		
		textS2i_gt = new JTextField();
		textS2i_gt.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2i_gt.setBackground(new Color(135, 206, 235));
		textS2i_gt.setHorizontalAlignment(SwingConstants.CENTER);
		textS2i_gt.setForeground(new Color(51, 51, 0));
		textS2i_gt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2i_gt.setColumns(10);
		textS2i_gt.setBounds(1269, 434, 41, 19);
		panel.add(textS2i_gt);
		
		textS2i_APC = new JTextField();
		textS2i_APC.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2i_APC.setBackground(new Color(135, 206, 235));
		textS2i_APC.setHorizontalAlignment(SwingConstants.CENTER);
		textS2i_APC.setForeground(new Color(51, 51, 0));
		textS2i_APC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2i_APC.setColumns(10);
		textS2i_APC.setBounds(1269, 458, 41, 19);
		panel.add(textS2i_APC);
		
		textS2IP_Da = new JTextField();
		textS2IP_Da.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS2IP_Da.setBackground(new Color(135, 206, 235));
		textS2IP_Da.setHorizontalAlignment(SwingConstants.CENTER);
		textS2IP_Da.setForeground(new Color(51, 51, 0));
		textS2IP_Da.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS2IP_Da.setColumns(10);
		textS2IP_Da.setBounds(1269, 545, 41, 19);
		panel.add(textS2IP_Da);
		
		JButton button_IA_Total = new JButton("");
		button_IA_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
						int b=Integer.parseInt(textS2I_sys_ana.getText());						
						int d=Integer.parseInt(textS2I_os.getText());					
						int g=Integer.parseInt(textS2I_Da.getText());					
						int i=Integer.parseInt(textS2i_gt.getText());					
						int k=Integer.parseInt(textS2i_APC.getText());			
						int m=Integer.parseInt(textS2IP_Da.getText());
						button_IA_Total.setText(" "+(b+d+g+i+k+m)+" ");
					}
				});
		
		
		button_IA_Total.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_IA_Total.setBorder(new LineBorder(new Color(135, 206, 235)));
		button_IA_Total.setBackground(new Color(135, 206, 250));
		button_IA_Total.setBounds(1268, 582, 58, 26);
		panel.add(button_IA_Total);
		
		JButton buttonTotal = new JButton("");
		buttonTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textS2E_sys_ana.getText());
				int b=Integer.parseInt(textS2I_sys_ana.getText());
				int c=Integer.parseInt(textS2E_os.getText());
				int d=Integer.parseInt(textS2I_os.getText());
				int f=Integer.parseInt(textS2E_Da.getText());
				int g=Integer.parseInt(textS2I_Da.getText());
				int h=Integer.parseInt(textS2E_Gt.getText());
				int i=Integer.parseInt(textS2i_gt.getText());
				int j=Integer.parseInt(textS2E_APC.getText());
				int k=Integer.parseInt(textS2i_APC.getText());
				int l=Integer.parseInt(textS2EP_Da.getText());
				int m=Integer.parseInt(textS2IP_Da.getText());
				buttonTotal.setText(" "+(a+b+c+d+f+g+h+i+j+k+l+m)+" ");
			}
		});
		buttonTotal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonTotal.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonTotal.setBackground(new Color(135, 206, 250));
		buttonTotal.setBounds(1332, 582, 58, 26);
		panel.add(buttonTotal);
		
		JLabel lblSystemAnalysisAnd = new JLabel("System analysis and design(CA201)");
		lblSystemAnalysisAnd.setForeground(Color.BLACK);
		lblSystemAnalysisAnd.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblSystemAnalysisAnd.setBounds(736, 355, 300, 19);
		panel.add(lblSystemAnalysisAnd);
		
		JLabel lblOperatingSystem = new JLabel("Operating system(CA201)");
		lblOperatingSystem.setForeground(Color.BLACK);
		lblOperatingSystem.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblOperatingSystem.setBounds(738, 372, 224, 26);
		panel.add(lblOperatingSystem);
		
		JLabel lblDataStructureUsing = new JLabel("Data structure Using C (CA204)");
		lblDataStructureUsing.setForeground(Color.BLACK);
		lblDataStructureUsing.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblDataStructureUsing.setBounds(738, 398, 256, 26);
		panel.add(lblDataStructureUsing);
		
		JLabel lblGraphTheory = new JLabel("Graph theory ");
		lblGraphTheory.setForeground(Color.BLACK);
		lblGraphTheory.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblGraphTheory.setBounds(737, 427, 148, 19);
		panel.add(lblGraphTheory);
		
		JLabel lblAdvancedProfessionalCommunication = new JLabel("Advanced Professional Communication");
		lblAdvancedProfessionalCommunication.setForeground(Color.BLACK);
		lblAdvancedProfessionalCommunication.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblAdvancedProfessionalCommunication.setBounds(736, 445, 300, 26);
		panel.add(lblAdvancedProfessionalCommunication);
		
		JLabel lblPractical_1 = new JLabel("Practical");
		lblPractical_1.setForeground(Color.BLACK);
		lblPractical_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPractical_1.setBounds(799, 507, 88, 26);
		panel.add(lblPractical_1);
		
		JLabel lblDataStructureUsing_1 = new JLabel("Data structure Using C  Lab (CAP205)");
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
		
		JLabel lblFistSemester_1 = new JLabel("Fist Semester");
		lblFistSemester_1.setForeground(Color.BLACK);
		lblFistSemester_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFistSemester_1.setBounds(262, 628, 160, 35);
		panel.add(lblFistSemester_1);
		
		JLabel lblFistSemester_1_1 = new JLabel("Second Semester");
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
				int a=Integer.parseInt(textF1EPC.getText());
				int b=Integer.parseInt(textF1IPC.getText());
				int c=Integer.parseInt(textF1EEVS.getText());
				int d=Integer.parseInt(textF1IEVS.getText());
				int g=Integer.parseInt(textF1ECF.getText());
				int h=Integer.parseInt(textF1ICF.getText());
				int f=Integer.parseInt(textF1EC.getText());
				int x=Integer.parseInt(textF1IC.getText());
				int y=Integer.parseInt(textF1Ecbnst.getText());
				int z=Integer.parseInt(textF1Icbnst.getText());
				int u=Integer.parseInt(textF1EP_c.getText());
				int v=Integer.parseInt(textF1iP_c.getText());
				int w=Integer.parseInt(textF1EP_ca.getText());
				int o=Integer.parseInt(textF1IP_ca.getText());
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
				
					int a=Integer.parseInt(textS2E_sys_ana.getText());
					int b=Integer.parseInt(textS2I_sys_ana.getText());
					int c=Integer.parseInt(textS2E_os.getText());
					int d=Integer.parseInt(textS2I_os.getText());
					int f=Integer.parseInt(textS2E_Da.getText());
					int g=Integer.parseInt(textS2I_Da.getText());
					int h=Integer.parseInt(textS2E_Gt.getText());
					int i=Integer.parseInt(textS2i_gt.getText());
					int j=Integer.parseInt(textS2E_APC.getText());
					int k=Integer.parseInt(textS2i_APC.getText());
					int l=Integer.parseInt(textS2EP_Da.getText());
					int m=Integer.parseInt(textS2IP_Da.getText());
					lblMarks2.setText(" "+(a+b+c+d+f+g+h+i+j+k+l+m)+" ");
				
				
			}
		});
		lblMarks2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarks2.setForeground(Color.BLACK);
		lblMarks2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarks2.setBounds(613, 687, 58, 26);
		panel.add(lblMarks2);
		
		 lblMarksObt_2 = new JLabel("/ 600");
		lblMarksObt_2.setForeground(Color.BLACK);
		lblMarksObt_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarksObt_2.setBounds(679, 687, 49, 26);
		panel.add(lblMarksObt_2);
		
		 lblT_PC = new JLabel("0");
		lblT_PC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF1EPC.getText());
				int b=Integer.parseInt(textF1IPC.getText());
				lblT_PC.setText(" "+(a+b)+" ");
			}
		});
		lblT_PC.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_PC.setForeground(Color.BLACK);
		lblT_PC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_PC.setBounds(651, 365, 58, 22);
		panel.add(lblT_PC);
		
		lblT_EVS = new JLabel("0");
		lblT_EVS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF1EEVS.getText());
				int b=Integer.parseInt(textF1IEVS.getText());
				lblT_EVS.setText(" "+(a+b)+" ");
			}
		});
		lblT_EVS.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_EVS.setForeground(Color.BLACK);
		lblT_EVS.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_EVS.setBounds(651, 394, 58, 22);
		panel.add(lblT_EVS);
		
		 lblT_CF = new JLabel("0");
		lblT_CF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF1ECF.getText());
				int b=Integer.parseInt(textF1ICF.getText());
				lblT_CF.setText(" "+(a+b)+" ");
			}
		});
		lblT_CF.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_CF.setForeground(Color.BLACK);
		lblT_CF.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_CF.setBounds(651, 419, 58, 22);
		panel.add(lblT_CF);
		
		 lblT_C = new JLabel("0");
		lblT_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF1EC.getText());
				int b=Integer.parseInt(textF1IC.getText());
				lblT_C.setText(" "+(a+b)+" ");
			}
		});
		lblT_C.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_C.setForeground(Color.BLACK);
		lblT_C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_C.setBounds(651, 442, 58, 22);
		panel.add(lblT_C);
		
		 lblT_Cbnst = new JLabel("0");
		lblT_Cbnst.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF1Ecbnst.getText());
				int b=Integer.parseInt(textF1Icbnst.getText());
				lblT_Cbnst.setText(" "+(a+b)+" ");
			}
		});
		lblT_Cbnst.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_Cbnst.setForeground(Color.BLACK);
		lblT_Cbnst.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_Cbnst.setBounds(651, 466, 58, 22);
		panel.add(lblT_Cbnst);
		
		 lblT_Ca = new JLabel("0");
		lblT_Ca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF1EP_ca.getText());
				int b=Integer.parseInt(textF1IP_ca.getText());
				lblT_Ca.setText(" "+(a+b)+" ");
			}
		});
		lblT_Ca.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_Ca.setForeground(Color.BLACK);
		lblT_Ca.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_Ca.setBounds(650, 512, 58, 22);
		panel.add(lblT_Ca);
		
		 lblT_L_C = new JLabel("0");
		lblT_L_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF1EP_c.getText());
				int b=Integer.parseInt(textF1iP_c.getText());
				lblT_L_C.setText(" "+(a+b)+" ");
			}
		});
		lblT_L_C.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_L_C.setForeground(Color.BLACK);
		lblT_L_C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_L_C.setBounds(651, 550, 58, 22);
		panel.add(lblT_L_C);
		
		 lblT_Sys_ana = new JLabel("0");
		lblT_Sys_ana.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textS2E_sys_ana.getText());
				int b=Integer.parseInt(textS2I_sys_ana.getText());
				lblT_Sys_ana.setText(" "+(a+b)+" ");
			}
		});
		
		
		lblT_Sys_ana.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_Sys_ana.setForeground(Color.BLACK);
		lblT_Sys_ana.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_Sys_ana.setBounds(1332, 365, 58, 22);
		panel.add(lblT_Sys_ana);
		
		 lblT_OS = new JLabel("0");
		lblT_OS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int c=Integer.parseInt(textS2E_os.getText());
				int d=Integer.parseInt(textS2I_os.getText());
				lblT_OS.setText(" "+(c+d)+" ");
			}
		});
		lblT_OS.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_OS.setForeground(Color.BLACK);
		lblT_OS.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_OS.setBounds(1333, 389, 58, 19);
		panel.add(lblT_OS);
		
		 lblT_Da = new JLabel("0");
		lblT_Da.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int f=Integer.parseInt(textS2E_Da.getText());
				int g=Integer.parseInt(textS2I_Da.getText());
				lblT_Da.setText(" "+(f+g)+" ");
			}
		});
		lblT_Da.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_Da.setForeground(Color.BLACK);
		lblT_Da.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_Da.setBounds(1332, 412, 58, 22);
		panel.add(lblT_Da);
		
	 lblT_gt = new JLabel("0");
		lblT_gt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int h=Integer.parseInt(textS2E_Gt.getText());
				int i=Integer.parseInt(textS2i_gt.getText());
				lblT_gt.setText(" "+(h+i)+" ");
			}
		});
		lblT_gt.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_gt.setForeground(Color.BLACK);
		lblT_gt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_gt.setBounds(1332, 437, 58, 19);
		panel.add(lblT_gt);
		
		 lblT_APC = new JLabel("0");
		lblT_APC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int j=Integer.parseInt(textS2E_APC.getText());
				int k=Integer.parseInt(textS2i_APC.getText());
				lblT_APC.setText(" "+(j+k)+" ");
			}
		});
		lblT_APC.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_APC.setForeground(Color.BLACK);
		lblT_APC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_APC.setBounds(1332, 461, 58, 19);
		panel.add(lblT_APC);
		
		 lblT_L_Da = new JLabel("0");
		lblT_L_Da.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int l=Integer.parseInt(textS2EP_Da.getText());
				int m=Integer.parseInt(textS2IP_Da.getText());
				lblT_L_Da.setText(" "+(l+m)+" ");
			}
		});
		lblT_L_Da.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_L_Da.setForeground(Color.BLACK);
		lblT_L_Da.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_L_Da.setBounds(1332, 546, 58, 19);
		panel.add(lblT_L_Da);
		
		 
		
		 lblResult2 = new JLabel("Result");
		lblResult2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultsem2();
			}
		});
		lblResult2.setForeground(Color.BLACK);
		lblResult2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblResult2.setBounds(612, 736, 152, 26);
		panel.add(lblResult2);
		
		 lblMarksObt_2_1 = new JLabel("/ 1300");
		lblMarksObt_2_1.setForeground(Color.BLACK);
		lblMarksObt_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarksObt_2_1.setBounds(1031, 687, 71, 26);
		panel.add(lblMarksObt_2_1);
		
		JLabel lblMarksf = new JLabel("1300");
		lblMarksf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int a=Integer.parseInt(textS2E_sys_ana.getText());
				int b=Integer.parseInt(textS2I_sys_ana.getText());
				int c=Integer.parseInt(textS2E_os.getText());
				int d=Integer.parseInt(textS2I_os.getText());
				int f=Integer.parseInt(textS2E_Da.getText());
				int g=Integer.parseInt(textS2I_Da.getText());
				int h=Integer.parseInt(textS2E_Gt.getText());
				int i=Integer.parseInt(textS2i_gt.getText());
				int j=Integer.parseInt(textS2E_APC.getText());
				int k=Integer.parseInt(textS2i_APC.getText());
				int l=Integer.parseInt(textS2EP_Da.getText());
				int m=Integer.parseInt(textS2IP_Da.getText());
				int n=Integer.parseInt(textF1EPC.getText());
				int o=Integer.parseInt(textF1IPC.getText());
				int p=Integer.parseInt(textF1EEVS.getText());
				int q=Integer.parseInt(textF1IEVS.getText());
				int r=Integer.parseInt(textF1ECF.getText());
				int s=Integer.parseInt(textF1ICF.getText());
				int t=Integer.parseInt(textF1EC.getText());
				int u=Integer.parseInt(textF1IC.getText());
				int v=Integer.parseInt(textF1Ecbnst.getText());
				int w=Integer.parseInt(textF1Icbnst.getText());
				int x=Integer.parseInt(textF1EP_c.getText());
				int y=Integer.parseInt(textF1iP_c.getText());
				int z=Integer.parseInt(textF1EP_ca.getText());
				int A=Integer.parseInt(textF1IP_ca.getText());
				lblMarksf.setText(" "+(a+b+c+d+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z+A)+" ");
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		panel_1.setBounds(1423, 10, 117, 825);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FistyearResult();
			}
		});
		btnCreate.setBounds(13, 623, 97, 33);
		btnCreate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCreate.setBorder(new LineBorder(new Color(255, 228, 196), 2));
		btnCreate.setBackground(new Color(221, 160, 221));
		panel_1.add(btnCreate);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FistyearResultupdate();
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnUpdate.setBorder(new LineBorder(new Color(255, 228, 196), 2));
		btnUpdate.setBackground(new Color(221, 160, 221));
		btnUpdate.setBounds(13, 703, 97, 33);
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
		btnPrint.setBounds(13, 558, 97, 33);
		panel_1.add(btnPrint);
		
		JButton btnView = new JButton("VIew");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnView.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView.setBorder(new LineBorder(new Color(255, 228, 196), 2));
		btnView.setBackground(new Color(221, 160, 221));
		btnView.setBounds(10, 236, 97, 33);
		panel_1.add(btnView);
		
		JButton btnView_1_2 = new JButton("Back");
		btnView_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				project.main(null);
				dispose();
			}
		});
		btnView_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 0, 0), new Color(255, 51, 204), new Color(51, 255, 51)));
		btnView_1_2.setBackground(new Color(0, 204, 204));
		btnView_1_2.setBounds(10, 0, 100, 40);
		panel_1.add(btnView_1_2);
		
		JButton btnndYear = new JButton("\nResult");
		btnndYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondyearresult.main(null);
				dispose();
			}
		});
		btnndYear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnndYear.setBorder(new LineBorder(new Color(255, 228, 196), 2));
		btnndYear.setBackground(new Color(221, 160, 221));
		btnndYear.setBounds(10, 99, 97, 33);
		panel_1.add(btnndYear);
		
		JLabel lblndYear = new JLabel("2nd year");
		lblndYear.setForeground(Color.BLACK);
		lblndYear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblndYear.setBounds(13, 65, 86, 35);
		panel_1.add(lblndYear);
		
		JLabel lblrdYear = new JLabel("3rd year");
		lblrdYear.setForeground(Color.BLACK);
		lblrdYear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblrdYear.setBounds(16, 143, 86, 35);
		panel_1.add(lblrdYear);
		
		JButton btnndYear_1 = new JButton("\nResult");
		btnndYear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Theardyear.main(null);
				dispose();
			}
		});
		btnndYear_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnndYear_1.setBorder(new LineBorder(new Color(255, 228, 196), 2));
		btnndYear_1.setBackground(new Color(221, 160, 221));
		btnndYear_1.setBounds(13, 177, 97, 33);
		panel_1.add(btnndYear_1);
	}
	public void result() {
		
		 double a,b,c,d,f,g,h,i,j,k,l,m,n,o;
		     a=Integer.parseInt(textF1EPC.getText());
			 b=Integer.parseInt(textF1IPC.getText());
			 c=Integer.parseInt(textF1EEVS.getText());
			 d=Integer.parseInt(textF1IEVS.getText());
			 g=Integer.parseInt(textF1ECF.getText());
			 h=Integer.parseInt(textF1ICF.getText());
			 f=Integer.parseInt(textF1EC.getText());
			 i=Integer.parseInt(textF1IC.getText());
			 j=Integer.parseInt(textF1Ecbnst.getText());
			 k=Integer.parseInt(textF1Icbnst.getText());
			 l=Integer.parseInt(textF1EP_c.getText());
			 m=Integer.parseInt(textF1iP_c.getText());
			 n=Integer.parseInt(textF1EP_ca.getText());
			 o=Integer.parseInt(textF1IP_ca.getText());
		
		  total = a+b+c+d+f+g+h+i+j+k+l+m+n+o;
		  
		  avg=total/7;
		  
		if (avg >=45) {
			
			result = "Pass";
			}
		else if (avg>=33) {
			result="pass With BCP";
		}
		else {
			result="Fail";
		}
		lblResult.setText(String.valueOf(result));
	}
	public void resultsem2() {
		
		 double a,b,c,d,f,g,h,i,j,k,l,m;
			 a=Integer.parseInt(textS2E_sys_ana.getText());
			 b=Integer.parseInt(textS2I_sys_ana.getText());
			 c=Integer.parseInt(textS2E_os.getText());
			 d=Integer.parseInt(textS2I_os.getText());
			 f=Integer.parseInt(textS2E_Da.getText());
			 g=Integer.parseInt(textS2I_Da.getText());
			 h=Integer.parseInt(textS2E_Gt.getText());
			 i=Integer.parseInt(textS2i_gt.getText());
			 j=Integer.parseInt(textS2E_APC.getText());
			 k=Integer.parseInt(textS2i_APC.getText());
			 l=Integer.parseInt(textS2EP_Da.getText());
			 m=Integer.parseInt(textS2IP_Da.getText());
			
		
		  total = a+b+c+d+f+g+h+i+j+k+l+m;
		  
		  avg=total/6;
		  
		if (avg >=45) {
			
			result = "Pass";
			}
		else if (avg>=33) { 
			result="pass With BCP";
		}
		else {
			result="Fail";
		}
		lblResult2.setText(String.valueOf(result));
	}
	public void finalresultse() {
		
		 double a,b,c,d,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A;
		     a=Integer.parseInt(textS2E_sys_ana.getText());
			 b=Integer.parseInt(textS2I_sys_ana.getText());
			 c=Integer.parseInt(textS2E_os.getText());
			 d=Integer.parseInt(textS2I_os.getText());
			 f=Integer.parseInt(textS2E_Da.getText());
			 g=Integer.parseInt(textS2I_Da.getText());
			 h=Integer.parseInt(textS2E_Gt.getText());
			 i=Integer.parseInt(textS2i_gt.getText());
			 j=Integer.parseInt(textS2E_APC.getText());
			 k=Integer.parseInt(textS2i_APC.getText());
			 l=Integer.parseInt(textS2EP_Da.getText());
			 m=Integer.parseInt(textS2IP_Da.getText());
			 n=Integer.parseInt(textF1EPC.getText());
			 o=Integer.parseInt(textF1IPC.getText());
			 p=Integer.parseInt(textF1EEVS.getText());
		     q=Integer.parseInt(textF1IEVS.getText());
			 r=Integer.parseInt(textF1ECF.getText());
			 s=Integer.parseInt(textF1ICF.getText());
			 t=Integer.parseInt(textF1EC.getText());
			 u=Integer.parseInt(textF1IC.getText());
			 v=Integer.parseInt(textF1Ecbnst.getText());
			 w=Integer.parseInt(textF1Icbnst.getText());
			 x=Integer.parseInt(textF1EP_c.getText());
			 y=Integer.parseInt(textF1iP_c.getText());
			 z=Integer.parseInt(textF1EP_ca.getText());
			 A=Integer.parseInt(textF1IP_ca.getText());
			
		
		  total = a+b+c+d+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z+A;
		  
		  avg=total/13;
		  
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
	public void FistyearResultupdate() {
		
		 try {
	 			Class.forName("com.mysql.cj.jdbc.Driver");
		    		Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
		    		String sql="update FistyearResult set Roll=?,Name=?,Enrollmentno=?,Fathername=?,FistSemesterMaks=?,FistSemesterResult=?,SecondSemesterMaks=? ,SecondSemesterResult=? ,FinalResult=? where Roll = ?";
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
	 		JOptionPane.showMessageDialog(null, "Fist year Marksheet is Updeted Sucsesfuly....");
	 		conn.close();
	 		}
		    	  catch (Exception e2) {
					e2.printStackTrace();
				}

	}
	public void FistyearResult() {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
				 String query = "INSERT INTO FistyearResult values (?,?,?,?,?,?,?,?,?)";
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
				 JOptionPane.showMessageDialog(null, "Fist year Marksheet Redy to print");
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
