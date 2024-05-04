package Payment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.w3c.dom.events.EventTarget;

import userdetails.Login;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.RescaleOp;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;

public class OfflinePay extends JFrame {
	String s;
	private JPanel contentPane;
	private JTextField textBookNO;
	private JTextField textRtno;
	private JTextField textName;
	private JTextField textDo_so;
	private JTextField textCourse;
	private JTextField textBatch;
	private JTextField textProsChargeR1;
	private JTextField textR_G_C_R1;
	private JTextField textEn_FEE_R1;
	private JTextField textTu_FEE_R1;
	private JTextField textHo_FEE_R1;
	private JTextField textOthers_R1;
	private JTextField textFi_R1;
	private JTextField textEx_FEE_R1;
	private JTextField textHos_se_R1;
	private JTextField textCo_Se_R1;
	private JTextField textOthers_R2;
	private JTextField textFi_R2;
	private JTextField textEx_FEE_R2;
	private JTextField textHos_se_R2;
	private JTextField textCo_Se_R2;
	private JTextField textHo_FEE_R2;
	private JTextField textTu_FEE_R2;
	private JTextField textEn_FEE_R2;
	private JTextField textR_G_C_R2;
	private JTextField textProsChargeR2;
	private JTextField textchase_Amount;
	private JTextField textDD_amount;
	private JTextField textcheque_amount;
	private JTextArea textArea_rs;
	private JTextField textroll;
	private String path;
	private JButton GrandTotal;
	private JLabel Sig;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButtonCy;
	private JRadioButton rdbtnCNo;
	private JRadioButton rdbtnddNo;
	private JRadioButton rdbtnNewRadioButtonDDY;
	private JRadioButton rdbtnNewRadioButtonCQY;
	private JRadioButton rdbtnCQNo;
	private JDateChooser casedate;
	private JDateChooser dddate;
	private JDateChooser Cequedate;
	private JDateChooser date;
	private JDateChooser DOB;
	private JButton BalanceTotal;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public OfflinePay() {
		setResizable(false);
		setTitle("Offline Payment");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1318, 870);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 4));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		/*path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
	    ImageIcon imageIcon1=new ImageIcon(path);
		Image imgImage1=imageIcon1.getImage();
		ImageIcon image1=new ImageIcon(newiImage1);*/
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 128), 3));
		panel.setBounds(0, 0, 1302, 777);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(20, 776, 1268, 5);
		panel.add(separator_1_1);
		separator_1_1.setBackground(new Color(51, 0, 204));
		
		 Sig = new JLabel("");
		 Sig.setBounds(995, 698, 268, 70);
		 panel.add(Sig);
		 
		 JLabel lblNewLabel_1_9_1_1_1 = new JLabel("Authorised Signatory(Name)");
		 lblNewLabel_1_9_1_1_1.setBounds(989, 663, 285, 36);
		 panel.add(lblNewLabel_1_9_1_1_1);
		 lblNewLabel_1_9_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_1_9_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		 
		 textArea_rs = new JTextArea();
		 textArea_rs.setBounds(733, 706, 235, 60);
		 panel.add(textArea_rs);
		 textArea_rs.setFont(new Font("Monospaced", Font.BOLD, 15));
		 textArea_rs.setForeground(new Color(0, 0, 204));
		 
		 JLabel lblNewLabel_1_9_1_1 = new JLabel("Rs.(in Words)");
		 lblNewLabel_1_9_1_1.setBounds(714, 670, 137, 36);
		 panel.add(lblNewLabel_1_9_1_1);
		 lblNewLabel_1_9_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_1_9_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		 
		 textchase_Amount = new JTextField();
		 textchase_Amount.setBounds(599, 681, 105, 21);
		 panel.add(textchase_Amount);
		 textchase_Amount.setForeground(new Color(0, 0, 204));
		 textchase_Amount.setFont(new Font("Times New Roman", Font.BOLD, 15));
		 textchase_Amount.setColumns(10);
		 
		 textDD_amount = new JTextField();
		 textDD_amount.setBounds(599, 709, 105, 21);
		 panel.add(textDD_amount);
		 textDD_amount.setForeground(new Color(0, 0, 204));
		 textDD_amount.setFont(new Font("Times New Roman", Font.BOLD, 15));
		 textDD_amount.setColumns(10);
		 
		 textcheque_amount = new JTextField();
		 textcheque_amount.setBounds(599, 741, 105, 21);
		 panel.add(textcheque_amount);
		 textcheque_amount.setForeground(new Color(0, 0, 204));
		 textcheque_amount.setFont(new Font("Times New Roman", Font.BOLD, 15));
		 textcheque_amount.setColumns(10);
		 
		 JLabel lblNewLabel_1_8_1_1_1_3_3 = new JLabel("Amaunt");
		 lblNewLabel_1_8_1_1_1_3_3.setBounds(523, 730, 90, 36);
		 panel.add(lblNewLabel_1_8_1_1_1_3_3);
		 lblNewLabel_1_8_1_1_1_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		 lblNewLabel_1_8_1_1_1_3_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		 
		 JLabel lblNewLabel_1_8_1_1_1_3_2 = new JLabel("Amaunt");
		 lblNewLabel_1_8_1_1_1_3_2.setBounds(523, 698, 90, 36);
		 panel.add(lblNewLabel_1_8_1_1_1_3_2);
		 lblNewLabel_1_8_1_1_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		 lblNewLabel_1_8_1_1_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		 
		 JLabel lblNewLabel_1_8_1_1_1_3 = new JLabel("Amaunt");
		 lblNewLabel_1_8_1_1_1_3.setBounds(523, 670, 90, 36);
		 panel.add(lblNewLabel_1_8_1_1_1_3);
		 lblNewLabel_1_8_1_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		 lblNewLabel_1_8_1_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		 
		  casedate = new JDateChooser();
		  casedate.setBounds(408, 683, 105, 19);
		  panel.add(casedate);
		  casedate.setBackground(new Color(255, 204, 255));
		  casedate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		  
		   dddate = new JDateChooser();
		   dddate.setBounds(408, 715, 105, 19);
		   panel.add(dddate);
		   dddate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		   dddate.setBackground(new Color(255, 204, 255));
		   
		    Cequedate = new JDateChooser();
		    Cequedate.setBounds(408, 747, 105, 19);
		    panel.add(Cequedate);
		    Cequedate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		    Cequedate.setBackground(new Color(255, 204, 255));
		    
		    JLabel lblNewLabel_1_8_1_1_1_3_1_2 = new JLabel("Date");
		    lblNewLabel_1_8_1_1_1_3_1_2.setBounds(357, 733, 46, 36);
		    panel.add(lblNewLabel_1_8_1_1_1_3_1_2);
		    lblNewLabel_1_8_1_1_1_3_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		    lblNewLabel_1_8_1_1_1_3_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		    
		    JLabel lblNewLabel_1_8_1_1_1_3_1_1 = new JLabel("Date");
		    lblNewLabel_1_8_1_1_1_3_1_1.setBounds(357, 705, 46, 29);
		    panel.add(lblNewLabel_1_8_1_1_1_3_1_1);
		    lblNewLabel_1_8_1_1_1_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		    lblNewLabel_1_8_1_1_1_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		    
		    JLabel lblNewLabel_1_8_1_1_1_3_1 = new JLabel("Date");
		    lblNewLabel_1_8_1_1_1_3_1.setBounds(357, 674, 51, 29);
		    panel.add(lblNewLabel_1_8_1_1_1_3_1);
		    lblNewLabel_1_8_1_1_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		    lblNewLabel_1_8_1_1_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		    
		     rdbtnCNo = new JRadioButton("No");
		     rdbtnCNo.setBounds(232, 679, 85, 21);
		     panel.add(rdbtnCNo);
		     rdbtnCNo.setBackground(new Color(255, 153, 51));
		     buttonGroup.add(rdbtnCNo);
		     rdbtnCNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		     
		      rdbtnddNo = new JRadioButton("No");
		      rdbtnddNo.setBounds(232, 707, 85, 21);
		      panel.add(rdbtnddNo);
		      rdbtnddNo.setBackground(new Color(255, 153, 51));
		      buttonGroup_1.add(rdbtnddNo);
		      rdbtnddNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		      
		       rdbtnCQNo = new JRadioButton("No");
		       rdbtnCQNo.setBounds(232, 740, 85, 21);
		       panel.add(rdbtnCQNo);
		       rdbtnCQNo.setBackground(new Color(255, 153, 51));
		       buttonGroup_2.add(rdbtnCQNo);
		       rdbtnCQNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		       
		        rdbtnNewRadioButtonCQY = new JRadioButton("Yes");
		        rdbtnNewRadioButtonCQY.setBounds(145, 740, 70, 21);
		        panel.add(rdbtnNewRadioButtonCQY);
		        rdbtnNewRadioButtonCQY.setBackground(new Color(153, 255, 153));
		        buttonGroup_2.add(rdbtnNewRadioButtonCQY);
		        rdbtnNewRadioButtonCQY.setFont(new Font("Times New Roman", Font.BOLD, 15));
		        
		         rdbtnNewRadioButtonDDY = new JRadioButton("Yes");
		         rdbtnNewRadioButtonDDY.setBounds(147, 707, 70, 21);
		         panel.add(rdbtnNewRadioButtonDDY);
		         rdbtnNewRadioButtonDDY.setBackground(new Color(153, 255, 153));
		         buttonGroup_1.add(rdbtnNewRadioButtonDDY);
		         rdbtnNewRadioButtonDDY.setFont(new Font("Times New Roman", Font.BOLD, 15));
		         
		          rdbtnNewRadioButtonCy = new JRadioButton("Yes");
		          rdbtnNewRadioButtonCy.setBounds(147, 679, 68, 21);
		          panel.add(rdbtnNewRadioButtonCy);
		          rdbtnNewRadioButtonCy.setBackground(new Color(153, 255, 153));
		          buttonGroup.add(rdbtnNewRadioButtonCy);
		          rdbtnNewRadioButtonCy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          
		          JLabel lblNewLabel_1_8_1_1_1_1 = new JLabel("Case");
		          lblNewLabel_1_8_1_1_1_1.setBounds(86, 670, 68, 36);
		          panel.add(lblNewLabel_1_8_1_1_1_1);
		          lblNewLabel_1_8_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		          lblNewLabel_1_8_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		          
		          JLabel lblNewLabel_1_8_1_1_1_2 = new JLabel("DD");
		          lblNewLabel_1_8_1_1_1_2.setBounds(86, 698, 68, 36);
		          panel.add(lblNewLabel_1_8_1_1_1_2);
		          lblNewLabel_1_8_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		          lblNewLabel_1_8_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		          
		          JLabel lblNewLabel_1_8_1_1_1_2_1 = new JLabel("Ceque");
		          lblNewLabel_1_8_1_1_1_2_1.setBounds(86, 733, 68, 36);
		          panel.add(lblNewLabel_1_8_1_1_1_2_1);
		          lblNewLabel_1_8_1_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		          lblNewLabel_1_8_1_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		          
		          JLabel lblNewLabel_1_8_1_1_1 = new JLabel("By.");
		          lblNewLabel_1_8_1_1_1.setBounds(30, 670, 46, 36);
		          panel.add(lblNewLabel_1_8_1_1_1);
		          lblNewLabel_1_8_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		          lblNewLabel_1_8_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		          
		          JSeparator separator_1 = new JSeparator();
		          separator_1.setBounds(20, 663, 1254, 10);
		          panel.add(separator_1);
		          separator_1.setBackground(new Color(51, 0, 204));
		          
		          textOthers_R2 = new JTextField();
		          textOthers_R2.setEditable(false);
		          textOthers_R2.setText("100");
		          textOthers_R2.setBounds(997, 585, 183, 21);
		          panel.add(textOthers_R2);
		          textOthers_R2.setForeground(new Color(0, 0, 204));
		          textOthers_R2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          textOthers_R2.setColumns(10);
		          
		          textFi_R2 = new JTextField();
		          textFi_R2.setBounds(997, 560, 183, 21);
		          panel.add(textFi_R2);
		          textFi_R2.setForeground(new Color(0, 0, 204));
		          textFi_R2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          textFi_R2.setColumns(10);
		          
		          textEx_FEE_R2 = new JTextField();
		          textEx_FEE_R2.setBounds(997, 534, 183, 21);
		          panel.add(textEx_FEE_R2);
		          textEx_FEE_R2.setForeground(new Color(0, 0, 204));
		          textEx_FEE_R2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          textEx_FEE_R2.setColumns(10);
		          
		          textHos_se_R2 = new JTextField();
		          textHos_se_R2.setEditable(false);
		          textHos_se_R2.setText("600");
		          textHos_se_R2.setBounds(997, 504, 183, 21);
		          panel.add(textHos_se_R2);
		          textHos_se_R2.setForeground(new Color(0, 0, 204));
		          textHos_se_R2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          textHos_se_R2.setColumns(10);
		          
		          textCo_Se_R2 = new JTextField();
		          textCo_Se_R2.setEditable(false);
		          textCo_Se_R2.setText("600");
		          textCo_Se_R2.setBounds(997, 479, 183, 21);
		          panel.add(textCo_Se_R2);
		          textCo_Se_R2.setForeground(new Color(0, 0, 204));
		          textCo_Se_R2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          textCo_Se_R2.setColumns(10);
		          
		          textHo_FEE_R2 = new JTextField();
		          textHo_FEE_R2.setEditable(false);
		          textHo_FEE_R2.setText("500");
		          textHo_FEE_R2.setBounds(997, 452, 183, 21);
		          panel.add(textHo_FEE_R2);
		          textHo_FEE_R2.setForeground(new Color(0, 0, 204));
		          textHo_FEE_R2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          textHo_FEE_R2.setColumns(10);
		          
		          textTu_FEE_R2 = new JTextField();
		          textTu_FEE_R2.setBounds(997, 424, 183, 21);
		          panel.add(textTu_FEE_R2);
		          textTu_FEE_R2.setForeground(new Color(0, 0, 204));
		          textTu_FEE_R2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          textTu_FEE_R2.setColumns(10);
		          
		          textEn_FEE_R2 = new JTextField();
		          textEn_FEE_R2.setEditable(false);
		          textEn_FEE_R2.setText("750");
		          textEn_FEE_R2.setBounds(997, 398, 183, 21);
		          panel.add(textEn_FEE_R2);
		          textEn_FEE_R2.setForeground(new Color(0, 0, 204));
		          textEn_FEE_R2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          textEn_FEE_R2.setColumns(10);
		          
		          textR_G_C_R2 = new JTextField();
		          textR_G_C_R2.setEditable(false);
		          textR_G_C_R2.setText("500");
		          textR_G_C_R2.setBounds(997, 372, 183, 21);
		          panel.add(textR_G_C_R2);
		          textR_G_C_R2.setForeground(new Color(0, 0, 204));
		          textR_G_C_R2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          textR_G_C_R2.setColumns(10);
		          
		          textProsChargeR2 = new JTextField();
		          textProsChargeR2.setEditable(false);
		          textProsChargeR2.setText("278");
		          textProsChargeR2.setBounds(997, 346, 183, 21);
		          panel.add(textProsChargeR2);
		          textProsChargeR2.setForeground(new Color(0, 0, 204));
		          textProsChargeR2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		          textProsChargeR2.setColumns(10);
		          
		          JSeparator separator_5_1_1 = new JSeparator();
		          separator_5_1_1.setBounds(989, 291, 12, 376);
		          panel.add(separator_5_1_1);
		          separator_5_1_1.setOrientation(SwingConstants.VERTICAL);
		          separator_5_1_1.setBackground(new Color(51, 0, 204));
		          separator_5_1_1.setAlignmentX(1.0f);
		          
		          JLabel lblNewLabel_1_4_2 = new JLabel("Rs.");
		          lblNewLabel_1_4_2.setBounds(1043, 306, 72, 21);
		          panel.add(lblNewLabel_1_4_2);
		          lblNewLabel_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		          lblNewLabel_1_4_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		          
		          JLabel lblNewLabel_1_4 = new JLabel("Balance Amount");
		          lblNewLabel_1_4.setBounds(1076, 286, 166, 21);
		          panel.add(lblNewLabel_1_4);
		          lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		          lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		          
		          JSeparator separator_4 = new JSeparator();
		          separator_4.setBounds(20, 327, 1254, 10);
		          panel.add(separator_4);
		          separator_4.setBackground(new Color(51, 0, 204));
		          
		          JSeparator separator_3 = new JSeparator();
		          separator_3.setBounds(20, 276, 1254, 10);
		          panel.add(separator_3);
		          separator_3.setBackground(new Color(51, 0, 204));
		          
		          JLabel lblNewLabel_1_4_2_2 = new JLabel("Rs.");
		          lblNewLabel_1_4_2_2.setBounds(636, 296, 72, 21);
		          panel.add(lblNewLabel_1_4_2_2);
		          lblNewLabel_1_4_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		          lblNewLabel_1_4_2_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		          
		          JLabel lblNewLabel_1_4_3 = new JLabel("Amount");
		          lblNewLabel_1_4_3.setBounds(733, 276, 137, 21);
		          panel.add(lblNewLabel_1_4_3);
		          lblNewLabel_1_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		          lblNewLabel_1_4_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		          
		          JLabel lblNewLabel_1_3 = new JLabel("Particulars");
		          lblNewLabel_1_3.setBounds(311, 281, 137, 36);
		          panel.add(lblNewLabel_1_3);
		          lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		          lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		          
		           GrandTotal = new JButton("");
		           GrandTotal.setBounds(656, 606, 166, 44);
		           panel.add(GrandTotal);
		           GrandTotal.addActionListener(new ActionListener() {
		           	public void actionPerformed(ActionEvent e) {
		           		double a=Double.parseDouble(textProsChargeR1.getText());
		           		double b=Double.parseDouble(textR_G_C_R1.getText());
		           		double c=Double.parseDouble(textEn_FEE_R1.getText());
		           		double d=Double.parseDouble(textTu_FEE_R1.getText());
		           		double e0=Double.parseDouble(textHo_FEE_R1.getText());
		           		double f=Double.parseDouble(textCo_Se_R1.getText());
		           		double g=Double.parseDouble(textHos_se_R1.getText());
		           		double h=Double.parseDouble(textEx_FEE_R1.getText());
		           		double i=Double.parseDouble(textFi_R1.getText());
		           		double j=Double.parseDouble(textOthers_R1.getText());
		           	
		           		GrandTotal.setText("Rs. "+(a+b+c+d+e0+f+g+h+i+j)+" ");
		           	}
		           });
		           GrandTotal.setBackground(new Color(255, 204, 255));
		           GrandTotal.setFont(new Font("Times New Roman", Font.BOLD, 17));
		           GrandTotal.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(51, 102, 204), new Color(204, 0, 204), new Color(255, 0, 0)));
		           
		           textOthers_R1 = new JTextField();
		           textOthers_R1.setBounds(646, 575, 183, 21);
		           panel.add(textOthers_R1);
		           textOthers_R1.setEditable(false);
		           textOthers_R1.setText("100");
		           textOthers_R1.setForeground(new Color(0, 0, 204));
		           textOthers_R1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		           textOthers_R1.setColumns(10);
		           
		           textFi_R1 = new JTextField();
		           textFi_R1.setBounds(646, 550, 183, 21);
		           panel.add(textFi_R1);
		           textFi_R1.setForeground(new Color(0, 0, 204));
		           textFi_R1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		           textFi_R1.setColumns(10);
		           
		           textEx_FEE_R1 = new JTextField();
		           textEx_FEE_R1.setBounds(646, 524, 183, 21);
		           panel.add(textEx_FEE_R1);
		           textEx_FEE_R1.setForeground(new Color(0, 0, 204));
		           textEx_FEE_R1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		           textEx_FEE_R1.setColumns(10);
		           
		           textHos_se_R1 = new JTextField();
		           textHos_se_R1.setBounds(646, 494, 183, 21);
		           panel.add(textHos_se_R1);
		           textHos_se_R1.setEditable(false);
		           textHos_se_R1.setText("600");
		           textHos_se_R1.setForeground(new Color(0, 0, 204));
		           textHos_se_R1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		           textHos_se_R1.setColumns(10);
		           
		           textCo_Se_R1 = new JTextField();
		           textCo_Se_R1.setBounds(646, 469, 183, 21);
		           panel.add(textCo_Se_R1);
		           textCo_Se_R1.setEditable(false);
		           textCo_Se_R1.setText("600");
		           textCo_Se_R1.setForeground(new Color(0, 0, 204));
		           textCo_Se_R1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		           textCo_Se_R1.setColumns(10);
		           
		           textHo_FEE_R1 = new JTextField();
		           textHo_FEE_R1.setBounds(646, 442, 183, 21);
		           panel.add(textHo_FEE_R1);
		           textHo_FEE_R1.setEditable(false);
		           textHo_FEE_R1.setText("500");
		           textHo_FEE_R1.setForeground(new Color(0, 0, 204));
		           textHo_FEE_R1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		           textHo_FEE_R1.setColumns(10);
		           
		           textTu_FEE_R1 = new JTextField();
		           textTu_FEE_R1.setBounds(646, 414, 183, 21);
		           panel.add(textTu_FEE_R1);
		           textTu_FEE_R1.setForeground(new Color(0, 0, 204));
		           textTu_FEE_R1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		           textTu_FEE_R1.setColumns(10);
		           
		           textEn_FEE_R1 = new JTextField();
		           textEn_FEE_R1.setBounds(646, 388, 183, 21);
		           panel.add(textEn_FEE_R1);
		           textEn_FEE_R1.setEditable(false);
		           textEn_FEE_R1.setText("750");
		           textEn_FEE_R1.setForeground(new Color(0, 0, 204));
		           textEn_FEE_R1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		           textEn_FEE_R1.setColumns(10);
		           
		           textR_G_C_R1 = new JTextField();
		           textR_G_C_R1.setBounds(646, 362, 183, 21);
		           panel.add(textR_G_C_R1);
		           textR_G_C_R1.setEditable(false);
		           textR_G_C_R1.setText("500");
		           textR_G_C_R1.setForeground(new Color(0, 0, 204));
		           textR_G_C_R1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		           textR_G_C_R1.setColumns(10);
		           
		           JLabel lblNewLabel_1_4_2_1_1_1_2_1_1 = new JLabel("9.");
		           lblNewLabel_1_4_2_1_1_1_2_1_1.setBounds(0, 548, 58, 33);
		           panel.add(lblNewLabel_1_4_2_1_1_1_2_1_1);
		           lblNewLabel_1_4_2_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		           lblNewLabel_1_4_2_1_1_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		           
		           JLabel lblNewLabel_1_4_2_1_1_1_2_2_1 = new JLabel("10");
		           lblNewLabel_1_4_2_1_1_1_2_2_1.setBounds(0, 573, 58, 33);
		           panel.add(lblNewLabel_1_4_2_1_1_1_2_2_1);
		           lblNewLabel_1_4_2_1_1_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		           lblNewLabel_1_4_2_1_1_1_2_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		           
		           JLabel lblNewLabel_1_3_1 = new JLabel("Course:");
		           lblNewLabel_1_3_1.setBounds(24, 236, 137, 36);
		           panel.add(lblNewLabel_1_3_1);
		           lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		           lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		           
		           JLabel lblNewLabel_1_1_2 = new JLabel("DOB");
		           lblNewLabel_1_1_2.setBounds(35, 205, 105, 21);
		           panel.add(lblNewLabel_1_1_2);
		           lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		           lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		           
		           JLabel lblNewLabel_1_1_1 = new JLabel("Date:");
		           lblNewLabel_1_1_1.setBounds(44, 177, 85, 21);
		           panel.add(lblNewLabel_1_1_1);
		           lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		           lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		           
		            date = new JDateChooser();
		            date.setBounds(127, 177, 190, 21);
		            panel.add(date);
		            date.setFont(new Font("Times New Roman", Font.BOLD, 15));
		            date.setBackground(new Color(255, 204, 255));
		            
		             DOB = new JDateChooser();
		             DOB.setBounds(127, 207, 190, 21);
		             panel.add(DOB);
		             DOB.setFont(new Font("Times New Roman", Font.BOLD, 15));
		             DOB.setBackground(new Color(255, 204, 255));
		             
		             textCourse = new JTextField();
		             textCourse.setBounds(127, 246, 190, 21);
		             panel.add(textCourse);
		             textCourse.addKeyListener(new KeyAdapter() {
		             	@Override
		             	public void keyPressed(KeyEvent e) {
		             		int Key=e.getKeyCode();
		             		if (Key==50) {
		             			textCourse.requestFocus();
		             		}
		             	}
		             });
		             textCourse.setForeground(new Color(0, 0, 204));
		             textCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		             textCourse.setColumns(10);
		             
		             JLabel lblNewLabel_1_2_1 = new JLabel("Name:");
		             lblNewLabel_1_2_1.setBounds(430, 177, 137, 36);
		             panel.add(lblNewLabel_1_2_1);
		             lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		             
		             JLabel lblNewLabel_1_2 = new JLabel("D/o,S/o:");
		             lblNewLabel_1_2.setBounds(430, 212, 137, 36);
		             panel.add(lblNewLabel_1_2);
		             lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		             
		             textDo_so = new JTextField();
		             textDo_so.setBounds(533, 223, 371, 21);
		             panel.add(textDo_so);
		             textDo_so.addKeyListener(new KeyAdapter() {
		             	@Override
		             	public void keyPressed(KeyEvent e) {
		             		int Key=e.getKeyCode();
		             		if (Key==50) {
		             			textDo_so.requestFocus();
		             		}
		             	}
		             });
		             textDo_so.setForeground(new Color(0, 0, 204));
		             textDo_so.setFont(new Font("Times New Roman", Font.BOLD, 15));
		             textDo_so.setColumns(10);
		             
		             textName = new JTextField();
		             textName.setBounds(533, 187, 371, 21);
		             panel.add(textName);
		             textName.addKeyListener(new KeyAdapter() {
		             	@Override
		             	public void keyPressed(KeyEvent e) {
		             		int Key=e.getKeyCode();
		             		if (Key==50) {
		             			textName.requestFocus();
		             		}
		             	}
		             });
		             textName.setForeground(new Color(0, 0, 204));
		             textName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		             textName.setColumns(10);
		             
		             JLabel lblNewLabel_1_1 = new JLabel("Batch");
		             lblNewLabel_1_1.setBounds(919, 166, 137, 36);
		             panel.add(lblNewLabel_1_1);
		             lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		             
		             JLabel lblNewLabel_1 = new JLabel("Book No:");
		             lblNewLabel_1.setBounds(933, 194, 137, 36);
		             panel.add(lblNewLabel_1);
		             lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		             lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		             
		             JLabel lblNewLabel_1_10 = new JLabel("Rt.No:");
		             lblNewLabel_1_10.setBounds(933, 233, 137, 36);
		             panel.add(lblNewLabel_1_10);
		             lblNewLabel_1_10.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		             
		             textRtno = new JTextField();
		             textRtno.setBounds(1040, 240, 190, 21);
		             panel.add(textRtno);
		             textRtno.addKeyListener(new KeyAdapter() {
		             	@Override
		             	public void keyPressed(KeyEvent e) {
		             		int Key=e.getKeyCode();
		             		if (Key==50) {
		             			textRtno.requestFocus();
		             		}
		             	}
		             });
		             textRtno.setForeground(new Color(0, 0, 204));
		             textRtno.setFont(new Font("Times New Roman", Font.BOLD, 15));
		             textRtno.setColumns(10);
		             
		             textBookNO = new JTextField();
		             textBookNO.setBounds(1040, 202, 190, 21);
		             panel.add(textBookNO);
		             textBookNO.addKeyListener(new KeyAdapter() {
		             	@Override
		             	public void keyPressed(KeyEvent e) {
		             		int Key=e.getKeyCode();
		             		if (Key==50) {
		             			textBookNO.requestFocus();
		             		}
		             	}
		             });
		             textBookNO.setForeground(new Color(0, 0, 204));
		             textBookNO.setFont(new Font("Times New Roman", Font.BOLD, 15));
		             textBookNO.setColumns(10);
		             
		             textBatch = new JTextField();
		             textBatch.setBounds(1038, 173, 190, 21);
		             panel.add(textBatch);
		             textBatch.addKeyListener(new KeyAdapter() {
		             	@Override
		             	public void keyPressed(KeyEvent e) {
		             		int Key=e.getKeyCode();
		             		if (Key==50) {
		             			textBatch.requestFocus();
		             		}
		             	}
		             });
		             textBatch.setForeground(new Color(0, 0, 204));
		             textBatch.setFont(new Font("Times New Roman", Font.BOLD, 15));
		             textBatch.setColumns(10);
		             
		             JLabel lblNewLabel = new JLabel("Offline Payment");
		             lblNewLabel.setBounds(477, 111, 512, 47);
		             panel.add(lblNewLabel);
		             lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		             
		             textroll = new JTextField();
		             textroll.setBounds(115, 121, 190, 21);
		             panel.add(textroll);
		             textroll.setForeground(new Color(0, 0, 204));
		             textroll.setFont(new Font("Times New Roman", Font.BOLD, 15));
		             textroll.setColumns(10);
		             
		             JLabel lblNewLabel_1_1_1_1 = new JLabel("Roll No:");
		             lblNewLabel_1_1_1_1.setBounds(28, 110, 93, 36);
		             panel.add(lblNewLabel_1_1_1_1);
		             lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		             
		             JSeparator separator_2 = new JSeparator();
		             separator_2.setBounds(20, 165, 1254, 10);
		             panel.add(separator_2);
		             separator_2.setBackground(new Color(51, 0, 204));
		             
		             JSeparator separator = new JSeparator();
		             separator.setBounds(20, 114, 1254, 10);
		             panel.add(separator);
		             separator.setBackground(new Color(51, 0, 204));
		             
		             JLabel lblNewLabel_1_6_1 = new JLabel("Hostel Security");
		             lblNewLabel_1_6_1.setBounds(115, 489, 354, 36);
		             panel.add(lblNewLabel_1_6_1);
		             lblNewLabel_1_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		             lblNewLabel_1_6_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		             
		             JLabel lblNewLabel_1_9 = new JLabel("Tution Fee");
		             lblNewLabel_1_9.setBounds(116, 409, 353, 29);
		             panel.add(lblNewLabel_1_9);
		             lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.LEFT);
		             lblNewLabel_1_9.setFont(new Font("Times New Roman", Font.BOLD, 22));
		             
		             JSeparator separator_5 = new JSeparator();
		             separator_5.setBounds(64, 276, 12, 384);
		             panel.add(separator_5);
		             separator_5.setAlignmentX(Component.RIGHT_ALIGNMENT);
		             separator_5.setOrientation(SwingConstants.VERTICAL);
		             separator_5.setBackground(new Color(51, 0, 204));
		             
		             JSeparator separator_5_1 = new JSeparator();
		             separator_5_1.setBounds(634, 276, 12, 384);
		             panel.add(separator_5_1);
		             separator_5_1.setOrientation(SwingConstants.VERTICAL);
		             separator_5_1.setBackground(new Color(51, 0, 204));
		             separator_5_1.setAlignmentX(1.0f);
		             
		             JLabel lblNewLabel_1_6 = new JLabel("Prospectus Charges");
		             lblNewLabel_1_6.setBounds(115, 337, 354, 21);
		             panel.add(lblNewLabel_1_6);
		             lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		             lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 22));
		             
		             JLabel lblNewLabel_1_7 = new JLabel("Registration Charges");
		             lblNewLabel_1_7.setBounds(115, 383, 353, 29);
		             panel.add(lblNewLabel_1_7);
		             lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		             lblNewLabel_1_7.setFont(new Font("Times New Roman", Font.BOLD, 22));
		             
		             JLabel lblNewLabel_1_8 = new JLabel("Enrolment Fee");
		             lblNewLabel_1_8.setBounds(115, 361, 353, 21);
		             panel.add(lblNewLabel_1_8);
		             lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.LEFT);
		             lblNewLabel_1_8.setFont(new Font("Times New Roman", Font.BOLD, 22));
		             
		             JLabel lblNewLabel_1_9_1 = new JLabel("Grand Total:");
		             lblNewLabel_1_9_1.setBounds(497, 605, 137, 36);
		             panel.add(lblNewLabel_1_9_1);
		             lblNewLabel_1_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_9_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		             
		             JLabel lblNewLabel_1_8_1 = new JLabel("Fine");
		             lblNewLabel_1_8_1.setBounds(119, 540, 354, 29);
		             panel.add(lblNewLabel_1_8_1);
		             lblNewLabel_1_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		             lblNewLabel_1_8_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		             
		             JLabel lblNewLabel_1_7_1 = new JLabel("Examination Fee");
		             lblNewLabel_1_7_1.setBounds(115, 515, 354, 36);
		             panel.add(lblNewLabel_1_7_1);
		             lblNewLabel_1_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		             lblNewLabel_1_7_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		             
		             JLabel lblNewLabel_1_5_1 = new JLabel("College Security");
		             lblNewLabel_1_5_1.setBounds(115, 464, 354, 29);
		             panel.add(lblNewLabel_1_5_1);
		             lblNewLabel_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		             lblNewLabel_1_5_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		             
		             JLabel lblNewLabel_1_4_1 = new JLabel("Hostel Fee");
		             lblNewLabel_1_4_1.setBounds(115, 437, 354, 29);
		             panel.add(lblNewLabel_1_4_1);
		             lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		             lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		             
		             JLabel lblNewLabel_1_10_1 = new JLabel("S No");
		             lblNewLabel_1_10_1.setBounds(15, 276, 46, 36);
		             panel.add(lblNewLabel_1_10_1);
		             lblNewLabel_1_10_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_10_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		             
		             JLabel lblNewLabel_1_8_1_1 = new JLabel("Others");
		             lblNewLabel_1_8_1_1.setBounds(119, 568, 354, 29);
		             panel.add(lblNewLabel_1_8_1_1);
		             lblNewLabel_1_8_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		             lblNewLabel_1_8_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		             
		             JLabel lblNewLabel_1_4_2_1_1_1 = new JLabel("1.");
		             lblNewLabel_1_4_2_1_1_1.setBounds(0, 332, 58, 21);
		             panel.add(lblNewLabel_1_4_2_1_1_1);
		             lblNewLabel_1_4_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_4_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		             
		             JLabel lblNewLabel_1_4_2_1_1_1_1 = new JLabel("2.");
		             lblNewLabel_1_4_2_1_1_1_1.setBounds(0, 352, 58, 33);
		             panel.add(lblNewLabel_1_4_2_1_1_1_1);
		             lblNewLabel_1_4_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_4_2_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		             
		             JLabel lblNewLabel_1_4_2_1_1_1_2 = new JLabel("3.");
		             lblNewLabel_1_4_2_1_1_1_2.setBounds(0, 379, 58, 33);
		             panel.add(lblNewLabel_1_4_2_1_1_1_2);
		             lblNewLabel_1_4_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_4_2_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		             
		             JLabel lblNewLabel_1_4_2_1_1_1_2_1 = new JLabel("4.");
		             lblNewLabel_1_4_2_1_1_1_2_1.setBounds(0, 409, 58, 33);
		             panel.add(lblNewLabel_1_4_2_1_1_1_2_1);
		             lblNewLabel_1_4_2_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_4_2_1_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		             
		             JLabel lblNewLabel_1_4_2_1_1_1_2_2 = new JLabel("5.");
		             lblNewLabel_1_4_2_1_1_1_2_2.setBounds(0, 433, 58, 33);
		             panel.add(lblNewLabel_1_4_2_1_1_1_2_2);
		             lblNewLabel_1_4_2_1_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_4_2_1_1_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		             
		             JLabel lblNewLabel_1_4_2_1_1_1_3 = new JLabel("6.");
		             lblNewLabel_1_4_2_1_1_1_3.setBounds(0, 458, 58, 33);
		             panel.add(lblNewLabel_1_4_2_1_1_1_3);
		             lblNewLabel_1_4_2_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_4_2_1_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		             
		             JLabel lblNewLabel_1_4_2_1_1_1_1_1 = new JLabel("7.");
		             lblNewLabel_1_4_2_1_1_1_1_1.setBounds(0, 490, 58, 33);
		             panel.add(lblNewLabel_1_4_2_1_1_1_1_1);
		             lblNewLabel_1_4_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_4_2_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		             
		             JLabel lblNewLabel_1_4_2_1_1_1_2_3 = new JLabel("8.");
		             lblNewLabel_1_4_2_1_1_1_2_3.setBounds(0, 517, 58, 33);
		             panel.add(lblNewLabel_1_4_2_1_1_1_2_3);
		             lblNewLabel_1_4_2_1_1_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		             lblNewLabel_1_4_2_1_1_1_2_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		             
		             JPanel panel_3 = new JPanel();
		             panel_3.setBounds(0, 2, 1302, 109);
		             panel.add(panel_3);
		             panel_3.setLayout(null);
		             panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		             panel_3.setBackground(new Color(135, 206, 235));
		             
		             JLabel EraLogo = new JLabel();
		             path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
		             EraLogo.setBounds(49, 10, 152, 89);
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
		             lblNewLabel_2.setBounds(308, 0, 782, 62);
		             panel_3.add(lblNewLabel_2);
		             
		             JLabel lblSarfarazhanjHardoiRoad_1 = new JLabel("Sarfarazhanj, Hardoi Road, Lucknow-226003 (UP) India");
		             lblSarfarazhanjHardoiRoad_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblSarfarazhanjHardoiRoad_1.setForeground(Color.BLUE);
		             lblSarfarazhanjHardoiRoad_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		             lblSarfarazhanjHardoiRoad_1.setBounds(251, 53, 883, 29);
		             panel_3.add(lblSarfarazhanjHardoiRoad_1);
		             
		             JLabel lblPhoneFax_1 = new JLabel("Phone: 0522-6600777, Fax: 0522-2407824");
		             lblPhoneFax_1.setHorizontalAlignment(SwingConstants.CENTER);
		             lblPhoneFax_1.setForeground(Color.BLUE);
		             lblPhoneFax_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		             lblPhoneFax_1.setBounds(384, 80, 663, 29);
		             panel_3.add(lblPhoneFax_1);
		             
		             JButton btnNewButton_1 = new JButton("Exit");
		             btnNewButton_1.setBounds(1425, 10, 85, 29);
		             panel_3.add(btnNewButton_1);
		             btnNewButton_1.addActionListener(new ActionListener() {
		             	public void actionPerformed(ActionEvent e) {
		             		AccountantSection.main(null);
		             		dispose();
		             	}
		             });
		             btnNewButton_1.setBackground(new Color(255, 99, 71));
		             btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		             
		             JButton btnBack = new JButton("Back");
		             btnBack.addActionListener(new ActionListener() {
		             	public void actionPerformed(ActionEvent e) {
		             		AccountantSection.main(null);
		             		dispose();
		             	}
		             });
		             btnBack.setBackground(new Color(255, 0, 0));
		             btnBack.setFont(new Font("Times New Roman", Font.BOLD, 17));
		             btnBack.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(51, 102, 204), new Color(204, 0, 204), new Color(255, 0, 0)));
		             btnBack.setBounds(1207, 10, 85, 40);
		             panel_3.add(btnBack);
		             
		             textProsChargeR1 = new JTextField();
		             textProsChargeR1.setBounds(646, 337, 183, 19);
		             panel.add(textProsChargeR1);
		             textProsChargeR1.setEditable(false);
		             textProsChargeR1.setText("278");
		             textProsChargeR1.setForeground(new Color(0, 0, 204));
		             textProsChargeR1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		             textProsChargeR1.setColumns(10);
		             
		             BalanceTotal = new JButton("");
		             BalanceTotal.addActionListener(new ActionListener() {
		             	public void actionPerformed(ActionEvent e) {
		             		double a=Double.parseDouble(textProsChargeR2.getText());
			           		double b=Double.parseDouble(textR_G_C_R2.getText());
			           		double c=Double.parseDouble(textEn_FEE_R2.getText());
			           		double d=Double.parseDouble(textTu_FEE_R2.getText());
			           		double e0=Double.parseDouble(textHo_FEE_R2.getText());
			           		double f=Double.parseDouble(textCo_Se_R2.getText());
			           		double g=Double.parseDouble(textHos_se_R2.getText());
			           		double h=Double.parseDouble(textEx_FEE_R2.getText());
			           		double i=Double.parseDouble(textFi_R2.getText());
			           		double j=Double.parseDouble(textOthers_R2.getText());
			           	
			           		BalanceTotal.setText("Rs. "+(a+b+c+d+e0+f+g+h+i+j)+" ");
		             	}
		             });
		             BalanceTotal.setFont(new Font("Times New Roman", Font.BOLD, 17));
		             BalanceTotal.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(51, 102, 204), new Color(204, 0, 204), new Color(255, 0, 0)));
		             BalanceTotal.setBackground(new Color(255, 204, 255));
		             BalanceTotal.setBounds(995, 616, 166, 44);
		             panel.add(BalanceTotal);
		             
		             JButton btnSignature = new JButton("Signature");
		             btnSignature.setBounds(1106, 787, 166, 29);
		             contentPane.add(btnSignature);
		             btnSignature.addActionListener(new ActionListener() {
		             	public void actionPerformed(ActionEvent e) {
		             	 	//this.file=FC.getSelectedFile();
		                     JFileChooser file = new JFileChooser();
		                     
		                       file.setCurrentDirectory(new File(System.getProperty("user.home")));
		                       //filter the files
		                       FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
		                       file.addChoosableFileFilter(filter);
		                       int result = file.showSaveDialog(null);
		                        //if the user click on save in Jfilechooser
		                       if(result == JFileChooser.APPROVE_OPTION){
		                     	  
		                           File selectedFile = file.getSelectedFile();
		                           String path = selectedFile.getAbsolutePath();
		                           Sig.setIcon(ResizeImage(path));
		                           s=path;
		                       }
		                        //if the user click on save in Jfilechooser
		                       else if(result == JFileChooser.CANCEL_OPTION){
		                           System.out.println("No File Select");
		                       }
		             	}
		             });
		             btnSignature.setFont(new Font("Times New Roman", Font.BOLD, 17));
		             btnSignature.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(51, 102, 204), new Color(204, 0, 204), new Color(255, 0, 0)));
		             
		             JButton btnPrint = new JButton("Print Recipt");
		             btnPrint.setBounds(636, 787, 166, 29);
		             contentPane.add(btnPrint);
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
		             btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 17));
		             btnPrint.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(51, 102, 204), new Color(204, 0, 204), new Color(255, 0, 0)));
		             
		             JButton btnNewButton = new JButton("Pay");
		             btnNewButton.setBounds(196, 791, 129, 25);
		             contentPane.add(btnNewButton);
		             btnNewButton.addActionListener(new ActionListener() {
		             	public void actionPerformed(ActionEvent e) {
		             		studentAdressdetail();
		             		
		             	}
		             });
		             btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(51, 102, 204), new Color(204, 0, 204), new Color(255, 0, 0)));
		             btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
			}
//Roll_No, Name, DO_SO, Course, DOB, Date, Batch, BookNO, Chase, ChaseDate, Chase_Amount, DD, DD_Date, DD_Ammunt, 
	//Cheque, Cheque_Date, Cheque_Ammunt, Grand_Total_Amount, Total_Balance_Amount, Rs_in_Worad, Authorety_Sing_Name
	 public void studentAdressdetail() {
			try {
				Connection conne = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payment","root","ramkumar");
				 String q = "INSERT INTO OfflinePyment values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				 PreparedStatement PST=conne.prepareStatement(q) ;
				 PST.setString(1, textroll.getText());
				 PST.setString(2, textName.getText());
				 PST.setString(3, textDo_so.getText());
				 PST.setString(4, textCourse.getText());
				 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-y");
				 String DOBm=sdf.format(DOB.getDate());
				 PST.setString(5, DOBm);
				 SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-y");
				 String DOB1=sdf1.format(date.getDate());
				 PST.setString(6, DOB1);
				 PST.setString(7, textBatch.getText());
				 PST.setString(8, textBookNO.getText());
				 if (rdbtnNewRadioButtonCy.isSelected()) 
					 	PST.setString(9, rdbtnNewRadioButtonCy.getText());
				 else 
					 	PST.setString(9, rdbtnCNo.getText());
				 SimpleDateFormat sdf10=new SimpleDateFormat("dd-MMM-y");
				 String DOBmn=sdf10.format(casedate.getDate());
				 PST.setString(10, DOBmn);
				 PST.setString(11, textchase_Amount.getText());
				 if (rdbtnNewRadioButtonDDY.isSelected()) 
					 	PST.setString(12, rdbtnNewRadioButtonDDY.getText());
				 else 
					 	PST.setString(12, rdbtnddNo.getText());
				 SimpleDateFormat sdf2=new SimpleDateFormat("dd-MMM-y");
				 String DOBn=sdf2.format(dddate.getDate());
				 PST.setString(13, DOBn);
				 PST.setString(14, textDD_amount.getText());
				 if (rdbtnNewRadioButtonCQY.isSelected()) 
					 	PST.setString(15, rdbtnNewRadioButtonCQY.getText());
				 else 
					 	PST.setString(15, rdbtnCQNo.getText());
				 SimpleDateFormat sdf3=new SimpleDateFormat("dd-MMM-y");
				 String DOBl=sdf3.format(Cequedate.getDate());
				 PST.setString(16, DOBl);
				 PST.setString(17, textcheque_amount.getText());
				 PST.setString(18, GrandTotal.getText());
				 PST.setString(19, BalanceTotal.getText());
				 PST.setString(20, textArea_rs.getText());
				 InputStream isa=new FileInputStream(new File(s));
					PST.setBlob(21, isa);
				
				 int i=PST.executeUpdate();
				       JOptionPane.showMessageDialog(null, "Payment is Succsesfull.....");
				 setVisible(false);
				 
				 PST.close();
				 conne.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
	 
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				OfflinePay frame = new OfflinePay();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
public ImageIcon ResizeImage(String ImagePath)
{
    ImageIcon MyImage = new ImageIcon(ImagePath);
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(Sig.getWidth(), Sig.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
}