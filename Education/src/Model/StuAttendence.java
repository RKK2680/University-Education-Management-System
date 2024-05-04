package Model;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

public class StuAttendence extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textaddstd1;
	private JTextField textroll1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textroll2;
	private JTextField textaddstd2;
	private JTextField textroll3;
	private JTextField textaddstd3;
	private JTextField textroll4;
	private JTextField textaddstd4;
	private JTextField textroll5;
	private JTextField textaddstd5;
	private JTextField textroll6;
	private JTextField textaddstd6;
	private String path;
	private JTable table;
	private JComboBox comboBoxRoll_1;
	private JComboBox comboBoxRoll_2;
	private JComboBox comboBoxRoll_3;
	private JComboBox comboBoxRoll_4;
	private JComboBox comboBoxRoll_5;
	private JComboBox comboBoxRoll_6;
	private JComboBox comboBoxName_6;
	private JComboBox comboBoxName_1;
	private JComboBox comboBoxName_2;
	private JComboBox comboBoxName_3;
	private JComboBox comboBoxName_4;
	private JComboBox comboBoxName_5;
	private JRadioButton rdbtnNewRadioButtonA_1;
	private JRadioButton rdbtnNewRadioButtonA_2;
	private JRadioButton rdbtnNewRadioButtonA_3;
	private JRadioButton rdbtnNewRadioButtonA_4;
	private JRadioButton rdbtnNewRadioButtonA_5;
	private JRadioButton rdbtnNewRadioButtonA_6;
	private JRadioButton rdbtnNewRadioButtonP_6;
	private JRadioButton rdbtnNewRadioButtonP_5;
	private JRadioButton rdbtnNewRadioButtonP_4;
	private JRadioButton rdbtnNewRadioButtonP_3;
	private JRadioButton rdbtnNewRadioButtonP_2;
	private JRadioButton rdbtnNewRadioButtonP_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			StuAttendence dialog = new StuAttendence();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public StuAttendence() {
		setBounds(100, 100, 1271, 790);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(204, 255, 255));
		contentPanel.setBorder(new LineBorder(new Color(0, 0, 102), 4));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 102), 2));
		panel.setBounds(0, 135, 1252, 389);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		 rdbtnNewRadioButtonP_1 = new JRadioButton("Prsent");
		rdbtnNewRadioButtonP_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		rdbtnNewRadioButtonP_1.setBounds(528, 58, 85, 32);
		panel.add(rdbtnNewRadioButtonP_1);
		buttonGroup.add(rdbtnNewRadioButtonP_1);
		rdbtnNewRadioButtonP_1.setBackground(new Color(102, 153, 102));
		rdbtnNewRadioButtonP_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		 rdbtnNewRadioButtonP_2 = new JRadioButton("Prsent");
		rdbtnNewRadioButtonP_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		buttonGroup.add(rdbtnNewRadioButtonP_2);
		rdbtnNewRadioButtonP_2.setBounds(528, 115, 85, 32);
		panel.add(rdbtnNewRadioButtonP_2);
		rdbtnNewRadioButtonP_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonP_2.setBackground(new Color(102, 153, 102));
		
		 rdbtnNewRadioButtonP_3 = new JRadioButton("Prsent");
		rdbtnNewRadioButtonP_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		buttonGroup.add(rdbtnNewRadioButtonP_3);
		rdbtnNewRadioButtonP_3.setBounds(528, 167, 85, 32);
		panel.add(rdbtnNewRadioButtonP_3);
		rdbtnNewRadioButtonP_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonP_3.setBackground(new Color(102, 153, 102));
		
		 rdbtnNewRadioButtonP_4 = new JRadioButton("Prsent");
		rdbtnNewRadioButtonP_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		buttonGroup.add(rdbtnNewRadioButtonP_4);
		rdbtnNewRadioButtonP_4.setBounds(528, 220, 85, 32);
		panel.add(rdbtnNewRadioButtonP_4);
		rdbtnNewRadioButtonP_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonP_4.setBackground(new Color(102, 153, 102));
		
		 rdbtnNewRadioButtonP_5 = new JRadioButton("Prsent");
		rdbtnNewRadioButtonP_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		buttonGroup.add(rdbtnNewRadioButtonP_5);
		rdbtnNewRadioButtonP_5.setBounds(528, 273, 85, 32);
		panel.add(rdbtnNewRadioButtonP_5);
		rdbtnNewRadioButtonP_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonP_5.setBackground(new Color(102, 153, 102));
		
		 rdbtnNewRadioButtonP_6 = new JRadioButton("Prsent");
		rdbtnNewRadioButtonP_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		buttonGroup.add(rdbtnNewRadioButtonP_6);
		rdbtnNewRadioButtonP_6.setBounds(528, 318, 85, 32);
		panel.add(rdbtnNewRadioButtonP_6);
		rdbtnNewRadioButtonP_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonP_6.setBackground(new Color(102, 153, 102));
		
		 rdbtnNewRadioButtonA_6 = new JRadioButton("Absent");
		rdbtnNewRadioButtonA_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		buttonGroup.add(rdbtnNewRadioButtonA_6);
		rdbtnNewRadioButtonA_6.setBounds(617, 318, 91, 32);
		panel.add(rdbtnNewRadioButtonA_6);
		rdbtnNewRadioButtonA_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonA_6.setBackground(new Color(255, 153, 102));
		
		 rdbtnNewRadioButtonA_5 = new JRadioButton("Absent");
		rdbtnNewRadioButtonA_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		buttonGroup.add(rdbtnNewRadioButtonA_5);
		rdbtnNewRadioButtonA_5.setBounds(617, 273, 91, 32);
		panel.add(rdbtnNewRadioButtonA_5);
		rdbtnNewRadioButtonA_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonA_5.setBackground(new Color(255, 153, 102));
		
	    rdbtnNewRadioButtonA_4 = new JRadioButton("Absent");
		rdbtnNewRadioButtonA_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		buttonGroup.add(rdbtnNewRadioButtonA_4);
		rdbtnNewRadioButtonA_4.setBounds(617, 220, 91, 32);
		panel.add(rdbtnNewRadioButtonA_4);
		rdbtnNewRadioButtonA_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonA_4.setBackground(new Color(255, 153, 102));
		
		 rdbtnNewRadioButtonA_3 = new JRadioButton("Absent");
		rdbtnNewRadioButtonA_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		buttonGroup.add(rdbtnNewRadioButtonA_3);
		rdbtnNewRadioButtonA_3.setBounds(617, 167, 91, 32);
		panel.add(rdbtnNewRadioButtonA_3);
		rdbtnNewRadioButtonA_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonA_3.setBackground(new Color(255, 153, 102));
		
		 rdbtnNewRadioButtonA_2 = new JRadioButton("Absent");
		rdbtnNewRadioButtonA_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		buttonGroup.add(rdbtnNewRadioButtonA_2);
		rdbtnNewRadioButtonA_2.setBounds(615, 115, 91, 32);
		panel.add(rdbtnNewRadioButtonA_2);
		rdbtnNewRadioButtonA_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonA_2.setBackground(new Color(255, 153, 102));
		
		 rdbtnNewRadioButtonA_1 = new JRadioButton("Absent");
		rdbtnNewRadioButtonA_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 204), new Color(255, 204, 0), new Color(255, 51, 204), new Color(51, 51, 102)));
		rdbtnNewRadioButtonA_1.setBounds(617, 58, 91, 32);
		panel.add(rdbtnNewRadioButtonA_1);
		buttonGroup.add(rdbtnNewRadioButtonA_1);
		rdbtnNewRadioButtonA_1.setBackground(new Color(255, 153, 102));
		rdbtnNewRadioButtonA_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		 comboBoxRoll_1 = new JComboBox();
		 comboBoxRoll_1.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		comboBoxRoll_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
		comboBoxRoll_1.setMaximumRowCount(60);
		comboBoxRoll_1.setBounds(83, 58, 146, 32);
		panel.add(comboBoxRoll_1);
		comboBoxRoll_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxRoll_1.setBackground(new Color(204, 153, 204));
		
		 comboBoxRoll_2 = new JComboBox();
		 comboBoxRoll_2.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		comboBoxRoll_2.setBounds(83, 108, 146, 32);
		panel.add(comboBoxRoll_2);
		comboBoxRoll_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxRoll_2.setBackground(new Color(204, 153, 204));
		
		 comboBoxRoll_3 = new JComboBox();
		 comboBoxRoll_3.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		comboBoxRoll_3.setBounds(83, 159, 146, 32);
		panel.add(comboBoxRoll_3);
		comboBoxRoll_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxRoll_3.setBackground(new Color(204, 153, 204));
		
		 comboBoxRoll_4 = new JComboBox();
		 comboBoxRoll_4.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		comboBoxRoll_4.setBounds(83, 211, 146, 32);
		panel.add(comboBoxRoll_4);
		comboBoxRoll_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxRoll_4.setBackground(new Color(204, 153, 204));
		
		 comboBoxRoll_5 = new JComboBox();
		 comboBoxRoll_5.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		comboBoxRoll_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		comboBoxRoll_5.setMaximumRowCount(30);
		comboBoxRoll_5.setBounds(83, 266, 146, 32);
		panel.add(comboBoxRoll_5);
		comboBoxRoll_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxRoll_5.setBackground(new Color(204, 153, 204));
		
		 comboBoxRoll_6 = new JComboBox();
		 comboBoxRoll_6.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		comboBoxRoll_6.setBounds(83, 318, 146, 32);
		panel.add(comboBoxRoll_6);
		comboBoxRoll_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxRoll_6.setBackground(new Color(204, 153, 204));
		
		 comboBoxName_6 = new JComboBox();
		 comboBoxName_6.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		 comboBoxName_6.setModel(new DefaultComboBoxModel(new String[] {"6th Semester"}));
		comboBoxName_6.setBounds(271, 318, 236, 32);
		panel.add(comboBoxName_6);
		comboBoxName_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxName_6.setBackground(new Color(204, 153, 204));
		
		 comboBoxName_5 = new JComboBox();
		 comboBoxName_5.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		comboBoxName_5.setModel(new DefaultComboBoxModel(new String[] {"5th Semester", "Sankalp Shukla", "Ramkumar Kashyap", "Mujtaba Husain", "Syed Hassan Abbas", "Shreya Mourya", "Sakshi Mourya", "Sanskriti Shing", "Alina Rizvi", "Mantrsha Rizvi", "Wafa Fatima", " Hassan Ahmad", " Adnan Kazim", "Viraj Vikram Shing", "Anshu Madyesiya", "Raza Kidwai", "Wamiq", "Priyanshu Tiwari", "Shoyeb"}));
		comboBoxName_5.setBounds(271, 266, 236, 32);
		panel.add(comboBoxName_5);
		comboBoxName_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxName_5.setBackground(new Color(204, 153, 204));
		
		 comboBoxName_4 = new JComboBox();
		 comboBoxName_4.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		 comboBoxName_4.setModel(new DefaultComboBoxModel(new String[] {"4th Semester"}));
		comboBoxName_4.setBounds(271, 213, 236, 32);
		panel.add(comboBoxName_4);
		comboBoxName_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxName_4.setBackground(new Color(204, 153, 204));
		
		 comboBoxName_3 = new JComboBox();
		 comboBoxName_3.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		 comboBoxName_3.setModel(new DefaultComboBoxModel(new String[] {"3rd Semester"}));
		comboBoxName_3.setBounds(271, 160, 236, 32);
		panel.add(comboBoxName_3);
		comboBoxName_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxName_3.setBackground(new Color(204, 153, 204));
		
		 comboBoxName_2 = new JComboBox();
		 comboBoxName_2.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		 comboBoxName_2.setModel(new DefaultComboBoxModel(new String[] {"2nd Semester"}));
		comboBoxName_2.setBounds(271, 108, 236, 32);
		panel.add(comboBoxName_2);
		comboBoxName_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxName_2.setBackground(new Color(204, 153, 204));
		
		 comboBoxName_1 = new JComboBox();
		 comboBoxName_1.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		 comboBoxName_1.setModel(new DefaultComboBoxModel(new String[] {"1st Semester"}));
		comboBoxName_1.setBounds(271, 58, 236, 32);
		panel.add(comboBoxName_1);
		comboBoxName_1.setBackground(new Color(204, 153, 204));
		comboBoxName_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		textaddstd1 = new JTextField();
		textaddstd1.setBounds(875, 58, 168, 24);
		panel.add(textaddstd1);
		textaddstd1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textaddstd1.setForeground(new Color(0, 0, 153));
		textaddstd1.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Attendenceinfo();
			}
		});
		btnSave.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnSave.setHorizontalAlignment(SwingConstants.LEFT);
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSave.setBackground(new Color(51, 153, 102));
		btnSave.setBounds(1172, 77, 80, 24);
		panel.add(btnSave);
		
		JButton btnSave_1 = new JButton("Save");
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Attendenceinfo2();
				
			}
		});
		btnSave_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnSave_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnSave_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSave_1.setBackground(new Color(51, 153, 102));
		btnSave_1.setBounds(1172, 134, 80, 24);
		panel.add(btnSave_1);
		
		JButton btnSave_2 = new JButton("Save");
		btnSave_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Attendenceinfo3();
			}
		});
		btnSave_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnSave_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnSave_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSave_2.setBackground(new Color(51, 153, 102));
		btnSave_2.setBounds(1172, 186, 80, 24);
		panel.add(btnSave_2);
		
		JButton btnSave_3 = new JButton("Save");
		btnSave_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Attendenceinfo4();
			}
		});
		btnSave_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnSave_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnSave_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSave_3.setBackground(new Color(51, 153, 102));
		btnSave_3.setBounds(1172, 239, 80, 24);
		panel.add(btnSave_3);
		
		JButton btnSave_4 = new JButton("Save");
		btnSave_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Attendenceinfo5();
			}
		});
		btnSave_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnSave_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnSave_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSave_4.setBackground(new Color(51, 153, 102));
		btnSave_4.setBounds(1172, 292, 80, 24);
		panel.add(btnSave_4);
		
		JButton btnSave_5 = new JButton("Save");
		btnSave_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Attendenceinfo6();
			}
		});
		btnSave_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnSave_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnSave_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSave_5.setBackground(new Color(51, 153, 102));
		btnSave_5.setBounds(1172, 344, 80, 24);
		panel.add(btnSave_5);
		
		JButton btnView_1 = new JButton("View");
		btnView_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AttendenceShow();
			}
		});
		btnView_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnView_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnView_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1.setBackground(new Color(51, 153, 102));
		btnView_1.setBounds(1061, 77, 80, 24);
		panel.add(btnView_1);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AttendenceShow2();
			}
		});
		btnView.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnView.setHorizontalAlignment(SwingConstants.LEFT);
		btnView.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView.setBackground(new Color(51, 153, 102));
		btnView.setBounds(1061, 134, 80, 24);
		panel.add(btnView);
		
		JButton btnView_2 = new JButton("View");
		btnView_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AttendenceShow3();
			}
		});
		btnView_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnView_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnView_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_2.setBackground(new Color(51, 153, 102));
		btnView_2.setBounds(1061, 186, 80, 24);
		panel.add(btnView_2);
		
		JButton btnView_3 = new JButton("View");
		btnView_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AttendenceShow4();
			}
		});
		btnView_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnView_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnView_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_3.setBackground(new Color(51, 153, 102));
		btnView_3.setBounds(1061, 239, 80, 24);
		panel.add(btnView_3);
		
		JButton btnView_4 = new JButton("View");
		btnView_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AttendenceShow5();
			}
		});
		btnView_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnView_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnView_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_4.setBackground(new Color(51, 153, 102));
		btnView_4.setBounds(1061, 292, 80, 24);
		panel.add(btnView_4);
		
		JButton btnView_5 = new JButton("View");
		btnView_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AttendenceShow6();
			}
		});
		btnView_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnView_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnView_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_5.setBackground(new Color(51, 153, 102));
		btnView_5.setBounds(1061, 344, 80, 24);
		panel.add(btnView_5);
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 58, 45, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(9, 108, 45, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(9, 159, 45, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(9, 211, 45, 32);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("5");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4.setBounds(9, 266, 45, 32);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("6");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(9, 317, 45, 32);
		panel.add(lblNewLabel_5);
		
		JLabel lblSn = new JLabel("S.N");
		lblSn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSn.setBounds(10, 6, 45, 32);
		panel.add(lblSn);
		
		JLabel lblRollNo = new JLabel("Roll No");
		lblRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblRollNo.setBounds(114, 6, 115, 32);
		panel.add(lblRollNo);
		
		JLabel lblName = new JLabel("Student Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(271, 6, 236, 32);
		panel.add(lblName);
		
		JLabel lblPrsentAbsent = new JLabel("Prsent & Absent");
		lblPrsentAbsent.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrsentAbsent.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPrsentAbsent.setBounds(526, 6, 182, 32);
		panel.add(lblPrsentAbsent);
		
		JLabel lblAddRollNo = new JLabel("Add Roll No");
		lblAddRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddRollNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAddRollNo.setBounds(738, 6, 115, 32);
		panel.add(lblAddRollNo);
		
		JLabel lblNewLabel_12_1 = new JLabel("New Student");
		lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_12_1.setBounds(909, 6, 156, 32);
		panel.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_12_2 = new JLabel("View & Submit");
		lblNewLabel_12_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_12_2.setBounds(1082, 6, 160, 32);
		panel.add(lblNewLabel_12_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 153));
		separator.setForeground(new Color(0, 0, 102));
		separator.setBounds(0, 36, 1242, 12);
		panel.add(separator);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setForeground(new Color(0, 0, 102));
		separator_1_1.setBackground(new Color(0, 0, 153));
		separator_1_1.setBounds(63, 0, 10, 389);
		panel.add(separator_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_1_2.setForeground(new Color(0, 0, 102));
		separator_1_2.setBackground(new Color(0, 0, 153));
		separator_1_2.setBounds(251, 0, 10, 389);
		panel.add(separator_1_2);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setOrientation(SwingConstants.VERTICAL);
		separator_1_3.setForeground(new Color(0, 0, 102));
		separator_1_3.setBackground(new Color(0, 0, 153));
		separator_1_3.setBounds(517, 0, 10, 389);
		panel.add(separator_1_3);
		
		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setOrientation(SwingConstants.VERTICAL);
		separator_1_4.setForeground(new Color(0, 0, 102));
		separator_1_4.setBackground(new Color(0, 0, 153));
		separator_1_4.setBounds(718, 0, 10, 389);
		panel.add(separator_1_4);
		
		JSeparator separator_1_5 = new JSeparator();
		separator_1_5.setOrientation(SwingConstants.VERTICAL);
		separator_1_5.setForeground(new Color(0, 0, 102));
		separator_1_5.setBackground(new Color(0, 0, 153));
		separator_1_5.setBounds(863, 0, 10, 389);
		panel.add(separator_1_5);
		
		JSeparator separator_1_6 = new JSeparator();
		separator_1_6.setOrientation(SwingConstants.VERTICAL);
		separator_1_6.setForeground(new Color(0, 0, 102));
		separator_1_6.setBackground(new Color(0, 0, 153));
		separator_1_6.setBounds(1053, 0, 10, 389);
		panel.add(separator_1_6);
		
		textroll1 = new JTextField();
		textroll1.setBounds(738, 58, 115, 24);
		panel.add(textroll1);
		textroll1.setForeground(new Color(0, 0, 153));
		textroll1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textroll1.setColumns(10);
		
		JButton btnAddRollNo = new JButton("Add Roll No");
		btnAddRollNo.setBounds(738, 81, 115, 24);
		panel.add(btnAddRollNo);
		btnAddRollNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textroll1.getText();
				comboBoxRoll_1.addItem(string);
			}
		});
		btnAddRollNo.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnAddRollNo.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddRollNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAddRollNo.setBackground(new Color(51, 153, 102));
		
		textroll2 = new JTextField();
		textroll2.setBounds(738, 115, 115, 24);
		panel.add(textroll2);
		textroll2.setForeground(new Color(0, 0, 153));
		textroll2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textroll2.setColumns(10);
		
		JButton btnAddRollNo_1 = new JButton("Add Roll No");
		btnAddRollNo_1.setBounds(738, 138, 115, 24);
		panel.add(btnAddRollNo_1);
		btnAddRollNo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textroll2.getText();
				comboBoxRoll_2.addItem(string);
			}
		});
		btnAddRollNo_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnAddRollNo_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAddRollNo_1.setBackground(new Color(51, 153, 102));
		
		textroll3 = new JTextField();
		textroll3.setBounds(738, 167, 115, 24);
		panel.add(textroll3);
		textroll3.setForeground(new Color(0, 0, 153));
		textroll3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textroll3.setColumns(10);
		
		JButton btnAddRollNo_2 = new JButton("Add Roll No");
		btnAddRollNo_2.setBounds(738, 190, 115, 24);
		panel.add(btnAddRollNo_2);
		btnAddRollNo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textroll3.getText();
				comboBoxRoll_3.addItem(string);
			}
		});
		btnAddRollNo_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnAddRollNo_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAddRollNo_2.setBackground(new Color(51, 153, 102));
		
		textroll4 = new JTextField();
		textroll4.setBounds(738, 220, 115, 24);
		panel.add(textroll4);
		textroll4.setForeground(new Color(0, 0, 153));
		textroll4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textroll4.setColumns(10);
		
		JButton btnAddRollNo_3 = new JButton("Add Roll No");
		btnAddRollNo_3.setBounds(738, 243, 115, 24);
		panel.add(btnAddRollNo_3);
		btnAddRollNo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textroll4.getText();
				comboBoxRoll_4.addItem(string);
			}
		});
		btnAddRollNo_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnAddRollNo_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAddRollNo_3.setBackground(new Color(51, 153, 102));
		
		textroll5 = new JTextField();
		textroll5.setBounds(738, 273, 115, 24);
		panel.add(textroll5);
		textroll5.setForeground(new Color(0, 0, 153));
		textroll5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textroll5.setColumns(10);
		
		JButton btnAddRollNo_4 = new JButton("Add Roll No");
		btnAddRollNo_4.setBounds(738, 296, 115, 24);
		panel.add(btnAddRollNo_4);
		btnAddRollNo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textroll5.getText();
				comboBoxRoll_5.addItem(string);
			}
		});
		btnAddRollNo_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnAddRollNo_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAddRollNo_4.setBackground(new Color(51, 153, 102));
		
		textroll6 = new JTextField();
		textroll6.setBounds(738, 325, 115, 24);
		panel.add(textroll6);
		textroll6.setForeground(new Color(0, 0, 153));
		textroll6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textroll6.setColumns(10);
		
		JButton btnAddRollNo_5 = new JButton("Add Roll No");
		btnAddRollNo_5.setBounds(738, 348, 115, 24);
		panel.add(btnAddRollNo_5);
		btnAddRollNo_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textroll6.getText();
				comboBoxRoll_6.addItem(string);
			}
		});
		btnAddRollNo_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnAddRollNo_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAddRollNo_5.setBackground(new Color(51, 153, 102));
		
		textaddstd4 = new JTextField();
		textaddstd4.setBounds(872, 220, 171, 24);
		panel.add(textaddstd4);
		textaddstd4.setForeground(new Color(0, 0, 153));
		textaddstd4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textaddstd4.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Add New Student");
		btnNewButton_3.setBounds(882, 243, 161, 24);
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textaddstd4.getText();
				comboBoxName_4.addItem(string);
			}
		});
		btnNewButton_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_3.setBackground(new Color(51, 153, 102));
		
		textaddstd5 = new JTextField();
		textaddstd5.setBounds(872, 273, 171, 24);
		panel.add(textaddstd5);
		textaddstd5.setForeground(new Color(0, 0, 153));
		textaddstd5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textaddstd5.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Add New Student");
		btnNewButton_4.setBounds(882, 296, 161, 24);
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textaddstd5.getText();
				comboBoxName_5.addItem(string);
			}
		});
		btnNewButton_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_4.setBackground(new Color(51, 153, 102));
		
		textaddstd6 = new JTextField();
		textaddstd6.setBounds(872, 325, 171, 24);
		panel.add(textaddstd6);
		textaddstd6.setForeground(new Color(0, 0, 153));
		textaddstd6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textaddstd6.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Add New Student");
		btnNewButton_5.setBounds(882, 348, 161, 24);
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textaddstd6.getText();
				comboBoxName_6.addItem(string);
			}
		});
		btnNewButton_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_5.setBackground(new Color(51, 153, 102));
		
		JButton btnNewButton_2 = new JButton("Add New Student");
		btnNewButton_2.setBounds(882, 186, 161, 24);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textaddstd3.getText();
				comboBoxName_3.addItem(string);
			}
		});
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(51, 153, 102));
		
		textaddstd3 = new JTextField();
		textaddstd3.setBounds(872, 163, 171, 24);
		panel.add(textaddstd3);
		textaddstd3.setForeground(new Color(0, 0, 153));
		textaddstd3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textaddstd3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Add New Student");
		btnNewButton_1.setBounds(882, 134, 161, 24);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textaddstd2.getText();
				comboBoxName_2.addItem(string);
			}
		});
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(51, 153, 102));
		
		textaddstd2 = new JTextField();
		textaddstd2.setBounds(872, 111, 171, 24);
		panel.add(textaddstd2);
		textaddstd2.setForeground(new Color(0, 0, 153));
		textaddstd2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textaddstd2.setColumns(10);
		
		JButton btnNewButton = new JButton("Add New Student");
		btnNewButton.setBounds(885, 81, 161, 24);
		panel.add(btnNewButton);
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 51, 204), new Color(255, 0, 0), new Color(204, 204, 0)));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(51, 153, 102));
		
		JSeparator separator_1_6_1 = new JSeparator();
		separator_1_6_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_6_1.setForeground(new Color(0, 0, 102));
		separator_1_6_1.setBackground(new Color(0, 0, 153));
		separator_1_6_1.setBounds(1152, 36, 10, 353);
		panel.add(separator_1_6_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textaddstd1.getText();
				comboBoxName_1.addItem(string);
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(0, 10, 1252, 115);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(0, 204, 255));
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 153), 3));
		scrollPane.setForeground(new Color(0, 0, 0));
		scrollPane.setFont(new Font("Times New Roman", Font.BOLD, 15));
		scrollPane.setBounds(0, 534, 1252, 218);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
	public void Attendenceinfo() {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
				 String query = "INSERT INTO StudentAttend values (?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				
				 String Roll=comboBoxRoll_1.getSelectedItem().toString();
				 PS.setString(1,Roll);
				 String Fname=comboBoxName_1.getSelectedItem().toString();
				 PS.setString(2, Fname);
				 if (rdbtnNewRadioButtonP_1.isSelected()) 
					 	PS.setString(3, rdbtnNewRadioButtonP_1.getText());
				 else 
					 	PS.setString(3, rdbtnNewRadioButtonA_1.getText());
				 
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Attendence Information Updated");
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
	public void AttendenceShow() {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			Statement St=connection.createStatement() ;
			String qString="select * from StudentAttend";
			ResultSet rs=St.executeQuery(qString);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
			int cols=rsmd.getColumnCount();
			String[] coolName=new String[cols];
			for(int i=0;i<cols;i++)
			coolName[i]=rsmd.getColumnName(i+1);
			tbl.setColumnIdentifiers(coolName);
			String Roll,Name,Prsent;
			while(rs.next()) {
				
				
				Roll=rs.getString(1);
				Name=rs.getString(2);
				Prsent=rs.getString(3);
				String[]rowStrings= {Roll,Name,Prsent};
				tbl.addRow(rowStrings);
			}
			St.close();
			connection.close();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}

	}
	public void Attendenceinfo2() {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
				 String query = "INSERT INTO StudentAttend2 values (?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				 
				 String Roll=comboBoxRoll_2.getSelectedItem().toString();
				 PS.setString(1,Roll);
				 String Fname=comboBoxName_2.getSelectedItem().toString();
				 PS.setString(2, Fname);
				 if (rdbtnNewRadioButtonP_2.isSelected()) 
					 	PS.setString(3, rdbtnNewRadioButtonP_2.getText());
				 else 
					 	PS.setString(3, rdbtnNewRadioButtonA_2.getText());
				 
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Attendence Information Updated");
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
public void AttendenceShow2() {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			Statement St=connection.createStatement() ;
			String qString="select * from StudentAttend2";
			ResultSet rs=St.executeQuery(qString);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
			int cols=rsmd.getColumnCount();
			String[] coolName=new String[cols];
			for(int i=0;i<cols;i++)
			coolName[i]=rsmd.getColumnName(i+1);
			tbl.setColumnIdentifiers(coolName);
			String Roll,Name,Prsent;
			while(rs.next()) {
				
				
				Roll=rs.getString(1);
				Name=rs.getString(2);
				Prsent=rs.getString(3);
				String[]rowStrings= {Roll,Name,Prsent};
				tbl.addRow(rowStrings);
			}
			St.close();
			connection.close();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}

	}
	public void Attendenceinfo3() {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
				 String query = "INSERT INTO StudentAttend3 values (?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				 
				 
				 String Roll=comboBoxRoll_3.getSelectedItem().toString();
				 PS.setString(1,Roll);
				 String Fname=comboBoxName_3.getSelectedItem().toString();
				 PS.setString(2, Fname);
				 if (rdbtnNewRadioButtonP_3.isSelected()) 
					 	PS.setString(3, rdbtnNewRadioButtonP_3.getText());
				 else 
					 	PS.setString(3, rdbtnNewRadioButtonA_3.getText());
				 
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Attendence Information Updated");
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
public void AttendenceShow3() {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			Statement St=connection.createStatement() ;
			String qString="select * from StudentAttend3";
			ResultSet rs=St.executeQuery(qString);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
			int cols=rsmd.getColumnCount();
			String[] coolName=new String[cols];
			for(int i=0;i<cols;i++)
			coolName[i]=rsmd.getColumnName(i+1);
			tbl.setColumnIdentifiers(coolName);
			String Roll,Name,Prsent;
			while(rs.next()) {
				
				
				Roll=rs.getString(1);
				Name=rs.getString(2);
				Prsent=rs.getString(3);
				String[]rowStrings= {Roll,Name,Prsent};
				tbl.addRow(rowStrings);
			}
			St.close();
			connection.close();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}

	}
	public void Attendenceinfo4() {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
				 String query = "INSERT INTO StudentAttend4 values (?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
			
				 String Roll=comboBoxRoll_4.getSelectedItem().toString();
				 PS.setString(1,Roll);
				 String Fname=comboBoxName_4.getSelectedItem().toString();
				 PS.setString(2, Fname);
				 if (rdbtnNewRadioButtonP_4.isSelected()) 
					 	PS.setString(3, rdbtnNewRadioButtonP_4.getText());
				 else 
					 	PS.setString(3, rdbtnNewRadioButtonA_4.getText());
				 
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Attendence Information Updated");
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
public void AttendenceShow4() {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			Statement St=connection.createStatement() ;
			String qString="select * from StudentAttend4";
			ResultSet rs=St.executeQuery(qString);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
			int cols=rsmd.getColumnCount();
			String[] coolName=new String[cols];
			for(int i=0;i<cols;i++)
			coolName[i]=rsmd.getColumnName(i+1);
			tbl.setColumnIdentifiers(coolName);
			String Roll,Name,Prsent;
			while(rs.next()) {
				
				
				Roll=rs.getString(1);
				Name=rs.getString(2);
				Prsent=rs.getString(3);
				String[]rowStrings= {Roll,Name,Prsent};
				tbl.addRow(rowStrings);
			}
			St.close();
			connection.close();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}

	}
	public void Attendenceinfo5() {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
				 String query = "INSERT INTO StudentAttend5 values (?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				
				 String Roll=comboBoxRoll_5.getSelectedItem().toString();
				 PS.setString(1,Roll);
				 String Fname=comboBoxName_5.getSelectedItem().toString();
				 PS.setString(2, Fname);
				 if (rdbtnNewRadioButtonP_5.isSelected()) 
					 	PS.setString(3, rdbtnNewRadioButtonP_5.getText());
				 else 
					 	PS.setString(3, rdbtnNewRadioButtonA_5.getText());
				 
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Attendence Information Updated");
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
public void AttendenceShow5() {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			Statement St=connection.createStatement() ;
			String qString="select * from StudentAttend5";
			ResultSet rs=St.executeQuery(qString);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
			int cols=rsmd.getColumnCount();
			String[] coolName=new String[cols];
			for(int i=0;i<cols;i++)
			coolName[i]=rsmd.getColumnName(i+1);
			tbl.setColumnIdentifiers(coolName);
			String Roll,Name,Prsent;
			while(rs.next()) {
				
				
				Roll=rs.getString(1);
				Name=rs.getString(2);
				Prsent=rs.getString(3);
				String[]rowStrings= {Roll,Name,Prsent};
				tbl.addRow(rowStrings);
			}
			St.close();
			connection.close();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}

	}
	public void Attendenceinfo6() {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
				 String query = "INSERT INTO StudentAttend6 values (?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				 
				 String Roll=comboBoxRoll_6.getSelectedItem().toString();
				 PS.setString(1,Roll);
				 String Fname=comboBoxName_6.getSelectedItem().toString();
				 PS.setString(2, Fname);
				 if (rdbtnNewRadioButtonP_6.isSelected()) 
					 	PS.setString(3, rdbtnNewRadioButtonP_6.getText());
				 else 
					 	PS.setString(3, rdbtnNewRadioButtonA_6.getText());
				 
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Attendence Information Updated");
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
public void AttendenceShow6() {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			Statement St=connection.createStatement() ;
			String qString="select * from StudentAttend6";
			ResultSet rs=St.executeQuery(qString);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
			int cols=rsmd.getColumnCount();
			String[] coolName=new String[cols];
			for(int i=0;i<cols;i++)
			coolName[i]=rsmd.getColumnName(i+1);
			tbl.setColumnIdentifiers(coolName);
			String Roll,Name,Prsent;
			while(rs.next()) {
				
				
				Roll=rs.getString(1);
				Name=rs.getString(2);
				Prsent=rs.getString(3);
				String[]rowStrings= {Roll,Name,Prsent};
				tbl.addRow(rowStrings);
			}
			St.close();
			connection.close();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}

	}
}
