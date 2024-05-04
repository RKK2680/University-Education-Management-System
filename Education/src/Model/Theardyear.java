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

public class Theardyear extends JFrame {

	private JPanel contentPane;
	private String path;
	private JTextField Enrollmentno;
	private JTextField Name;
	private JTextField Rollno;
	private JTextField Fathername;
	private JTextField textF5E_ifo;
	private JTextField textF5E_net;
	private JTextField textF5E_web;
	private JTextField textF5E_cc;
	private JTextField textF5E_mp;
	private JTextField textF5E_P_net;
	private JTextField textF5E_P_wb;
	private JTextField textF3I_info;
	private JTextField textF5I_net;
	private JTextField textF5I_web;
	private JTextField textF5I_cc;
	private JTextField textF5I_mp;
	private JTextField textF5I_P_net;
	private JTextField textF5i_P_wb;
	private JTextField textS6E_RL;
	private JTextField textS6E_ML;
	private JTextField textS6E_MC;
	private JTextField textS6E_ONM;
	private JTextField textS6E_MJP;
	private JTextField textS6EA_L_ML;
	private JTextField textS6I_RL;
	private JTextField textS6I_ML;
	private JTextField textS6I_MC;
	private JTextField textS6i_Onm;
	private JTextField textS6i_MJP;
	private JTextField textS6IA_L_ML;
	private JLabel lblT_info;
	private JLabel lblT_net;
	private JLabel lblT_web;
	private JLabel lblT_cc;
	private JLabel lblT_mp;
	private JLabel lblT_P_net;
	private JLabel lblT_L_wb;
	private JLabel lblT_RL;
	private double total;
	private double avg;
	private String result;
	private JLabel lblResult5;
	private JLabel lblT_ML;
	private JLabel lblT_MC;
	private JLabel lblT_Onm;
	private JLabel LblT_L_ML;
	private JLabel lblResult6;
	private JLabel lblMarksObt_2_1;
	private JLabel lblfinalResult;
	private JLabel lblMarks5;
	private JLabel lblT_MJP;
	private JLabel lblMarksObt_2;
	private JLabel lblMarks6;
	private JPanel panel;
	private JTextField textS6EA_L_RL;
	private JTextField textS6IA_L_RL;
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Theardyear frame = new Theardyear();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Theardyear() {
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
		
		JLabel lblBachelorssInComputer = new JLabel("Bachelors's in Computer Application Theard  Year Examination 2022");
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
		
		JLabel lblFistSemester = new JLabel("Fifth Semester");
		lblFistSemester.setForeground(Color.BLACK);
		lblFistSemester.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblFistSemester.setBounds(151, 282, 123, 26);
		panel.add(lblFistSemester);
		
		JLabel lblSecondsemester = new JLabel("Six Semester");
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
		
		JLabel lblProfessionalCommunication = new JLabel("Information sequrity & cyber Low(CA504)");
		lblProfessionalCommunication.setForeground(Color.BLACK);
		lblProfessionalCommunication.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProfessionalCommunication.setBounds(30, 363, 339, 26);
		panel.add(lblProfessionalCommunication);
		
		JLabel lblProfessionalCommunicationms = new JLabel("  Dot Net Fremwork With C#(CA502)");
		lblProfessionalCommunicationms.setForeground(Color.BLACK);
		lblProfessionalCommunicationms.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProfessionalCommunicationms.setBounds(20, 385, 374, 26);
		panel.add(lblProfessionalCommunicationms);
		
		JLabel lblIntroductionOfComputer = new JLabel("Web Technology(CA501)");
		lblIntroductionOfComputer.setForeground(Color.BLACK);
		lblIntroductionOfComputer.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroductionOfComputer.setBounds(30, 410, 349, 26);
		panel.add(lblIntroductionOfComputer);
		
		JLabel lblProgrammingInC = new JLabel("Cloud Computing");
		lblProgrammingInC.setForeground(Color.BLACK);
		lblProgrammingInC.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProgrammingInC.setBounds(29, 434, 362, 24);
		panel.add(lblProgrammingInC);
		
		JLabel lblCbnstmt = new JLabel("Mini Project (CAP503)");
		lblCbnstmt.setForeground(Color.BLACK);
		lblCbnstmt.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCbnstmt.setBounds(29, 538, 246, 26);
		panel.add(lblCbnstmt);
		
		JLabel lblPractical = new JLabel("Practical");
		lblPractical.setForeground(Color.BLACK);
		lblPractical.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPractical.setBounds(152, 457, 88, 26);
		panel.add(lblPractical);
		
		JLabel lblComputerApplicationLabcap = new JLabel("   Dot NetFramework With C# Lab (CAP 502)");
		lblComputerApplicationLabcap.setForeground(Color.BLACK);
		lblComputerApplicationLabcap.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblComputerApplicationLabcap.setBounds(20, 482, 349, 26);
		panel.add(lblComputerApplicationLabcap);
		
		JLabel lblCProgrammingLab = new JLabel("  Web Technology(CAP501)");
		lblCProgrammingLab.setForeground(Color.BLACK);
		lblCProgrammingLab.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCProgrammingLab.setBounds(20, 510, 349, 26);
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
		
		JLabel lblEa_4_4 = new JLabel("100");
		lblEa_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_4.setForeground(Color.BLACK);
		lblEa_4_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_4.setBounds(401, 538, 32, 26);
		panel.add(lblEa_4_4);
		
		JLabel lblEa_4_5 = new JLabel("50");
		lblEa_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_5.setForeground(Color.BLACK);
		lblEa_4_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_5.setBounds(401, 482, 32, 26);
		panel.add(lblEa_4_5);
		
		JLabel lblEa_4_6 = new JLabel("50");
		lblEa_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6.setForeground(Color.BLACK);
		lblEa_4_6.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6.setBounds(401, 510, 32, 26);
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
		
		JLabel lblEa_4_7_4 = new JLabel("100");
		lblEa_4_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_4.setForeground(Color.BLACK);
		lblEa_4_7_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_4.setBounds(432, 540, 32, 24);
		panel.add(lblEa_4_7_4);
		
		JLabel lblEa_4_5_1 = new JLabel("50");
		lblEa_4_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_5_1.setForeground(Color.BLACK);
		lblEa_4_5_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_5_1.setBounds(432, 482, 32, 26);
		panel.add(lblEa_4_5_1);
		
		JLabel lblEa_4_6_1 = new JLabel("50");
		lblEa_4_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6_1.setForeground(Color.BLACK);
		lblEa_4_6_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6_1.setBounds(432, 510, 32, 26);
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
		
		JLabel lblTotal_4_4 = new JLabel("200");
		lblTotal_4_4.setForeground(Color.BLACK);
		lblTotal_4_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_4.setBounds(485, 538, 49, 26);
		panel.add(lblTotal_4_4);
		
		JLabel lblTotal_4_5 = new JLabel("100");
		lblTotal_4_5.setForeground(Color.BLACK);
		lblTotal_4_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_5.setBounds(485, 482, 49, 26);
		panel.add(lblTotal_4_5);
		
		JLabel lblTotal_4_6 = new JLabel("100");
		lblTotal_4_6.setForeground(Color.BLACK);
		lblTotal_4_6.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_6.setBounds(485, 510, 49, 26);
		panel.add(lblTotal_4_6);
		
		JLabel lblTotal_4_7 = new JLabel("800");
		lblTotal_4_7.setForeground(Color.BLACK);
		lblTotal_4_7.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_7.setBounds(485, 582, 49, 26);
		panel.add(lblTotal_4_7);
		
		JLabel lblTotal_4_8 = new JLabel("320");
		lblTotal_4_8.setForeground(Color.BLACK);
		lblTotal_4_8.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_8.setBounds(442, 582, 49, 26);
		panel.add(lblTotal_4_8);
		
		JLabel lblTotal_4_9 = new JLabel("480");
		lblTotal_4_9.setForeground(Color.BLACK);
		lblTotal_4_9.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_9.setBounds(401, 582, 49, 26);
		panel.add(lblTotal_4_9);
		
		textF5E_ifo = new JTextField();
		textF5E_ifo.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5E_ifo.setBackground(new Color(135, 206, 235));
		textF5E_ifo.setHorizontalAlignment(SwingConstants.CENTER);
		textF5E_ifo.setForeground(new Color(51, 51, 0));
		textF5E_ifo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5E_ifo.setColumns(10);
		textF5E_ifo.setBounds(548, 367, 41, 19);
		panel.add(textF5E_ifo);
		
		textF5E_net = new JTextField();
		textF5E_net.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5E_net.setBackground(new Color(135, 206, 235));
		textF5E_net.setHorizontalAlignment(SwingConstants.CENTER);
		textF5E_net.setForeground(new Color(51, 51, 0));
		textF5E_net.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5E_net.setColumns(10);
		textF5E_net.setBounds(548, 391, 41, 19);
		panel.add(textF5E_net);
		
		textF5E_web = new JTextField();
		textF5E_web.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5E_web.setBackground(new Color(135, 206, 235));
		textF5E_web.setHorizontalAlignment(SwingConstants.CENTER);
		textF5E_web.setForeground(new Color(51, 51, 0));
		textF5E_web.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5E_web.setColumns(10);
		textF5E_web.setBounds(548, 416, 41, 19);
		panel.add(textF5E_web);
		
		textF5E_cc = new JTextField();
		textF5E_cc.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5E_cc.setBackground(new Color(135, 206, 235));
		textF5E_cc.setHorizontalAlignment(SwingConstants.CENTER);
		textF5E_cc.setForeground(new Color(51, 51, 0));
		textF5E_cc.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5E_cc.setColumns(10);
		textF5E_cc.setBounds(548, 439, 41, 19);
		panel.add(textF5E_cc);
		
		textF5E_mp = new JTextField();
		textF5E_mp.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5E_mp.setBackground(new Color(135, 206, 235));
		textF5E_mp.setHorizontalAlignment(SwingConstants.CENTER);
		textF5E_mp.setForeground(new Color(51, 51, 0));
		textF5E_mp.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5E_mp.setColumns(10);
		textF5E_mp.setBounds(548, 538, 41, 19);
		panel.add(textF5E_mp);
		
		textF5E_P_net = new JTextField();
		textF5E_P_net.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5E_P_net.setBackground(new Color(135, 206, 235));
		textF5E_P_net.setHorizontalAlignment(SwingConstants.CENTER);
		textF5E_P_net.setForeground(new Color(51, 51, 0));
		textF5E_P_net.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5E_P_net.setColumns(10);
		textF5E_P_net.setBounds(548, 484, 41, 19);
		panel.add(textF5E_P_net);
		
		textF5E_P_wb = new JTextField();
		textF5E_P_wb.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5E_P_wb.setBackground(new Color(135, 206, 235));
		textF5E_P_wb.setHorizontalAlignment(SwingConstants.CENTER);
		textF5E_P_wb.setForeground(new Color(51, 51, 0));
		textF5E_P_wb.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5E_P_wb.setColumns(10);
		textF5E_P_wb.setBounds(548, 510, 41, 19);
		panel.add(textF5E_P_wb);
		
		textF3I_info = new JTextField();
		textF3I_info.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF3I_info.setBackground(new Color(135, 206, 235));
		textF3I_info.setHorizontalAlignment(SwingConstants.CENTER);
		textF3I_info.setForeground(new Color(51, 51, 0));
		textF3I_info.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF3I_info.setColumns(10);
		textF3I_info.setBounds(599, 367, 41, 19);
		panel.add(textF3I_info);
		
		textF5I_net = new JTextField();
		textF5I_net.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5I_net.setBackground(new Color(135, 206, 235));
		textF5I_net.setHorizontalAlignment(SwingConstants.CENTER);
		textF5I_net.setForeground(new Color(51, 51, 0));
		textF5I_net.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5I_net.setColumns(10);
		textF5I_net.setBounds(599, 389, 41, 19);
		panel.add(textF5I_net);
		
		textF5I_web = new JTextField();
		textF5I_web.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5I_web.setBackground(new Color(135, 206, 235));
		textF5I_web.setHorizontalAlignment(SwingConstants.CENTER);
		textF5I_web.setForeground(new Color(51, 51, 0));
		textF5I_web.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5I_web.setColumns(10);
		textF5I_web.setBounds(599, 414, 41, 19);
		panel.add(textF5I_web);
		
		textF5I_cc = new JTextField();
		textF5I_cc.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5I_cc.setBackground(new Color(135, 206, 235));
		textF5I_cc.setHorizontalAlignment(SwingConstants.CENTER);
		textF5I_cc.setForeground(new Color(51, 51, 0));
		textF5I_cc.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5I_cc.setColumns(10);
		textF5I_cc.setBounds(600, 442, 41, 19);
		panel.add(textF5I_cc);
		
		textF5I_mp = new JTextField();
		textF5I_mp.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5I_mp.setBackground(new Color(135, 206, 235));
		textF5I_mp.setHorizontalAlignment(SwingConstants.CENTER);
		textF5I_mp.setForeground(new Color(51, 51, 0));
		textF5I_mp.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5I_mp.setColumns(10);
		textF5I_mp.setBounds(600, 541, 41, 19);
		panel.add(textF5I_mp);
		
		textF5I_P_net = new JTextField();
		textF5I_P_net.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5I_P_net.setBackground(new Color(135, 206, 235));
		textF5I_P_net.setHorizontalAlignment(SwingConstants.CENTER);
		textF5I_P_net.setForeground(new Color(51, 51, 0));
		textF5I_P_net.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5I_P_net.setColumns(10);
		textF5I_P_net.setBounds(599, 484, 41, 19);
		panel.add(textF5I_P_net);
		
		textF5i_P_wb = new JTextField();
		textF5i_P_wb.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textF5i_P_wb.setBackground(new Color(135, 206, 235));
		textF5i_P_wb.setHorizontalAlignment(SwingConstants.CENTER);
		textF5i_P_wb.setForeground(new Color(51, 51, 0));
		textF5i_P_wb.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textF5i_P_wb.setColumns(10);
		textF5i_P_wb.setBounds(600, 513, 41, 19);
		panel.add(textF5i_P_wb);
		
		JButton buttonEITotal5 = new JButton("");
		buttonEITotal5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textF5E_ifo.getText());
				int b=Integer.parseInt(textF3I_info.getText());
				int c=Integer.parseInt(textF5E_net.getText());
				int d=Integer.parseInt(textF5I_net.getText());
				int g=Integer.parseInt(textF5E_web.getText());
				int h=Integer.parseInt(textF5I_web.getText());
				int f=Integer.parseInt(textF5E_cc.getText());
				int x=Integer.parseInt(textF5I_cc.getText());
				int y=Integer.parseInt(textF5E_mp.getText());
				int z=Integer.parseInt(textF5I_mp.getText());
				int u=Integer.parseInt(textF5E_P_wb.getText());
				int v=Integer.parseInt(textF5i_P_wb.getText());
				int w=Integer.parseInt(textF5E_P_net.getText());
				int o=Integer.parseInt(textF5I_P_net.getText());
				buttonEITotal5.setText(" "+(a+b+c+d+g+h+f+x+y+z+u+v+w+o)+" ");
			}
		});
		
		buttonEITotal5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonEITotal5.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonEITotal5.setBackground(new Color(135, 206, 250));
		buttonEITotal5.setBounds(661, 582, 54, 26);
		panel.add(buttonEITotal5);
		
		JButton buttonEATotal5 = new JButton("");
		buttonEATotal5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textF5E_ifo.getText());
				int c=Integer.parseInt(textF5E_net.getText());
				int g=Integer.parseInt(textF5E_web.getText());
				int f=Integer.parseInt(textF5E_cc.getText());
				int y=Integer.parseInt(textF5E_mp.getText());
				int u=Integer.parseInt(textF5E_P_wb.getText());
				int w=Integer.parseInt(textF5E_P_net.getText());
				buttonEATotal5.setText(" "+(a+c+g+f+y+u+w)+" ");
			}
		});
		buttonEATotal5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonEATotal5.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonEATotal5.setBackground(new Color(135, 206, 250));
		buttonEATotal5.setBounds(548, 582, 49, 26);
		panel.add(buttonEATotal5);
		
		JButton buttonIATotal5 = new JButton("");
		buttonIATotal5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b=Integer.parseInt(textF3I_info.getText());
				int d=Integer.parseInt(textF5I_net.getText());
				int h=Integer.parseInt(textF5I_web.getText());
				int x=Integer.parseInt(textF5I_cc.getText());
				int z=Integer.parseInt(textF5I_mp.getText());
				int v=Integer.parseInt(textF5i_P_wb.getText());
				int o=Integer.parseInt(textF5I_P_net.getText());
				buttonIATotal5.setText(" "+(b+d+h+x+z+v+o)+" ");
			}
		});
		buttonIATotal5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonIATotal5.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonIATotal5.setBackground(new Color(135, 206, 250));
		buttonIATotal5.setBounds(599, 582, 58, 26);
		panel.add(buttonIATotal5);
		
		JLabel lblTotal_4_9_1 = new JLabel("480");
		lblTotal_4_9_1.setForeground(Color.BLACK);
		lblTotal_4_9_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_9_1.setBounds(1053, 574, 49, 26);
		panel.add(lblTotal_4_9_1);
		
		JLabel lblEa_4_6_2 = new JLabel("100");
		lblEa_4_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6_2.setForeground(Color.BLACK);
		lblEa_4_6_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6_2.setBounds(1046, 531, 32, 26);
		panel.add(lblEa_4_6_2);
		
		JLabel lblEa_4_4_1 = new JLabel("50");
		lblEa_4_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_4_1.setForeground(Color.BLACK);
		lblEa_4_4_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_4_1.setBounds(1048, 482, 32, 26);
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
		
		JLabel lblEa_4_7_4_1 = new JLabel("50");
		lblEa_4_7_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_7_4_1.setForeground(Color.BLACK);
		lblEa_4_7_4_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_7_4_1.setBounds(1088, 482, 32, 26);
		panel.add(lblEa_4_7_4_1);
		
		JLabel lblEa_4_6_1_1 = new JLabel("100");
		lblEa_4_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEa_4_6_1_1.setForeground(Color.BLACK);
		lblEa_4_6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEa_4_6_1_1.setBounds(1090, 531, 32, 26);
		panel.add(lblEa_4_6_1_1);
		
		JLabel lblTotal_4_8_1 = new JLabel("320");
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
		lblTotal_4_4_1.setBounds(1160, 482, 49, 26);
		panel.add(lblTotal_4_4_1);
		
		JLabel lblTotal_4_6_1 = new JLabel("200");
		lblTotal_4_6_1.setForeground(Color.BLACK);
		lblTotal_4_6_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_6_1.setBounds(1160, 531, 49, 26);
		panel.add(lblTotal_4_6_1);
		
		JLabel lblTotal_4_7_1 = new JLabel("800");
		lblTotal_4_7_1.setForeground(Color.BLACK);
		lblTotal_4_7_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal_4_7_1.setBounds(1151, 574, 49, 26);
		panel.add(lblTotal_4_7_1);
		
		textS6E_RL = new JTextField();
		textS6E_RL.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6E_RL.setBackground(new Color(135, 206, 235));
		textS6E_RL.setHorizontalAlignment(SwingConstants.CENTER);
		textS6E_RL.setForeground(new Color(51, 51, 0));
		textS6E_RL.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6E_RL.setColumns(10);
		textS6E_RL.setBounds(1217, 359, 41, 19);
		panel.add(textS6E_RL);
		
		textS6E_ML = new JTextField();
		textS6E_ML.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6E_ML.setBackground(new Color(135, 206, 235));
		textS6E_ML.setHorizontalAlignment(SwingConstants.CENTER);
		textS6E_ML.setForeground(new Color(51, 51, 0));
		textS6E_ML.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6E_ML.setColumns(10);
		textS6E_ML.setBounds(1217, 383, 41, 19);
		panel.add(textS6E_ML);
		
		textS6E_MC = new JTextField();
		textS6E_MC.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6E_MC.setBackground(new Color(135, 206, 235));
		textS6E_MC.setHorizontalAlignment(SwingConstants.CENTER);
		textS6E_MC.setForeground(new Color(51, 51, 0));
		textS6E_MC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6E_MC.setColumns(10);
		textS6E_MC.setBounds(1217, 408, 41, 19);
		panel.add(textS6E_MC);
		
		textS6E_ONM = new JTextField();
		textS6E_ONM.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6E_ONM.setBackground(new Color(135, 206, 235));
		textS6E_ONM.setHorizontalAlignment(SwingConstants.CENTER);
		textS6E_ONM.setForeground(new Color(51, 51, 0));
		textS6E_ONM.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6E_ONM.setColumns(10);
		textS6E_ONM.setBounds(1217, 431, 41, 19);
		panel.add(textS6E_ONM);
		
		textS6E_MJP = new JTextField();
		textS6E_MJP.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6E_MJP.setBackground(new Color(135, 206, 235));
		textS6E_MJP.setHorizontalAlignment(SwingConstants.CENTER);
		textS6E_MJP.setForeground(new Color(51, 51, 0));
		textS6E_MJP.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6E_MJP.setColumns(10);
		textS6E_MJP.setBounds(1217, 540, 41, 19);
		panel.add(textS6E_MJP);
		
		textS6EA_L_ML = new JTextField();
		textS6EA_L_ML.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6EA_L_ML.setBackground(new Color(135, 206, 235));
		textS6EA_L_ML.setHorizontalAlignment(SwingConstants.CENTER);
		textS6EA_L_ML.setForeground(new Color(51, 51, 0));
		textS6EA_L_ML.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6EA_L_ML.setColumns(10);
		textS6EA_L_ML.setBounds(1217, 512, 41, 19);
		panel.add(textS6EA_L_ML);
		
		JButton button_EA_Total4 = new JButton("");
		button_EA_Total4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						int a=Integer.parseInt(textS6E_RL.getText());						
						int c=Integer.parseInt(textS6E_ML.getText());					
						int f=Integer.parseInt(textS6E_MC.getText());
						int h=Integer.parseInt(textS6E_ONM.getText());
						int j=Integer.parseInt(textS6E_MJP.getText());
						int l=Integer.parseInt(textS6EA_L_ML.getText());
						int n=Integer.parseInt(textS6EA_L_RL.getText());
						
						button_EA_Total4.setText(" "+(a+c+f+h+j+l+n)+" ");
					}
				});
		button_EA_Total4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_EA_Total4.setBorder(new LineBorder(new Color(135, 206, 235)));
		button_EA_Total4.setBackground(new Color(135, 206, 250));
		button_EA_Total4.setBounds(1211, 582, 49, 26);
		panel.add(button_EA_Total4);
		
		textS6I_RL = new JTextField();
		textS6I_RL.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6I_RL.setBackground(new Color(135, 206, 235));
		textS6I_RL.setHorizontalAlignment(SwingConstants.CENTER);
		textS6I_RL.setForeground(new Color(51, 51, 0));
		textS6I_RL.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6I_RL.setColumns(10);
		textS6I_RL.setBounds(1271, 360, 41, 22);
		panel.add(textS6I_RL);
		
		textS6I_ML = new JTextField();
		textS6I_ML.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6I_ML.setBackground(new Color(135, 206, 235));
		textS6I_ML.setHorizontalAlignment(SwingConstants.CENTER);
		textS6I_ML.setForeground(new Color(51, 51, 0));
		textS6I_ML.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6I_ML.setColumns(10);
		textS6I_ML.setBounds(1269, 386, 41, 19);
		panel.add(textS6I_ML);
		
		textS6I_MC = new JTextField();
		textS6I_MC.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6I_MC.setBackground(new Color(135, 206, 235));
		textS6I_MC.setHorizontalAlignment(SwingConstants.CENTER);
		textS6I_MC.setForeground(new Color(51, 51, 0));
		textS6I_MC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6I_MC.setColumns(10);
		textS6I_MC.setBounds(1269, 411, 41, 19);
		panel.add(textS6I_MC);
		
		textS6i_Onm = new JTextField();
		textS6i_Onm.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6i_Onm.setBackground(new Color(135, 206, 235));
		textS6i_Onm.setHorizontalAlignment(SwingConstants.CENTER);
		textS6i_Onm.setForeground(new Color(51, 51, 0));
		textS6i_Onm.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6i_Onm.setColumns(10);
		textS6i_Onm.setBounds(1269, 434, 41, 19);
		panel.add(textS6i_Onm);
		
		textS6i_MJP = new JTextField();
		textS6i_MJP.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6i_MJP.setBackground(new Color(135, 206, 235));
		textS6i_MJP.setHorizontalAlignment(SwingConstants.CENTER);
		textS6i_MJP.setForeground(new Color(51, 51, 0));
		textS6i_MJP.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6i_MJP.setColumns(10);
		textS6i_MJP.setBounds(1269, 543, 41, 19);
		panel.add(textS6i_MJP);
		
		textS6IA_L_ML = new JTextField();
		textS6IA_L_ML.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6IA_L_ML.setBackground(new Color(135, 206, 235));
		textS6IA_L_ML.setHorizontalAlignment(SwingConstants.CENTER);
		textS6IA_L_ML.setForeground(new Color(51, 51, 0));
		textS6IA_L_ML.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6IA_L_ML.setColumns(10);
		textS6IA_L_ML.setBounds(1269, 515, 41, 19);
		panel.add(textS6IA_L_ML);
		
		JButton button_IA_Total4 = new JButton("");
		button_IA_Total4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
						int b=Integer.parseInt(textS6I_RL.getText());						
						int d=Integer.parseInt(textS6I_ML.getText());					
						int g=Integer.parseInt(textS6I_MC.getText());					
						int i=Integer.parseInt(textS6i_Onm.getText());					
						int k=Integer.parseInt(textS6i_MJP.getText());			
						int m=Integer.parseInt(textS6IA_L_ML.getText());
						int o=Integer.parseInt(textS6IA_L_RL.getText());
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
				int a=Integer.parseInt(textS6E_RL.getText());
				int b=Integer.parseInt(textS6I_RL.getText());
				int c=Integer.parseInt(textS6E_ML.getText());
				int d=Integer.parseInt(textS6I_ML.getText());
				int f=Integer.parseInt(textS6E_MC.getText());
				int g=Integer.parseInt(textS6I_MC.getText());
				int h=Integer.parseInt(textS6E_ONM.getText());
				int i=Integer.parseInt(textS6i_Onm.getText());
				int j=Integer.parseInt(textS6E_MJP.getText());
				int k=Integer.parseInt(textS6i_MJP.getText());
				int l=Integer.parseInt(textS6EA_L_ML.getText());
				int m=Integer.parseInt(textS6IA_L_ML.getText());
				int n=Integer.parseInt(textS6EA_L_RL.getText());
				int o=Integer.parseInt(textS6IA_L_RL.getText());
				buttonTotal4.setText(" "+(a+b+c+d+f+g+h+i+j+k+l+m+n+o)+" ");
			}
		});
		buttonTotal4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buttonTotal4.setBorder(new LineBorder(new Color(135, 206, 235)));
		buttonTotal4.setBackground(new Color(135, 206, 250));
		buttonTotal4.setBounds(1332, 582, 58, 26);
		panel.add(buttonTotal4);
		
		JLabel lblSystemAnalysisAnd = new JLabel("R Language (CA205)");
		lblSystemAnalysisAnd.setForeground(Color.BLACK);
		lblSystemAnalysisAnd.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblSystemAnalysisAnd.setBounds(736, 355, 300, 19);
		panel.add(lblSystemAnalysisAnd);
		
		JLabel lblOperatingSystem = new JLabel("Machine Larning (CA201)");
		lblOperatingSystem.setForeground(Color.BLACK);
		lblOperatingSystem.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblOperatingSystem.setBounds(738, 372, 224, 26);
		panel.add(lblOperatingSystem);
		
		JLabel lblDataStructureUsing = new JLabel("Mobile Cloud(CA204)");
		lblDataStructureUsing.setForeground(Color.BLACK);
		lblDataStructureUsing.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblDataStructureUsing.setBounds(738, 398, 256, 26);
		panel.add(lblDataStructureUsing);
		
		JLabel lblGraphTheory = new JLabel("Online Markting(CA202)");
		lblGraphTheory.setForeground(Color.BLACK);
		lblGraphTheory.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblGraphTheory.setBounds(737, 427, 289, 19);
		panel.add(lblGraphTheory);
		
		JLabel lblAdvancedProfessionalCommunication = new JLabel("Major Project (CA203)");
		lblAdvancedProfessionalCommunication.setForeground(Color.BLACK);
		lblAdvancedProfessionalCommunication.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblAdvancedProfessionalCommunication.setBounds(736, 534, 300, 26);
		panel.add(lblAdvancedProfessionalCommunication);
		
		JLabel lblPractical_1 = new JLabel("Practical");
		lblPractical_1.setForeground(Color.BLACK);
		lblPractical_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPractical_1.setBounds(797, 457, 88, 26);
		panel.add(lblPractical_1);
		
		JLabel lblDataStructureUsing_1 = new JLabel("Machine Larning Lab(CAP103)");
		lblDataStructureUsing_1.setForeground(Color.BLACK);
		lblDataStructureUsing_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblDataStructureUsing_1.setBounds(738, 510, 298, 26);
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
		
		JLabel lblFifithSemester_1 = new JLabel("Fift Semester");
		lblFifithSemester_1.setForeground(Color.BLACK);
		lblFifithSemester_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFifithSemester_1.setBounds(262, 628, 160, 35);
		panel.add(lblFifithSemester_1);
		
		JLabel lblFistSemester_1_1 = new JLabel("Six Semester");
		lblFistSemester_1_1.setForeground(Color.BLACK);
		lblFistSemester_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFistSemester_1_1.setBounds(604, 628, 160, 35);
		panel.add(lblFistSemester_1_1);
		
		JLabel lblFistSemester_1_2 = new JLabel("Gread Total");
		lblFistSemester_1_2.setForeground(Color.BLACK);
		lblFistSemester_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFistSemester_1_2.setBounds(968, 627, 160, 35);
		panel.add(lblFistSemester_1_2);
		
		JLabel lblMarksObt = new JLabel("/ 800");
		lblMarksObt.setForeground(Color.BLACK);
		lblMarksObt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarksObt.setBounds(330, 687, 49, 26);
		panel.add(lblMarksObt);
		
	 lblResult5 = new JLabel("Result");
	 lblResult5.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				result();
				
			}
		});
		lblResult5.setForeground(Color.BLACK);
		lblResult5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblResult5.setBounds(204, 736, 274, 35);
		panel.add(lblResult5);
		
		 lblMarks5 = new JLabel("800");
		lblMarks5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF5E_ifo.getText());
				int b=Integer.parseInt(textF3I_info.getText());
				int c=Integer.parseInt(textF5E_net.getText());
				int d=Integer.parseInt(textF5I_net.getText());
				int g=Integer.parseInt(textF5E_web.getText());
				int h=Integer.parseInt(textF5I_web.getText());
				int f=Integer.parseInt(textF5E_cc.getText());
				int x=Integer.parseInt(textF5I_cc.getText());
				int y=Integer.parseInt(textF5E_mp.getText());
				int z=Integer.parseInt(textF5I_mp.getText());
				int u=Integer.parseInt(textF5E_P_wb.getText());
				int v=Integer.parseInt(textF5i_P_wb.getText());
				int w=Integer.parseInt(textF5E_P_net.getText());
				int o=Integer.parseInt(textF5I_P_net.getText());
				lblMarks5.setText(" "+(a+b+c+d+g+h+f+x+y+z+u+v+w+o)+" ");
				
			}
		});
		lblMarks5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarks5.setForeground(Color.BLACK);
		lblMarks5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarks5.setBounds(264, 687, 58, 26);
		panel.add(lblMarks5);
		
		 lblMarks6 = new JLabel("800");
		lblMarks6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					int a=Integer.parseInt(textS6E_RL.getText());
					int b=Integer.parseInt(textS6I_RL.getText());
					int c=Integer.parseInt(textS6E_ML.getText());
					int d=Integer.parseInt(textS6I_ML.getText());
					int f=Integer.parseInt(textS6E_MC.getText());
					int g=Integer.parseInt(textS6I_MC.getText());
					int h=Integer.parseInt(textS6E_ONM.getText());
					int i=Integer.parseInt(textS6i_Onm.getText());
					int j=Integer.parseInt(textS6E_MJP.getText());
					int k=Integer.parseInt(textS6i_MJP.getText());
					int l=Integer.parseInt(textS6EA_L_ML.getText());
					int m=Integer.parseInt(textS6IA_L_ML.getText());
					int n=Integer.parseInt(textS6EA_L_RL.getText());
					int o=Integer.parseInt(textS6IA_L_RL.getText());
					lblMarks6.setText(" "+(a+b+c+d+f+g+h+i+j+k+l+m+n+o)+" ");
				
				
			}
		});
		lblMarks6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarks6.setForeground(Color.BLACK);
		lblMarks6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarks6.setBounds(613, 687, 58, 26);
		panel.add(lblMarks6);
		
		 lblMarksObt_2 = new JLabel("/ 800");
		lblMarksObt_2.setForeground(Color.BLACK);
		lblMarksObt_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarksObt_2.setBounds(679, 687, 49, 26);
		panel.add(lblMarksObt_2);
		
		 lblT_info = new JLabel("0");
		lblT_info.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF5E_ifo.getText());
				int b=Integer.parseInt(textF3I_info.getText());
				lblT_info.setText(" "+(a+b)+" ");
			}
		});
		lblT_info.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_info.setForeground(Color.BLACK);
		lblT_info.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_info.setBounds(651, 365, 58, 22);
		panel.add(lblT_info);
		
		lblT_net = new JLabel("0");
		lblT_net.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF5E_net.getText());
				int b=Integer.parseInt(textF5I_net.getText());
				lblT_net.setText(" "+(a+b)+" ");
			}
		});
		lblT_net.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_net.setForeground(Color.BLACK);
		lblT_net.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_net.setBounds(651, 394, 58, 22);
		panel.add(lblT_net);
		
		 lblT_web = new JLabel("0");
		lblT_web.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF5E_web.getText());
				int b=Integer.parseInt(textF5I_web.getText());
				lblT_web.setText(" "+(a+b)+" ");
			}
		});
		lblT_web.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_web.setForeground(Color.BLACK);
		lblT_web.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_web.setBounds(651, 419, 58, 22);
		panel.add(lblT_web);
		
		 lblT_cc = new JLabel("0");
		lblT_cc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF5E_cc.getText());
				int b=Integer.parseInt(textF5I_cc.getText());
				lblT_cc.setText(" "+(a+b)+" ");
			}
		});
		lblT_cc.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_cc.setForeground(Color.BLACK);
		lblT_cc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_cc.setBounds(651, 442, 58, 22);
		panel.add(lblT_cc);
		
		 lblT_mp = new JLabel("0");
		lblT_mp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF5E_mp.getText());
				int b=Integer.parseInt(textF5I_mp.getText());
				lblT_mp.setText(" "+(a+b)+" ");
			}
		});
		lblT_mp.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_mp.setForeground(Color.BLACK);
		lblT_mp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_mp.setBounds(651, 541, 58, 22);
		panel.add(lblT_mp);
		
		 lblT_P_net = new JLabel("0");
		lblT_P_net.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF5E_P_net.getText());
				int b=Integer.parseInt(textF5I_P_net.getText());
				lblT_P_net.setText(" "+(a+b)+" ");
			}
		});
		lblT_P_net.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_P_net.setForeground(Color.BLACK);
		lblT_P_net.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_P_net.setBounds(650, 482, 58, 22);
		panel.add(lblT_P_net);
		
		 lblT_L_wb = new JLabel("0");
		lblT_L_wb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textF5E_P_wb.getText());
				int b=Integer.parseInt(textF5i_P_wb.getText());
				lblT_L_wb.setText(" "+(a+b)+" ");
			}
		});
		lblT_L_wb.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_L_wb.setForeground(Color.BLACK);
		lblT_L_wb.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_L_wb.setBounds(651, 510, 58, 22);
		panel.add(lblT_L_wb);
		
		 lblT_RL = new JLabel("0");
		lblT_RL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a=Integer.parseInt(textS6E_RL.getText());
				int b=Integer.parseInt(textS6I_RL.getText());
				lblT_RL.setText(" "+(a+b)+" ");
			}
		});
		
		
		lblT_RL.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_RL.setForeground(Color.BLACK);
		lblT_RL.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_RL.setBounds(1332, 355, 58, 22);
		panel.add(lblT_RL);
		
		 lblT_ML = new JLabel("0");
		lblT_ML.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int c=Integer.parseInt(textS6E_ML.getText());
				int d=Integer.parseInt(textS6I_ML.getText());
				lblT_ML.setText(" "+(c+d)+" ");
			}
		});
		lblT_ML.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_ML.setForeground(Color.BLACK);
		lblT_ML.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_ML.setBounds(1333, 389, 58, 19);
		panel.add(lblT_ML);
		
		 lblT_MC = new JLabel("0");
		lblT_MC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int f=Integer.parseInt(textS6E_MC.getText());
				int g=Integer.parseInt(textS6I_MC.getText());
				lblT_MC.setText(" "+(f+g)+" ");
			}
		});
		lblT_MC.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_MC.setForeground(Color.BLACK);
		lblT_MC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_MC.setBounds(1332, 412, 58, 22);
		panel.add(lblT_MC);
		
	 lblT_Onm = new JLabel("0");
		lblT_Onm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int h=Integer.parseInt(textS6E_ONM.getText());
				int i=Integer.parseInt(textS6i_Onm.getText());
				lblT_Onm.setText(" "+(h+i)+" ");
			}
		});
		lblT_Onm.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_Onm.setForeground(Color.BLACK);
		lblT_Onm.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_Onm.setBounds(1332, 437, 58, 19);
		panel.add(lblT_Onm);
		
		 lblT_MJP = new JLabel("0");
		lblT_MJP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int j=Integer.parseInt(textS6E_MJP.getText());
				int k=Integer.parseInt(textS6i_MJP.getText());
				lblT_MJP.setText(" "+(j+k)+" ");
			}
		});
		lblT_MJP.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_MJP.setForeground(Color.BLACK);
		lblT_MJP.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_MJP.setBounds(1332, 546, 58, 19);
		panel.add(lblT_MJP);
		
		 LblT_L_ML = new JLabel("0");
		LblT_L_ML.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int l=Integer.parseInt(textS6EA_L_ML.getText());
				int m=Integer.parseInt(textS6IA_L_ML.getText());
				LblT_L_ML.setText(" "+(l+m)+" ");
			}
		});
		LblT_L_ML.setHorizontalAlignment(SwingConstants.CENTER);
		LblT_L_ML.setForeground(Color.BLACK);
		LblT_L_ML.setFont(new Font("Times New Roman", Font.BOLD, 20));
		LblT_L_ML.setBounds(1332, 516, 58, 19);
		panel.add(LblT_L_ML);
		
		 
		
		 lblResult6 = new JLabel("Result");
		 lblResult6.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultsem4();
			}
		});
		lblResult6.setForeground(Color.BLACK);
		lblResult6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblResult6.setBounds(564, 736, 256, 35);
		panel.add(lblResult6);
		
		 lblMarksObt_2_1 = new JLabel("/ 1600");
		lblMarksObt_2_1.setForeground(Color.BLACK);
		lblMarksObt_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarksObt_2_1.setBounds(1031, 687, 71, 26);
		panel.add(lblMarksObt_2_1);
		
		JLabel lblMarksf = new JLabel("1600");
		lblMarksf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int a=Integer.parseInt(textS6E_RL.getText());
				int b=Integer.parseInt(textS6I_RL.getText());
				int c=Integer.parseInt(textS6E_ML.getText());
				int d=Integer.parseInt(textS6I_ML.getText());
				int f=Integer.parseInt(textS6E_MC.getText());
				int g=Integer.parseInt(textS6I_MC.getText());
				int h=Integer.parseInt(textS6E_ONM.getText());
				int i=Integer.parseInt(textS6i_Onm.getText());
				int j=Integer.parseInt(textS6E_MJP.getText());
				int k=Integer.parseInt(textS6i_MJP.getText());
				int l=Integer.parseInt(textS6EA_L_ML.getText());
				int m=Integer.parseInt(textS6IA_L_ML.getText());
				int B=Integer.parseInt(textS6EA_L_RL.getText());
				int C=Integer.parseInt(textS6IA_L_RL.getText());
				int n=Integer.parseInt(textF5E_ifo.getText());
				int o=Integer.parseInt(textF3I_info.getText());
				int p=Integer.parseInt(textF5E_net.getText());
				int q=Integer.parseInt(textF5I_net.getText());
				int r=Integer.parseInt(textF5E_web.getText());
				int s=Integer.parseInt(textF5I_web.getText());
				int t=Integer.parseInt(textF5E_cc.getText());
				int u=Integer.parseInt(textF5I_cc.getText());
				int v=Integer.parseInt(textF5E_mp.getText());
				int w=Integer.parseInt(textF5I_mp.getText());
				int x=Integer.parseInt(textF5E_P_wb.getText());
				int y=Integer.parseInt(textF5i_P_wb.getText());
				int z=Integer.parseInt(textF5E_P_net.getText());
				int A=Integer.parseInt(textF5I_P_net.getText());
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
		lblfinalResult.setBounds(914, 736, 214, 37);
		panel.add(lblfinalResult);
		
		JLabel lblDataStructureUsing_1_1 = new JLabel("R Programming Lab(CAP102)");
		lblDataStructureUsing_1_1.setForeground(Color.BLACK);
		lblDataStructureUsing_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblDataStructureUsing_1_1.setBounds(738, 482, 298, 26);
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
		
		textS6EA_L_RL = new JTextField();
		textS6EA_L_RL.setHorizontalAlignment(SwingConstants.CENTER);
		textS6EA_L_RL.setForeground(new Color(51, 51, 0));
		textS6EA_L_RL.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6EA_L_RL.setColumns(10);
		textS6EA_L_RL.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6EA_L_RL.setBackground(new Color(135, 206, 235));
		textS6EA_L_RL.setBounds(1219, 484, 41, 19);
		panel.add(textS6EA_L_RL);
		
		textS6IA_L_RL = new JTextField();
		textS6IA_L_RL.setHorizontalAlignment(SwingConstants.CENTER);
		textS6IA_L_RL.setForeground(new Color(51, 51, 0));
		textS6IA_L_RL.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textS6IA_L_RL.setColumns(10);
		textS6IA_L_RL.setBorder(new LineBorder(new Color(135, 206, 235), 2));
		textS6IA_L_RL.setBackground(new Color(135, 206, 235));
		textS6IA_L_RL.setBounds(1271, 484, 41, 19);
		panel.add(textS6IA_L_RL);
		
		JLabel lblT_L_RL = new JLabel("0");
		lblT_L_RL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int l=Integer.parseInt(textS6EA_L_RL.getText());
				int m=Integer.parseInt(textS6IA_L_RL.getText());
				lblT_L_RL.setText(" "+(l+m)+" ");
			}
		});
		lblT_L_RL.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_L_RL.setForeground(Color.BLACK);
		lblT_L_RL.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblT_L_RL.setBounds(1332, 489, 58, 19);
		panel.add(lblT_L_RL);
		
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
		btnView_1_2.setBounds(10, 24, 100, 40);
		panel_1.add(btnView_1_2);
	}
	public void result() {
		
		 double a,b,c,d,f,g,h,i,j,k,l,m,n,o;
		     a=Integer.parseInt(textF5E_ifo.getText());
			 b=Integer.parseInt(textF3I_info.getText());
			 c=Integer.parseInt(textF5E_net.getText());
			 d=Integer.parseInt(textF5I_net.getText());
			 g=Integer.parseInt(textF5E_web.getText());
			 h=Integer.parseInt(textF5I_web.getText());
			 f=Integer.parseInt(textF5E_cc.getText());
			 i=Integer.parseInt(textF5I_cc.getText());
			 j=Integer.parseInt(textF5E_mp.getText());
			 k=Integer.parseInt(textF5I_mp.getText());
			 l=Integer.parseInt(textF5E_P_wb.getText());
			 m=Integer.parseInt(textF5i_P_wb.getText());
			 n=Integer.parseInt(textF5E_P_net.getText());
			 o=Integer.parseInt(textF5I_P_net.getText());
		
		  total = a+b+c+d+f+g+h+i+j+k+l+m+n+o;
		  
		  avg=total/8;
		  
		if (avg >=45) {
			
			result = "Pass";
			}
		else if (avg>=33) {
			result="PASS WITH BCP";
		}
		else {
			result="Fail";
		}
		lblResult5.setText(String.valueOf(result));
	}
	public void resultsem4() {
		
		 double a,b,c,d,f,g,h,i,j,k,l,m,n,o;
			 a=Integer.parseInt(textS6E_RL.getText());
			 b=Integer.parseInt(textS6I_RL.getText());
			 c=Integer.parseInt(textS6E_ML.getText());
			 d=Integer.parseInt(textS6I_ML.getText());
			 f=Integer.parseInt(textS6E_MC.getText());
			 g=Integer.parseInt(textS6I_MC.getText());
			 h=Integer.parseInt(textS6E_ONM.getText());
			 i=Integer.parseInt(textS6i_Onm.getText());
			 j=Integer.parseInt(textS6E_MJP.getText());
			 k=Integer.parseInt(textS6i_MJP.getText());
			 l=Integer.parseInt(textS6EA_L_ML.getText());
			 m=Integer.parseInt(textS6IA_L_ML.getText());
			 n=Integer.parseInt(textS6EA_L_RL.getText());
			o=Integer.parseInt(textS6IA_L_RL.getText());
		
		  total = a+b+c+d+f+g+h+i+j+k+l+m+n+o;
		  
		  avg=total/8;
		  
		if (avg >=45) {
			
			result = "Pass";
			}
		else if (avg>=33) {
			result="PASS With BCP";
		}
		else {
			result="Fail";
		}
		lblResult6.setText(String.valueOf(result));
	}
	public void finalresultse() {
		
		 double a,b,c,d,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C;
		     a=Integer.parseInt(textS6E_RL.getText());
			 b=Integer.parseInt(textS6I_RL.getText());
			 c=Integer.parseInt(textS6E_ML.getText());
			 d=Integer.parseInt(textS6I_ML.getText());
			 f=Integer.parseInt(textS6E_MC.getText());
			 g=Integer.parseInt(textS6I_MC.getText());
			 h=Integer.parseInt(textS6E_ONM.getText());
			 i=Integer.parseInt(textS6i_Onm.getText());
			 j=Integer.parseInt(textS6E_MJP.getText());
			 k=Integer.parseInt(textS6i_MJP.getText());
			 l=Integer.parseInt(textS6EA_L_ML.getText());
			 m=Integer.parseInt(textS6IA_L_ML.getText());
			 B=Integer.parseInt(textS6EA_L_RL.getText());
			 C=Integer.parseInt(textS6IA_L_RL.getText());
			 n=Integer.parseInt(textF5E_ifo.getText());
			 o=Integer.parseInt(textF3I_info.getText());
			 p=Integer.parseInt(textF5E_net.getText());
		     q=Integer.parseInt(textF5I_net.getText());
			 r=Integer.parseInt(textF5E_web.getText());
			 s=Integer.parseInt(textF5I_web.getText());
			 t=Integer.parseInt(textF5E_cc.getText());
			 u=Integer.parseInt(textF5I_cc.getText());
			 v=Integer.parseInt(textF5E_mp.getText());
			 w=Integer.parseInt(textF5I_mp.getText());
			 x=Integer.parseInt(textF5E_P_wb.getText());
			 y=Integer.parseInt(textF5i_P_wb.getText());
			 z=Integer.parseInt(textF5E_P_net.getText());
			 A=Integer.parseInt(textF5I_P_net.getText());
			 
		
		  total = a+b+c+d+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z+A+B+C;
		  
		  avg=total/16;
		  
		if (avg >=45) {
			
			result = "Pass";
			}
		
		else if (avg>=40){
			result="PASS With BCP";
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
		    		String sql="update TheardyearResult set Roll=?,Name=?,Enrollmentno=?,Fathername=?,FfithSemesterMaks=?,FifthSemesterResult=?,SixSemesterMaks=? ,SixSemesterResult=? ,FinalResult=? where Roll = ?";
		    		PreparedStatement PS=conn.prepareStatement(sql);
		    		PS.setString(1,Rollno.getText());
					 PS.setString(2, Name.getText());
					 PS.setString(3,Enrollmentno.getText());
					 PS.setString(4, Fathername.getText());
					 PS.setString(5,lblMarks5.getText());
					 PS.setString(6, lblResult5.getText());
					 PS.setString(7,lblMarks6.getText());
					 PS.setString(8, lblResult6.getText());
					 PS.setString(9,lblfinalResult.getText());
					 PS.setString(10,Rollno.getText());
						 
					 PS.executeUpdate();
	 		JOptionPane.showMessageDialog(null, "Theard year Marksheet is Updeted Sucsesfuly....");
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
				 String query = "INSERT INTO TheardyearResult values (?,?,?,?,?,?,?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				 PS.setString(1,Rollno.getText());
				 PS.setString(2, Name.getText());
				 PS.setString(3,Enrollmentno.getText());
				 PS.setString(4, Fathername.getText());
				 PS.setString(5,lblMarks5.getText());
				 PS.setString(6, lblResult5.getText());
				 PS.setString(7,lblMarks6.getText());
				 PS.setString(8, lblResult6.getText());
				 PS.setString(9,lblfinalResult.getText());
					 
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Theard year Marksheet Redy to print");
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
