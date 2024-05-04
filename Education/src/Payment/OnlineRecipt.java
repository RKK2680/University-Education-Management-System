package Payment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import userdetails.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import pdf.viewRecipt;

public class OnlineRecipt extends JFrame {

	private JPanel contentPane;
	private JTextField textBatch;
	private JTextField textName;
	private JTextField textCourse;
	private JTextField textDO_So;
	private JTextField textPID;
	//private JFrame frame;
	private JComboBox comboBoxPay_M;
	private String path;
	private JLabel Photo;
	String s;
	String b;
	private JDateChooser date;
	private JDateChooser DOB;
	private JDateChooser paydate;
	private JLabel Photo_1;
	private JTextField textSTName;
	private JLabel PhotoRE;
	private JTextField textpayamount;
	private JTextField textRoll;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlineRecipt frame = new OnlineRecipt();
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
	public OnlineRecipt() {
		setBackground(new Color(0, 0, 255));
		setTitle("Online Recipt");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 000, 1253, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 4));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(255, 204, 102));
		panel.setBounds(0, 0, 1239, 763);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Uploade Online Payment Recipt");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setBounds(203, 117, 747, 41);
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 153));
		separator.setBounds(10, 113, 1221, 11);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 153));
		separator_1.setBounds(10, 168, 1221, 11);
		panel.add(separator_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Date:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(20, 179, 137, 36);
		panel.add(lblNewLabel_1_1_1);
		
		textBatch = new JTextField();
		textBatch.setForeground(new Color(0, 0, 204));
		textBatch.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textBatch.setColumns(10);
		textBatch.setBounds(443, 194, 190, 21);
		panel.add(textBatch);
		
		JLabel lblNewLabel_1_1 = new JLabel("Batch");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(346, 187, 137, 36);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("DOB");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_2.setBounds(346, 232, 137, 29);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Name:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2_1.setBounds(698, 182, 137, 36);
		panel.add(lblNewLabel_1_2_1);
		
		textName = new JTextField();
		textName.setForeground(new Color(0, 0, 204));
		textName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textName.setColumns(10);
		textName.setBounds(801, 192, 371, 21);
		panel.add(textName);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Course:");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_3_1.setBounds(698, 249, 137, 36);
		panel.add(lblNewLabel_1_3_1);
		
		textCourse = new JTextField();
		textCourse.setForeground(new Color(0, 0, 204));
		textCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textCourse.setColumns(10);
		textCourse.setBounds(801, 259, 190, 21);
		panel.add(textCourse);
		
		textDO_So = new JTextField();
		textDO_So.setForeground(new Color(0, 0, 204));
		textDO_So.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textDO_So.setColumns(10);
		textDO_So.setBounds(801, 228, 371, 21);
		panel.add(textDO_So);
		
		JLabel lblNewLabel_1_2 = new JLabel("D/o,S/o:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(698, 217, 137, 36);
		panel.add(lblNewLabel_1_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 153));
		separator_2.setBounds(20, 292, 1221, 11);
		panel.add(separator_2);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Payment Id");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_4_1.setBounds(50, 313, 119, 29);
		panel.add(lblNewLabel_1_4_1);
		
		JButton Pay = new JButton("Pay");
		Pay.setBackground(new Color(50, 205, 50));
		Pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payment","root","ramkumar");
					 String query = "INSERT INTO FeeRecipt values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
					 PreparedStatement PS=connection.prepareStatement(query) ;
					 
					 PS.setString(1, textName.getText());
					 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-y");
					 String Date=sdf.format(DOB.getDate());
					 PS.setString(2, Date);
					 PS.setString(3, textDO_So.getText());
					 PS.setString(4, textCourse.getText());
					 PS.setString(5, textBatch.getText());
					 SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-y");
					 String Date1=sdf.format(date.getDate());
					 PS.setString(6, Date1);
					 PS.setString(7, textPID.getText());
					 String value=comboBoxPay_M.getSelectedItem().toString();
					 PS.setString(8, value);
					 SimpleDateFormat sdf0=new SimpleDateFormat("dd-MMM-y");
					 String Dat0=sdf.format(paydate.getDate());
					 PS.setString(9, Dat0);
					 InputStream is=new FileInputStream(new File(b));
							PS.setBlob(10, is);
					 InputStream isa=new FileInputStream(new File(s));
							PS.setBlob(11, isa);
							 PS.setString(12, textRoll.getText());
							 PS.setString(13, textpayamount.getText());
					 int i=PS.executeUpdate();
					 //JOptionPane.showMessageDialog(Sumbit_Details, "Student Detail is Succsesfull.....");
					 //setVisible(false);
					// new Login().setVisible(true);
					 PS.close();
					 connection.close();
					 JOptionPane.showMessageDialog(Pay, "Payment Details Uploded is Succsesfull.....");
				}
				catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
	    		
	    		//JOptionPane.showMessageDialog(Pay, "Payment Details Field.....");
	    	}
	    	
	    });
		Pay.setFont(new Font("Times New Roman", Font.BOLD, 17));
		Pay.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(51, 102, 204), new Color(204, 0, 204), new Color(255, 0, 0)));
		Pay.setBounds(467, 666, 166, 44);
		panel.add(Pay);
		
		JLabel lblNewLabel_1_9_1_1_1 = new JLabel("Authorised Signatory(Name)");
		lblNewLabel_1_9_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_9_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_9_1_1_1.setBounds(927, 577, 285, 36);
		panel.add(lblNewLabel_1_9_1_1_1);
		
		textPID = new JTextField();
		textPID.setForeground(new Color(0, 0, 204));
		textPID.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textPID.setColumns(10);
		textPID.setBounds(175, 313, 250, 29);
		panel.add(textPID);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Payment Mode");
		lblNewLabel_1_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_4_1_1.setBounds(643, 313, 163, 29);
		panel.add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Payment Date");
		lblNewLabel_1_4_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_4_1_2.setBounds(666, 384, 154, 29);
		panel.add(lblNewLabel_1_4_1_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(0, 0, 153));
		separator_3.setBounds(10, 458, 1221, 11);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(new Color(0, 0, 153));
		separator_4.setBounds(10, 577, 1221, 11);
		panel.add(separator_4);
		
		comboBoxPay_M = new JComboBox();
		comboBoxPay_M.setBackground(new Color(204, 153, 204));
		comboBoxPay_M.setFont(new Font("Times New Roman", Font.BOLD, 17));
		comboBoxPay_M.setModel(new DefaultComboBoxModel(new String[] {"Paytm", "Phone Pay", "Googel Pay", "Razor Pay"}));
		comboBoxPay_M.setBounds(816, 314, 237, 28);
		panel.add(comboBoxPay_M);
		
		JLabel lblDownloadePayment = new JLabel("* Downloade Payment Invoice");
		lblDownloadePayment.setForeground(new Color(255, 0, 0));
		lblDownloadePayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblDownloadePayment.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDownloadePayment.setBounds(34, 407, 371, 41);
		panel.add(lblDownloadePayment);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(0, 0, 1241, 109);
		panel.add(panel_3);
		
		JLabel EraLogo = new JLabel();
		 path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
		    EraLogo.setBounds(50, 10, 152, 89);
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
		lblNewLabel_2.setBounds(259, 0, 782, 62);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblSarfarazhanjHardoiRoad = new JLabel("Sarfarazhanj, Hardoi Road, Lucknow-226003 (UP) India");
		lblSarfarazhanjHardoiRoad.setBounds(202, 53, 883, 29);
		panel_3.add(lblSarfarazhanjHardoiRoad);
		lblSarfarazhanjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazhanjHardoiRoad.setForeground(Color.BLUE);
		lblSarfarazhanjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JLabel lblPhoneFax = new JLabel("Phone: 0522-6600777, Fax: 0522-2407824");
		lblPhoneFax.setBounds(146, 80, 1006, 29);
		panel_3.add(lblPhoneFax);
		lblPhoneFax.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneFax.setForeground(Color.BLUE);
		lblPhoneFax.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
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
		btnBack.setBounds(1119, 10, 112, 44);
		panel_3.add(btnBack);
		
		 Photo = new JLabel("");
		Photo.setBounds(948, 616, 250, 64);
		panel.add(Photo);
		
		JButton btnNewButton = new JButton("Signature");
		btnNewButton.setBackground(new Color(102, 255, 102));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 0), new Color(0, 0, 204), new Color(255, 204, 0), new Color(255, 102, 0)));
		btnNewButton.addActionListener(new ActionListener() {
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
	              Photo.setIcon(ResizeImage(path));
	              s=path;
	          }
	           //if the user click on save in Jfilechooser
	          else if(result == JFileChooser.CANCEL_OPTION){
	              System.out.println("No File Select");
	          }
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(1079, 690, 119, 29);
		panel.add(btnNewButton);
		
		 date = new JDateChooser();
		date.setFont(new Font("Times New Roman", Font.BOLD, 15));
		date.setForeground(new Color(0, 0, 153));
		date.setBackground(new Color(204, 255, 204));
		date.setBounds(117, 187, 190, 21);
		panel.add(date);
		
		 DOB = new JDateChooser();
		DOB.setFont(new Font("Times New Roman", Font.BOLD, 15));
		DOB.setForeground(new Color(0, 0, 153));
		DOB.setBackground(new Color(204, 255, 204));
		DOB.setBounds(443, 233, 190, 21);
		panel.add(DOB);
		
		 paydate = new JDateChooser();
		paydate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		paydate.setForeground(new Color(0, 0, 153));
		paydate.setBackground(new Color(204, 255, 204));
		paydate.setBounds(821, 384, 190, 21);
		panel.add(paydate);
		
		Photo_1 = new JLabel("");
		Photo_1.setBounds(34, 470, 163, 99);
		panel.add(Photo_1);
		
		JButton btnNewButton_1 = new JButton("Upload Recipt");
		btnNewButton_1.setBackground(new Color(102, 255, 102));
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 0), new Color(0, 0, 204), new Color(255, 204, 0), new Color(255, 102, 0)));
		btnNewButton_1.addActionListener(new ActionListener() {
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
	              Photo_1.setIcon(ResizeImage1(path));
	              b=path;
	          }
	           //if the user click on save in Jfilechooser
	          else if(result == JFileChooser.CANCEL_OPTION){
	              System.out.println("No File Select");
	          }
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(214, 538, 142, 29);
		panel.add(btnNewButton_1);
		
		 PhotoRE = new JLabel("");
		PhotoRE.setBounds(727, 470, 154, 99);
		panel.add(PhotoRE);
		
		JButton btnNewButton_1_1 = new JButton("View Recipt");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
	                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payment","root","ramkumar");
	                Statement st = con.createStatement();
	                //ResultSet rs = st.executeQuery("select * from myimages where ID = '"+jtf.getText()+"'");
	                ResultSet rs = st.executeQuery("select * from FeeRecipt where Name = '"+textSTName.getText()+"'");
	                if(rs.next()){
	                    byte[] img = rs.getBytes("Upload_Recipt");



	                    //Resize The ImageIcon
	                    ImageIcon image = new ImageIcon(img);
	                    Image im = image.getImage();
	                    Image myImg = im.getScaledInstance(PhotoRE.getWidth(), PhotoRE.getHeight(),Image.SCALE_SMOOTH);
	                    ImageIcon newImage = new ImageIcon(myImg);
	                    PhotoRE.setIcon(newImage);
	                }
	                
	                
	                else{
	                    JOptionPane.showMessageDialog(null, "No Data");
	                }
	            }catch(Exception ex){
	                ex.printStackTrace();
	            }
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 0), new Color(0, 0, 204), new Color(255, 204, 0), new Color(255, 102, 0)));
		btnNewButton_1_1.setBackground(new Color(102, 255, 102));
		btnNewButton_1_1.setBounds(949, 538, 142, 29);
		panel.add(btnNewButton_1_1);
		
		textSTName = new JTextField();
		textSTName.setForeground(new Color(0, 0, 204));
		textSTName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textSTName.setColumns(10);
		textSTName.setBounds(982, 505, 190, 21);
		panel.add(textSTName);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Student Name");
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_3_1_1.setBounds(875, 495, 109, 36);
		panel.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_4_1_3 = new JLabel("Payment Amount");
		lblNewLabel_1_4_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4_1_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_4_1_3.setBounds(20, 371, 149, 29);
		panel.add(lblNewLabel_1_4_1_3);
		
		textpayamount = new JTextField();
		textpayamount.setForeground(new Color(0, 0, 204));
		textpayamount.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textpayamount.setColumns(10);
		textpayamount.setBounds(175, 371, 250, 29);
		panel.add(textpayamount);
		
		textRoll = new JTextField();
		textRoll.setForeground(new Color(0, 0, 204));
		textRoll.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textRoll.setColumns(10);
		textRoll.setBounds(117, 232, 190, 21);
		panel.add(textRoll);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Roll no");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_3.setBounds(20, 225, 109, 36);
		panel.add(lblNewLabel_1_1_3);
		
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
		btnPrint.setBackground(new Color(46, 139, 87));
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnPrint.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(51, 102, 204), new Color(204, 0, 204), new Color(255, 0, 0)));
		btnPrint.setBounds(43, 666, 166, 44);
		panel.add(btnPrint);
	}
	public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Photo.getWidth(), Photo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
	public ImageIcon ResizeImage1(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Photo_1.getWidth(), Photo_1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
}
