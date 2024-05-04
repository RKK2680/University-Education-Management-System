package pdf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import userdetails.project;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class p2 extends JFrame {
     JLabel label;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField txtLandmark_1;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField txtMobileNo;
	private JTextField txtPostOffice;
	private JTextField txtDistrict;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField txtHouseFlaetNo_1;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField txtPinCode;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField txtLandmark;
	private JTextField txtDistrict_1;
	private JTextField txtPostOffice_1;
	private JTextField txtMobileNo_1;
	private JTextField textField_49;
	private JTextField txtPinCode_1;
	private JTextField txtState_1;
	private JTextField txtCity_1;
	private JTextField txtHouseFlaetNo;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_22;
	private JTextField textField_57;
	private JTextField txtExaminationcourse;
	private JTextField txtBoardUniversity;
	private JTextField txtNameOfCollage;
	private JTextField txtPassingYear;
	private JTextField txtTotalMaks;
	private JTextField txtObtainMaks;
	private JTextField txtPercentage;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_100;
	private JButton btnNewButton_3;
    String s;
    private JPanel panel_1;
    private JLabel EraLogo;
    private JLabel lblNewLabel;
    private JLabel lblSarfarazganjHardoiRoad;
	private String path;
	private JTextField txtPhoto;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p2 frame = new p2();
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
	public p2() {
		setTitle("Offfline Addmision");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education Management System\\img\\contet.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1372, 882);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 153));
		panel.setBounds(23, 10, 1313, 805);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setText("Personal Details");
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(37, 150, 208, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Fist Name:*");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(309, 183, 124, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("DOB*");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(308, 213, 125, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(443, 213, 155, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(443, 183, 155, 20);
		panel.add(textField_6);
		
		JRadioButton rdbtnNewRadioButtonMale = new JRadioButton("Male");
		rdbtnNewRadioButtonMale.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButtonMale.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButtonMale.setBounds(460, 242, 108, 23);
		panel.add(rdbtnNewRadioButtonMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnFemale.setBounds(460, 274, 108, 23);
		panel.add(rdbtnFemale);
		
		textField_7 = new JTextField();
		textField_7.setText("Gender*");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(309, 243, 124, 36);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("Last Name:*");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(608, 183, 118, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("Mother Name:*");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(601, 213, 124, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("Father Name:*");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(608, 245, 124, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("Cast*");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(608, 274, 135, 22);
		panel.add(textField_11);
		
		JComboBox comboBoxCast = new JComboBox();
		comboBoxCast.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxCast.setBounds(745, 274, 145, 22);
		panel.add(comboBoxCast);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_12.setColumns(10);
		textField_12.setBounds(735, 247, 155, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_13.setColumns(10);
		textField_13.setBounds(735, 213, 155, 20);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_14.setColumns(10);
		textField_14.setBounds(736, 183, 149, 20);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("Mobile NO:*");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(892, 181, 124, 20);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("Email Id");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(900, 213, 124, 20);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("Select Course*");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(900, 244, 135, 22);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("Select Document ID*");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(910, 275, 147, 20);
		panel.add(textField_18);
		
		JComboBox comboBox_2Document = new JComboBox();
		comboBox_2Document.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_2Document.setBounds(1059, 274, 123, 22);
		panel.add(comboBox_2Document);
		
		JComboBox comboBox_1BCA = new JComboBox();
		comboBox_1BCA.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_1BCA.setBounds(1049, 243, 145, 22);
		panel.add(comboBox_1BCA);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_19.setColumns(10);
		textField_19.setBounds(1028, 215, 199, 20);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_20.setColumns(10);
		textField_20.setBounds(1020, 183, 199, 20);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText("Address");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(37, 326, 199, 20);
		panel.add(textField_21);
		
		textField_23 = new JTextField();
		textField_23.setText("Permanent Address");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(270, 344, 139, 20);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText(" Correspondence Address");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(778, 344, 186, 20);
		panel.add(textField_24);
		
		txtLandmark_1 = new JTextField();
		txtLandmark_1.setText("Landmark*");
		txtLandmark_1.setHorizontalAlignment(SwingConstants.LEFT);
		txtLandmark_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtLandmark_1.setEditable(false);
		txtLandmark_1.setColumns(10);
		txtLandmark_1.setBounds(924, 375, 86, 20);
		panel.add(txtLandmark_1);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_26.setColumns(10);
		textField_26.setBounds(1017, 376, 165, 20);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_27.setColumns(10);
		textField_27.setBounds(1017, 406, 165, 20);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_28.setColumns(10);
		textField_28.setBounds(1017, 437, 165, 20);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_29.setColumns(10);
		textField_29.setBounds(1017, 470, 165, 20);
		panel.add(textField_29);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setText("Mobile No*");
		txtMobileNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtMobileNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtMobileNo.setEditable(false);
		txtMobileNo.setColumns(10);
		txtMobileNo.setBounds(924, 469, 86, 20);
		panel.add(txtMobileNo);
		
		txtPostOffice = new JTextField();
		txtPostOffice.setText("Post Office*");
		txtPostOffice.setHorizontalAlignment(SwingConstants.CENTER);
		txtPostOffice.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPostOffice.setEditable(false);
		txtPostOffice.setColumns(10);
		txtPostOffice.setBounds(924, 437, 86, 20);
		panel.add(txtPostOffice);
		
		txtDistrict = new JTextField();
		txtDistrict.setText("District*");
		txtDistrict.setHorizontalAlignment(SwingConstants.CENTER);
		txtDistrict.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtDistrict.setEditable(false);
		txtDistrict.setColumns(10);
		txtDistrict.setBounds(924, 406, 83, 20);
		panel.add(txtDistrict);
		
		textField_33 = new JTextField();
		textField_33.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_33.setColumns(10);
		textField_33.setBounds(746, 406, 155, 20);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_34.setColumns(10);
		textField_34.setBounds(791, 375, 110, 20);
		panel.add(textField_34);
		
		txtHouseFlaetNo_1 = new JTextField();
		txtHouseFlaetNo_1.setText("House/ Flaet No*");
		txtHouseFlaetNo_1.setHorizontalAlignment(SwingConstants.LEFT);
		txtHouseFlaetNo_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtHouseFlaetNo_1.setEditable(false);
		txtHouseFlaetNo_1.setColumns(10);
		txtHouseFlaetNo_1.setBounds(663, 375, 118, 20);
		panel.add(txtHouseFlaetNo_1);
		
		txtCity = new JTextField();
		txtCity.setText("City*");
		txtCity.setHorizontalAlignment(SwingConstants.CENTER);
		txtCity.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtCity.setEditable(false);
		txtCity.setColumns(10);
		txtCity.setBounds(663, 406, 73, 20);
		panel.add(txtCity);
		
		txtState = new JTextField();
		txtState.setText("State*");
		txtState.setHorizontalAlignment(SwingConstants.CENTER);
		txtState.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtState.setEditable(false);
		txtState.setColumns(10);
		txtState.setBounds(663, 437, 73, 20);
		panel.add(txtState);
		
		textField_38 = new JTextField();
		textField_38.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_38.setColumns(10);
		textField_38.setBounds(746, 437, 155, 20);
		panel.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_39.setColumns(10);
		textField_39.setBounds(746, 470, 155, 20);
		panel.add(textField_39);
		
		txtPinCode = new JTextField();
		txtPinCode.setText("Pin Code*");
		txtPinCode.setHorizontalAlignment(SwingConstants.CENTER);
		txtPinCode.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPinCode.setEditable(false);
		txtPinCode.setColumns(10);
		txtPinCode.setBounds(663, 469, 73, 20);
		panel.add(txtPinCode);
		
		textField_41 = new JTextField();
		textField_41.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_41.setColumns(10);
		textField_41.setBounds(445, 469, 167, 20);
		panel.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_42.setColumns(10);
		textField_42.setBounds(445, 438, 165, 20);
		panel.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_43.setColumns(10);
		textField_43.setBounds(447, 406, 165, 20);
		panel.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_44.setColumns(10);
		textField_44.setBounds(447, 376, 165, 20);
		panel.add(textField_44);
		
		txtLandmark = new JTextField();
		txtLandmark.setText("Landmark*");
		txtLandmark.setHorizontalAlignment(SwingConstants.LEFT);
		txtLandmark.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtLandmark.setEditable(false);
		txtLandmark.setColumns(10);
		txtLandmark.setBounds(360, 375, 83, 20);
		panel.add(txtLandmark);
		
		txtDistrict_1 = new JTextField();
		txtDistrict_1.setText("District*");
		txtDistrict_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtDistrict_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtDistrict_1.setEditable(false);
		txtDistrict_1.setColumns(10);
		txtDistrict_1.setBounds(357, 406, 86, 20);
		panel.add(txtDistrict_1);
		
		txtPostOffice_1 = new JTextField();
		txtPostOffice_1.setText("Post Office*");
		txtPostOffice_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPostOffice_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPostOffice_1.setEditable(false);
		txtPostOffice_1.setColumns(10);
		txtPostOffice_1.setBounds(357, 437, 86, 20);
		panel.add(txtPostOffice_1);
		
		txtMobileNo_1 = new JTextField();
		txtMobileNo_1.setText("Mobile No*");
		txtMobileNo_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtMobileNo_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtMobileNo_1.setEditable(false);
		txtMobileNo_1.setColumns(10);
		txtMobileNo_1.setBounds(357, 468, 86, 20);
		panel.add(txtMobileNo_1);
		
		textField_49 = new JTextField();
		textField_49.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_49.setColumns(10);
		textField_49.setBounds(200, 468, 155, 20);
		panel.add(textField_49);
		
		txtPinCode_1 = new JTextField();
		txtPinCode_1.setText("Pin Code*");
		txtPinCode_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPinCode_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPinCode_1.setEditable(false);
		txtPinCode_1.setColumns(10);
		txtPinCode_1.setBounds(124, 469, 73, 20);
		panel.add(txtPinCode_1);
		
		txtState_1 = new JTextField();
		txtState_1.setText("State*");
		txtState_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtState_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtState_1.setEditable(false);
		txtState_1.setColumns(10);
		txtState_1.setBounds(124, 437, 73, 20);
		panel.add(txtState_1);
		
		txtCity_1 = new JTextField();
		txtCity_1.setText("City*");
		txtCity_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtCity_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtCity_1.setEditable(false);
		txtCity_1.setColumns(10);
		txtCity_1.setBounds(124, 406, 73, 20);
		panel.add(txtCity_1);
		
		txtHouseFlaetNo = new JTextField();
		txtHouseFlaetNo.setText("House/ Flaet No*");
		txtHouseFlaetNo.setHorizontalAlignment(SwingConstants.LEFT);
		txtHouseFlaetNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtHouseFlaetNo.setEditable(false);
		txtHouseFlaetNo.setColumns(10);
		txtHouseFlaetNo.setBounds(124, 375, 118, 20);
		panel.add(txtHouseFlaetNo);
		
		textField_54 = new JTextField();
		textField_54.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_54.setColumns(10);
		textField_54.setBounds(243, 375, 110, 20);
		panel.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_55.setColumns(10);
		textField_55.setBounds(200, 406, 155, 20);
		panel.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_56.setColumns(10);
		textField_56.setBounds(200, 438, 155, 20);
		panel.add(textField_56);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBackground(new Color(250, 235, 215));
		textField_22.setBounds(37, 346, 1205, 156);
		panel.add(textField_22);
		
		textField_57 = new JTextField();
		textField_57.setText("Educational Details");
		textField_57.setHorizontalAlignment(SwingConstants.CENTER);
		textField_57.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_57.setEditable(false);
		textField_57.setColumns(10);
		textField_57.setBounds(37, 502, 193, 20);
		panel.add(textField_57);
		
		txtExaminationcourse = new JTextField();
		txtExaminationcourse.setText("Examination/Course*");
		txtExaminationcourse.setHorizontalAlignment(SwingConstants.CENTER);
		txtExaminationcourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtExaminationcourse.setEditable(false);
		txtExaminationcourse.setColumns(10);
		txtExaminationcourse.setBounds(80, 531, 180, 22);
		panel.add(txtExaminationcourse);
		
		txtBoardUniversity = new JTextField();
		txtBoardUniversity.setText(" Board / University*");
		txtBoardUniversity.setHorizontalAlignment(SwingConstants.CENTER);
		txtBoardUniversity.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtBoardUniversity.setEditable(false);
		txtBoardUniversity.setColumns(10);
		txtBoardUniversity.setBounds(270, 531, 208, 22);
		panel.add(txtBoardUniversity);
		
		txtNameOfCollage = new JTextField();
		txtNameOfCollage.setText("Name of Collage/ University*");
		txtNameOfCollage.setHorizontalAlignment(SwingConstants.CENTER);
		txtNameOfCollage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtNameOfCollage.setEditable(false);
		txtNameOfCollage.setColumns(10);
		txtNameOfCollage.setBounds(485, 531, 208, 23);
		panel.add(txtNameOfCollage);
		
		txtPassingYear = new JTextField();
		txtPassingYear.setText("Passing Year*");
		txtPassingYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassingYear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPassingYear.setEditable(false);
		txtPassingYear.setColumns(10);
		txtPassingYear.setBounds(703, 533, 98, 24);
		panel.add(txtPassingYear);
		
		txtTotalMaks = new JTextField();
		txtTotalMaks.setText("Total Maks*");
		txtTotalMaks.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalMaks.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtTotalMaks.setEditable(false);
		txtTotalMaks.setColumns(10);
		txtTotalMaks.setBounds(807, 533, 86, 23);
		panel.add(txtTotalMaks);
		
		txtObtainMaks = new JTextField();
		txtObtainMaks.setText("Obtain Maks*");
		txtObtainMaks.setHorizontalAlignment(SwingConstants.CENTER);
		txtObtainMaks.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtObtainMaks.setEditable(false);
		txtObtainMaks.setColumns(10);
		txtObtainMaks.setBounds(903, 531, 95, 24);
		panel.add(txtObtainMaks);
		
		txtPercentage = new JTextField();
		txtPercentage.setText("Percentage*");
		txtPercentage.setHorizontalAlignment(SwingConstants.CENTER);
		txtPercentage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPercentage.setEditable(false);
		txtPercentage.setColumns(10);
		txtPercentage.setBounds(999, 531, 95, 23);
		panel.add(txtPercentage);
		
		textField_65 = new JTextField();
		textField_65.setText("CGPA");
		textField_65.setHorizontalAlignment(SwingConstants.CENTER);
		textField_65.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_65.setEditable(false);
		textField_65.setColumns(10);
		textField_65.setBounds(1099, 531, 95, 24);
		panel.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_66.setColumns(10);
		textField_66.setBounds(1096, 563, 86, 20);
		panel.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_67.setColumns(10);
		textField_67.setBounds(1096, 585, 86, 20);
		panel.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_68.setColumns(10);
		textField_68.setBounds(1096, 606, 86, 20);
		panel.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_69.setColumns(10);
		textField_69.setBounds(1096, 628, 86, 20);
		panel.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_70.setColumns(10);
		textField_70.setBounds(999, 628, 86, 20);
		panel.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_71.setColumns(10);
		textField_71.setBounds(999, 606, 86, 20);
		panel.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_72.setColumns(10);
		textField_72.setBounds(999, 585, 86, 20);
		panel.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_73.setColumns(10);
		textField_73.setBounds(999, 563, 86, 20);
		panel.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_74.setColumns(10);
		textField_74.setBounds(903, 563, 86, 20);
		panel.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_75.setColumns(10);
		textField_75.setBounds(903, 585, 86, 20);
		panel.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_76.setColumns(10);
		textField_76.setBounds(903, 606, 86, 20);
		panel.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_77.setColumns(10);
		textField_77.setBounds(903, 628, 86, 20);
		panel.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_78.setColumns(10);
		textField_78.setBounds(806, 628, 86, 20);
		panel.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_79.setColumns(10);
		textField_79.setBounds(806, 606, 86, 20);
		panel.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_80.setColumns(10);
		textField_80.setBounds(806, 585, 86, 20);
		panel.add(textField_80);
		
		textField_81 = new JTextField();
		textField_81.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_81.setColumns(10);
		textField_81.setBounds(806, 563, 86, 20);
		panel.add(textField_81);
		
		textField_82 = new JTextField();
		textField_82.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_82.setColumns(10);
		textField_82.setBounds(705, 563, 98, 20);
		panel.add(textField_82);
		
		textField_83 = new JTextField();
		textField_83.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_83.setColumns(10);
		textField_83.setBounds(705, 585, 98, 20);
		panel.add(textField_83);
		
		textField_84 = new JTextField();
		textField_84.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_84.setColumns(10);
		textField_84.setBounds(705, 606, 98, 20);
		panel.add(textField_84);
		
		textField_85 = new JTextField();
		textField_85.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_85.setColumns(10);
		textField_85.setBounds(705, 628, 98, 20);
		panel.add(textField_85);
		
		textField_86 = new JTextField();
		textField_86.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_86.setColumns(10);
		textField_86.setBounds(487, 629, 193, 20);
		panel.add(textField_86);
		
		textField_87 = new JTextField();
		textField_87.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_87.setColumns(10);
		textField_87.setBounds(487, 607, 193, 20);
		panel.add(textField_87);
		
		textField_88 = new JTextField();
		textField_88.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_88.setColumns(10);
		textField_88.setBounds(487, 586, 193, 20);
		panel.add(textField_88);
		
		textField_89 = new JTextField();
		textField_89.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_89.setColumns(10);
		textField_89.setBounds(487, 564, 193, 20);
		panel.add(textField_89);
		
		textField_90 = new JTextField();
		textField_90.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_90.setColumns(10);
		textField_90.setBounds(284, 564, 193, 20);
		panel.add(textField_90);
		
		textField_91 = new JTextField();
		textField_91.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_91.setColumns(10);
		textField_91.setBounds(284, 586, 193, 20);
		panel.add(textField_91);
		
		textField_92 = new JTextField();
		textField_92.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_92.setColumns(10);
		textField_92.setBounds(284, 607, 193, 20);
		panel.add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_93.setColumns(10);
		textField_93.setBounds(284, 629, 193, 20);
		panel.add(textField_93);
		
		textField_94 = new JTextField();
		textField_94.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_94.setColumns(10);
		textField_94.setBounds(81, 628, 193, 20);
		panel.add(textField_94);
		
		textField_95 = new JTextField();
		textField_95.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_95.setColumns(10);
		textField_95.setBounds(81, 606, 193, 20);
		panel.add(textField_95);
		
		textField_96 = new JTextField();
		textField_96.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_96.setColumns(10);
		textField_96.setBounds(81, 585, 193, 20);
		panel.add(textField_96);
		
		textField_97 = new JTextField();
		textField_97.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_97.setColumns(10);
		textField_97.setBounds(81, 564, 193, 20);
		panel.add(textField_97);
		
		textField_98 = new JTextField();
		textField_98.setEditable(false);
		textField_98.setColumns(10);
		textField_98.setBackground(new Color(250, 235, 215));
		textField_98.setBounds(37, 523, 1205, 135);
		panel.add(textField_98);
		
		textField_99 = new JTextField();
		textField_99.setText("Upload Document");
		textField_99.setHorizontalAlignment(SwingConstants.CENTER);
		textField_99.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_99.setEditable(false);
		textField_99.setColumns(10);
		textField_99.setBounds(37, 658, 193, 20);
		panel.add(textField_99);
		
		JButton btnPhoto = new JButton("Photo*");
		btnPhoto.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnPhoto.setBounds(107, 688, 83, 20);
		panel.add(btnPhoto);
		
		JButton btnNewButton_2 = new JButton("View");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBounds(107, 720, 78, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("View");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_4.setBounds(295, 720, 89, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Signature*");
		btnNewButton_4_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_4_1.setBounds(295, 689, 108, 23);
		panel.add(btnNewButton_4_1);
		
		JButton btnNewButton_6_1 = new JButton("10th Marksheet*");
		btnNewButton_6_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_6_1.setBounds(467, 689, 145, 23);
		panel.add(btnNewButton_6_1);
		
		JButton btnNewButton_6 = new JButton("View");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_6.setBounds(477, 720, 83, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("View");
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_8.setBounds(665, 720, 67, 23);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("12th Marksheet*");
		btnNewButton_8_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_8_1.setBounds(651, 689, 145, 23);
		panel.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("UG/PG Degree");
		btnNewButton_8_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_8_2.setBounds(818, 688, 146, 23);
		panel.add(btnNewButton_8_2);
		
		JButton btnNewButton_8_3 = new JButton("View");
		btnNewButton_8_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_8_3.setBounds(822, 720, 67, 23);
		panel.add(btnNewButton_8_3);
		
		JButton btnNewButton_8_4 = new JButton("Goverment id proof*");
		btnNewButton_8_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_8_4.setBounds(999, 690, 164, 23);
		panel.add(btnNewButton_8_4);
		
		JButton btnNewButton_10 = new JButton("View");
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_10.setBounds(1024, 720, 70, 23);
		panel.add(btnNewButton_10);
		
		textField_100 = new JTextField();
		textField_100.setEditable(false);
		textField_100.setColumns(10);
		textField_100.setBackground(new Color(250, 235, 215));
		textField_100.setBounds(37, 679, 1205, 84);
		panel.add(textField_100);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBounds(0, 0, 1313, 147);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		EraLogo = new JLabel();
		path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
	    EraLogo.setBounds(37, 10, 201, 127);
	    ImageIcon imageIcon1=new ImageIcon(path);
		Image imgImage1=imageIcon1.getImage();
		Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image1=new ImageIcon(newiImage1);
		EraLogo.setIcon(image1);
		panel_1.add(EraLogo);
		
		lblNewLabel = new JLabel("Era University Lucknow");
		lblNewLabel.setBounds(297, 10, 782, 62);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 60));
		panel_1.add(lblNewLabel);
		
		lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
		lblSarfarazganjHardoiRoad.setBounds(284, 68, 783, 35);
		lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
		lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel_1.add(lblSarfarazganjHardoiRoad);
		
		JLabel lblOfflineAdmissionForm = new JLabel("Offline Admission Form");
		lblOfflineAdmissionForm.setBounds(284, 102, 783, 35);
		lblOfflineAdmissionForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfflineAdmissionForm.setForeground(new Color(0, 0, 0));
		lblOfflineAdmissionForm.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_1.add(lblOfflineAdmissionForm);
		
		btnNewButton_3 = new JButton("Dawnload");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_3.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\Downloads-Folder-icon.png"));
		btnNewButton_3.setBounds(1142, 10, 161, 36);
		panel_1.add(btnNewButton_3);
		btnNewButton_3.setBackground(new Color(51, 255, 102));
		btnNewButton_3.addActionListener(new ActionListener() {
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
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
		JButton btnNewButton_3_1 = new JButton("Exit");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				project.main(null);
				dispose();
			}
		});
		btnNewButton_3_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_3_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_3_1.setBackground(new Color(255, 0, 0));
		btnNewButton_3_1.setBounds(1142, 68, 161, 36);
		panel_1.add(btnNewButton_3_1);
		
		txtPhoto = new JTextField();
		txtPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhoto.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPhoto.setText("Photo");
		txtPhoto.setBounds(80, 180, 165, 136);
		panel.add(txtPhoto);
		txtPhoto.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(250, 235, 215));
		textField_1.setBounds(37, 171, 1205, 156);
		panel.add(textField_1);
		

	}
	 public ImageIcon ResizeImage(String ImagePath)
	    {
	        ImageIcon MyImage = new ImageIcon(ImagePath);
	        Image img = MyImage.getImage();
	        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
	        ImageIcon image = new ImageIcon(newImg);
	        return image;
	    }
}
