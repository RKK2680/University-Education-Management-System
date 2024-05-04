package userdetails;

import java.awt.Font;
import java.awt.Image;
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
import java.sql.SQLException;

import javax.management.loading.PrivateClassLoader;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import Home.Admission1;
import userdetails.Login;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;



public class FecultyRegister extends JFrame{
   
	JButton brbtn ;
    JLabel Photolabel;
	private File file;
    String s;
    private JTextField textFecultyID;
    private JTextField textFecultyName;
    private JTextField textDOB;
    private JComboBox comboBoxF_W;
    private JTextField textMobile;
    private JPasswordField passwordField;
    private JTextField textEmail;
    private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBoxCOM;
	private JLabel EraLogo;
	private String path;
	private JRadioButton rdbtnNewRadioButton1Male;
	private JRadioButton rdbtnNewRadioButton2Female;
     
    public FecultyRegister(){
    	super("Set Picture Into A JLabel Using JFileChooser In Java");
    	setTitle("Feculty Regester");
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
    	setResizable(false);
    setBounds(500, 600, 1200, 900);
    getContentPane().setBackground(new Color(153, 102, 255));
    
    getContentPane().setLayout(null);
    
    JPanel panel = new JPanel();
    panel.setBackground(new Color(0, 204, 102));
    panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel.setBounds(40, 144, 1158, 642);
    getContentPane().add(panel);
    panel.setLayout(null);
    brbtn = new JButton("Browse");
    brbtn.setBackground(new Color(0, 255, 153));
    brbtn.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(153, 0, 51), new Color(255, 51, 204), new Color(102, 51, 255), new Color(255, 51, 255)));
    brbtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
    brbtn.setBounds(130, 474, 156, 40);
    panel.add(brbtn);
    Photolabel = new JLabel();
    Photolabel.setBounds(184, 215, 183, 203);
    panel.add(Photolabel);
    
    JButton save = new JButton("Save");
    save.setEnabled(false);
    save.setFont(new Font("Times New Roman", Font.BOLD, 15));
    save.setBounds(334, 474, 156, 40);
    panel.add(save);
    
    comboBoxCOM = new JComboBox();
    comboBoxCOM.setModel(new DefaultComboBoxModel(new String[] {"Computer Scinence Department", "Biotech Department", "Food & Nutrition", "Libral & Art", "Pharmecy", "Nursing"}));
    comboBoxCOM.setMaximumRowCount(10);
    comboBoxCOM.setForeground(Color.BLACK);
    comboBoxCOM.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxCOM.setBackground(new Color(51, 102, 204));
    comboBoxCOM.setBounds(268, 100, 238, 34);
    panel.add(comboBoxCOM);
    
    JLabel txtFistName_1_1 = new JLabel();
    txtFistName_1_1.setBackground(new Color(240, 240, 240));
    txtFistName_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 51), new Color(153, 255, 0), new Color(255, 102, 204), new Color(0, 102, 204)));
    txtFistName_1_1.setText("Select Department");
    txtFistName_1_1.setHorizontalAlignment(SwingConstants.CENTER);
    txtFistName_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtFistName_1_1.setBounds(91, 100, 156, 26);
    panel.add(txtFistName_1_1);
    
    JPanel panel_1 = new JPanel();
    panel_1.setBackground(new Color(204, 102, 102));
    panel_1.setBounds(541, 24, 522, 578);
    panel.add(panel_1);
    panel_1.setLayout(null);
    
    JButton Login = new JButton("Login");
    Login.setBounds(363, 485, 116, 41);
    panel_1.add(Login);
    Login.setFont(new Font("Tahoma", Font.BOLD, 20));
    Login.setBackground(new Color(0, 255, 51));
    
    JButton Sinup = new JButton("Sinup");
    Sinup.setBounds(71, 486, 148, 40);
    panel_1.add(Sinup);
    Sinup.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
				 String query = "INSERT INTO FecultyRegistretion values (?,?,?,?,?,?,?,?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				 String Dept=comboBoxCOM.getSelectedItem().toString();
				 PS.setString(1,Dept);
				 PS.setString(2, textFecultyID.getText());
				 PS.setString(3, textFecultyName.getText());
				 
				 if (rdbtnNewRadioButton1Male.isSelected()) 
					 	PS.setString(4, rdbtnNewRadioButton1Male.getText());
				 else 
					 	PS.setString(4, rdbtnNewRadioButton2Female.getText());
				 PS.setString(5, textDOB.getText());
				 String Fecultywork=comboBoxF_W.getSelectedItem().toString();
				 PS.setString(6,Fecultywork);
				 PS.setString(7, textMobile.getText());
				 PS.setString(8, passwordField.getText());
				 PS.setString(9, textEmail.getText());
				 
				InputStream is=new FileInputStream(new File(s));
						PS.setBlob(10, is);
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(Sinup, "Feculty Registretion is Sccsesfull.....");
				 setVisible(false);
				 new Login().setVisible(true);
				 PS.close();
				 connection.close();
			}
			catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
		
    	}
    });
    Sinup.setForeground(Color.BLACK);
    Sinup.setFont(new Font("Tahoma", Font.BOLD, 18));
    Sinup.setBackground(new Color(255, 153, 51));
    
    textFecultyID = new JTextField();
    textFecultyID.setBounds(189, 130, 243, 26);
    panel_1.add(textFecultyID);
    textFecultyID.setForeground(new Color(255, 69, 0));
    textFecultyID.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textFecultyID.setColumns(10);
    
    textFecultyName = new JTextField();
    textFecultyName.setBounds(189, 172, 243, 26);
    panel_1.add(textFecultyName);
    textFecultyName.setForeground(new Color(255, 69, 0));
    textFecultyName.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textFecultyName.setColumns(10);
    
     rdbtnNewRadioButton1Male = new JRadioButton("male");
    rdbtnNewRadioButton1Male.setBounds(192, 221, 103, 21);
    panel_1.add(rdbtnNewRadioButton1Male);
    buttonGroup.add(rdbtnNewRadioButton1Male);
    rdbtnNewRadioButton1Male.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    rdbtnNewRadioButton2Female = new JRadioButton("female");
    rdbtnNewRadioButton2Female.setBounds(329, 221, 103, 21);
    panel_1.add(rdbtnNewRadioButton2Female);
    buttonGroup.add(rdbtnNewRadioButton2Female);
    rdbtnNewRadioButton2Female.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    textDOB = new JTextField();
    textDOB.setBounds(189, 256, 246, 26);
    panel_1.add(textDOB);
    textDOB.setForeground(new Color(255, 69, 0));
    textDOB.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textDOB.setColumns(10);
    
    comboBoxF_W = new JComboBox();
    comboBoxF_W.setBounds(189, 292, 243, 26);
    panel_1.add(comboBoxF_W);
    comboBoxF_W.setModel(new DefaultComboBoxModel(new String[] {"Head Of Depertment (HOD)", "Senior Associate Prof.", "Junior Associate Prof.", "Senior Assistaint Prof.", "Junior Assistaint Prof.", "Lecturer", "Lab Assistent", "Office Assistent", "Clark", "Worker"}));
    comboBoxF_W.setMaximumRowCount(10);
    comboBoxF_W.setForeground(Color.BLACK);
    comboBoxF_W.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxF_W.setBackground(new Color(51, 102, 204));
    
    textMobile = new JTextField();
    textMobile.setBounds(189, 328, 243, 26);
    panel_1.add(textMobile);
    textMobile.setForeground(new Color(255, 69, 0));
    textMobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textMobile.setColumns(10);
    
    passwordField = new JPasswordField();
    passwordField.setBounds(189, 366, 243, 26);
    panel_1.add(passwordField);
    passwordField.setForeground(new Color(255, 69, 0));
    passwordField.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    textEmail = new JTextField();
    textEmail.setBounds(189, 402, 243, 26);
    panel_1.add(textEmail);
    textEmail.setForeground(new Color(255, 69, 0));
    textEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textEmail.setColumns(10);
    
    JLabel txtLastName_1 = new JLabel();
    txtLastName_1.setBackground(new Color(240, 240, 240));
    txtLastName_1.setBorder(null);
    txtLastName_1.setBounds(51, 133, 86, 20);
    panel_1.add(txtLastName_1);
    txtLastName_1.setHorizontalTextPosition(SwingConstants.LEADING);
    txtLastName_1.setText("Feculty ID*");
    txtLastName_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JLabel txtFistName_1 = new JLabel();
    txtFistName_1.setBackground(new Color(240, 240, 240));
    txtFistName_1.setBorder(null);
    txtFistName_1.setBounds(51, 175, 100, 20);
    panel_1.add(txtFistName_1);
    txtFistName_1.setHorizontalTextPosition(SwingConstants.LEADING);
    txtFistName_1.setText("Feculty Name*");
    txtFistName_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JLabel textField_9 = new JLabel();
    textField_9.setBackground(new Color(240, 240, 240));
    textField_9.setBorder(null);
    textField_9.setBounds(51, 218, 95, 26);
    panel_1.add(textField_9);
    textField_9.setHorizontalTextPosition(SwingConstants.LEADING);
    textField_9.setText("Gender*");
    textField_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JLabel txtDob_1 = new JLabel();
    txtDob_1.setBackground(new Color(240, 240, 240));
    txtDob_1.setBorder(null);
    txtDob_1.setBounds(51, 259, 86, 20);
    panel_1.add(txtDob_1);
    txtDob_1.setHorizontalTextPosition(SwingConstants.LEADING);
    txtDob_1.setText("DOB*");
    txtDob_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JLabel lblNewLabel_1_9 = new JLabel("Designation*");
    lblNewLabel_1_9.setBackground(new Color(240, 240, 240));
    lblNewLabel_1_9.setBorder(null);
    lblNewLabel_1_9.setBounds(51, 292, 116, 26);
    panel_1.add(lblNewLabel_1_9);
    lblNewLabel_1_9.setHorizontalTextPosition(SwingConstants.LEADING);
    lblNewLabel_1_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JLabel txtMobileNo_1 = new JLabel();
    txtMobileNo_1.setBackground(new Color(240, 240, 240));
    txtMobileNo_1.setBorder(null);
    txtMobileNo_1.setBounds(51, 328, 86, 20);
    panel_1.add(txtMobileNo_1);
    txtMobileNo_1.setHorizontalTextPosition(SwingConstants.LEADING);
    txtMobileNo_1.setText("Mobile no");
    txtMobileNo_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JLabel textField_14 = new JLabel();
    textField_14.setBackground(new Color(240, 240, 240));
    textField_14.setBorder(null);
    textField_14.setBounds(51, 366, 95, 26);
    panel_1.add(textField_14);
    textField_14.setHorizontalTextPosition(SwingConstants.LEADING);
    textField_14.setText("Password*");
    textField_14.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JLabel txtEmailId_1 = new JLabel();
    txtEmailId_1.setBackground(new Color(240, 240, 240));
    txtEmailId_1.setBorder(null);
    txtEmailId_1.setBounds(51, 403, 86, 20);
    panel_1.add(txtEmailId_1);
    txtEmailId_1.setHorizontalTextPosition(SwingConstants.LEADING);
    txtEmailId_1.setText("Email Id*");
    txtEmailId_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JLabel lblNewLabel = new JLabel("Feculty Registration");
    lblNewLabel.setBackground(new Color(240, 240, 240));
    lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 51), new Color(153, 255, 0), new Color(255, 102, 204), new Color(0, 102, 204)));
    lblNewLabel.setBounds(29, 40, 470, 44);
    panel_1.add(lblNewLabel);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    
    JButton btnExit = new JButton("Exit");
    btnExit.setBounds(1073, 0, 81, 40);
    panel.add(btnExit);
    btnExit.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		dispose();
    	}
    });
    btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
    btnExit.setBackground(new Color(255, 69, 0));
    
    JPanel panel_2 = new JPanel();
    panel_2.setLayout(null);
    panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel_2.setBackground(new Color(135, 206, 235));
    panel_2.setBounds(10, 10, 1213, 127);
    getContentPane().add(panel_2);
    
    EraLogo = new JLabel();
    path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
    EraLogo.setBounds(68, 10, 194, 107);
    ImageIcon imageIcon1=new ImageIcon(path);
	Image imgImage1=imageIcon1.getImage();
	Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon image1=new ImageIcon(newiImage1);
	EraLogo.setIcon(image1);
    panel_2.add(EraLogo);
    
    JLabel lblNewLabel_2 = new JLabel("Era University Lucknow");
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2.setForeground(new Color(0, 0, 153));
    lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 50));
    lblNewLabel_2.setBounds(263, 0, 782, 62);
    panel_2.add(lblNewLabel_2);
    
    JLabel lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
    lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
    lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
    lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblSarfarazganjHardoiRoad.setBounds(249, 54, 783, 35);
    panel_2.add(lblSarfarazganjHardoiRoad);
    
    JLabel lblNewLabel_1 = new JLabel("Welcome To Education Management System");
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
    lblNewLabel_1.setBounds(313, 72, 686, 56);
    panel_2.add(lblNewLabel_1);
    save.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
    		try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
				PreparedStatement ps=con.prepareStatement("Insert into Document(File_name, Doc_FILe)values(?,?)");
				InputStream is=new FileInputStream(new File(s));
				/*ps.setString(1, txtid.getText());
				ps.setString(1, txtid.getText());*/
				//ps.setString(1, textFile.getText());
				ps.setBlob(1, is);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null,"Document uplode sucssfully" );
				setVisible(false);
				
    		} catch (Exception e1) {
				e1.printStackTrace();
			}
    			
		}

		
    		
    });
    
    brbtn.addActionListener(new ActionListener() {

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
              Photolabel.setIcon(ResizeImage(path));
              s=path;
          }
           //if the user click on save in Jfilechooser
          else if(result == JFileChooser.CANCEL_OPTION){
              System.out.println("No File Select");
          }
        }
    });
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(1247,833);
    setVisible(true);
    }
     
     // Methode to resize imageIcon with the same size of a Jlabel
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Photolabel.getWidth(), Photolabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public static void main(String[] args){
        new FecultyRegister();
    
    
    }
   }