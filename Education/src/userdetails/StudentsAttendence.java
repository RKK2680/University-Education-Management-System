package userdetails;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.nio.file.Files;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.management.loading.PrivateClassLoader;
import javax.management.modelmbean.ModelMBean;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import Home.Admission1;
import Model.StuAttendence;
import Model.stdATENDENS;
import userdetails.Login;

import java.awt.Color;
import java.awt.Container;

import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.BevelBorder;



public class StudentsAttendence extends JFrame{
	private File file;
    String s;
    private JFrame frame;
	
    private JTextField textP_M_S_1;
    private JTextField textP_Sem_S_1;
    private JTextField textP_M_S_2;
    private JTextField textP_Sem_S_2;
    private JTextField textP_M_S_3;
    private JTextField textP_Sem_S_3;
    private JTextField textP_M_S_4;
    private JTextField textP_Sem_S_4;
    private JTextField textP_M_S_5;
    private JTextField textP_Sem_S_5;
    private JTextField textP_M_S_6;
    private JTextField textP_Sem_S_6;
    private JTable table;
	private JComboBox comboBox_CTot_sem_6;
	private JComboBox comboBox_CTin_sem_6;
	private JComboBox comboBox_ST_sem_6;
	private JComboBox comboBox_Sub_sem_6;
	private JComboBox comboBox_CTot_sem_5;
	private JComboBox comboBox_CTin_sem_5;
	private JComboBox comboBox_ST_sem_5;
	private JComboBox comboBox_Sub_sem_5;
	private JComboBox comboBox_CTot_sem_4;
	private JComboBox comboBox_CTin_sem_4;
	private JComboBox comboBox_ST_sem_4;
	private JComboBox comboBox_Sub_sem_4;
	private JComboBox comboBox_CTot_sem_3;
	private JComboBox comboBox_CTin_sem_3;
	private JComboBox comboBox_ST_sem_3;
	private JComboBox comboBox_CTot_sem_2;
	private JComboBox comboBox_CTin_sem_2;
	private JComboBox comboBox_ST_sem_2;
	private JComboBox comboBox_Sub_sem_2;
	private JComboBox comboBox_CTot_sem_1;
	private JComboBox comboBox_CTin_sem_1;
	private JComboBox comboBox_ST_sem_1;
	private JComboBox comboBox_Sub_sem_1;
	
	private JComboBox comboBox_Sub_sem_3;
	private JLabel lblFistSemesterAtendence;
	private JButton btnView_1;
	private JButton btnView_2;
	private JButton btnBack;
	private String path;
	private JDateChooser dateChooser_5;
	private JDateChooser dateChooser_4;
	private JDateChooser dateChooser_3;
	private JDateChooser dateChooser_2;
	private JDateChooser dateChooser_1;
	private JDateChooser dateChooser;
	private JButton btnNewButton_S_2;
	private JButton btnNewButton_S_0;
	private JButton btnNewButton_S_1;
	private JButton btnNewButton_S_3;
	private JButton btnNewButton_S_4;
	private JButton btnNewButton_S_5;
    
    public StudentsAttendence(){
    	super("Set Picture Into A JLabel Using JFileChooser In Java");
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
    	setTitle("Attendence Details");
    setBounds(000, 000, 1650, 1000);
    getContentPane().setBackground(new Color(102, 255, 255));
    
    getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Student Attendence");
    lblNewLabel.setBounds(0, 96, 257, 35);
    getContentPane().add(lblNewLabel);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
    
    JPanel panel_1_1 = new JPanel();
    panel_1_1.setLayout(null);
    panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel_1_1.setBackground(new Color(255, 204, 153));
    panel_1_1.setBounds(0, 130, 1530, 454);
    getContentPane().add(panel_1_1);
    
    JLabel lblNewLabel_1_2 = new JLabel("Subjects");
    lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_2.setBounds(271, 10, 108, 26);
    panel_1_1.add(lblNewLabel_1_2);
    
    JLabel lblNewLabel_1_3 = new JLabel("Sub Techaers");
    lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_3.setBounds(520, 10, 108, 26);
    panel_1_1.add(lblNewLabel_1_3);
    
    JLabel lblNewLabel_1_4 = new JLabel("Class Time");
    lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_4.setBounds(737, 0, 108, 26);
    panel_1_1.add(lblNewLabel_1_4);
    
    JLabel lblNewLabel_1_5 = new JLabel("Prsent Student Name");
    lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_5.setBounds(905, 10, 138, 26);
    panel_1_1.add(lblNewLabel_1_5);
    
    JLabel lblNewLabel_1_8 = new JLabel("P (%)");
    lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_8.setBounds(1342, 10, 84, 26);
    panel_1_1.add(lblNewLabel_1_8);
    
    JSeparator separator_1 = new JSeparator();
    separator_1.setOrientation(SwingConstants.VERTICAL);
    separator_1.setForeground(new Color(0, 0, 139));
    separator_1.setBackground(new Color(0, 0, 128));
    separator_1.setBounds(778, 24, 14, 448);
    panel_1_1.add(separator_1);
    
    JSeparator separator_2 = new JSeparator();
    separator_2.setOrientation(SwingConstants.VERTICAL);
    separator_2.setForeground(new Color(0, 0, 139));
    separator_2.setBackground(new Color(0, 0, 128));
    separator_2.setBounds(437, 0, 14, 454);
    panel_1_1.add(separator_2);
    
    JSeparator separator_2_1 = new JSeparator();
    separator_2_1.setOrientation(SwingConstants.VERTICAL);
    separator_2_1.setForeground(new Color(0, 0, 139));
    separator_2_1.setBackground(new Color(0, 0, 128));
    separator_2_1.setBounds(885, 0, 14, 472);
    panel_1_1.add(separator_2_1);
    
    JSeparator separator_2_3 = new JSeparator();
    separator_2_3.setOrientation(SwingConstants.VERTICAL);
    separator_2_3.setForeground(new Color(0, 0, 139));
    separator_2_3.setBackground(new Color(0, 0, 128));
    separator_2_3.setBounds(1053, 0, 14, 454);
    panel_1_1.add(separator_2_3);
    
    JSeparator separator_2_5 = new JSeparator();
    separator_2_5.setForeground(new Color(0, 0, 139));
    separator_2_5.setBackground(new Color(0, 128, 128));
    separator_2_5.setBounds(2, 46, 1518, 15);
    panel_1_1.add(separator_2_5);
    
    JLabel lblNewLabel_1_4_1 = new JLabel(" IN                       OUT");
    lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_4_1.setBounds(699, 18, 157, 26);
    panel_1_1.add(lblNewLabel_1_4_1);
    
    JSeparator separator_1_1 = new JSeparator();
    separator_1_1.setOrientation(SwingConstants.VERTICAL);
    separator_1_1.setForeground(new Color(0, 0, 139));
    separator_1_1.setBackground(new Color(0, 0, 128));
    separator_1_1.setBounds(152, 0, 14, 454);
    panel_1_1.add(separator_1_1);
    
    JLabel lblNewLabel_1_6_1 = new JLabel("Total Month Class");
    lblNewLabel_1_6_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_6_1.setBounds(1064, 10, 138, 26);
    panel_1_1.add(lblNewLabel_1_6_1);
    
    JSeparator separator_1_2 = new JSeparator();
    separator_1_2.setOrientation(SwingConstants.VERTICAL);
    separator_1_2.setForeground(new Color(0, 0, 139));
    separator_1_2.setBackground(new Color(0, 0, 128));
    separator_1_2.setBounds(1203, 0, 14, 454);
    panel_1_1.add(separator_1_2);
    
    comboBox_Sub_sem_1 = new JComboBox();
    comboBox_Sub_sem_1.setModel(new DefaultComboBoxModel(new String[] {"Fist Semester Subject", "Programing in C", "Food Nutrion and Hygine", "Fundamental of Mathematics", "Profesnol Comunication", "Multimedia Bsed Graphic Design", "Computre Fundamental ", "Digital Electronics", "Libery", "Open Session", "Open Elective Class", "Half Day Off", "Others"}));
    comboBox_Sub_sem_1.setMaximumRowCount(10);
    comboBox_Sub_sem_1.setForeground(Color.BLACK);
    comboBox_Sub_sem_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_Sub_sem_1.setBackground(new Color(204, 153, 204));
    comboBox_Sub_sem_1.setBounds(176, 71, 251, 26);
    panel_1_1.add(comboBox_Sub_sem_1);
    
     comboBox_ST_sem_1 = new JComboBox();
    comboBox_ST_sem_1.setModel(new DefaultComboBoxModel(new String[] {"Dr.S.A.A Rizvi(Programing in c)", "Dr.S.A.A Rizvi(C Lab )", "Dr.Nigar Naqvi(Food Nutration)", "Ms. Hershika Verma(Graphics )", "Ms. Hershika Verma(Graphics Lab)", "DrAqeel Abbas(P.C)", "Dr.Tauqeer Khan(Maths)", "Dr.Shaweta Vikram(C F)", "Dr.Shaweta Vikram(Digital Elec.)", "Dr.Shaweta Vikram(C A Lab)"}));
    comboBox_ST_sem_1.setMaximumRowCount(10);
    comboBox_ST_sem_1.setForeground(Color.BLACK);
    comboBox_ST_sem_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_ST_sem_1.setBackground(new Color(204, 153, 204));
    comboBox_ST_sem_1.setBounds(449, 67, 210, 26);
    panel_1_1.add(comboBox_ST_sem_1);
    
     comboBox_CTin_sem_1 = new JComboBox();
    comboBox_CTin_sem_1.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00", "03:00", "04:00"}));
    comboBox_CTin_sem_1.setMaximumRowCount(10);
    comboBox_CTin_sem_1.setForeground(Color.BLACK);
    comboBox_CTin_sem_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTin_sem_1.setBackground(new Color(204, 153, 204));
    comboBox_CTin_sem_1.setBounds(675, 71, 93, 26);
    panel_1_1.add(comboBox_CTin_sem_1);
    
      comboBox_CTot_sem_1 = new JComboBox();
    comboBox_CTot_sem_1.setModel(new DefaultComboBoxModel(new String[] {"10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00(Lunch Over)", "03:00", "04:00", "05:00"}));
    comboBox_CTot_sem_1.setMaximumRowCount(10);
    comboBox_CTot_sem_1.setForeground(Color.BLACK);
    comboBox_CTot_sem_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTot_sem_1.setBackground(new Color(204, 153, 204));
    comboBox_CTot_sem_1.setBounds(791, 71, 84, 26);
    panel_1_1.add(comboBox_CTot_sem_1);
    
    textP_M_S_1 = new JTextField();
    textP_M_S_1.setForeground(Color.BLACK);
    textP_M_S_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_M_S_1.setColumns(10);
    textP_M_S_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_M_S_1.setBounds(1077, 72, 99, 26);
    panel_1_1.add(textP_M_S_1);
    
    textP_Sem_S_1 = new JTextField();
    textP_Sem_S_1.setForeground(Color.BLACK);
    textP_Sem_S_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_Sem_S_1.setColumns(10);
    textP_Sem_S_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_Sem_S_1.setBounds(1227, 71, 89, 26);
    panel_1_1.add(textP_Sem_S_1);
    
    JSeparator separator_2_5_1 = new JSeparator();
    separator_2_5_1.setForeground(new Color(0, 0, 139));
    separator_2_5_1.setBackground(new Color(0, 128, 128));
    separator_2_5_1.setBounds(2, 115, 1518, 15);
    panel_1_1.add(separator_2_5_1);
    
    JSeparator separator_2_5_1_1 = new JSeparator();
    separator_2_5_1_1.setForeground(new Color(0, 0, 139));
    separator_2_5_1_1.setBackground(new Color(0, 128, 128));
    separator_2_5_1_1.setBounds(2, 192, 1518, 15);
    panel_1_1.add(separator_2_5_1_1);
    
    JSeparator separator_2_5_1_2 = new JSeparator();
    separator_2_5_1_2.setForeground(new Color(0, 0, 139));
    separator_2_5_1_2.setBackground(new Color(0, 128, 128));
    separator_2_5_1_2.setBounds(2, 260, 1518, 15);
    panel_1_1.add(separator_2_5_1_2);
    
    JSeparator separator_2_5_1_3 = new JSeparator();
    separator_2_5_1_3.setForeground(new Color(0, 0, 139));
    separator_2_5_1_3.setBackground(new Color(0, 128, 128));
    separator_2_5_1_3.setBounds(2, 326, 1518, 15);
    panel_1_1.add(separator_2_5_1_3);
    
    JSeparator separator_2_5_1_4 = new JSeparator();
    separator_2_5_1_4.setForeground(new Color(0, 0, 139));
    separator_2_5_1_4.setBackground(new Color(0, 128, 128));
    separator_2_5_1_4.setBounds(2, 388, 1518, 15);
    panel_1_1.add(separator_2_5_1_4);
    
     comboBox_Sub_sem_2 = new JComboBox();
    comboBox_Sub_sem_2.setModel(new DefaultComboBoxModel(new String[] {"Secand Semester Subject", "Data Structure Using  C++", "Data Structure Using  C++ (Lab)", "Opreting System", "Graph Theory", "Advance Profesnol Comunication", "System Desing And Analysis", "Libery", "Open Session", "Open Elective Class", "Half Day Off", "Others"}));
    comboBox_Sub_sem_2.setMaximumRowCount(10);
    comboBox_Sub_sem_2.setForeground(Color.BLACK);
    comboBox_Sub_sem_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_Sub_sem_2.setBackground(new Color(204, 153, 204));
    comboBox_Sub_sem_2.setBounds(176, 140, 251, 26);
    panel_1_1.add(comboBox_Sub_sem_2);
    
     comboBox_ST_sem_2 = new JComboBox();
    comboBox_ST_sem_2.setModel(new DefaultComboBoxModel(new String[] {"Dr.S.A.A Rizvi", "Dr.S.A.A Rizvi", "Dr.Shaweta Vikram", "Mr. Moh.Arif", "Mr.Naffes Akhter Faroki", "Dr.Moh.Islam", "Mr.Saqaib Ali", "Ms. Hershika Verma(Graphics )", "Ms. Hershika Verma(Graphics Lab)", "DrAqeel Abbas(P.C)", "Dr.Tauqeer Khan(Maths)"}));
    comboBox_ST_sem_2.setMaximumRowCount(10);
    comboBox_ST_sem_2.setForeground(Color.BLACK);
    comboBox_ST_sem_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_ST_sem_2.setBackground(new Color(204, 153, 204));
    comboBox_ST_sem_2.setBounds(449, 140, 210, 26);
    panel_1_1.add(comboBox_ST_sem_2);
    
      comboBox_CTin_sem_2 = new JComboBox();
    comboBox_CTin_sem_2.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00", "03:00", "04:00"}));
    comboBox_CTin_sem_2.setMaximumRowCount(10);
    comboBox_CTin_sem_2.setForeground(Color.BLACK);
    comboBox_CTin_sem_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTin_sem_2.setBackground(new Color(204, 153, 204));
    comboBox_CTin_sem_2.setBounds(675, 140, 93, 26);
    panel_1_1.add(comboBox_CTin_sem_2);
    
     comboBox_CTot_sem_2 = new JComboBox();
    comboBox_CTot_sem_2.setModel(new DefaultComboBoxModel(new String[] {"10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00(Lunch Over)", "03:00", "04:00", "05:00"}));
    comboBox_CTot_sem_2.setMaximumRowCount(10);
    comboBox_CTot_sem_2.setForeground(Color.BLACK);
    comboBox_CTot_sem_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTot_sem_2.setBackground(new Color(204, 153, 204));
    comboBox_CTot_sem_2.setBounds(791, 143, 84, 26);
    panel_1_1.add(comboBox_CTot_sem_2);
    
    textP_M_S_2 = new JTextField();
    textP_M_S_2.setForeground(Color.BLACK);
    textP_M_S_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_M_S_2.setColumns(10);
    textP_M_S_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_M_S_2.setBounds(1077, 141, 98, 26);
    panel_1_1.add(textP_M_S_2);
    
    textP_Sem_S_2 = new JTextField();
    textP_Sem_S_2.setForeground(Color.BLACK);
    textP_Sem_S_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_Sem_S_2.setColumns(10);
    textP_Sem_S_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_Sem_S_2.setBounds(1227, 140, 89, 26);
    panel_1_1.add(textP_Sem_S_2);
    
    
     comboBox_ST_sem_3 = new JComboBox();
    comboBox_ST_sem_3.setModel(new DefaultComboBoxModel(new String[] {"Dr.S.A.A Rizvi", "Dr.Shaweta Vikram", "Mr.Moh.Arif", "Dr.Moh.Islam", "Mr.Saqaib Ali", "Ms.Saliha Jafri(Besiness Org)", "Ms.Laffat Fatima(Multimedia Project)", "Ms. Hershika Verma(Graphics )", "Ms. Hershika Verma(Graphics Lab)", "Dr.Meeta Ghosh(French Language)", "DrAqeel Abbas(P.C)", "Dr.Tauqeer Khan(Maths)"}));
    comboBox_ST_sem_3.setMaximumRowCount(10);
    comboBox_ST_sem_3.setForeground(Color.BLACK);
    comboBox_ST_sem_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_ST_sem_3.setBackground(new Color(204, 153, 204));
    comboBox_ST_sem_3.setBounds(449, 217, 210, 26);
    panel_1_1.add(comboBox_ST_sem_3);
    
     comboBox_CTin_sem_3 = new JComboBox();
    comboBox_CTin_sem_3.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00", "03:00", "04:00"}));
    comboBox_CTin_sem_3.setMaximumRowCount(10);
    comboBox_CTin_sem_3.setForeground(Color.BLACK);
    comboBox_CTin_sem_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTin_sem_3.setBackground(new Color(204, 153, 204));
    comboBox_CTin_sem_3.setBounds(675, 217, 93, 26);
    panel_1_1.add(comboBox_CTin_sem_3);
    
    textP_M_S_3 = new JTextField();
    textP_M_S_3.setForeground(Color.BLACK);
    textP_M_S_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_M_S_3.setColumns(10);
    textP_M_S_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_M_S_3.setBounds(1078, 217, 98, 26);
    panel_1_1.add(textP_M_S_3);
    
    textP_Sem_S_3 = new JTextField();
    textP_Sem_S_3.setForeground(Color.BLACK);
    textP_Sem_S_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_Sem_S_3.setColumns(10);
    textP_Sem_S_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_Sem_S_3.setBounds(1227, 217, 89, 26);
    panel_1_1.add(textP_Sem_S_3);
    
     comboBox_Sub_sem_4 = new JComboBox();
    comboBox_Sub_sem_4.setModel(new DefaultComboBoxModel(new String[] {"Fourth Semester Subject", "Advance Java Programing ", "Advance Java Programing (Lab)", "Introduction to Python Programing", "Python Programing( Lab)", "Wireless Networking", "Computer Networks", "Software Engeniaring", "Libray", "Open Session", "Open Elective Class", "Half Day Off"}));
    comboBox_Sub_sem_4.setMaximumRowCount(10);
    comboBox_Sub_sem_4.setForeground(Color.BLACK);
    comboBox_Sub_sem_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_Sub_sem_4.setBackground(new Color(204, 153, 204));
    comboBox_Sub_sem_4.setBounds(176, 285, 251, 26);
    panel_1_1.add(comboBox_Sub_sem_4);
    
     comboBox_ST_sem_4 = new JComboBox();
    comboBox_ST_sem_4.setModel(new DefaultComboBoxModel(new String[] {"Dr.S.A.A Rizvi", "Dr.Shaweta Vikram", "Mr.Saqaib Ali", "Mr.Moh.Arif", "Mr.Nafees Faruki", "Dr.Moh.Islam", "Dr.Tauqeer Khan(Maths)"}));
    comboBox_ST_sem_4.setMaximumRowCount(10);
    comboBox_ST_sem_4.setForeground(Color.BLACK);
    comboBox_ST_sem_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_ST_sem_4.setBackground(new Color(204, 153, 204));
    comboBox_ST_sem_4.setBounds(449, 285, 210, 26);
    panel_1_1.add(comboBox_ST_sem_4);
    
     comboBox_CTin_sem_4 = new JComboBox();
    comboBox_CTin_sem_4.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00", "03:00", "04:00"}));
    comboBox_CTin_sem_4.setMaximumRowCount(10);
    comboBox_CTin_sem_4.setForeground(Color.BLACK);
    comboBox_CTin_sem_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTin_sem_4.setBackground(new Color(204, 153, 204));
    comboBox_CTin_sem_4.setBounds(675, 285, 93, 26);
    panel_1_1.add(comboBox_CTin_sem_4);
    
     comboBox_CTot_sem_4 = new JComboBox();
    comboBox_CTot_sem_4.setModel(new DefaultComboBoxModel(new String[] {"10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00(Lunch Over)", "03:00", "04:00", "05:00"}));
    comboBox_CTot_sem_4.setMaximumRowCount(10);
    comboBox_CTot_sem_4.setForeground(Color.BLACK);
    comboBox_CTot_sem_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTot_sem_4.setBackground(new Color(204, 153, 204));
    comboBox_CTot_sem_4.setBounds(790, 282, 84, 26);
    panel_1_1.add(comboBox_CTot_sem_4);
    
    textP_M_S_4 = new JTextField();
    textP_M_S_4.setForeground(Color.BLACK);
    textP_M_S_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_M_S_4.setColumns(10);
    textP_M_S_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_M_S_4.setBounds(1078, 285, 98, 26);
    panel_1_1.add(textP_M_S_4);
    
    textP_Sem_S_4 = new JTextField();
    textP_Sem_S_4.setForeground(Color.BLACK);
    textP_Sem_S_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_Sem_S_4.setColumns(10);
    textP_Sem_S_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_Sem_S_4.setBounds(1227, 285, 89, 26);
    panel_1_1.add(textP_Sem_S_4);
    
     comboBox_Sub_sem_5 = new JComboBox();
    comboBox_Sub_sem_5.setModel(new DefaultComboBoxModel(new String[] {"Fifth Semester Subject", "Cloud Computing", ".Net Fremwork", ".Net Fremwork(Lab)", "Web Technology", "Web Technology(Lab)", "Information Cyber Security & Low", "Indistrial Food Service Management", "Sofft Skil Class", "Indistrial Training", "Mini Project", "Open Session", "Open Elective Class", "Half Day Off"}));
    comboBox_Sub_sem_5.setMaximumRowCount(10);
    comboBox_Sub_sem_5.setForeground(Color.BLACK);
    comboBox_Sub_sem_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_Sub_sem_5.setBackground(new Color(204, 153, 204));
    comboBox_Sub_sem_5.setBounds(179, 351, 248, 26);
    panel_1_1.add(comboBox_Sub_sem_5);
    
     comboBox_ST_sem_5 = new JComboBox();
    comboBox_ST_sem_5.setModel(new DefaultComboBoxModel(new String[] {"Dr.S.A.A Rizvi", "Dr.Shaweta Vikram", "Mr.Moh.Arif", "Dr.Islam", "Dr.Ashfaq ", "Dr.Kaunain", "Ms.Minhaj Khan(Food Nutration)", "Dr.Meeta Ghoseh(French Language)"}));
    comboBox_ST_sem_5.setMaximumRowCount(10);
    comboBox_ST_sem_5.setForeground(Color.BLACK);
    comboBox_ST_sem_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_ST_sem_5.setBackground(new Color(204, 153, 204));
    comboBox_ST_sem_5.setBounds(449, 352, 207, 26);
    panel_1_1.add(comboBox_ST_sem_5);
    
     comboBox_CTin_sem_5 = new JComboBox();
    comboBox_CTin_sem_5.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00", "03:00", "04:00"}));
    comboBox_CTin_sem_5.setMaximumRowCount(10);
    comboBox_CTin_sem_5.setForeground(Color.BLACK);
    comboBox_CTin_sem_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTin_sem_5.setBackground(new Color(204, 153, 204));
    comboBox_CTin_sem_5.setBounds(675, 352, 93, 26);
    panel_1_1.add(comboBox_CTin_sem_5);
    
     comboBox_CTot_sem_5 = new JComboBox();
    comboBox_CTot_sem_5.setModel(new DefaultComboBoxModel(new String[] {"10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00(Lunch Over)", "03:00", "04:00", "05:00"}));
    comboBox_CTot_sem_5.setMaximumRowCount(10);
    comboBox_CTot_sem_5.setForeground(Color.BLACK);
    comboBox_CTot_sem_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTot_sem_5.setBackground(new Color(204, 153, 204));
    comboBox_CTot_sem_5.setBounds(791, 352, 84, 26);
    panel_1_1.add(comboBox_CTot_sem_5);
    
    textP_M_S_5 = new JTextField();
    textP_M_S_5.setForeground(Color.BLACK);
    textP_M_S_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_M_S_5.setColumns(10);
    textP_M_S_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_M_S_5.setBounds(1077, 352, 94, 26);
    panel_1_1.add(textP_M_S_5);
    
    textP_Sem_S_5 = new JTextField();
    textP_Sem_S_5.setForeground(Color.BLACK);
    textP_Sem_S_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_Sem_S_5.setColumns(10);
    textP_Sem_S_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_Sem_S_5.setBounds(1230, 351, 86, 26);
    panel_1_1.add(textP_Sem_S_5);
    
     comboBox_Sub_sem_6 = new JComboBox();
    comboBox_Sub_sem_6.setModel(new DefaultComboBoxModel(new String[] {"Six Semester Subject", "Programing ", "Major Project", "Open Session", "Open Elective Class", "Half Day Off"}));
    comboBox_Sub_sem_6.setMaximumRowCount(10);
    comboBox_Sub_sem_6.setForeground(Color.BLACK);
    comboBox_Sub_sem_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_Sub_sem_6.setBackground(new Color(204, 153, 204));
    comboBox_Sub_sem_6.setBounds(176, 413, 251, 26);
    panel_1_1.add(comboBox_Sub_sem_6);
    
     comboBox_ST_sem_6 = new JComboBox();
    comboBox_ST_sem_6.setModel(new DefaultComboBoxModel(new String[] {"Dr.S.A.A Rizvi", "Dr.Shaweta Vikram(C F)", "Mr.Moh.Arif", "Dr.Islam", "Mr.Saqaib Ali", "Mr.Nafees Faruki", "Dr.Meeta Ghoseh(French Language)", "Ms. Hershika Verma"}));
    comboBox_ST_sem_6.setMaximumRowCount(10);
    comboBox_ST_sem_6.setForeground(Color.BLACK);
    comboBox_ST_sem_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_ST_sem_6.setBackground(new Color(204, 153, 204));
    comboBox_ST_sem_6.setBounds(449, 413, 210, 26);
    panel_1_1.add(comboBox_ST_sem_6);
    
    comboBox_CTin_sem_6 = new JComboBox();
    comboBox_CTin_sem_6.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00", "03:00", "04:00"}));
    comboBox_CTin_sem_6.setMaximumRowCount(10);
    comboBox_CTin_sem_6.setForeground(Color.BLACK);
    comboBox_CTin_sem_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTin_sem_6.setBackground(new Color(204, 153, 204));
    comboBox_CTin_sem_6.setBounds(675, 413, 93, 26);
    panel_1_1.add(comboBox_CTin_sem_6);
    
     comboBox_CTot_sem_6 = new JComboBox();
    comboBox_CTot_sem_6.setModel(new DefaultComboBoxModel(new String[] {"10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00(Lunch Over)", "03:00", "04:00", "05:00"}));
    comboBox_CTot_sem_6.setMaximumRowCount(10);
    comboBox_CTot_sem_6.setForeground(Color.BLACK);
    comboBox_CTot_sem_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTot_sem_6.setBackground(new Color(204, 153, 204));
    comboBox_CTot_sem_6.setBounds(791, 416, 84, 26);
    panel_1_1.add(comboBox_CTot_sem_6);
    
    textP_M_S_6 = new JTextField();
    textP_M_S_6.setForeground(Color.BLACK);
    textP_M_S_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_M_S_6.setColumns(10);
    textP_M_S_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_M_S_6.setBounds(1078, 413, 98, 26);
    panel_1_1.add(textP_M_S_6);
    
    textP_Sem_S_6 = new JTextField();
    textP_Sem_S_6.setForeground(Color.BLACK);
    textP_Sem_S_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textP_Sem_S_6.setColumns(10);
    textP_Sem_S_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textP_Sem_S_6.setBounds(1227, 413, 89, 26);
    panel_1_1.add(textP_Sem_S_6);
    
    JSeparator separator_4 = new JSeparator();
    separator_4.setOrientation(SwingConstants.VERTICAL);
    separator_4.setForeground(new Color(0, 0, 139));
    separator_4.setBackground(new Color(0, 0, 128));
    separator_4.setBounds(669, 0, 20, 454);
    panel_1_1.add(separator_4);
    
    JSeparator separator_2_3_1 = new JSeparator();
    separator_2_3_1.setOrientation(SwingConstants.VERTICAL);
    separator_2_3_1.setForeground(new Color(0, 0, 139));
    separator_2_3_1.setBackground(new Color(0, 0, 128));
    separator_2_3_1.setBounds(1436, 0, 14, 454);
    panel_1_1.add(separator_2_3_1);
    
    JLabel lblNewLabel_1_6_1_1 = new JLabel("Submit");
    lblNewLabel_1_6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_6_1_1.setBounds(1451, 10, 66, 26);
    panel_1_1.add(lblNewLabel_1_6_1_1);
    
    JButton btnNewButton = new JButton("Save");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		FistSame();
    		
    	}
    });
    btnNewButton.setForeground(Color.BLACK);
    btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton.setBackground(new Color(51, 204, 102));
    btnNewButton.setBounds(1451, 67, 66, 35);
    panel_1_1.add(btnNewButton);
    
    JButton btnNewButton_1 = new JButton("Save");
    btnNewButton_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		SecandSemester();
    	}
    });
    btnNewButton_1.setForeground(Color.BLACK);
    btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_1.setBackground(new Color(51, 204, 102));
    btnNewButton_1.setBounds(1451, 139, 66, 35);
    panel_1_1.add(btnNewButton_1);
    
    JButton btnNewButton_2 = new JButton("Save");
    btnNewButton_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		TherdSemester();
    	}
    });
    btnNewButton_2.setForeground(Color.BLACK);
    btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_2.setBackground(new Color(51, 204, 102));
    btnNewButton_2.setBounds(1454, 215, 66, 35);
    panel_1_1.add(btnNewButton_2);
    
    JButton btnNewButton_3 = new JButton("Save");
    btnNewButton_3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		FourthSemester();
    	}
    });
    btnNewButton_3.setForeground(Color.BLACK);
    btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_3.setBackground(new Color(51, 204, 102));
    btnNewButton_3.setBounds(1454, 281, 66, 35);
    panel_1_1.add(btnNewButton_3);
    
    JButton btnNewButton_4 = new JButton("Save");
    btnNewButton_4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		FifthSemester();
    	}
    });
    btnNewButton_4.setForeground(Color.BLACK);
    btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_4.setBackground(new Color(51, 204, 102));
    btnNewButton_4.setBounds(1454, 342, 66, 35);
    panel_1_1.add(btnNewButton_4);
    
    JButton btnNewButton_5 = new JButton("Save");
    btnNewButton_5.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		SixSemester();
    	}
    });
    btnNewButton_5.setForeground(Color.BLACK);
    btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_5.setBackground(new Color(51, 204, 102));
    btnNewButton_5.setBounds(1451, 412, 66, 35);
    panel_1_1.add(btnNewButton_5);
    
    comboBox_CTot_sem_3 = new JComboBox();
    comboBox_CTot_sem_3.setModel(new DefaultComboBoxModel(new String[] {"10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00(Lunch Over)", "03:00", "04:00", "05:00"}));
    comboBox_CTot_sem_3.setMaximumRowCount(10);
    comboBox_CTot_sem_3.setForeground(Color.BLACK);
    comboBox_CTot_sem_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_CTot_sem_3.setBackground(new Color(204, 153, 204));
    comboBox_CTot_sem_3.setBounds(791, 217, 84, 26);
    panel_1_1.add(comboBox_CTot_sem_3);
    
    comboBox_Sub_sem_3 = new JComboBox();
    comboBox_Sub_sem_3.setModel(new DefaultComboBoxModel(new String[] {"Theard Semester Subject", "Java Programing ", "Java Programing (Lab)", "Database Management System(DBMS)", "Database Management System(DBMS Lab)", "Prensples OfManagement & Business Organization", "Computer Networks", "Software Engeniaring", "Multimedia & Animation Based Project", "Animation", "Libery", "Open Session", "Open Elective Class", "Half Day Off", "Others"}));
    comboBox_Sub_sem_3.setMaximumRowCount(10);
    comboBox_Sub_sem_3.setForeground(Color.BLACK);
    comboBox_Sub_sem_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBox_Sub_sem_3.setBackground(new Color(204, 153, 204));
    comboBox_Sub_sem_3.setBounds(176, 217, 251, 26);
    panel_1_1.add( comboBox_Sub_sem_3);
    
    JButton btnNewButton_6 = new JButton("Student Name*");
    btnNewButton_6.setBackground(new Color(102, 255, 204));
    btnNewButton_6.setForeground(new Color(255, 0, 0));
    btnNewButton_6.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		StuAttendence.main(null);
    	}
    });
    btnNewButton_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(153, 102, 204), new Color(255, 102, 51), new Color(0, 255, 102)));
    btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_6.setBounds(905, 71, 138, 26);
    panel_1_1.add(btnNewButton_6);
    
    JSeparator separator_2_3_1_1 = new JSeparator();
    separator_2_3_1_1.setOrientation(SwingConstants.VERTICAL);
    separator_2_3_1_1.setForeground(new Color(0, 0, 139));
    separator_2_3_1_1.setBackground(new Color(0, 0, 128));
    separator_2_3_1_1.setBounds(1332, 0, 14, 454);
    panel_1_1.add(separator_2_3_1_1);
    
     btnNewButton_S_0 = new JButton("");
    btnNewButton_S_0.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		double no1=Double.parseDouble(textP_M_S_1.getText());
			double no2=Double.parseDouble(textP_Sem_S_1.getText());
			btnNewButton_S_0.setText(" "+(no2/no1)*100+"%");
    	}
    });
    btnNewButton_S_0.setBorder(new LineBorder(new Color(0, 0, 153)));
    btnNewButton_S_0.setForeground(Color.BLACK);
    btnNewButton_S_0.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_S_0.setBackground(new Color(255, 204, 255));
    btnNewButton_S_0.setBounds(1342, 71, 84, 35);
    panel_1_1.add(btnNewButton_S_0);
    
    JLabel lblNewLabel_1_6_1_2 = new JLabel("Total Present Std");
    lblNewLabel_1_6_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_6_1_2.setBounds(1212, 10, 120, 26);
    panel_1_1.add(lblNewLabel_1_6_1_2);
    
    JLabel lblNewLabel_1_2_1 = new JLabel("Date");
    lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_2_1.setBounds(32, 10, 108, 26);
    panel_1_1.add(lblNewLabel_1_2_1);
    
     dateChooser = new JDateChooser();
    dateChooser.setForeground(new Color(0, 0, 0));
    dateChooser.setFont(new Font("Times New Roman", Font.BOLD, 15));
    dateChooser.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 204, 0), new Color(102, 0, 204), new Color(51, 255, 102)));
    dateChooser.setBackground(new Color(0, 0, 153));
    dateChooser.setBounds(12, 71, 130, 26);
    panel_1_1.add(dateChooser);
    
     dateChooser_1 = new JDateChooser();
    dateChooser_1.setForeground(Color.BLACK);
    dateChooser_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    dateChooser_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 204, 0), new Color(102, 0, 204), new Color(51, 255, 102)));
    dateChooser_1.setBackground(new Color(0, 0, 153));
    dateChooser_1.setBounds(12, 140, 130, 26);
    panel_1_1.add(dateChooser_1);
    
    dateChooser_2 = new JDateChooser();
    dateChooser_2.setForeground(Color.BLACK);
    dateChooser_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    dateChooser_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 204, 0), new Color(102, 0, 204), new Color(51, 255, 102)));
    dateChooser_2.setBackground(new Color(0, 0, 153));
    dateChooser_2.setBounds(12, 217, 130, 26);
    panel_1_1.add(dateChooser_2);
    
     dateChooser_3 = new JDateChooser();
    dateChooser_3.setForeground(Color.BLACK);
    dateChooser_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
    dateChooser_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 204, 0), new Color(102, 0, 204), new Color(51, 255, 102)));
    dateChooser_3.setBackground(new Color(0, 0, 153));
    dateChooser_3.setBounds(12, 285, 130, 26);
    panel_1_1.add(dateChooser_3);
    
     dateChooser_4 = new JDateChooser();
    dateChooser_4.setForeground(Color.BLACK);
    dateChooser_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
    dateChooser_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 204, 0), new Color(102, 0, 204), new Color(51, 255, 102)));
    dateChooser_4.setBackground(new Color(0, 0, 153));
    dateChooser_4.setBounds(12, 351, 130, 26);
    panel_1_1.add(dateChooser_4);
    
     dateChooser_5 = new JDateChooser();
    dateChooser_5.setForeground(Color.BLACK);
    dateChooser_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
    dateChooser_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 204, 0), new Color(102, 0, 204), new Color(51, 255, 102)));
    dateChooser_5.setBackground(new Color(0, 0, 153));
    dateChooser_5.setBounds(12, 413, 130, 26);
    panel_1_1.add(dateChooser_5);
    
    JButton btnNewButton_6_1 = new JButton("Student Name*");
    btnNewButton_6_1.setBackground(new Color(102, 255, 204));
    btnNewButton_6_1.setForeground(new Color(255, 0, 0));
    btnNewButton_6_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		StuAttendence.main(null);
    	}
    });
    btnNewButton_6_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_6_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(153, 102, 204), new Color(255, 102, 51), new Color(0, 255, 102)));
    btnNewButton_6_1.setBounds(905, 140, 138, 26);
    panel_1_1.add(btnNewButton_6_1);
    
    JButton btnNewButton_6_2 = new JButton("Student Name*");
    btnNewButton_6_2.setBackground(new Color(102, 255, 204));
    btnNewButton_6_2.setForeground(new Color(255, 0, 0));
    btnNewButton_6_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		StuAttendence.main(null);
    	}
    });
    btnNewButton_6_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_6_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(153, 102, 204), new Color(255, 102, 51), new Color(0, 255, 102)));
    btnNewButton_6_2.setBounds(905, 217, 138, 26);
    panel_1_1.add(btnNewButton_6_2);
    
    JButton btnNewButton_6_3 = new JButton("Student Name*");
    btnNewButton_6_3.setBackground(new Color(102, 255, 204));
    btnNewButton_6_3.setForeground(new Color(255, 0, 0));
    btnNewButton_6_3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		StuAttendence.main(null);
    	}
    });
    btnNewButton_6_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_6_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(153, 102, 204), new Color(255, 102, 51), new Color(0, 255, 102)));
    btnNewButton_6_3.setBounds(905, 285, 138, 26);
    panel_1_1.add(btnNewButton_6_3);
    
    JButton btnNewButton_6_4 = new JButton("Student Name*");
    btnNewButton_6_4.setBackground(new Color(102, 255, 204));
    btnNewButton_6_4.setForeground(new Color(255, 0, 0));
    btnNewButton_6_4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		StuAttendence.main(null);
    	}
    });
    btnNewButton_6_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_6_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(153, 102, 204), new Color(255, 102, 51), new Color(0, 255, 102)));
    btnNewButton_6_4.setBounds(905, 351, 138, 26);
    panel_1_1.add(btnNewButton_6_4);
    
    JButton btnNewButton_6_5 = new JButton("Student Name*");
    btnNewButton_6_5.setBackground(new Color(102, 255, 204));
    btnNewButton_6_5.setForeground(new Color(255, 0, 0));
    btnNewButton_6_5.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		StuAttendence.main(null);
    	}
    });
    btnNewButton_6_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_6_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(153, 102, 204), new Color(255, 102, 51), new Color(0, 255, 102)));
    btnNewButton_6_5.setBounds(905, 413, 138, 26);
    panel_1_1.add(btnNewButton_6_5);
    
    btnNewButton_S_1 = new JButton("");
    btnNewButton_S_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		double no1=Double.parseDouble(textP_M_S_2.getText());
			double no2=Double.parseDouble(textP_Sem_S_2.getText());
			btnNewButton_S_1.setText(" "+(no2/no1)*100+"%");
    		
    	}
    });
    btnNewButton_S_1.setForeground(Color.BLACK);
    btnNewButton_S_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_S_1.setBorder(new LineBorder(new Color(0, 0, 153)));
    btnNewButton_S_1.setBackground(new Color(255, 204, 255));
    btnNewButton_S_1.setBounds(1342, 140, 84, 35);
    panel_1_1.add(btnNewButton_S_1);
    
    btnNewButton_S_2 = new JButton("");
    btnNewButton_S_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		double no1=Double.parseDouble(textP_M_S_3.getText());
			double no2=Double.parseDouble(textP_Sem_S_3.getText());
			btnNewButton_S_2.setText(" "+(no2/no1)*100+"%");
    		
    	}
    });
    btnNewButton_S_2.setForeground(Color.BLACK);
    btnNewButton_S_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_S_2.setBorder(new LineBorder(new Color(0, 0, 153)));
    btnNewButton_S_2.setBackground(new Color(255, 204, 255));
    btnNewButton_S_2.setBounds(1342, 215, 84, 35);
    panel_1_1.add(btnNewButton_S_2);
    
     btnNewButton_S_3 = new JButton("");
    btnNewButton_S_3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		double no1=Double.parseDouble(textP_M_S_4.getText());
			double no2=Double.parseDouble(textP_Sem_S_4.getText());
			btnNewButton_S_3.setText(" "+(no2/no1)*100+"%");
    		
    	}
    });
    btnNewButton_S_3.setForeground(Color.BLACK);
    btnNewButton_S_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_S_3.setBorder(new LineBorder(new Color(0, 0, 153)));
    btnNewButton_S_3.setBackground(new Color(255, 204, 255));
    btnNewButton_S_3.setBounds(1342, 285, 84, 35);
    panel_1_1.add(btnNewButton_S_3);
    
   btnNewButton_S_4 = new JButton("");
    btnNewButton_S_4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		double no1=Double.parseDouble(textP_M_S_5.getText());
			double no2=Double.parseDouble(textP_Sem_S_5.getText());
			btnNewButton_S_4.setText(" "+(no2/no1)*100+"%");
    		
    	}
    });
    btnNewButton_S_4.setForeground(Color.BLACK);
    btnNewButton_S_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_S_4.setBorder(new LineBorder(new Color(0, 0, 153)));
    btnNewButton_S_4.setBackground(new Color(255, 204, 255));
    btnNewButton_S_4.setBounds(1342, 343, 84, 35);
    panel_1_1.add(btnNewButton_S_4);
    
     btnNewButton_S_5 = new JButton("");
    btnNewButton_S_5.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		double no1=Double.parseDouble(textP_M_S_6.getText());
			double no2=Double.parseDouble(textP_Sem_S_6.getText());
			btnNewButton_S_5.setText(" "+(no2/no1)*100+"%");
    		
    	}
    });
    btnNewButton_S_5.setForeground(Color.BLACK);
    btnNewButton_S_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_S_5.setBorder(new LineBorder(new Color(0, 0, 153)));
    btnNewButton_S_5.setBackground(new Color(255, 204, 255));
    btnNewButton_S_5.setBounds(1342, 412, 84, 35);
    panel_1_1.add(btnNewButton_S_5);
    
    JScrollPane scrollPane_1 = new JScrollPane();
    scrollPane_1.setBounds(22, 634, 1539, 201);
    getContentPane().add(scrollPane_1);
    
    table = new JTable();
    scrollPane_1.setViewportView(table);
    
    lblFistSemesterAtendence = new JLabel("Fist Semester Atendence Deails");
    lblFistSemesterAtendence.setHorizontalAlignment(SwingConstants.CENTER);
    lblFistSemesterAtendence.setFont(new Font("Times New Roman", Font.BOLD, 30));
    lblFistSemesterAtendence.setBounds(0, 589, 446, 35);
    getContentPane().add(lblFistSemesterAtendence);
    
    JButton btnView = new JButton("View");
    btnView.setBackground(new Color(0, 191, 255));
    btnView.setBounds(440, 584, 100, 40);
    getContentPane().add(btnView);
    btnView.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		try {
    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
    			Statement St=connection.createStatement() ;
    			String qString="select * from StudentAttendence";
    			ResultSet rs=St.executeQuery(qString);
    			ResultSetMetaData rsmd=rs.getMetaData();
    			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
    			int cols=rsmd.getColumnCount();
    			String[] coolName=new String[cols];
    			for(int i=0;i<cols;i++)
    			coolName[i]=rsmd.getColumnName(i+1);
    			tbl.setColumnIdentifiers(coolName);
    			String Date, Subject_Name, Subject_Techars_Name, Class_Time_In, Class_Time_Out, Total_month_Class, Total_Prsent_Student, Persentage;
    			while(rs.next()) {
    				
    				Date=rs.getString(1);
    				Subject_Name=rs.getString(2);
    				Subject_Techars_Name=rs.getString(3);
    				Class_Time_In=rs.getString(4);
    				Class_Time_Out=rs.getString(5);
    				Total_month_Class=rs.getString(6);
    				Total_Prsent_Student=rs.getString(7);
    				Persentage=rs.getString(8);
    				
    				String[]rowStrings= {Date, Subject_Name, Subject_Techars_Name, Class_Time_In, Class_Time_Out, Total_month_Class, Total_Prsent_Student, Persentage};
    				tbl.addRow(rowStrings);
    			}
    			St.close();
    			connection.close();
    		} catch (Exception e1) {
    			// TODO: handle exception
    			e1.printStackTrace();
    		}

    		
    	}
    });
    btnView.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    btnView_1 = new JButton("Second And Theard Semester Details");
    btnView_1.setBackground(new Color(152, 251, 152));
    btnView_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		StudentDTL sDtl=new StudentDTL();
    		sDtl.main(null);
    		sDtl.setVisible(true);
    		
    		
    	}
    });
    btnView_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnView_1.setBounds(860, 584, 275, 40);
    getContentPane().add(btnView_1);
    
    btnView_2 = new JButton("Fourth Fifth And Six Semester Details");
    btnView_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		AttendenceDTL2 aDtl2=new AttendenceDTL2();
    		aDtl2.main(null);
    	}
    });
    btnView_2.setBackground(new Color(152, 251, 152));
    btnView_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnView_2.setBounds(1189, 584, 308, 40);
    getContentPane().add(btnView_2);
    
    JPanel panel_3 = new JPanel();
    panel_3.setLayout(null);
    panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel_3.setBackground(new Color(135, 206, 235));
    panel_3.setBounds(0, 0, 1530, 99);
    getContentPane().add(panel_3);
    
    JLabel EraLogo = new JLabel();
    path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
    EraLogo.setBounds(23, 10, 130, 79);
    ImageIcon imageIcon1=new ImageIcon(path);
	Image imgImage1=imageIcon1.getImage();
	Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon image1=new ImageIcon(newiImage1);
	EraLogo.setIcon(image1);
    panel_3.add(EraLogo);
    
    JLabel lblNewLabel_2 = new JLabel("Era University Lucknow");
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2.setForeground(new Color(0, 0, 153));
    lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 60));
    lblNewLabel_2.setBounds(405, 0, 782, 62);
    panel_3.add(lblNewLabel_2);
    
    JLabel lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
    lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
    lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
    lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblSarfarazganjHardoiRoad.setBounds(391, 54, 783, 35);
    panel_3.add(lblSarfarazganjHardoiRoad);
    
    btnBack = new JButton("Back");
    btnBack.setBounds(1437, 10, 83, 35);
    panel_3.add(btnBack);
    btnBack.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		project.main(null);
    		dispose();
    	}
    });
    btnBack.setForeground(Color.BLACK);
    btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnBack.setBackground(new Color(255, 99, 71));
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(1554,962);
    setVisible(true);
    }
    public void FistSame(){
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			 String query = "INSERT INTO StudentAttendence values (?,?,?,?,?,?,?,?)";
			 PreparedStatement PS=connection.prepareStatement(query) ;
			 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-y");
			 String Date=sdf.format(dateChooser.getDate());
			 PS.setString(1, Date);
			 String sub=comboBox_Sub_sem_1.getSelectedItem().toString();
			 PS.setString(2, sub);
			 String st=comboBox_ST_sem_1.getSelectedItem().toString();
			 PS.setString(3, st);
			 String classin=comboBox_CTin_sem_1.getSelectedItem().toString();
			 PS.setString(4,classin);
			 String classout=comboBox_CTot_sem_1.getSelectedItem().toString();
			 PS.setString(5, classout);
			 PS.setString(6, textP_M_S_1.getText());
			 PS.setString(7, textP_Sem_S_1.getText());
			 PS.setString(8, btnNewButton_S_0.getText());
			 int i=PS.executeUpdate();
			 JOptionPane.showMessageDialog(null, "Fist Semester Attendence Detail is Succsesfull.....");
			 PS.close();
			 connection.close();
			 
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	
    	
    } 
    public void SecandSemester(){
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			 String query = "INSERT INTO secondsem values (?,?,?,?,?,?,?,?)";
			 PreparedStatement PS=connection.prepareStatement(query) ;
			 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-y");
			 String Date=sdf.format(dateChooser_1.getDate());
			 PS.setString(1, Date);
			 String sub=comboBox_Sub_sem_2.getSelectedItem().toString();
			 PS.setString(2, sub);
			 String st=comboBox_ST_sem_2.getSelectedItem().toString();
			 PS.setString(3, st);
			 String classin=comboBox_CTin_sem_2.getSelectedItem().toString();
			 PS.setString(4,classin);
			 String classout=comboBox_CTot_sem_2.getSelectedItem().toString();
			 PS.setString(5, classout);
			 PS.setString(6, textP_M_S_2.getText());
			 PS.setString(7, textP_Sem_S_2.getText());
			 PS.setString(8, btnNewButton_S_1.getText());
			 int i=PS.executeUpdate();
			 JOptionPane.showMessageDialog(null, "Second Semester Attendence Detail is Succsesfull.....");
			 PS.close();
			 connection.close();
			 
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	
    	
    } 
    public void TherdSemester(){
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			 String query = "INSERT INTO Theardsem values (?,?,?,?,?,?,?,?)";
			 PreparedStatement PS=connection.prepareStatement(query) ;
			 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-y");
			 String Date=sdf.format(dateChooser_2.getDate());
			 PS.setString(1, Date);
			 String sub=comboBox_Sub_sem_3.getSelectedItem().toString();
			 PS.setString(2, sub);
			 String st=comboBox_ST_sem_3.getSelectedItem().toString();
			 PS.setString(3, st);
			 String classin=comboBox_CTin_sem_3.getSelectedItem().toString();
			 PS.setString(4,classin);
			 String classout=comboBox_CTot_sem_3.getSelectedItem().toString();
			 PS.setString(5, classout);
			 PS.setString(6, textP_M_S_3.getText());
			 PS.setString(7, textP_Sem_S_3.getText());
			 PS.setString(8, btnNewButton_S_2.getText());
			 int i=PS.executeUpdate();
			 JOptionPane.showMessageDialog(null, "Theard Semester Attendence Detail is Succsesfull.....");
			 PS.close();
			 connection.close();
			 
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	
    	
    } 
    public void FourthSemester(){
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			 String query = "INSERT INTO fourthsem values (?,?,?,?,?,?,?,?)";
			 PreparedStatement PS=connection.prepareStatement(query) ;
			 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-y");
			 String Date=sdf.format(dateChooser_3.getDate());
			 PS.setString(1, Date);
			 String sub=comboBox_Sub_sem_4.getSelectedItem().toString();
			 PS.setString(2, sub);
			 String st=comboBox_ST_sem_4.getSelectedItem().toString();
			 PS.setString(3, st);
			 String classin=comboBox_CTin_sem_4.getSelectedItem().toString();
			 PS.setString(4,classin);
			 String classout=comboBox_CTot_sem_4.getSelectedItem().toString();
			 PS.setString(5, classout);
			 PS.setString(6, textP_M_S_4.getText());
			 PS.setString(7, textP_Sem_S_4.getText());
			 PS.setString(8, btnNewButton_S_3.getText());
			 int i=PS.executeUpdate();
			 JOptionPane.showMessageDialog(null, "Fourth Semester Attendence Detail is Succsesfull.....");
			 PS.close();
			 connection.close();
			 
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	
    	
    } 
    public void FifthSemester(){
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			 String query = "INSERT INTO fiftsem values (?,?,?,?,?,?,?,?)";
			 PreparedStatement PS=connection.prepareStatement(query) ;
			 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-y");
			 String Date=sdf.format(dateChooser_4.getDate());
			 PS.setString(1, Date);
			 String sub=comboBox_Sub_sem_5.getSelectedItem().toString();
			 PS.setString(2, sub);
			 String st=comboBox_ST_sem_5.getSelectedItem().toString();
			 PS.setString(3, st);
			 String classin=comboBox_CTin_sem_5.getSelectedItem().toString();
			 PS.setString(4,classin);
			 String classout=comboBox_CTot_sem_5.getSelectedItem().toString();
			 PS.setString(5, classout);
			 PS.setString(6, textP_M_S_5.getText());
			 PS.setString(7, textP_Sem_S_5.getText());
			 PS.setString(8, btnNewButton_S_4.getText());
			 int i=PS.executeUpdate();
			 JOptionPane.showMessageDialog(null, "Fifth Semester Attendence Detail is Succsesfull.....");
			 PS.close();
			 connection.close();
			 
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	
    	
    } 
    public void SixSemester(){
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			 String query = "INSERT INTO sixsem values (?,?,?,?,?,?,?,?)";
			 PreparedStatement PS=connection.prepareStatement(query) ;
			 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-y");
			 String Date=sdf.format(dateChooser_5.getDate());
			 PS.setString(1, Date);
			 String sub=comboBox_Sub_sem_6.getSelectedItem().toString();
			 PS.setString(2, sub);
			 String st=comboBox_ST_sem_6.getSelectedItem().toString();
			 PS.setString(3, st);
			 String classin=comboBox_CTin_sem_6.getSelectedItem().toString();
			 PS.setString(4,classin);
			 String classout=comboBox_CTot_sem_6.getSelectedItem().toString();
			 PS.setString(5, classout);
			 PS.setString(6, textP_M_S_6.getText());
			 PS.setString(7, textP_Sem_S_6.getText());
			 PS.setString(8, btnNewButton_S_5.getText());
			 int i=PS.executeUpdate();
			 JOptionPane.showMessageDialog(null, "Six Semester Attendence Detail is Succsesfull.....");
			 PS.close();
			 connection.close();
			 
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	
    	
    } 

    
    public static void main(String[] args){
        new StudentsAttendence();
    
    
    }
   }