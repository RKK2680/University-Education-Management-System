package userdetails;

import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.SizeRequirements;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.print.attribute.Size2DSyntax;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Set;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTree;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JSplitPane;
import javax.swing.DropMode;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;
import javax.swing.plaf.DesktopIconUI;

import Home.HomeM;
import Model.Resultview;
import Model.StudentIcard;
import Model.icard;
import Model.stdATENDENS;
import Payment.AdminLogin;
import Payment.FeePayment;
import pdf.ComLabInofo;
import pdf.p2;
import pdf.viewRecipt;

import javax.swing.JTextPane;
import javax.swing.JPanel;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import com.jgoodies.looks.plastic.PlasticXPSpinnerUI;
import javax.swing.border.MatteBorder;

public class project {
	
	private JFrame frmWelcomeHomePage;
	private JComboBox comboBox_3;
	private JMenuItem mntmNewMenuItem;
	private JTextField textName;
	private JTextField textEmail;
	private JTextField textMobile;
	private JTextField textField_9;
	private JButton btnHome;
	private JFrame frame;
	private JButton btnPyment;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JPanel panel_1;
	private JLabel EraLogo;
	private String path;
	private JLabel lblNewLabel_7;
	private JLabel EraLogo_1;
	private JLabel lblNewLabel_8;
	private JLabel EraLogo_2;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JButton btnLabInfo;
	private JTextArea textQuery;
	private JButton btnResult;

	/**
	 * Launch the application.
	 */
	public static void main(String arg[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project window = new project();
					window.frmWelcomeHomePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public project() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.displayable
	 */
	private void initialize() {
		
		frmWelcomeHomePage = new JFrame();
		frmWelcomeHomePage.getContentPane().setEnabled(false);
		frmWelcomeHomePage.setBackground(new Color(147, 112, 219));
		frmWelcomeHomePage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmWelcomeHomePage.setType(Type.UTILITY);
		frmWelcomeHomePage.setFont(new Font("Bell MT", Font.BOLD, 15));
		frmWelcomeHomePage.setTitle("Welcome Home Page");
		frmWelcomeHomePage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\eclipse-workspace\\Education Management System\\img\\home-icon.png"));
		frmWelcomeHomePage.getContentPane().setBackground(new Color(135, 206, 235));
		frmWelcomeHomePage.setSize(1606, 882);
		
		/*JTextField lblNewLabel = new JTextField("");
		lblNewLabel.setBounds(20, 11, 211, 132);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel.setEditable(false);
		lblNewLabel.setBackground(new Color(255, 250, 250));
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 99));*/
		frmWelcomeHomePage.getContentPane().setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("                Abut Details");
		internalFrame.setBounds(10, 250, 250, 551);
		internalFrame.getContentPane().setBackground(new Color(224, 255, 255));
		internalFrame.getContentPane().setLayout(null);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Syllabus", "Time Table", "Students Evants"}));
		comboBox_4.setBackground(new Color(255, 218, 185));
		comboBox_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_4.setBounds(10, 131, 154, 22);
		internalFrame.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_4_1_1 = new JComboBox();
		comboBox_4_1_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
							
						if (comboBox_4_1_1.getSelectedItem()=="Select") {
								viewImage.main(null);
								show();
							}
						
						if (comboBox_4_1_1.getSelectedItem()=="Offline Admission Form") {
							p2.main(null);
							show();
						}
						if (comboBox_4_1_1.getSelectedItem()=="Student Identity Card (I Card)") {
							icard.main(null);
							show();
						}
						if (comboBox_4_1_1.getSelectedItem()=="Fee Recipt") {
							viewRecipt.main(null);
							show();
							
						}
						
			}
		});
		comboBox_4_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fee Recipt ", "Offline Admission Form", "Student Identity Card (I Card)"}));
		comboBox_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_4_1_1.setBackground(new Color(255, 218, 185));
		comboBox_4_1_1.setBounds(10, 203, 154, 22);
		internalFrame.getContentPane().add(comboBox_4_1_1);
		
		JComboBox comboBox_4_1_1_1 = new JComboBox();
		comboBox_4_1_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
							
						if (comboBox_4_1_1.getSelectedItem()=="Select") {
								
							}
						
						if (comboBox_4_1_1.getSelectedItem()=="Wipro") {
							
								
									//java.awt.Desktop.getDesktop().browse(new URL("https://twitter.com").toURI());
								
							
					
						}
						if (comboBox_4_1_1.getSelectedItem()=="TCS") {
							try {
								  java.awt.Desktop.getDesktop().browse(new URL("https://twitter.com").toURI());
							}
							catch(Exception e1) {
								
							}
					
						}
						if (comboBox_4_1_1.getSelectedItem()=="Fee Recipt") {
							try {
								  java.awt.Desktop.getDesktop().browse(new URL("Amazone").toURI());
							}
							catch(Exception e1) {
								
							}
					
							
						}
						if (comboBox_4_1_1.getSelectedItem()=="Google") {
							try {
								  java.awt.Desktop.getDesktop().browse(new URL("Google").toURI());
							}
							catch(Exception e1) {
								
							}
					
							
						}
						
			}
		});
		comboBox_4_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select","Wipro", "TCS", "Amazone", "Google"}));
		comboBox_4_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_4_1_1_1.setBackground(new Color(255, 218, 185));
		comboBox_4_1_1_1.setBounds(10, 277, 154, 22);
		internalFrame.getContentPane().add(comboBox_4_1_1_1);
		
		JComboBox comboBox_4_1_1_2 = new JComboBox();
		comboBox_4_1_1_2.setModel(new DefaultComboBoxModel(new String[] {"Criket", "Vollyboll", "Footboll", "Badmintan", "Kho Kho", "Ches", "basketball", "tennis", "running", "table tennis"}));
		comboBox_4_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_4_1_1_2.setBackground(new Color(255, 218, 185));
		comboBox_4_1_1_2.setBounds(10, 349, 154, 22);
		internalFrame.getContentPane().add(comboBox_4_1_1_2);
		
		JButton btnNewButton_1 = new JButton("Help");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help.main(null);
			}
		});
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 204, 51), new Color(204, 255, 0), new Color(153, 0, 102), new Color(255, 204, 0)));
		btnNewButton_1.setBackground(new Color(204, 255, 153));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 402, 89, 23);
		internalFrame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_9 = new JLabel("Students");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_9.setBackground(new Color(255, 182, 193));
		lblNewLabel_9.setBounds(10, 94, 105, 27);
		internalFrame.getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_11 = new JLabel(" Downloads");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_11.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_11.setBackground(new Color(255, 182, 193));
		lblNewLabel_11.setBounds(10, 174, 154, 27);
		internalFrame.getContentPane().add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Placements");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_12.setBackground(new Color(255, 182, 193));
		lblNewLabel_12.setBounds(10, 247, 154, 27);
		internalFrame.getContentPane().add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Sports");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_13.setBackground(new Color(255, 182, 193));
		lblNewLabel_13.setBounds(10, 320, 154, 27);
		internalFrame.getContentPane().add(lblNewLabel_13);
		
		btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.main(null);
				
			}
		});
		btnResult.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnResult.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 255), new Color(30, 144, 255), new Color(255, 127, 80), new Color(124, 252, 0)));
		btnResult.setBackground(new Color(255, 192, 203));
		btnResult.setBounds(16, 46, 148, 23);
		internalFrame.getContentPane().add(btnResult);
		internalFrame.setBorder(new LineBorder(new Color(0, 102, 0), 4, true));
		internalFrame.setFrameIcon(new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\Education Management System\\img\\home-icon.png"));
		frmWelcomeHomePage.getContentPane().add(internalFrame);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 99, 71));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(10, 155, 1520, 85);
		frmWelcomeHomePage.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Select Department");
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_1.setBackground(new Color(255, 182, 193));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(161, 10, 177, 27);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(" Select Curriculum");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_2.setBackground(new Color(255, 182, 193));
		lblNewLabel_2.setBounds(365, 10, 177, 27);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		comboBox_1.setBounds(366, 47, 165, 22);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Undergraduate (UG)", "Post Graduate (PG)", "Doctor of Philosophy (PhD)s"}));
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_1.setBackground(new Color(255, 192, 203));
		
		lblNewLabel_3 = new JLabel("Faculty Details");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_3.setBackground(new Color(255, 182, 193));
		lblNewLabel_3.setBounds(577, 10, 177, 27);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Attendence Details");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_4.setBackground(new Color(255, 182, 193));
		lblNewLabel_4.setBounds(793, 10, 177, 27);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Lab Ditails");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_5.setBackground(new Color(255, 182, 193));
		lblNewLabel_5.setBounds(1030, 10, 177, 27);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Payment");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_6.setBackground(new Color(255, 182, 193));
		lblNewLabel_6.setBounds(1270, 10, 177, 27);
		panel.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		comboBox.setBounds(171, 47, 165, 22);
		panel.add(comboBox);
		comboBox.setBackground(new Color(255, 192, 203));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Computer Scinence Department", "Biotech Department", "Food & Nutrition", "Libral & Art", "Pharmecy", "Nursing"}));
		
		JButton btnFacultyDetails = new JButton("Faculty Details");
		btnFacultyDetails.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnFacultyDetails.setBounds(600, 48, 148, 21);
		panel.add(btnFacultyDetails);
		btnFacultyDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HODLogin1.main(null);
			}
		});
		btnFacultyDetails.setBackground(new Color(255, 192, 203));
		btnFacultyDetails.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		comboBox_3.setBounds(803, 47, 165, 22);
		panel.add(comboBox_3);
		comboBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (comboBox_3.getSelectedItem()=="Student Attendence") {
					StudentsAttendence.main(null);
					show();
					
				}
				if (comboBox_3.getSelectedItem()=="Techars Attendence") {
					FecultyLogin1.main(null);
					show();
				}
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"select", "Student Attendence", "Techars Attendence"}));
		comboBox_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_3.setBackground(new Color(255, 192, 203));
		
		btnHome = new JButton("Home");
		btnHome.setBounds(10, 22, 133, 35);
		panel.add(btnHome);
		btnHome.setBackground(new Color(147, 112, 219));
		btnHome.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 204), new Color(255, 51, 204), new Color(255, 102, 51), new Color(0, 153, 255)));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeM homeM=new HomeM();
				homeM.home();
			}
		});
		btnHome.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\home-icon.png"));
		btnHome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		btnPyment = new JButton("Payment");
		btnPyment.setBounds(1296, 43, 133, 28);
		panel.add(btnPyment);
		btnPyment.setBackground(new Color(102, 255, 153));
		btnPyment.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		btnPyment.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnPyment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeePayment fp =new FeePayment();
				fp.main(null);
			}
		});
		btnPyment.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		btnLabInfo = new JButton("Lab Info");
		btnLabInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ComLabInofo.main(null);
			}
		});
		btnLabInfo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLabInfo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnLabInfo.setBackground(new Color(255, 192, 203));
		btnLabInfo.setBounds(1040, 47, 148, 23);
		panel.add(btnLabInfo);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(10, 10, 1520, 143);
		frmWelcomeHomePage.getContentPane().add(panel_1);
		EraLogo = new JLabel();
	    path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
	    EraLogo.setBounds(20, 10, 202, 123);
	    ImageIcon imageIcon=new ImageIcon(path);
		Image imgImage=imageIcon.getImage();
		Image newiImage=imgImage.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image=new ImageIcon(newiImage);
		EraLogo.setIcon(image);
	    panel_1.add(EraLogo);
		panel_1.setLayout(null);
		
		lblNewLabel_7 = new JLabel("  Era University, Lucknow");
		lblNewLabel_7.setBorder(new LineBorder(new Color(0, 0, 128), 5));
		lblNewLabel_7.setForeground(new Color(0, 0, 128));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_7.setBounds(242, 24, 632, 105);
		panel_1.add(lblNewLabel_7);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(1134, 38, 76, 60);
		panel_1.add(btnNewButton_5);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("E:\\eclipse-workspace\\Education Management System\\img\\Apps-Search-Log-icon.png"));
		
		textField_9 = new JTextField();
		textField_9.setBounds(947, 76, 156, 22);
		panel_1.add(textField_9);
		textField_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_9.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Search..........");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_8.setBackground(new Color(255, 182, 193));
		lblNewLabel_8.setBounds(947, 38, 177, 27);
		panel_1.add(lblNewLabel_8);
		
		EraLogo_1 = new JLabel();
		EraLogo_1.setBackground(new Color(152, 251, 152));
		EraLogo_1.setBounds(914, 10, 318, 130);
		panel_1.add(EraLogo_1);
		EraLogo_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		
		EraLogo_2 = new JLabel();
		EraLogo_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		EraLogo_2.setBackground(new Color(152, 251, 152));
		EraLogo_2.setBounds(1230, 10, 231, 130);
		panel_1.add(EraLogo_2);
		
		JButton btnNewButton_4 = new JButton("Log \r\nOut");
		btnNewButton_4.setBounds(1295, 50, 124, 48);
		panel_1.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logout logout=new Logout(null);
				logout.log();
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("E:\\eclipse-workspace\\Education Management System\\img\\cancel-icon.png"));
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_4.setBackground(new Color(255, 69, 0));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(152, 251, 152));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(1265, 250, 239, 101);
		frmWelcomeHomePage.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(75, 50, 92, 29);
		panel_2.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 51, 204), new Color(255, 102, 0), new Color(51, 102, 204), new Color(153, 102, 153)));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login rI=new Login();
						rI.main(null);	
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JButton btnNewButton_6 = new JButton("Regstretion");
		btnNewButton_6.setBounds(56, 11, 133, 29);
		panel_2.add(btnNewButton_6);
		btnNewButton_6.setBackground(new Color(153, 153, 255));
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
		btnNewButton_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 153), new Color(51, 255, 255), new Color(255, 255, 0), new Color(255, 153, 0)));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rebuttion.main(null);
				
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBackground(new Color(152, 251, 152));
		panel_3.setBounds(1265, 363, 255, 438);
		frmWelcomeHomePage.getContentPane().add(panel_3);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(29, 38, 62, 60);
		panel_3.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					  java.awt.Desktop.getDesktop().browse(new URL("https://www.google.com").toURI());
				}
				catch(Exception e1) {
					
				}
			}
		});
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setIcon(new ImageIcon("E:\\eclipse-workspace\\Education Management System\\img\\Google-Chrome-icon.png"));
		
		JButton btnNewButton_3_3 = new JButton("Google");
		btnNewButton_3_3.setBackground(new Color(175, 238, 238));
		btnNewButton_3_3.setBounds(102, 76, 126, 22);
		panel_3.add(btnNewButton_3_3);
		btnNewButton_3_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 153, 153), new Color(51, 255, 255), new Color(153, 102, 0), new Color(255, 255, 0)));
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					  java.awt.Desktop.getDesktop().browse(new URL("https://www.google.com").toURI());
				}
				catch(Exception e1) {
					
				}
			}
		});
		btnNewButton_3_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.setBounds(30, 123, 62, 60);
		panel_3.add(btnNewButton_3_1);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						  java.awt.Desktop.getDesktop().browse(new URL("https://web.whatsapp.com").toURI());
					}
					catch(Exception e1) {
						
					}
			}
		});
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_3_1.setIcon(new ImageIcon("E:\\eclipse-workspace\\Education Management System\\img\\Apps-Whatsapp-icon.png"));
		
		JButton btnNewButton_3_2 = new JButton("");
		btnNewButton_3_2.setBounds(30, 213, 62, 60);
		panel_3.add(btnNewButton_3_2);
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						  java.awt.Desktop.getDesktop().browse(new URL("https://twitter.com").toURI());
					}
					catch(Exception e1) {
						
					}
			}
		});
		btnNewButton_3_2.setIcon(new ImageIcon("E:\\eclipse-workspace\\Education Management System\\img\\Twitter-icon.png"));
		
		JButton btnNewButton_3_2_1 = new JButton("");
		btnNewButton_3_2_1.setBounds(29, 309, 62, 60);
		panel_3.add(btnNewButton_3_2_1);
		btnNewButton_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						  java.awt.Desktop.getDesktop().browse(new URL("https://www.youtube.com").toURI());
					}
					catch(Exception e1) {
						
					}
			}
		});
		btnNewButton_3_2_1.setIcon(new ImageIcon("E:\\eclipse-workspace\\Education Management System\\img\\YouTube-icon (1).png"));
		
		JButton btnNewButton_3_3_3 = new JButton("youtube");
		btnNewButton_3_3_3.setBackground(new Color(175, 238, 238));
		btnNewButton_3_3_3.setBounds(102, 347, 126, 22);
		panel_3.add(btnNewButton_3_3_3);
		btnNewButton_3_3_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 51, 204), new Color(102, 0, 0), new Color(51, 255, 102), new Color(0, 255, 255)));
		btnNewButton_3_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					  java.awt.Desktop.getDesktop().browse(new URL("https://www.youtube.com").toURI());
				}
				catch(Exception e1) {
					
				}
			}
		});
		btnNewButton_3_3_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnNewButton_3_3_2 = new JButton("Twitter");
		btnNewButton_3_3_2.setBackground(new Color(175, 238, 238));
		btnNewButton_3_3_2.setBounds(103, 251, 126, 22);
		panel_3.add(btnNewButton_3_3_2);
		btnNewButton_3_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 102, 102), new Color(255, 102, 0), new Color(255, 255, 51), new Color(0, 0, 255)));
		btnNewButton_3_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					  java.awt.Desktop.getDesktop().browse(new URL("https://twitter.com").toURI());
				}
				catch(Exception e1) {
					
				}
		
			}
		});
		btnNewButton_3_3_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnNewButton_3_3_1 = new JButton("Whatsapp");
		btnNewButton_3_3_1.setBackground(new Color(175, 238, 238));
		btnNewButton_3_3_1.setBounds(102, 158, 126, 22);
		panel_3.add(btnNewButton_3_3_1);
		btnNewButton_3_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 102, 153), new Color(51, 102, 153), new Color(0, 51, 204), new Color(0, 204, 0)));
		btnNewButton_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					  java.awt.Desktop.getDesktop().browse(new URL("https://web.whatsapp.com").toURI());
				}
				catch(Exception e1) {
					
				}
			}
		});
		btnNewButton_3_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBackground(new Color(224, 255, 255));
		panel_4.setBounds(270, 366, 960, 438);
		frmWelcomeHomePage.getContentPane().add(panel_4);
		
		JInternalFrame internalFrame_1 = new JInternalFrame("                                                                                             Enqury Now");
		internalFrame_1.setBounds(10, 36, 915, 350);
		panel_4.add(internalFrame_1);
		internalFrame_1.getContentPane().setBackground(new Color(102, 102, 102));
		internalFrame_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		internalFrame_1.setClosable(true);
		internalFrame_1.setFrameIcon(new ImageIcon("E:\\eclipse-workspace\\Education Management System\\img\\context.png"));
		internalFrame_1.getContentPane().setLayout(null);
		
		textName = new JTextField();
		textName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textName.setColumns(10);
		textName.setBounds(76, 71, 207, 20);
		internalFrame_1.getContentPane().add(textName);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(377, 71, 207, 20);
		internalFrame_1.getContentPane().add(textEmail);
		
		textMobile = new JTextField();
		textMobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textMobile.setColumns(10);
		textMobile.setBounds(187, 110, 207, 20);
		internalFrame_1.getContentPane().add(textMobile);
		
		JButton btnNewButton_2 = new JButton("Sumbit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
					 String query = "INSERT INTO Query values (?,?,?,?)";
					 PreparedStatement PS=connection.prepareStatement(query) ;
					 PS.setString(1,textName.getText());
					 PS.setString(2, textEmail.getText());
					 PS.setString(3,textMobile.getText());
					 PS.setString(4, textQuery.getText());
					 
						 
					 int i=PS.executeUpdate();
					 JOptionPane.showMessageDialog(null, "Your Query Send To Department Head");
					 PS.close();
					 connection.close();
					 
				}
				catch (Exception e1) {
					
					e1.printStackTrace();
					
				}
				
			}
		});
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 102), new Color(51, 204, 51), new Color(255, 102, 0), new Color(255, 255, 0)));
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_2.setBounds(169, 206, 307, 59);
		internalFrame_1.getContentPane().add(btnNewButton_2);
		
		 textQuery = new JTextArea();
		textQuery.setFont(new Font("Monospaced", Font.BOLD, 14));
		textQuery.setTabSize(50);
		textQuery.setBounds(595, 138, 284, 130);
		internalFrame_1.getContentPane().add(textQuery);
		
		lblNewLabel_14 = new JLabel("Name:");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_14.setBackground(new Color(255, 182, 193));
		lblNewLabel_14.setBounds(73, 39, 110, 27);
		internalFrame_1.getContentPane().add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("Email Id:");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_15.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_15.setBackground(new Color(255, 182, 193));
		lblNewLabel_15.setBounds(377, 34, 110, 27);
		internalFrame_1.getContentPane().add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Mobile No:");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_16.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_16.setBackground(new Color(255, 182, 193));
		lblNewLabel_16.setBounds(67, 110, 110, 27);
		internalFrame_1.getContentPane().add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("Query:");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_17.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 20, 147), new Color(255, 0, 0), new Color(50, 205, 50), new Color(255, 215, 0)));
		lblNewLabel_17.setBackground(new Color(255, 182, 193));
		lblNewLabel_17.setBounds(483, 136, 110, 27);
		internalFrame_1.getContentPane().add(lblNewLabel_17);
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBackground(new Color(240, 230, 140));
		panel_5.setBounds(270, 250, 960, 108);
		frmWelcomeHomePage.getContentPane().add(panel_5);
		
		JTextArea txtrContextNoxxxxxxx = new JTextArea();
		txtrContextNoxxxxxxx.setBounds(10, 10, 940, 88);
		panel_5.add(txtrContextNoxxxxxxx);
		txtrContextNoxxxxxxx.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(240, 230, 140)));
		txtrContextNoxxxxxxx.setLineWrap(true);
		txtrContextNoxxxxxxx.setBackground(new Color(240, 230, 140));
		txtrContextNoxxxxxxx.setForeground(new Color(255, 127, 80));
		txtrContextNoxxxxxxx.setText("\tContext no: 800xxxxxxx      Whatsapp No:     780xxxxxxx       \r\n                         Email Id: Ramkumarkashyap57@gamil.com\r\n\tAdress:  Sarfarajganj Hardoi Rode Balaganj Lucknow Pin(226003)");
		txtrContextNoxxxxxxx.setFont(new Font("Times New Roman", Font.BOLD, 22));
		txtrContextNoxxxxxxx.setRows(2);
		internalFrame_1.setVisible(true);
		internalFrame.setVisible(true);
		
		
	}
	protected static Object getProject() {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Desktop() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			/**
			 *
			 */
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}
}
