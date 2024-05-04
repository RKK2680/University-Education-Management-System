package Home;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import Image.image1;
import userdetails.Login;
import userdetails.project;
import userdetails.viewImage;

import javax.swing.border.BevelBorder;
import com.toedter.calendar.JDateChooser;

public  class Admission1 extends JFrame {
    JButton button ;
    JLabel label;
    JLabel UPPLabel;
    JLabel UPSLabel;
    String a,b,c,d,f,g;
    private JTextField lblFistName;
    private JTextField lblMotherName;
    private JTextField lblGender;
    private JTextField textFname;
    private JTextField textmother;
    private JTextField lblSelectCourse;
    private JTextField lblFatherName;
    private JTextField lblCast;
    private JTextField textFather;
    private JTextField lblSelectDocumentId;
    private JTextField lblLastName;
    private JTextField lblDob;
    private JTextField lblemail;
    private JTextField textlname;
    private JTextField textEmail;
    private JTextField textField_20;
    private JTextField textField_21;
    private JTextField lblhouse;
    private JTextField texthous;
    private JTextField lbllendmark;
    private JTextField textLendmark;
    private JTextField lblcity;
    private JTextField textcity;
    private JTextField lbldistric;
    private JTextField textdistric;
    private JTextField lblstate;
    private JTextField textstate;
    private JTextField lblpostoffice;
    private JTextField textpostoffice;
    private JTextField lblpincode;
    private JTextField textPincode;
    private JTextField Lblmobile;
    private JTextField textMobileadd;
    private JTextField textField_38;
    private JTextField lblho;
    private JTextField texthouse_co;
    private JTextField lblland_co;
    private JTextField textlandCo;
    private JTextField lblcityCO;
    private JTextField textcity_co;
    private JTextField lbldistric_co;
    private JTextField textDistric_co;
    private JTextField lblstateCO;
    private JTextField textstate_co;
    private JTextField lblpost_co;
    private JTextField textPost_co;
    private JTextField lblPin_co;
    private JTextField textPincode_co;
    private JTextField lblmobile;
    private JTextField textMobile_co;
    private JTextField textField_55;
    private JTextField lblExamination;
    private JTextField textHigh;
    private JTextField textEntermediate;
    private JTextField textDegree;
    private JTextField textcertifecate;
    private JTextField lbluniversty;
    private JTextField textH_U_B_name;
    private JTextField textE_U_B_name;
    private JTextField textD_U_B_name;
    private JTextField textC_U_B_name;
    private JTextField lblnameunivestry;
    private JTextField textH_U_B_F_N;
    private JTextField textE_U_B_F_N;
    private JTextField textD_U_B_F_N;
    private JTextField textC_U_B_F_N;
    private JTextField lblpassing;
    private JTextField textH_P_Y;
    private JTextField textE_P_Y;
    private JTextField textD_P_Y;
    private JTextField textC_P_Y;
    private JTextField lbltotalM;
    private JTextField textH_T_M;
    private JTextField textE_T_M;
    private JTextField textD_T_M;
    private JTextField textC_T_M;
    private JTextField lblObtinM;
    private JTextField textH_O_M;
    private JTextField textE_O_M;
    private JTextField textD_O_M;
    private JTextField textC_O_M;
    private JTextField lblPersentage;
    private JTextField lblRollNO;
    private JTextField textH_R;
    private JTextField textE_R;
    private JTextField textD_R;
    private JTextField textC_R;
    private JTextField textField_96;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JButton btnPhoto;
    private JTextField textMobile;
    private JTextField lblMobileNo;
    String s;
    String p;
	private PrinterJob printerJob;
	private JTextField textField_3;
	private JButton Sumbit_Details_2;
	private JTextField textField_5;
	private JPanel panel_1;
	private JLabel EraLogo;
	private JLabel lblNewLabel;
	private JLabel lblSarfarazhanjHardoiRoad;
	private JLabel lblPhoneFax;
	private String path;
	private JComboBox comboBoxCast;
	private JComboBox comboBox_1BCA;
	private JComboBox comboBox_2Document;
	private JRadioButton rdbtnNewRadioButtonMale;
	private JRadioButton rdbtnFemale;
	private JLabel lblPhoto;
	private JLabel lblSig;
	private JLabel high;
	private JLabel inter;
	private JLabel Degreee;
	private JLabel Goverment;
	private JTextField textField;
	private JPanel panel0;
	private JTextField textField_2;
	private JTextField textField_1;
	private JDateChooser dateChooser;
	private JButton HIGH;
	private JButton INTER;
	private JButton DEGREE;
	private JButton CERTIFICATE;
	
    public Admission1(){
    super("Set Picture Into A JLabel Using JFileChooser In Java");
    setBackground(new Color(222, 184, 135));
    getContentPane().setBackground(new Color(204, 255, 153));
    setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\eclipse-workspace\\Education Management System\\img\\contet.png"));
    setTitle("Admission Form");
    setBounds(0, 0, 1600, 1000);
    
    getContentPane().setLayout(null);
    
    JButton Print = new JButton("Print");
    Print.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 153, 51), new Color(255, 51, 255), new Color(255, 255, 153), new Color(255, 204, 0)));
    Print.setBounds(1098, 784, 131, 35);
    Print.addActionListener(new ActionListener() {
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
                
                panel0.print(g2);
         
               
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
  
    Print.setFont(new Font("Times New Roman", Font.BOLD, 18));
    Print.setBackground(new Color(240, 230, 140));
    getContentPane().add(Print);
    
    JButton Sumbit_Details = new JButton("Sumbit Details");
    Sumbit_Details.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 51, 102), new Color(0, 51, 204), new Color(255, 255, 0), new Color(51, 204, 0)));
    Sumbit_Details.setBounds(289, 784, 155, 35);
    Sumbit_Details.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admission","root","ramkumar");
				 String query = "INSERT INTO StudentAdmission values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				 PS.setString(1, textFname.getText());
				 PS.setString(2, textlname.getText());
				 if (rdbtnNewRadioButtonMale.isSelected()) 
					 	PS.setString(3, rdbtnNewRadioButtonMale.getText());
				 else 
					 	PS.setString(3, rdbtnFemale.getText());
				 SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-y");
				 String Date1=sdf1.format(dateChooser.getDate());
				 PS.setString(4, Date1);
				 PS.setString(5, textmother.getText());
				 PS.setString(6, textFather.getText());
				 PS.setString(7, textMobile.getText());
				 PS.setString(8, textEmail.getText());
				 String value=comboBoxCast.getSelectedItem().toString();
				 PS.setString(9, value);
				 String corse=comboBox_1BCA.getSelectedItem().toString();
				 PS.setString(10,corse);
				 String Document=comboBox_2Document.getSelectedItem().toString();
				 PS.setString(11, Document);
				InputStream is=new FileInputStream(new File(s));
						PS.setBlob(12, is);
						InputStream h=new FileInputStream(new File(a));
						PS.setBlob(13, h);
						InputStream io=new FileInputStream(new File(b));
						PS.setBlob(14, io);
						InputStream s=new FileInputStream(new File(c));
						PS.setBlob(15, s);
						InputStream aa=new FileInputStream(new File(d));
						PS.setBlob(16, aa);
						InputStream n=new FileInputStream(new File(f));
						PS.setBlob(17, n);
						InputStream m=new FileInputStream(new File(g));
						PS.setBlob(18, m);
				 int i=PS.executeUpdate();
				 //JOptionPane.showMessageDialog(Sumbit_Details, "Student Detail is Succsesfull.....");
				 setVisible(false);
				 PS.close();
				 connection.close();
				 
			}
			catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
    		studentAdressdetail();
    		CO_studentAdresdetail();
    		HighSchool();
    		EnterMediate();
    		Degree();
    		Certificate();
    		JOptionPane.showMessageDialog(Sumbit_Details, "Student Admission is Succsesfull.....");
    	}
    	
    });
    Sumbit_Details.setFont(new Font("Times New Roman", Font.BOLD, 18));
    Sumbit_Details.setBackground(new Color(152, 251, 152));
    getContentPane().add(Sumbit_Details);
    
    textField_3 = new JTextField();
    textField_3.setBorder(new LineBorder(new Color(51, 51, 51), 4));
    textField_3.setEditable(false);
    textField_3.setColumns(10);
    textField_3.setBackground(new Color(250, 235, 215));
    textField_3.setBounds(0, 751, 1540, 84);
    getContentPane().add(textField_3);
    
    panel0 = new JPanel();
    panel0.setBackground(new Color(153, 255, 153));
    panel0.setBounds(0, 0, 1540, 747);
    getContentPane().add(panel0);
    panel0.setLayout(null);
    
    btnPhoto = new JButton("Photo");
    btnPhoto.setBounds(105, 675, 83, 20);
    panel0.add(btnPhoto);
    btnPhoto.addActionListener(new ActionListener() {
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
	              lblPhoto.setIcon(ResizeImage1(path));
	              a=path;
	          }
	           //if the user click on save in Jfilechooser
	          else if(result == JFileChooser.CANCEL_OPTION){
	              System.out.println("No File Select");
	          }
    	}
    });
    btnPhoto.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JButton btnNewButton_4_1 = new JButton("Signature");
    btnNewButton_4_1.setBounds(309, 658, 108, 23);
    panel0.add(btnNewButton_4_1);
    btnNewButton_4_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
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
	              lblSig.setIcon(ResizeImage2(path));
	              b=path;
	          }
	           //if the user click on save in Jfilechooser
	          else if(result == JFileChooser.CANCEL_OPTION){
	              System.out.println("No File Select");
	          }
    		
    	}
    });
    btnNewButton_4_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JButton btnNewButton_6_1 = new JButton("10th Marksheet");
    btnNewButton_6_1.setBounds(541, 658, 145, 23);
    panel0.add(btnNewButton_6_1);
    btnNewButton_6_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
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
	              high.setIcon(ResizeImage3(path));
	              c=path;
	          }
	           //if the user click on save in Jfilechooser
	          else if(result == JFileChooser.CANCEL_OPTION){
	              System.out.println("No File Select");
	          }
    	}
    });
    btnNewButton_6_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JButton btnNewButton_8_1 = new JButton("12th Marksheet");
    btnNewButton_8_1.setBounds(783, 658, 145, 23);
    panel0.add(btnNewButton_8_1);
    btnNewButton_8_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
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
	              inter.setIcon(ResizeImage4(path));
	              d=path;
	          }
	           //if the user click on save in Jfilechooser
	          else if(result == JFileChooser.CANCEL_OPTION){
	              System.out.println("No File Select");
	          }
    	}
    });
    btnNewButton_8_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JButton btnNewButton_8_2 = new JButton("UG/PG Degree");
    btnNewButton_8_2.setBounds(1050, 657, 146, 23);
    panel0.add(btnNewButton_8_2);
    btnNewButton_8_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
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
	              Degreee.setIcon(ResizeImage5(path));
	              f=path;
	          }
	           //if the user click on save in Jfilechooser
	          else if(result == JFileChooser.CANCEL_OPTION){
	              System.out.println("No File Select");
	          }
    	}
    });
    btnNewButton_8_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JButton btnNewButton_8_4 = new JButton("Goverment id proof");
    btnNewButton_8_4.setBounds(1333, 657, 164, 23);
    panel0.add(btnNewButton_8_4);
    btnNewButton_8_4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
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
	              Goverment.setIcon(ResizeImage6(path));
	              g=path;
	          }
	           //if the user click on save in Jfilechooser
	          else if(result == JFileChooser.CANCEL_OPTION){
	              System.out.println("No File Select");
	          }
    	}
    });
    btnNewButton_8_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    textField_96 = new JTextField();
    textField_96.setBounds(10, 627, 193, 20);
    panel0.add(textField_96);
    textField_96.setText("Upload Document");
    textField_96.setHorizontalAlignment(SwingConstants.CENTER);
    textField_96.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textField_96.setEditable(false);
    textField_96.setColumns(10);
    
    textcertifecate = new JTextField();
    textcertifecate.setBounds(29, 586, 238, 20);
    panel0.add(textcertifecate);
    textcertifecate.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textcertifecate.setColumns(10);
    
    textDegree = new JTextField();
    textDegree.setBounds(29, 564, 238, 20);
    panel0.add(textDegree);
    textDegree.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textDegree.setColumns(10);
    
    textEntermediate = new JTextField();
    textEntermediate.setBounds(29, 543, 238, 20);
    panel0.add(textEntermediate);
    textEntermediate.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textEntermediate.setColumns(10);
    
    textHigh = new JTextField();
    textHigh.setBounds(29, 522, 238, 20);
    panel0.add(textHigh);
    textHigh.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textHigh.setColumns(10);
    
    lblExamination = new JTextField();
    lblExamination.setBounds(28, 489, 194, 22);
    panel0.add(lblExamination);
    lblExamination.setText("Examination/Course");
    lblExamination.setHorizontalAlignment(SwingConstants.CENTER);
    lblExamination.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblExamination.setEditable(false);
    lblExamination.setColumns(10);
    
    lblPersentage = new JTextField();
    lblPersentage.setBounds(1402, 489, 95, 23);
    panel0.add(lblPersentage);
    lblPersentage.setText("Percentage");
    lblPersentage.setHorizontalAlignment(SwingConstants.CENTER);
    lblPersentage.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblPersentage.setEditable(false);
    lblPersentage.setColumns(10);
    
    textC_O_M = new JTextField();
    textC_O_M.setBounds(1244, 586, 86, 20);
    panel0.add(textC_O_M);
    textC_O_M.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textC_O_M.setColumns(10);
    
    textD_O_M = new JTextField();
    textD_O_M.setBounds(1244, 564, 86, 20);
    panel0.add(textD_O_M);
    textD_O_M.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textD_O_M.setColumns(10);
    
    textE_O_M = new JTextField();
    textE_O_M.setBounds(1244, 543, 86, 20);
    panel0.add(textE_O_M);
    textE_O_M.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textE_O_M.setColumns(10);
    
    textH_O_M = new JTextField();
    textH_O_M.setBounds(1244, 521, 86, 20);
    panel0.add(textH_O_M);
    textH_O_M.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textH_O_M.setColumns(10);
    
    lblObtinM = new JTextField();
    lblObtinM.setBounds(1244, 489, 95, 24);
    panel0.add(lblObtinM);
    lblObtinM.setText("Obtain Maks");
    lblObtinM.setHorizontalAlignment(SwingConstants.CENTER);
    lblObtinM.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblObtinM.setEditable(false);
    lblObtinM.setColumns(10);
    
    lbltotalM = new JTextField();
    lbltotalM.setBounds(1110, 491, 86, 23);
    panel0.add(lbltotalM);
    lbltotalM.setText("Total Maks");
    lbltotalM.setHorizontalAlignment(SwingConstants.CENTER);
    lbltotalM.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lbltotalM.setEditable(false);
    lbltotalM.setColumns(10);
    
    textH_T_M = new JTextField();
    textH_T_M.setBounds(1109, 521, 86, 20);
    panel0.add(textH_T_M);
    textH_T_M.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textH_T_M.setColumns(10);
    
    textE_T_M = new JTextField();
    textE_T_M.setBounds(1109, 543, 86, 20);
    panel0.add(textE_T_M);
    textE_T_M.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textE_T_M.setColumns(10);
    
    textD_T_M = new JTextField();
    textD_T_M.setBounds(1109, 564, 86, 20);
    panel0.add(textD_T_M);
    textD_T_M.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textD_T_M.setColumns(10);
    
    textC_T_M = new JTextField();
    textC_T_M.setBounds(1109, 586, 86, 20);
    panel0.add(textC_T_M);
    textC_T_M.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textC_T_M.setColumns(10);
    
    lblpassing = new JTextField();
    lblpassing.setBounds(950, 491, 98, 24);
    panel0.add(lblpassing);
    lblpassing.setText("Passing Year");
    lblpassing.setHorizontalAlignment(SwingConstants.CENTER);
    lblpassing.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblpassing.setEditable(false);
    lblpassing.setColumns(10);
    
    textH_P_Y = new JTextField();
    textH_P_Y.setBounds(952, 521, 98, 20);
    panel0.add(textH_P_Y);
    textH_P_Y.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textH_P_Y.setColumns(10);
    
    textE_P_Y = new JTextField();
    textE_P_Y.setBounds(952, 543, 98, 20);
    panel0.add(textE_P_Y);
    textE_P_Y.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textE_P_Y.setColumns(10);
    
    textD_P_Y = new JTextField();
    textD_P_Y.setBounds(952, 564, 98, 20);
    panel0.add(textD_P_Y);
    textD_P_Y.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textD_P_Y.setColumns(10);
    
    textC_P_Y = new JTextField();
    textC_P_Y.setBounds(952, 586, 98, 20);
    panel0.add(textC_P_Y);
    textC_P_Y.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textC_P_Y.setColumns(10);
    
    textC_R = new JTextField();
    textC_R.setBounds(800, 586, 98, 20);
    panel0.add(textC_R);
    textC_R.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textC_R.setColumns(10);
    
    textD_R = new JTextField();
    textD_R.setBounds(800, 564, 98, 20);
    panel0.add(textD_R);
    textD_R.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textD_R.setColumns(10);
    
    textE_R = new JTextField();
    textE_R.setBounds(800, 543, 95, 20);
    panel0.add(textE_R);
    textE_R.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textE_R.setColumns(10);
    
    textH_R = new JTextField();
    textH_R.setBounds(800, 521, 95, 20);
    panel0.add(textH_R);
    textH_R.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textH_R.setColumns(10);
    
    lblRollNO = new JTextField();
    lblRollNO.setBounds(803, 489, 83, 24);
    panel0.add(lblRollNO);
    lblRollNO.setText("ROLL NO");
    lblRollNO.setHorizontalAlignment(SwingConstants.CENTER);
    lblRollNO.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblRollNO.setEditable(false);
    lblRollNO.setColumns(10);
    
    textC_U_B_F_N = new JTextField();
    textC_U_B_F_N.setBounds(560, 586, 230, 20);
    panel0.add(textC_U_B_F_N);
    textC_U_B_F_N.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textC_U_B_F_N.setColumns(10);
    
    textD_U_B_F_N = new JTextField();
    textD_U_B_F_N.setBounds(560, 564, 230, 20);
    panel0.add(textD_U_B_F_N);
    textD_U_B_F_N.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textD_U_B_F_N.setColumns(10);
    
    textE_U_B_F_N = new JTextField();
    textE_U_B_F_N.setBounds(560, 543, 230, 20);
    panel0.add(textE_U_B_F_N);
    textE_U_B_F_N.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textE_U_B_F_N.setColumns(10);
    
    textH_U_B_F_N = new JTextField();
    textH_U_B_F_N.setBounds(560, 521, 230, 20);
    panel0.add(textH_U_B_F_N);
    textH_U_B_F_N.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textH_U_B_F_N.setColumns(10);
    
    lblnameunivestry = new JTextField();
    lblnameunivestry.setBounds(558, 488, 208, 23);
    panel0.add(lblnameunivestry);
    lblnameunivestry.setText("Name of Collage/ University");
    lblnameunivestry.setHorizontalAlignment(SwingConstants.CENTER);
    lblnameunivestry.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblnameunivestry.setEditable(false);
    lblnameunivestry.setColumns(10);
    
    textD_U_B_name = new JTextField();
    textD_U_B_name.setBounds(309, 565, 220, 20);
    panel0.add(textD_U_B_name);
    textD_U_B_name.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textD_U_B_name.setColumns(10);
    
    textE_U_B_name = new JTextField();
    textE_U_B_name.setBounds(309, 544, 220, 20);
    panel0.add(textE_U_B_name);
    textE_U_B_name.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textE_U_B_name.setColumns(10);
    
    textH_U_B_name = new JTextField();
    textH_U_B_name.setBounds(309, 522, 220, 20);
    panel0.add(textH_U_B_name);
    textH_U_B_name.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textH_U_B_name.setColumns(10);
    
    lbluniversty = new JTextField();
    lbluniversty.setBounds(309, 489, 220, 22);
    panel0.add(lbluniversty);
    lbluniversty.setText(" Board / University");
    lbluniversty.setHorizontalAlignment(SwingConstants.CENTER);
    lbluniversty.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lbluniversty.setEditable(false);
    lbluniversty.setColumns(10);
    
    textC_U_B_name = new JTextField();
    textC_U_B_name.setBounds(309, 587, 220, 20);
    panel0.add(textC_U_B_name);
    textC_U_B_name.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textC_U_B_name.setColumns(10);
    
    lblho = new JTextField();
    lblho.setBounds(797, 328, 118, 20);
    panel0.add(lblho);
    lblho.setText("House/ Flaet No");
    lblho.setHorizontalAlignment(SwingConstants.LEFT);
    lblho.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblho.setEditable(false);
    lblho.setColumns(10);
    
    lblcityCO = new JTextField();
    lblcityCO.setBounds(797, 359, 73, 20);
    panel0.add(lblcityCO);
    lblcityCO.setText("City");
    lblcityCO.setHorizontalAlignment(SwingConstants.CENTER);
    lblcityCO.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblcityCO.setEditable(false);
    lblcityCO.setColumns(10);
    
    lblstateCO = new JTextField();
    lblstateCO.setBounds(797, 390, 73, 20);
    panel0.add(lblstateCO);
    lblstateCO.setText("State");
    lblstateCO.setHorizontalAlignment(SwingConstants.CENTER);
    lblstateCO.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblstateCO.setEditable(false);
    lblstateCO.setColumns(10);
    
    lblPin_co = new JTextField();
    lblPin_co.setBounds(797, 422, 73, 20);
    panel0.add(lblPin_co);
    lblPin_co.setText("Pin Code");
    lblPin_co.setHorizontalAlignment(SwingConstants.CENTER);
    lblPin_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblPin_co.setEditable(false);
    lblPin_co.setColumns(10);
    
    textPincode_co = new JTextField();
    textPincode_co.setBounds(880, 423, 155, 20);
    panel0.add(textPincode_co);
    textPincode_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textPincode_co.setColumns(10);
    
    textstate_co = new JTextField();
    textstate_co.setBounds(880, 390, 155, 20);
    panel0.add(textstate_co);
    textstate_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textstate_co.setColumns(10);
    
    textcity_co = new JTextField();
    textcity_co.setBounds(880, 359, 155, 20);
    panel0.add(textcity_co);
    textcity_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textcity_co.setColumns(10);
    
    texthouse_co = new JTextField();
    texthouse_co.setBounds(925, 328, 110, 20);
    panel0.add(texthouse_co);
    texthouse_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    texthouse_co.setColumns(10);
    
    textField_38 = new JTextField();
    textField_38.setBounds(1004, 298, 186, 20);
    panel0.add(textField_38);
    textField_38.setText(" Correspondence Address");
    textField_38.setHorizontalAlignment(SwingConstants.CENTER);
    textField_38.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textField_38.setEditable(false);
    textField_38.setColumns(10);
    
    lblland_co = new JTextField();
    lblland_co.setBounds(1150, 329, 86, 20);
    panel0.add(lblland_co);
    lblland_co.setText("Landmark");
    lblland_co.setHorizontalAlignment(SwingConstants.LEFT);
    lblland_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblland_co.setEditable(false);
    lblland_co.setColumns(10);
    
    textlandCo = new JTextField();
    textlandCo.setBounds(1243, 330, 165, 20);
    panel0.add(textlandCo);
    textlandCo.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textlandCo.setColumns(10);
    
    lbldistric_co = new JTextField();
    lbldistric_co.setBounds(1150, 360, 83, 20);
    panel0.add(lbldistric_co);
    lbldistric_co.setText("District");
    lbldistric_co.setHorizontalAlignment(SwingConstants.CENTER);
    lbldistric_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lbldistric_co.setEditable(false);
    lbldistric_co.setColumns(10);
    
    textDistric_co = new JTextField();
    textDistric_co.setBounds(1243, 360, 165, 20);
    panel0.add(textDistric_co);
    textDistric_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textDistric_co.setColumns(10);
    
    textPost_co = new JTextField();
    textPost_co.setBounds(1243, 391, 165, 20);
    panel0.add(textPost_co);
    textPost_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textPost_co.setColumns(10);
    
    textMobile_co = new JTextField();
    textMobile_co.setBounds(1243, 424, 165, 20);
    panel0.add(textMobile_co);
    textMobile_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textMobile_co.setColumns(10);
    
    lblmobile = new JTextField();
    lblmobile.setBounds(1150, 423, 86, 20);
    panel0.add(lblmobile);
    lblmobile.setText("Mobile No");
    lblmobile.setHorizontalAlignment(SwingConstants.CENTER);
    lblmobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblmobile.setEditable(false);
    lblmobile.setColumns(10);
    
    lblpost_co = new JTextField();
    lblpost_co.setBounds(1150, 391, 86, 20);
    panel0.add(lblpost_co);
    lblpost_co.setText("Post Office");
    lblpost_co.setHorizontalAlignment(SwingConstants.CENTER);
    lblpost_co.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblpost_co.setEditable(false);
    lblpost_co.setColumns(10);
    
    textMobileadd = new JTextField();
    textMobileadd.setBounds(543, 423, 167, 20);
    panel0.add(textMobileadd);
    textMobileadd.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textMobileadd.setColumns(10);
    
    textpostoffice = new JTextField();
    textpostoffice.setBounds(543, 392, 165, 20);
    panel0.add(textpostoffice);
    textpostoffice.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textpostoffice.setColumns(10);
    
    textdistric = new JTextField();
    textdistric.setBounds(545, 360, 165, 20);
    panel0.add(textdistric);
    textdistric.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textdistric.setColumns(10);
    
    textLendmark = new JTextField();
    textLendmark.setBounds(545, 330, 165, 20);
    panel0.add(textLendmark);
    textLendmark.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textLendmark.setColumns(10);
    
    lbllendmark = new JTextField();
    lbllendmark.setBounds(458, 329, 83, 20);
    panel0.add(lbllendmark);
    lbllendmark.setText("Landmark");
    lbllendmark.setHorizontalAlignment(SwingConstants.LEFT);
    lbllendmark.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lbllendmark.setEditable(false);
    lbllendmark.setColumns(10);
    
    lbldistric = new JTextField();
    lbldistric.setBounds(455, 360, 86, 20);
    panel0.add(lbldistric);
    lbldistric.setText("District");
    lbldistric.setHorizontalAlignment(SwingConstants.CENTER);
    lbldistric.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lbldistric.setEditable(false);
    lbldistric.setColumns(10);
    
    lblpostoffice = new JTextField();
    lblpostoffice.setBounds(455, 391, 86, 20);
    panel0.add(lblpostoffice);
    lblpostoffice.setText("Post Office");
    lblpostoffice.setHorizontalAlignment(SwingConstants.CENTER);
    lblpostoffice.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblpostoffice.setEditable(false);
    lblpostoffice.setColumns(10);
    
    Lblmobile = new JTextField();
    Lblmobile.setBounds(455, 422, 86, 20);
    panel0.add(Lblmobile);
    Lblmobile.setText("Mobile No");
    Lblmobile.setHorizontalAlignment(SwingConstants.CENTER);
    Lblmobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
    Lblmobile.setEditable(false);
    Lblmobile.setColumns(10);
    
    textField_21 = new JTextField();
    textField_21.setBounds(309, 308, 139, 20);
    panel0.add(textField_21);
    textField_21.setText("Permanent Address");
    textField_21.setHorizontalAlignment(SwingConstants.CENTER);
    textField_21.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textField_21.setEditable(false);
    textField_21.setColumns(10);
    
    lblhouse = new JTextField();
    lblhouse.setBounds(66, 328, 118, 20);
    panel0.add(lblhouse);
    lblhouse.setText("House/ Flaet No");
    lblhouse.setHorizontalAlignment(SwingConstants.LEFT);
    lblhouse.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblhouse.setEditable(false);
    lblhouse.setColumns(10);
    
    texthous = new JTextField();
    texthous.setBounds(185, 328, 110, 20);
    panel0.add(texthous);
    texthous.setFont(new Font("Times New Roman", Font.BOLD, 15));
    texthous.setColumns(10);
    
    textcity = new JTextField();
    textcity.setBounds(142, 359, 155, 20);
    panel0.add(textcity);
    textcity.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textcity.setColumns(10);
    
    lblcity = new JTextField();
    lblcity.setBounds(66, 359, 73, 20);
    panel0.add(lblcity);
    lblcity.setText("City");
    lblcity.setHorizontalAlignment(SwingConstants.CENTER);
    lblcity.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblcity.setEditable(false);
    lblcity.setColumns(10);
    
    lblstate = new JTextField();
    lblstate.setBounds(66, 390, 73, 20);
    panel0.add(lblstate);
    lblstate.setText("State");
    lblstate.setHorizontalAlignment(SwingConstants.CENTER);
    lblstate.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblstate.setEditable(false);
    lblstate.setColumns(10);
    
    textstate = new JTextField();
    textstate.setBounds(142, 391, 155, 20);
    panel0.add(textstate);
    textstate.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textstate.setColumns(10);
    
    textPincode = new JTextField();
    textPincode.setBounds(142, 421, 155, 20);
    panel0.add(textPincode);
    textPincode.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textPincode.setColumns(10);
    
    lblpincode = new JTextField();
    lblpincode.setBounds(66, 422, 73, 20);
    panel0.add(lblpincode);
    lblpincode.setText("Pin Code");
    lblpincode.setHorizontalAlignment(SwingConstants.CENTER);
    lblpincode.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblpincode.setEditable(false);
    lblpincode.setColumns(10);
    
    textField_55 = new JTextField();
    textField_55.setBounds(10, 459, 193, 20);
    panel0.add(textField_55);
    textField_55.setText("Educational Details");
    textField_55.setHorizontalAlignment(SwingConstants.CENTER);
    textField_55.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textField_55.setEditable(false);
    textField_55.setColumns(10);
    
    textField_20 = new JTextField();
    textField_20.setBounds(10, 283, 199, 20);
    panel0.add(textField_20);
    textField_20.setText("Address");
    textField_20.setHorizontalAlignment(SwingConstants.CENTER);
    textField_20.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textField_20.setEditable(false);
    textField_20.setColumns(10);
    
    textField_5 = new JTextField();
    textField_5.setEditable(false);
    textField_5.setColumns(10);
    textField_5.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    textField_5.setBackground(new Color(250, 235, 215));
    textField_5.setBounds(10, 300, 1510, 156);
    panel0.add(textField_5);
    
    lblCast = new JTextField();
    lblCast.setBounds(709, 251, 142, 22);
    panel0.add(lblCast);
    lblCast.setText("Cast*");
    lblCast.setHorizontalAlignment(SwingConstants.CENTER);
    lblCast.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblCast.setEditable(false);
    lblCast.setColumns(10);
    
    lblFatherName = new JTextField();
    lblFatherName.setBounds(709, 222, 131, 20);
    panel0.add(lblFatherName);
    lblFatherName.setText("Father Name:*");
    lblFatherName.setHorizontalAlignment(SwingConstants.CENTER);
    lblFatherName.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblFatherName.setEditable(false);
    lblFatherName.setColumns(10);
    
    lblMotherName = new JTextField();
    lblMotherName.setBounds(709, 190, 124, 20);
    panel0.add(lblMotherName);
    lblMotherName.setText("Mother Name:*");
    lblMotherName.setHorizontalAlignment(SwingConstants.CENTER);
    lblMotherName.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblMotherName.setEditable(false);
    lblMotherName.setColumns(10);
    
    lblLastName = new JTextField();
    lblLastName.setBounds(709, 160, 125, 20);
    panel0.add(lblLastName);
    lblLastName.setText("Last Name:*");
    lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
    lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblLastName.setEditable(false);
    lblLastName.setColumns(10);
    
    textlname = new JTextField();
    textlname.setBounds(844, 160, 149, 20);
    panel0.add(textlname);
    textlname.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textlname.setColumns(10);
    
    textmother = new JTextField();
    textmother.setBounds(843, 190, 155, 20);
    panel0.add(textmother);
    textmother.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textmother.setColumns(10);
    
    textFather = new JTextField();
    textFather.setBounds(843, 224, 155, 20);
    panel0.add(textFather);
    textFather.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textFather.setColumns(10);
    
     comboBoxCast = new JComboBox();
    comboBoxCast.setBounds(853, 251, 145, 22);
    panel0.add(comboBoxCast);
    comboBoxCast.setModel(new DefaultComboBoxModel(new String[] {"Genral", "OBC", "SC", "ST"}));
    comboBoxCast.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    lblSelectDocumentId = new JTextField();
    lblSelectDocumentId.setBounds(1148, 252, 147, 20);
    panel0.add(lblSelectDocumentId);
    lblSelectDocumentId.setText("Select Document ID*");
    lblSelectDocumentId.setHorizontalAlignment(SwingConstants.CENTER);
    lblSelectDocumentId.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblSelectDocumentId.setEditable(false);
    lblSelectDocumentId.setColumns(10);
    
    lblSelectCourse = new JTextField();
    lblSelectCourse.setBounds(1138, 221, 135, 22);
    panel0.add(lblSelectCourse);
    lblSelectCourse.setText("Select Course*");
    lblSelectCourse.setHorizontalAlignment(SwingConstants.CENTER);
    lblSelectCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblSelectCourse.setEditable(false);
    lblSelectCourse.setColumns(10);
    
    lblemail = new JTextField();
    lblemail.setBounds(1138, 190, 124, 20);
    panel0.add(lblemail);
    lblemail.setText("Email Id");
    lblemail.setHorizontalAlignment(SwingConstants.CENTER);
    lblemail.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblemail.setEditable(false);
    lblemail.setColumns(10);
    
    lblMobileNo = new JTextField();
    lblMobileNo.setBounds(1130, 158, 124, 20);
    panel0.add(lblMobileNo);
    lblMobileNo.setText("Mobile NO:*");
    lblMobileNo.setHorizontalAlignment(SwingConstants.CENTER);
    lblMobileNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblMobileNo.setEditable(false);
    lblMobileNo.setColumns(10);
    
    textMobile = new JTextField();
    textMobile.setBounds(1258, 160, 199, 20);
    panel0.add(textMobile);
    textMobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textMobile.setColumns(10);
    
    textEmail = new JTextField();
    textEmail.setBounds(1266, 192, 199, 20);
    panel0.add(textEmail);
    textEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textEmail.setColumns(10);
    
     comboBox_1BCA = new JComboBox();
    comboBox_1BCA.setBounds(1287, 220, 145, 22);
    panel0.add(comboBox_1BCA);
    comboBox_1BCA.setModel(new DefaultComboBoxModel(new String[] {"BCA", "MCA", "Biotech", "Nursing", "Libral of Art", "Food & Nutrision", "Bpharma", "Dpharma"}));
    comboBox_1BCA.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    comboBox_2Document = new JComboBox();
    comboBox_2Document.setBounds(1297, 251, 123, 22);
    panel0.add(comboBox_2Document);
    comboBox_2Document.setModel(new DefaultComboBoxModel(new String[] {"Adhar Card", "Passport", "Driving Licence", "Voter ID Card", "Passbook", "Ration Cord", "Water Bil", "Electricity Bil"}));
    comboBox_2Document.setFont(new Font("Times New Roman", Font.BOLD, 15));
    label = new JLabel();
    label.setBounds(43, 153, 172, 120);
    panel0.add(label);
    
    lblFistName = new JTextField();
    lblFistName.setBounds(269, 156, 124, 20);
    panel0.add(lblFistName);
    lblFistName.setText("Fist Name:*");
    lblFistName.setHorizontalAlignment(SwingConstants.CENTER);
    lblFistName.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblFistName.setEditable(false);
    lblFistName.setColumns(10);
    
    lblDob = new JTextField();
    lblDob.setBounds(268, 186, 125, 20);
    panel0.add(lblDob);
    lblDob.setText("DOB*");
    lblDob.setHorizontalAlignment(SwingConstants.CENTER);
    lblDob.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblDob.setEditable(false);
    lblDob.setColumns(10);
    
    lblGender = new JTextField();
    lblGender.setBounds(269, 218, 124, 20);
    panel0.add(lblGender);
    lblGender.setText("Gender*");
    lblGender.setHorizontalAlignment(SwingConstants.CENTER);
    lblGender.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblGender.setEditable(false);
    lblGender.setColumns(10);
    button = new JButton("Browse");
    button.setBackground(new Color(0, 153, 102));
    button.setBounds(268, 249, 146, 24);
    panel0.add(button);
    button.setFont(new Font("Times New Roman", Font.BOLD, 20));
    
     rdbtnFemale = new JRadioButton("Female");
    rdbtnFemale.setBounds(420, 247, 108, 23);
    panel0.add(rdbtnFemale);
    buttonGroup.add(rdbtnFemale);
    rdbtnFemale.setHorizontalAlignment(SwingConstants.CENTER);
    rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
     rdbtnNewRadioButtonMale = new JRadioButton("Male");
    rdbtnNewRadioButtonMale.setBounds(420, 215, 108, 23);
    panel0.add(rdbtnNewRadioButtonMale);
    buttonGroup.add(rdbtnNewRadioButtonMale);
    rdbtnNewRadioButtonMale.setHorizontalAlignment(SwingConstants.CENTER);
    rdbtnNewRadioButtonMale.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    textFname = new JTextField();
    textFname.setBounds(403, 156, 155, 20);
    panel0.add(textFname);
    textFname.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textFname.setColumns(10);
    
    panel_1 = new JPanel();
    panel_1.setLayout(null);
    panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel_1.setBackground(new Color(135, 206, 235));
    panel_1.setBounds(0, 0, 1540, 136);
    panel0.add(panel_1);
    
    EraLogo = new JLabel();
    path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
    EraLogo.setBounds(49, 10, 173, 116);
    ImageIcon imageIcon1=new ImageIcon(path);
    Image imgImage1=imageIcon1.getImage();
    Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
	 ImageIcon image1=new ImageIcon(newiImage1);
	EraLogo.setIcon(image1);
    panel_1.add(EraLogo);
    
    lblNewLabel = new JLabel("Era University Lucknow");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setForeground(new Color(0, 0, 153));
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
    lblNewLabel.setBounds(310, 0, 782, 44);
    panel_1.add(lblNewLabel);
    
    lblSarfarazhanjHardoiRoad = new JLabel("Sarfarazhanj, Hardoi Road, Lucknow-226003 (UP) India");
    lblSarfarazhanjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
    lblSarfarazhanjHardoiRoad.setForeground(Color.BLUE);
    lblSarfarazhanjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblSarfarazhanjHardoiRoad.setBounds(251, 41, 883, 29);
    panel_1.add(lblSarfarazhanjHardoiRoad);
    
    lblPhoneFax = new JLabel("Phone: 0522-6600777, Fax: 0522-2407824");
    lblPhoneFax.setHorizontalAlignment(SwingConstants.CENTER);
    lblPhoneFax.setForeground(Color.BLUE);
    lblPhoneFax.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblPhoneFax.setBounds(383, 69, 663, 29);
    panel_1.add(lblPhoneFax);
    
    JLabel lblOnlineAdmissionForm = new JLabel("Online Admission Form");
    lblOnlineAdmissionForm.setHorizontalAlignment(SwingConstants.CENTER);
    lblOnlineAdmissionForm.setForeground(new Color(0, 0, 0));
    lblOnlineAdmissionForm.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblOnlineAdmissionForm.setBounds(383, 97, 663, 29);
    panel_1.add(lblOnlineAdmissionForm);
    
    Sumbit_Details_2 = new JButton("Back");
    Sumbit_Details_2.setBounds(1432, 10, 98, 35);
    panel_1.add(Sumbit_Details_2);
    Sumbit_Details_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		project.main(null);
    		dispose();
    	}
    });
    Sumbit_Details_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
    Sumbit_Details_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 153, 51), new Color(204, 0, 255), new Color(255, 0, 0), new Color(204, 0, 0)));
    Sumbit_Details_2.setBackground(new Color(255, 69, 0));
    
    lblPhoto = new JLabel("");
    lblPhoto.setBounds(20, 657, 75, 72);
    panel0.add(lblPhoto);
    
    lblSig = new JLabel("");
    lblSig.setBounds(198, 657, 101, 72);
    panel0.add(lblSig);
    
    high = new JLabel("");
    high.setBounds(427, 662, 114, 72);
    panel0.add(high);
    
    inter = new JLabel("");
    inter.setBounds(689, 662, 89, 72);
    panel0.add(inter);
    
    Degreee = new JLabel("");
    Degreee.setBounds(930, 662, 114, 72);
    panel0.add(Degreee);
    
    Goverment = new JLabel("");
    Goverment.setBounds(1206, 662, 114, 72);
    panel0.add(Goverment);
    
    textField = new JTextField();
    textField.setEditable(false);
    textField.setColumns(10);
    textField.setBorder(new LineBorder(new Color(51, 51, 51), 4));
    textField.setBackground(new Color(250, 235, 215));
    textField.setBounds(10, 645, 1510, 97);
    panel0.add(textField);
    
     HIGH = new JButton("");
    HIGH.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		double i=Double.parseDouble(textH_T_M.getText());
       		double j=Double.parseDouble(textH_O_M.getText());
       	
       		HIGH.setText(" "+(j/i)*100+"%");
    	}
    });
    HIGH.setBackground(new Color(255, 204, 255));
    HIGH.setFont(new Font("Times New Roman", Font.BOLD, 15));
    HIGH.setBounds(1402, 522, 95, 21);
    panel0.add(HIGH);
    
    INTER = new JButton("");
    INTER.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		double i=Double.parseDouble(textE_T_M.getText());
       		double j=Double.parseDouble(textE_O_M.getText());
       	
       		INTER.setText(" "+(j/i)*100+"%");
    	}
    });
    INTER.setFont(new Font("Times New Roman", Font.BOLD, 15));
    INTER.setBackground(new Color(255, 204, 255));
    INTER.setBounds(1402, 544, 95, 21);
    panel0.add(INTER);
    
    DEGREE = new JButton("");
    DEGREE.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		double i=Double.parseDouble(textD_T_M.getText());
       		double j=Double.parseDouble(textD_O_M.getText());
       	
       		DEGREE.setText(" "+(j/i)*100+"%");
    	}
    });
    DEGREE.setFont(new Font("Times New Roman", Font.BOLD, 15));
    DEGREE.setBackground(new Color(255, 204, 255));
    DEGREE.setBounds(1402, 565, 95, 21);
    panel0.add(DEGREE);
    
     CERTIFICATE = new JButton("");
    CERTIFICATE.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		double i=Double.parseDouble(textC_T_M.getText());
       		double j=Double.parseDouble(textC_O_M.getText());
       	
       		CERTIFICATE.setText(" "+(j/i)*100+"%");
    	}
    });
    CERTIFICATE.setFont(new Font("Times New Roman", Font.BOLD, 15));
    CERTIFICATE.setBackground(new Color(255, 204, 255));
    CERTIFICATE.setBounds(1402, 585, 95, 21);
    panel0.add(CERTIFICATE);
    
    textField_2 = new JTextField();
    textField_2.setEditable(false);
    textField_2.setColumns(10);
    textField_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    textField_2.setBackground(new Color(250, 235, 215));
    textField_2.setBounds(10, 479, 1510, 143);
    panel0.add(textField_2);
    
     dateChooser = new JDateChooser();
    dateChooser.setBounds(403, 190, 155, 19);
    panel0.add(dateChooser);
    
    textField_1 = new JTextField();
    textField_1.setEditable(false);
    textField_1.setColumns(10);
    textField_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    textField_1.setBackground(new Color(250, 235, 215));
    textField_1.setBounds(10, 128, 1510, 156);
    panel0.add(textField_1);
    
    button.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        
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
              label.setIcon(ResizeImage(path));
              s=path;
          }
           //if the user click on save in Jfilechooser


          else if(result == JFileChooser.CANCEL_OPTION){
              System.out.println("No File Select");
          }
        }
    });
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(1580,882);
    setVisible(true);
    }

	// Methode to resize imageIcon with the same size of a Jlabel
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
   
    public static void main(String[] args){
        new Admission1();
    }
    public void studentAdressdetail() {
		try {
			Connection conne = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admission","root","ramkumar");
			 String q = "INSERT INTO studentAddres values (?,?,?,?,?,?,?,?)";
			 PreparedStatement PST=conne.prepareStatement(q) ;
			 PST.setString(1, texthous.getText());
			 PST.setString(2, textLendmark.getText());
			 PST.setString(3, textcity.getText());
			 PST.setString(4, textdistric.getText());
			 PST.setString(5, textstate.getText());
			 PST.setString(6, textpostoffice.getText());
			 PST.setString(7, textPincode.getText());
			 PST.setString(8, textMobileadd.getText());
			 int i=PST.executeUpdate();
			// JOptionPane.showMessageDialog(null, "Student Detail is Succsesfull.....");
			 setVisible(false);
			 new Login().setVisible(true);
			 PST.close();
			 conne.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public void CO_studentAdresdetail() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admission","root","ramkumar");
		 String qu = "INSERT INTO Co_studentAddres values (?,?,?,?,?,?,?,?)";
		 PreparedStatement P=conn.prepareStatement(qu) ;
		 	P.setString(1, texthouse_co.getText());
		 	P.setString(2, textlandCo.getText());
		 	P.setString(3, textcity_co.getText());
		 	P.setString(4, textDistric_co.getText());
		 	P.setString(5, textstate_co.getText());
		 	P.setString(6, textPost_co.getText());
		 	P.setString(7, textPincode_co.getText());
		 	P.setString(8, textMobile_co.getText());
		 	 int i=P.executeUpdate();
			 //JOptionPane.showMessageDialog(null, "Co_Student Detail is Succsesfull.....");
			 setVisible(false);
			 new Login().setVisible(true);
			 P.close();
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public void HighSchool() {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admission","root","ramkumar");
		 String qu = "INSERT INTO Qulification values (?,?,?,?,?,?,?,?)";
		 PreparedStatement P=conn.prepareStatement(qu) ;
		 	 P.setString(1, textHigh.getText());
		 	 P.setString(2, textH_U_B_name.getText());
			 P.setString(3, textH_U_B_F_N.getText());
			 P.setString(4, textH_R.getText());
			 P.setString(5, textH_P_Y.getText());
			 P.setString(6, textH_T_M.getText());
			 P.setString(7, textH_O_M.getText());
			 P.setString(8, HIGH.getText());
			 
		 	 int i=P.executeUpdate();
			 //JOptionPane.showMessageDialog(null, "HighSchool Detail is Succsesfull.....");
			 setVisible(false);
			 new Login().setVisible(true);
			 P.close();
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public void EnterMediate() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admission","root","ramkumar");
		 String qu = "INSERT INTO Qulification values (?,?,?,?,?,?,?,?)";
		 PreparedStatement P=conn.prepareStatement(qu) ;
		 P.setString(1, textEntermediate.getText());
		 P.setString(2, textE_U_B_name.getText());
		 P.setString(3, textE_U_B_F_N.getText());
		 P.setString(4, textE_R.getText());
		 P.setString(5, textE_P_Y.getText());
		 P.setString(6, textE_T_M.getText());
		 P.setString(7, textE_O_M.getText());
		 P.setString(8, INTER.getText());
		 
		 	 int i=P.executeUpdate();
			 //JOptionPane.showMessageDialog(null, "EnterMediate Detail is Succsesfull.....");
			 setVisible(false);
			 //new Login().setVisible(true);
			 P.close();
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public void Degree() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admission","root","ramkumar");
		 String qu = "INSERT INTO Qulification values (?,?,?,?,?,?,?,?)";
		 PreparedStatement P=conn.prepareStatement(qu) ;
		 P.setString(1, textDegree.getText());
		 P.setString(2, textD_U_B_name.getText());
		 P.setString(3, textD_U_B_F_N.getText());
		 P.setString(4, textD_R.getText());
		 P.setString(5, textD_P_Y.getText());
		 P.setString(6, textD_T_M.getText());
		 P.setString(7, textD_O_M.getText());
		 P.setString(8, DEGREE.getText());
		 
		 	 int i=P.executeUpdate();
			 //JOptionPane.showMessageDialog(null, "Degree Detail is Succsesfull.....");
			 setVisible(false);
			 //new Login().setVisible(true);
			 P.close();
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public void Certificate() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admission","root","ramkumar");
		 String qu = "INSERT INTO Qulification values (?,?,?,?,?,?,?,?)";
		 PreparedStatement P=conn.prepareStatement(qu) ;
		 P.setString(1, textcertifecate.getText());
		 P.setString(2, textC_U_B_name.getText());
		 P.setString(3, textC_U_B_F_N.getText());
		 P.setString(4, textC_R.getText());
		 P.setString(5, textC_P_Y.getText());
		 P.setString(6, textC_T_M.getText());
		 P.setString(7, textC_O_M.getText());
		 P.setString(8, CERTIFICATE.getText());
		 
		 	 int i=P.executeUpdate();
			 //JOptionPane.showMessageDialog(null, "Certificate Detail is Succsesfull.....");
			 setVisible(false);
			 //new Login().setVisible(true);
			 P.close();
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public ImageIcon ResizeImage1(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public ImageIcon ResizeImage2(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblSig.getWidth(), lblSig.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public ImageIcon ResizeImage3(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(high.getWidth(), high.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public ImageIcon ResizeImage4(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(inter.getWidth(), inter.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public ImageIcon ResizeImage5(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Degreee.getWidth(), Degreee.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public ImageIcon ResizeImage6(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Goverment.getWidth(), Goverment.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
   }

