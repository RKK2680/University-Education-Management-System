package userdetails;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import Image.Retrive_image;
import Model.stdATENDENS;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewStudent extends JFrame {

	   JButton btnSearch ;
	    JLabel label;
	    JTextField jtf;
	    private JLabel lblNewLabel_1;
	    private JTextField textFname;
	    private JTextField textLname;
	    private JTextField textFatherN;
	    private JTextField textMotherN;
	    private JTextField textDob;
	    private JTextField textGender;
	    private JLabel lblNewLabel_2;
	    private JTextField texthous;
	    private JLabel lblNewLabel_1_7;
	    private JTextField textland;
	    private JLabel lblNewLabel_1_8;
	    private JTextField textcity;
	    private JLabel lblNewLabel_1_10;
	    private JLabel lblNewLabel_1_11;
	    private JTextField textpost;
	    private JTextField textState;
	    private JLabel lblNewLabel_1_17;
	    private JTextField textDistric;
	    private JLabel lblNewLabel_1_18;
	    private JTextField textpin;
	    private JLabel lblNewLabel_1_9;
	    private JTextField textMobile;
	    private JLabel lblNewLabel_3;
	    private JLabel lbl;
	    private JLabel lblNewLabel_1_13;
	    private JLabel lblNewLabel_1_14;
	    private JLabel lblNewLabel_1_15;
	    private JLabel lblNewLabel_1_16;
	    private JLabel lblNewLabel_1_19;
	    private JLabel lblNewLabel_1_20;
	    private JTextField textCo_mobile;
	    private JTextField textCo_pin;
	    private JTextField textCo_post;
	    private JTextField textCo_state;
	    private JTextField textCo_Distric;
	    private JTextField textCo_city;
	    private JTextField textCo_land;
	    private JTextField textCo_House;
	    private JLabel lblNewLabel_4;
	    private JTextField text_H_C_U;
	    private JLabel lblNewLabel_1_24;
	    private JTextField text_H_C_U_bord;
	    private JLabel lblNewLabel_5;
	    private JLabel lblNewLabel_1_29;
	    private JTextField text_H_C_U_Pass;
	    private JLabel lblNewLabel_6;
	    private JTextField text_H_C_U_Persen;
	    private JLabel lblNewLabel_1_23;
	    private JTextField text_H_C_U_Co;
	    private JLabel lblNewLabel_11;
	    private JLabel lblNewLabel_12;
	    private JTable table;
	    private JButton btnUpdate_2_3;
	    private JButton btnUpdate_2_4;
	    private JTable table_1;
	    private JTable table_2;
	    private JTable table_3;
	    private JTextField textcast;
	    private JTextField textcorse;
	    private JButton btnUpdate_2_5;
	    private JLabel lblNewLabel_1_12;
	    private JTextField text_H_C_U_roll;
	    private JButton btnUpdate_2_6;

	    public NewStudent(){
	    super("retrieve image from database in java");
	    setTitle("New Student");
	    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
	    setBounds(100, 000, 1500, 1000);
	    getContentPane().setLayout(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    getContentPane().setBackground(new Color(210, 105, 30));
	    
	    JLabel lblNewLabel = new JLabel("New Student Admission Details");
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
	    lblNewLabel.setBounds(427, 10, 597, 48);
	    getContentPane().add(lblNewLabel);
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(135, 206, 250));
	    panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	    panel.setBounds(32, 68, 1498, 324);
	    getContentPane().add(panel);
	    panel.setLayout(null);
	    
	    label = new JLabel();
	    label.setBounds(53, 65, 204, 202);
	    panel.add(label);
	    
	    jtf = new JTextField();
	    jtf.setBounds(347, 43, 125, 20);
	    panel.add(jtf);
	    
	    btnSearch = new JButton("Search");
	    btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 18));
	    btnSearch.setBackground(new Color(152, 251, 152));
	    btnSearch.setForeground(new Color(0, 0, 0));
	    btnSearch.setBounds(482, 24, 113, 40);
	    panel.add(btnSearch);
	    
	    lblNewLabel_1 = new JLabel("Name*");
	    lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1.setBounds(309, 80, 69, 26);
	    panel.add(lblNewLabel_1);
	    
	    textFname = new JTextField();
	    textFname.setForeground(new Color(0, 0, 128));
	    textFname.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textFname.setBounds(372, 83, 118, 19);
	    panel.add(textFname);
	    textFname.setColumns(10);
	    
	    textLname = new JTextField();
	    textLname.setForeground(new Color(0, 0, 128));
	    textLname.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textLname.setColumns(10);
	    textLname.setBounds(489, 83, 106, 19);
	    panel.add(textLname);
	    
	    JLabel lblNewLabel_1_1 = new JLabel("Father Name*");
	    lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_1.setBounds(309, 112, 100, 26);
	    panel.add(lblNewLabel_1_1);
	    
	    textFatherN = new JTextField();
	    textFatherN.setForeground(new Color(0, 0, 128));
	    textFatherN.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textFatherN.setColumns(10);
	    textFatherN.setBounds(426, 115, 155, 19);
	    panel.add(textFatherN);
	    
	    JLabel lblNewLabel_1_2 = new JLabel("Mother Name*");
	    lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_2.setBounds(309, 141, 118, 26);
	    panel.add(lblNewLabel_1_2);
	    
	    textMotherN = new JTextField();
	    textMotherN.setForeground(new Color(0, 0, 128));
	    textMotherN.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textMotherN.setColumns(10);
	    textMotherN.setBounds(426, 144, 155, 19);
	    panel.add(textMotherN);
	    
	    JLabel lblNewLabel_1_3 = new JLabel("DOB*");
	    lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_3.setBounds(309, 167, 69, 26);
	    panel.add(lblNewLabel_1_3);
	    
	    textDob = new JTextField();
	    textDob.setForeground(new Color(0, 0, 128));
	    textDob.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textDob.setColumns(10);
	    textDob.setBounds(426, 170, 155, 19);
	    panel.add(textDob);
	    
	    JLabel lblNewLabel_1_4 = new JLabel("Gender*");
	    lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_4.setBounds(309, 203, 69, 26);
	    panel.add(lblNewLabel_1_4);
	    
	    textGender = new JTextField();
	    textGender.setForeground(new Color(0, 0, 128));
	    textGender.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textGender.setColumns(10);
	    textGender.setBounds(426, 206, 155, 19);
	    panel.add(textGender);
	    
	    JLabel lblNewLabel_1_5 = new JLabel("Cast*");
	    lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_5.setBounds(309, 239, 69, 26);
	    panel.add(lblNewLabel_1_5);
	    
	    JLabel lblNewLabel_1_6 = new JLabel("Fist Name");
	    lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_6.setBounds(264, 38, 76, 26);
	    panel.add(lblNewLabel_1_6);
	    
	    lblNewLabel_2 = new JLabel("Hause no*");
	    lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_2.setBounds(638, 56, 88, 26);
	    panel.add(lblNewLabel_2);
	    
	    texthous = new JTextField();
	    texthous.setForeground(new Color(0, 0, 128));
	    texthous.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    texthous.setColumns(10);
	    texthous.setBounds(717, 65, 118, 19);
	    panel.add(texthous);
	    
	    lblNewLabel_1_7 = new JLabel("Landmrk*");
	    lblNewLabel_1_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_7.setBounds(638, 88, 100, 26);
	    panel.add(lblNewLabel_1_7);
	    
	    textland = new JTextField();
	    textland.setForeground(new Color(0, 0, 128));
	    textland.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textland.setColumns(10);
	    textland.setBounds(717, 97, 118, 19);
	    panel.add(textland);
	    
	    lblNewLabel_1_8 = new JLabel("City*");
	    lblNewLabel_1_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_8.setBounds(638, 116, 100, 26);
	    panel.add(lblNewLabel_1_8);
	    
	    textcity = new JTextField();
	    textcity.setForeground(new Color(0, 0, 128));
	    textcity.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textcity.setColumns(10);
	    textcity.setBounds(717, 125, 118, 19);
	    panel.add(textcity);
	    
	    lblNewLabel_1_10 = new JLabel("State*");
	    lblNewLabel_1_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_10.setBounds(638, 167, 69, 26);
	    panel.add(lblNewLabel_1_10);
	    
	    lblNewLabel_1_11 = new JLabel("Post Office*");
	    lblNewLabel_1_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_11.setBounds(632, 199, 94, 26);
	    panel.add(lblNewLabel_1_11);
	    
	    textpost = new JTextField();
	    textpost.setForeground(new Color(0, 0, 128));
	    textpost.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textpost.setColumns(10);
	    textpost.setBounds(717, 208, 118, 19);
	    panel.add(textpost);
	    
	    textState = new JTextField();
	    textState.setForeground(new Color(0, 0, 128));
	    textState.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textState.setColumns(10);
	    textState.setBounds(717, 179, 118, 20);
	    panel.add(textState);
	    
	    lblNewLabel_1_17 = new JLabel("Distric*");
	    lblNewLabel_1_17.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_17.setBounds(638, 141, 100, 26);
	    panel.add(lblNewLabel_1_17);
	    
	    textDistric = new JTextField();
	    textDistric.setForeground(new Color(0, 0, 128));
	    textDistric.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textDistric.setColumns(10);
	    textDistric.setBounds(717, 150, 118, 20);
	    panel.add(textDistric);
	    
	    lblNewLabel_1_18 = new JLabel("Pincode");
	    lblNewLabel_1_18.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_18.setBounds(638, 231, 100, 26);
	    panel.add(lblNewLabel_1_18);
	    
	    textpin = new JTextField();
	    textpin.setForeground(new Color(0, 0, 128));
	    textpin.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textpin.setColumns(10);
	    textpin.setBounds(717, 240, 118, 19);
	    panel.add(textpin);
	    
	    lblNewLabel_1_9 = new JLabel("Mobile");
	    lblNewLabel_1_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_9.setBounds(638, 263, 69, 26);
	    panel.add(lblNewLabel_1_9);
	    
	    textMobile = new JTextField();
	    textMobile.setForeground(new Color(0, 0, 128));
	    textMobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textMobile.setColumns(10);
	    textMobile.setBounds(717, 272, 118, 19);
	    panel.add(textMobile);
	    
	    lblNewLabel_3 = new JLabel("Hause no*");
	    lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_3.setBounds(860, 58, 88, 26);
	    panel.add(lblNewLabel_3);
	    
	    lbl = new JLabel("Landmrk*");
	    lbl.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lbl.setBounds(860, 90, 100, 26);
	    panel.add(lbl);
	    
	    lblNewLabel_1_13 = new JLabel("City*");
	    lblNewLabel_1_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_13.setBounds(860, 118, 100, 26);
	    panel.add(lblNewLabel_1_13);
	    
	    lblNewLabel_1_14 = new JLabel("Distric*");
	    lblNewLabel_1_14.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_14.setBounds(860, 143, 100, 26);
	    panel.add(lblNewLabel_1_14);
	    
	    lblNewLabel_1_15 = new JLabel("State*");
	    lblNewLabel_1_15.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_15.setBounds(860, 169, 69, 26);
	    panel.add(lblNewLabel_1_15);
	    
	    lblNewLabel_1_16 = new JLabel("Post Office*");
	    lblNewLabel_1_16.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_16.setBounds(848, 203, 100, 26);
	    panel.add(lblNewLabel_1_16);
	    
	    lblNewLabel_1_19 = new JLabel("Pincode");
	    lblNewLabel_1_19.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_19.setBounds(860, 233, 100, 26);
	    panel.add(lblNewLabel_1_19);
	    
	    lblNewLabel_1_20 = new JLabel("Mobile");
	    lblNewLabel_1_20.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_20.setBounds(860, 265, 69, 26);
	    panel.add(lblNewLabel_1_20);
	    
	    textCo_mobile = new JTextField();
	    textCo_mobile.setForeground(new Color(0, 0, 128));
	    textCo_mobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textCo_mobile.setColumns(10);
	    textCo_mobile.setBounds(939, 272, 118, 19);
	    panel.add(textCo_mobile);
	    
	    textCo_pin = new JTextField();
	    textCo_pin.setForeground(new Color(0, 0, 128));
	    textCo_pin.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textCo_pin.setColumns(10);
	    textCo_pin.setBounds(939, 240, 118, 19);
	    panel.add(textCo_pin);
	    
	    textCo_post = new JTextField();
	    textCo_post.setForeground(new Color(0, 0, 128));
	    textCo_post.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textCo_post.setColumns(10);
	    textCo_post.setBounds(939, 208, 118, 19);
	    panel.add(textCo_post);
	    
	    textCo_state = new JTextField();
	    textCo_state.setForeground(new Color(0, 0, 128));
	    textCo_state.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textCo_state.setColumns(10);
	    textCo_state.setBounds(939, 179, 118, 20);
	    panel.add(textCo_state);
	    
	    textCo_Distric = new JTextField();
	    textCo_Distric.setForeground(new Color(0, 0, 128));
	    textCo_Distric.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textCo_Distric.setColumns(10);
	    textCo_Distric.setBounds(939, 150, 118, 20);
	    panel.add(textCo_Distric);
	    
	    textCo_city = new JTextField();
	    textCo_city.setForeground(new Color(0, 0, 128));
	    textCo_city.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textCo_city.setColumns(10);
	    textCo_city.setBounds(939, 125, 118, 19);
	    panel.add(textCo_city);
	    
	    textCo_land = new JTextField();
	    textCo_land.setForeground(new Color(0, 0, 128));
	    textCo_land.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textCo_land.setColumns(10);
	    textCo_land.setBounds(939, 97, 118, 19);
	    panel.add(textCo_land);
	    
	    textCo_House = new JTextField();
	    textCo_House.setForeground(new Color(0, 0, 128));
	    textCo_House.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textCo_House.setColumns(10);
	    textCo_House.setBounds(939, 65, 118, 19);
	    panel.add(textCo_House);
	    
	    JSeparator separator = new JSeparator();
	    separator.setForeground(new Color(0, 0, 128));
	    separator.setOrientation(SwingConstants.VERTICAL);
	    separator.setBounds(606, 0, 16, 318);
	    panel.add(separator);
	    
	    JSeparator separator_1 = new JSeparator();
	    separator_1.setOrientation(SwingConstants.VERTICAL);
	    separator_1.setForeground(new Color(0, 0, 128));
	    separator_1.setBounds(845, 0, 16, 318);
	    panel.add(separator_1);
	    
	    JSeparator separator_1_1 = new JSeparator();
	    separator_1_1.setOrientation(SwingConstants.VERTICAL);
	    separator_1_1.setForeground(new Color(0, 0, 128));
	    separator_1_1.setBounds(1067, 0, 16, 318);
	    panel.add(separator_1_1);
	    
	    lblNewLabel_4 = new JLabel("High School/Collge/Universty*");
	    lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_4.setBounds(1077, 88, 204, 26);
	    panel.add(lblNewLabel_4);
	    
	    text_H_C_U = new JTextField();
	    text_H_C_U.setForeground(new Color(0, 0, 128));
	    text_H_C_U.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    text_H_C_U.setColumns(10);
	    text_H_C_U.setBounds(1280, 91, 208, 23);
	    panel.add(text_H_C_U);
	    
	    lblNewLabel_1_24 = new JLabel("Board*");
	    lblNewLabel_1_24.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_24.setBounds(1228, 182, 69, 26);
	    panel.add(lblNewLabel_1_24);
	    
	    text_H_C_U_bord = new JTextField();
	    text_H_C_U_bord.setForeground(new Color(0, 0, 128));
	    text_H_C_U_bord.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    text_H_C_U_bord.setColumns(10);
	    text_H_C_U_bord.setBounds(1283, 179, 143, 26);
	    panel.add(text_H_C_U_bord);
	    
	    lblNewLabel_5 = new JLabel("Qulification");
	    lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
	    lblNewLabel_5.setBounds(1077, 19, 143, 26);
	    panel.add(lblNewLabel_5);
	    
	    lblNewLabel_1_29 = new JLabel("P year*");
	    lblNewLabel_1_29.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_29.setBounds(1215, 221, 69, 26);
	    panel.add(lblNewLabel_1_29);
	    
	    text_H_C_U_Pass = new JTextField();
	    text_H_C_U_Pass.setForeground(new Color(0, 0, 128));
	    text_H_C_U_Pass.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    text_H_C_U_Pass.setColumns(10);
	    text_H_C_U_Pass.setBounds(1281, 218, 155, 26);
	    panel.add(text_H_C_U_Pass);
	    
	    lblNewLabel_6 = new JLabel("Presentage%*");
	    lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_6.setBounds(1181, 261, 103, 26);
	    panel.add(lblNewLabel_6);
	    
	    text_H_C_U_Persen = new JTextField();
	    text_H_C_U_Persen.setForeground(new Color(0, 0, 128));
	    text_H_C_U_Persen.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    text_H_C_U_Persen.setColumns(10);
	    text_H_C_U_Persen.setBounds(1291, 262, 106, 28);
	    panel.add(text_H_C_U_Persen);
	    
	    lblNewLabel_1_23 = new JLabel("Corse*");
	    lblNewLabel_1_23.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_23.setBounds(1227, 116, 69, 26);
	    panel.add(lblNewLabel_1_23);
	    
	    text_H_C_U_Co = new JTextField();
	    text_H_C_U_Co.setForeground(new Color(0, 0, 128));
	    text_H_C_U_Co.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    text_H_C_U_Co.setColumns(10);
	    text_H_C_U_Co.setBounds(1282, 119, 118, 20);
	    panel.add(text_H_C_U_Co);
	    
	    lblNewLabel_11 = new JLabel("CO_Adress");
	    lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
	    lblNewLabel_11.setBounds(855, 19, 143, 26);
	    panel.add(lblNewLabel_11);
	    
	    lblNewLabel_12 = new JLabel("P_Adress");
	    lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
	    lblNewLabel_12.setBounds(615, 20, 106, 26);
	    panel.add(lblNewLabel_12);
	    
	    JButton btnUpdate = new JButton("Update");
	    btnUpdate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		P_ADressupdate();
	    	}
	    });
	    btnUpdate.setForeground(Color.BLACK);
	    btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 18));
	    btnUpdate.setBackground(new Color(152, 251, 152));
	    btnUpdate.setBounds(736, 19, 99, 38);
	    panel.add(btnUpdate);
	    
	    JButton btnUpdate_1 = new JButton("Update");
	    btnUpdate_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		Co_ADressupdate();
	    	}
	    });
	    btnUpdate_1.setForeground(Color.BLACK);
	    btnUpdate_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
	    btnUpdate_1.setBackground(new Color(152, 251, 152));
	    btnUpdate_1.setBounds(967, 17, 99, 38);
	    panel.add(btnUpdate_1);
	    
	    JButton btnUpdate_2 = new JButton("Update");
	    btnUpdate_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Qulifictionup();
	    	}
	    });
	    btnUpdate_2.setForeground(Color.BLACK);
	    btnUpdate_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
	    btnUpdate_2.setBackground(new Color(152, 251, 152));
	    btnUpdate_2.setBounds(1389, 13, 99, 38);
	    panel.add(btnUpdate_2);
	    
	    JLabel lblNewLabel_1_5_1 = new JLabel("Course*");
	    lblNewLabel_1_5_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_5_1.setBounds(309, 275, 69, 26);
	    panel.add(lblNewLabel_1_5_1);
	    
	    JButton btnUpdate_2_1 = new JButton("View");
	    btnUpdate_2_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Qulification();
	    	}
	    });
	    btnUpdate_2_1.setForeground(Color.BLACK);
	    btnUpdate_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
	    btnUpdate_2_1.setBackground(new Color(152, 251, 152));
	    btnUpdate_2_1.setBounds(1281, 13, 99, 38);
	    panel.add(btnUpdate_2_1);
	    
	    JButton btnUpdate_2_2 = new JButton("View");
	    btnUpdate_2_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		P_adress();
	    	}
	    });
	    btnUpdate_2_2.setForeground(Color.BLACK);
	    btnUpdate_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
	    btnUpdate_2_2.setBackground(new Color(152, 251, 152));
	    btnUpdate_2_2.setBounds(748, 296, 99, 22);
	    panel.add(btnUpdate_2_2);
	    
	    btnUpdate_2_3 = new JButton("View");
	    btnUpdate_2_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Co_adress();
	    	}
	    });
	    btnUpdate_2_3.setForeground(Color.BLACK);
	    btnUpdate_2_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
	    btnUpdate_2_3.setBackground(new Color(152, 251, 152));
	    btnUpdate_2_3.setBounds(967, 296, 99, 22);
	    panel.add(btnUpdate_2_3);
	    
	    btnUpdate_2_4 = new JButton("View");
	    btnUpdate_2_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		StudentView();
	    	}
	    });
	    btnUpdate_2_4.setForeground(Color.BLACK);
	    btnUpdate_2_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
	    btnUpdate_2_4.setBackground(new Color(152, 251, 152));
	    btnUpdate_2_4.setBounds(10, 296, 99, 22);
	    panel.add(btnUpdate_2_4);
	    
	    textcast = new JTextField();
	    textcast.setForeground(new Color(0, 0, 128));
	    textcast.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textcast.setColumns(10);
	    textcast.setBounds(426, 235, 155, 19);
	    panel.add(textcast);
	    
	    textcorse = new JTextField();
	    textcorse.setForeground(new Color(0, 0, 128));
	    textcorse.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    textcorse.setColumns(10);
	    textcorse.setBounds(426, 274, 155, 19);
	    panel.add(textcorse);
	    
	    btnUpdate_2_5 = new JButton("Update");
	    btnUpdate_2_5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Profileupdate();
	    	}
	    });
	    btnUpdate_2_5.setForeground(Color.BLACK);
	    btnUpdate_2_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
	    btnUpdate_2_5.setBackground(new Color(152, 251, 152));
	    btnUpdate_2_5.setBounds(158, 296, 99, 22);
	    panel.add(btnUpdate_2_5);
	    
	    lblNewLabel_1_12 = new JLabel("Roll no*");
	    lblNewLabel_1_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
	    lblNewLabel_1_12.setBounds(1215, 141, 69, 26);
	    panel.add(lblNewLabel_1_12);
	    
	    text_H_C_U_roll = new JTextField();
	    text_H_C_U_roll.setForeground(new Color(0, 0, 128));
	    text_H_C_U_roll.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    text_H_C_U_roll.setColumns(10);
	    text_H_C_U_roll.setBounds(1284, 144, 165, 26);
	    panel.add(text_H_C_U_roll);
	    
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBackground(new Color(240, 240, 240));
	    scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	    scrollPane.setBounds(10, 399, 1508, 105);
	    getContentPane().add(scrollPane);
	    
	    table = new JTable();
	    table.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
	    		int i = table.getSelectedRow();
	    		 textFname.setText((String)dtm.getValueAt(i, 0));
	    		 textLname.setText((String)dtm.getValueAt(i, 1));
	    		 textFatherN.setText((String)dtm.getValueAt(i, 3));
	    		 textMotherN.setText((String)dtm.getValueAt(i, 2));
	    		 textDob.setText((String)dtm.getValueAt(i, 4));
	    		 textGender.setText((String)dtm.getValueAt(i, 5));
	    		 textcast.setText((String)dtm.getValueAt(i, 6));
	    		 textcorse.setText((String)dtm.getValueAt(i, 7));
	    	}
	    });
	    scrollPane.setViewportView(table);
	    
	    JScrollPane scrollPane_1 = new JScrollPane();
	    scrollPane_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	    scrollPane_1.setBounds(10, 507, 1508, 105);
	    getContentPane().add(scrollPane_1);
	    
	    table_1 = new JTable();
	    table_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		DefaultTableModel dtm=(DefaultTableModel) table_1.getModel();
	    		int i = table_1.getSelectedRow();
	    		 texthous.setText((String)dtm.getValueAt(i, 0));
	    		 textland.setText((String)dtm.getValueAt(i, 1));
	    		 textcity.setText((String)dtm.getValueAt(i, 2));
	    		 textDistric.setText((String)dtm.getValueAt(i, 3));
	    		 textState.setText((String)dtm.getValueAt(i, 4));
	    		 textpost.setText((String)dtm.getValueAt(i, 5));
	    		 textpin.setText((String)dtm.getValueAt(i, 6));
	    		 textMobile.setText((String)dtm.getValueAt(i, 7));
	    		
	    	}
	    });
	    scrollPane_1.setViewportView(table_1);
	    
	    JScrollPane scrollPane_2 = new JScrollPane();
	    scrollPane_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	    scrollPane_2.setBounds(10, 614, 1508, 105);
	    getContentPane().add(scrollPane_2);
	    
	    table_2 = new JTable();
	    table_2.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		
	    		DefaultTableModel dtm=(DefaultTableModel) table_2.getModel();
	    		int i = table_2.getSelectedRow();
	    		 textCo_House.setText((String)dtm.getValueAt(i, 0));
	    		 textCo_land.setText((String)dtm.getValueAt(i, 1));
	    		 textCo_city.setText((String)dtm.getValueAt(i, 2));
	    		 textCo_Distric.setText((String)dtm.getValueAt(i, 3));
	    		 textCo_state.setText((String)dtm.getValueAt(i, 4));
	    		 textCo_post.setText((String)dtm.getValueAt(i, 5));
	    		 textCo_pin.setText((String)dtm.getValueAt(i, 6));
	    		 textCo_mobile.setText((String)dtm.getValueAt(i, 7));
	    		
	    	}
	    });
	    scrollPane_2.setViewportView(table_2);
	    
	    JScrollPane scrollPane_3 = new JScrollPane();
	    scrollPane_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	    scrollPane_3.setBounds(10, 721, 1508, 114);
	    getContentPane().add(scrollPane_3);
	    
	    table_3 = new JTable();
	    table_3.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		DefaultTableModel dtm=(DefaultTableModel) table_3.getModel();
	    		int i = table_3.getSelectedRow();
	    		 
	    		 text_H_C_U.setText((String)dtm.getValueAt(i, 0));
	    		 text_H_C_U_Co.setText((String)dtm.getValueAt(i, 1));
	    		 text_H_C_U_roll.setText((String)dtm.getValueAt(i, 2));
	    		 text_H_C_U_bord.setText((String)dtm.getValueAt(i, 3));
	    		 text_H_C_U_Pass.setText((String)dtm.getValueAt(i, 4));
	    		 text_H_C_U_Persen.setText((String)dtm.getValueAt(i, 5));
	    		 
	    	}
	    });
	    scrollPane_3.setViewportView(table_3);
	    
	    btnUpdate_2_6 = new JButton("Back");
	    btnUpdate_2_6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//FecultyInfo.main(null);
	    		dispose();
	    	}
	    });
	    btnUpdate_2_6.setForeground(Color.BLACK);
	    btnUpdate_2_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    btnUpdate_2_6.setBackground(new Color(255, 69, 0));
	    btnUpdate_2_6.setBounds(1431, 10, 99, 38);
	    getContentPane().add(btnUpdate_2_6);
	    
	    btnSearch.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        
	            try{
	                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
	                Statement st = con.createStatement();
	                //ResultSet rs = st.executeQuery("select * from myimages where ID = '"+jtf.getText()+"'");
	                ResultSet rs = st.executeQuery("select * from  StudentAdmission where Fistname = '"+jtf.getText()+"'");
	                if(rs.next()){
	                    byte[] img = rs.getBytes("Image");



	                    //Resize The ImageIcon
	                    ImageIcon image = new ImageIcon(img);
	                    Image im = image.getImage();
	                    Image myImg = im.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
	                    ImageIcon newImage = new ImageIcon(myImg);
	                    label.setIcon(newImage);
	                }
	                
	                else{
	                    JOptionPane.showMessageDialog(null, "No Data");
	                }
	            }catch(Exception ex){
	                ex.printStackTrace();
	            }
	        
	        }
	    });
	    setLocationRelativeTo(null);
	    setSize(1554,890);
	    setVisible(true);
	    } 
	     public void StudentView() {
	    	 try {
	    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
	    			Statement St=connection.createStatement() ;
	    			String qString="select Fistname, Lastname,Mothername, Fathername,DOB,Gender ,Cast, Course from StudentAdmission";
	    			ResultSet rs=St.executeQuery(qString); 
	    			ResultSetMetaData rsmd=rs.getMetaData();
	    			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
	    			int cols=rsmd.getColumnCount();
	    			String[] coolName=new String[cols];
	    			for(int i=0;i<cols;i++)
	    			coolName[i]=rsmd.getColumnName(i+1);
	    			tbl.setColumnIdentifiers(coolName);
	    			String f,l,m,fa,D,G,C,Co;
	    			while(rs.next()) {
	    				
	    				f=rs.getString(1);
	    				l=rs.getString(2);
	    				m=rs.getString(3);
	    				fa=rs.getString(4);
	    				D=rs.getString(5);
	    				G=rs.getString(6);
	    				C=rs.getString(7);
	    				Co=rs.getString(8);
	    			
	    				String[]rowStrings= {f,l,m,fa,D,G,C,Co};
	    				tbl.addRow(rowStrings);
	    			}
	    			St.close();
	    			connection.close();
	    		} catch (Exception e1) {
	    			// TODO: handle exception
	    			e1.printStackTrace();
	    		}
		}
	     public void Profileupdate(){
			
	     try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
	    		String sql="update StudentAdmission set Fistname=?,Lastname=?,Fathername=?,Mothername=?,DOB=?,Gender=? ,Cast=? ,Course=? where Fistname = ?";
	    		PreparedStatement Ps=conn.prepareStatement(sql);
	    		 Ps.setString(1, textFname.getText());
				 Ps.setString(2, textLname.getText());
				 Ps.setString(3, textFatherN.getText());
				 Ps.setString(4, textMotherN.getText());
				 Ps.setString(5, textDob.getText());
				 Ps.setString(6, textGender.getText());
				 Ps.setString(7, textcast.getText());
				 Ps.setString(8, textcorse.getText());
				 Ps.setString(9, textFname.getText());
				 Ps.executeUpdate();
 		JOptionPane.showMessageDialog(null, "Profile is Updeted Sucsesfuly....");
 		conn.close();
 		}
	    	  catch (Exception e2) {
				e2.printStackTrace();
			}
	     }
	     public void P_adress() {
	    	 try {
	    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
	    			Statement St=connection.createStatement() ;
	    			String qString="select * from  studentAddres";
	    			ResultSet rs=St.executeQuery(qString); 
	    			ResultSetMetaData rsmd=rs.getMetaData();
	    			DefaultTableModel tbl=(DefaultTableModel)table_1.getModel(); 
	    			int cols=rsmd.getColumnCount();
	    			String[] coolName=new String[cols];
	    			for(int i=0;i<cols;i++)
	    			coolName[i]=rsmd.getColumnName(i+1);
	    			tbl.setColumnIdentifiers(coolName);
	    			String f,l,m,fa,D,G,C,Co;
	    			while(rs.next()) {
	    				
	    				f=rs.getString(1);
	    				l=rs.getString(2);
	    				m=rs.getString(3);
	    				fa=rs.getString(4);
	    				D=rs.getString(5);
	    				G=rs.getString(6);
	    				C=rs.getString(7);
	    				Co=rs.getString(8);
	    			
	    				String[]rowStrings= {f,l,m,fa,D,G,C,Co};
	    				tbl.addRow(rowStrings);
	    			}
	    			St.close();
	    			connection.close();
	    		} catch (Exception e1) {
	    			// TODO: handle exception
	    			e1.printStackTrace();
	    		}
		}
	     public void P_ADressupdate(){
			
	     try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
	    		String sql="update studentAddres set House_no=?,Landmark=?,City=?,Distric=?,State=?,PostOffice=? ,Pincode=? ,Mobile_no=? where State = ?";
	    		PreparedStatement Ps=conn.prepareStatement(sql);
	    		 Ps.setString(1, texthous.getText()); 
				 Ps.setString(2, textland.getText());
				 Ps.setString(3, textcity.getText());
				 Ps.setString(4, textDistric.getText());
				 Ps.setString(5, textState.getText());
				 Ps.setString(6, textpost.getText());
				 Ps.setString(7, textpin.getText());
				 Ps.setString(8, textMobile.getText());
				 Ps.setString(9, textState.getText());
				 
				 Ps.executeUpdate();
 		JOptionPane.showMessageDialog(null, "Profile is Updeted Sucsesfuly....");
 		conn.close();
 		}
	    	  catch (Exception e2) {
				e2.printStackTrace();
			}
	     }
	     public void Co_adress() {
	    	 try {
	    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
	    			Statement St=connection.createStatement() ;
	    			String qString="select * from  Co_studentAddres";
	    			ResultSet rs=St.executeQuery(qString); 
	    			ResultSetMetaData rsmd=rs.getMetaData();
	    			DefaultTableModel tbl=(DefaultTableModel)table_2.getModel(); 
	    			int cols=rsmd.getColumnCount();
	    			String[] coolName=new String[cols];
	    			for(int i=0;i<cols;i++)
	    			coolName[i]=rsmd.getColumnName(i+1);
	    			tbl.setColumnIdentifiers(coolName);
	    			String f,l,m,fa,D,G,C,Co;
	    			while(rs.next()) {
	    				
	    				f=rs.getString(1);
	    				l=rs.getString(2);
	    				m=rs.getString(3);
	    				fa=rs.getString(4);
	    				D=rs.getString(5);
	    				G=rs.getString(6);
	    				C=rs.getString(7);
	    				Co=rs.getString(8);
	    			
	    				String[]rowStrings= {f,l,m,fa,D,G,C,Co};
	    				tbl.addRow(rowStrings);
	    			}
	    			St.close();
	    			connection.close();
	    		} catch (Exception e1) {
	    			// TODO: handle exception
	    			e1.printStackTrace();
	    		}
		}
	     public void Co_ADressupdate(){
			
	     try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
	    		String sql="update Co_studentAddres set House_no=?,Landmark=?,City=?,Distric=?,State=?,PostOffice=? ,Pincode=? ,Mobile_no=? where State = ?";
	    		PreparedStatement Ps=conn.prepareStatement(sql);
	    		 Ps.setString(1, textCo_House.getText()); 
				 Ps.setString(2, textCo_land.getText());
				 Ps.setString(3, textCo_city.getText());
				 Ps.setString(4, textCo_Distric.getText());
				 Ps.setString(5, textCo_state.getText());
				 Ps.setString(6, textCo_post.getText());
				 Ps.setString(7, textCo_pin.getText());
				 Ps.setString(8, textCo_mobile.getText());
				 Ps.setString(9, textCo_state.getText());
				 
				 Ps.executeUpdate();
 		JOptionPane.showMessageDialog(null, "Co_Address is Updeted Sucsesfuly....");
 		conn.close();
 		}
	    	  catch (Exception e2) {
				e2.printStackTrace();
			}
	     }
	     public void Qulification() {
	    	 try {
	    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
	    			Statement St=connection.createStatement() ;
	    			String qString="select Name_of_collage_U,Examination_course,Roll_no,Bord_universcty,Passing_year,Persentage from  Qulification";
	    			ResultSet rs=St.executeQuery(qString); 
	    			ResultSetMetaData rsmd=rs.getMetaData();
	    			DefaultTableModel tbl=(DefaultTableModel)table_3.getModel(); 
	    			int cols=rsmd.getColumnCount();
	    			String[] coolName=new String[cols];
	    			for(int i=0;i<cols;i++)
	    			coolName[i]=rsmd.getColumnName(i+1);
	    			tbl.setColumnIdentifiers(coolName);
	    			String f,l,m,fa,fag,roll;
	    			while(rs.next()) {
	    				
	    				f=rs.getString(1);
	    				l=rs.getString(2);
	    				m=rs.getString(3);
	    				fa=rs.getString(4);
	    				fag=rs.getString(5);
	    				roll=rs.getString(6);
	    				String[]rowStrings= {f,l,m,fa,fag,roll};
	    				tbl.addRow(rowStrings);
	    			}
	    			St.close();
	    			connection.close();
	    		} catch (Exception e1) {
	    			// TODO: handle exception
	    			e1.printStackTrace();
	    		}
		}
	     public void Qulifictionup(){
			
	     try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
	    		String sql="update Qulification set Name_of_collage_U=?,Examination_course=?,Roll_no=?,Bord_universcty=?,Passing_year=?,Persentage=? where Examination_course = ?";
	    		PreparedStatement Ps=conn.prepareStatement(sql);
	    		 Ps.setString(1, text_H_C_U.getText()); 
				 Ps.setString(2, text_H_C_U_bord.getText());
				 Ps.setString(3, text_H_C_U_Co.getText());
				 Ps.setString(4, text_H_C_U_roll.getText());
				 Ps.setString(5, text_H_C_U_Pass.getText());
				 Ps.setString(6, text_H_C_U_Persen.getText());
				 Ps.setString(7, text_H_C_U_Co.getText());
				 
				 Ps.executeUpdate();
 		JOptionPane.showMessageDialog(null, "Qulificatin Details is Updeted Sucsesfuly....");
 		conn.close();
 		}
	    	  catch (Exception e2) {
				e2.printStackTrace();
			}
	     }
	    public static void main(String[] args){
	        new NewStudent();
	    }
	   }

