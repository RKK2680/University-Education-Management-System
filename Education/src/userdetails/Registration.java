package userdetails;
import Home.*;
import java.awt.Image;
//import Home.project1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.CancelablePrintJob;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

//import Home.Project1;

//import userdetails.sinup_page.SwingAction;

import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Window.Type;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class Registration extends JDialog{
	protected static final AbstractButton rbmale = null;
	Conn myc=new Conn();
    JButton button ;
    JLabel Photolabel;
    String s;
    private JLabel txtSelect;
    private JPanel contentPane;
	private JTextField textField_7;
	private JTextField textField_5;
	//text fild
	private JLabel txtFistName_1;
	 
	private JLabel txtLastName_1;
	private JTextField txtlastname;
	private JLabel txtDob_1;
	private JTextField txtDob;
	private JLabel txtMobileNo_1;
	private JTextField txtmobile;
	private JLabel txtEmailId_1;
	private JTextField txteamil;
	private JLabel textField_9;
	private JLabel textField_14;
	private JPasswordField txtpasswordField_1;
	private JPasswordField conpassword;
	private JTextField txtFistname;
	private JRadioButton JRBMale;
	private JRadioButton rdbtnNewRadioButton1;
	private JRadioButton rdbtnNewRadioButton2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String path;
	private JLabel EraLogo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel Fulllbl;
	private JLabel elab;
	private JLabel nlab;
	private JLabel llab;
	private JLabel dlab;
	private JButton btnExit;
    
    public Registration(){
    super();
    setType(Type.POPUP);
    setVisible(true);
    setBounds(100, 100, 1084, 749);
    setEnabled(true);
    
    //setSize(300, 500);
    getContentPane().setBackground(new Color(153, 255, 204));
    setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\eclipse-workspace\\Education Management System\\img\\Client_Male_Light.png"));
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setTitle("Ragistration form");
    getContentPane().setLayout(null);
    
    JPanel panel = new JPanel();
    panel.setBackground(new Color(153, 102, 204));
    panel.setBounds(20, 188, 406, 504);
    getContentPane().add(panel);
    panel.setLayout(null);
    
    JButton btnSave = new JButton("Save");
    btnSave.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 255, 0), new Color(0, 204, 255), new Color(0, 0, 0)));
    btnSave.setBackground(new Color(204, 102, 102));
    btnSave.setBounds(289, 391, 100, 40);
    panel.add(btnSave);
    btnSave.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
				PreparedStatement ps=con.prepareStatement("Insert into image1(Photo)values(?)");
				InputStream is=new FileInputStream(new File(s));
				/*ps.setString(1, txtid.getText());
				ps.setString(1, txtid.getText());
				ps.setString(1, txtid.getText());*/
				ps.setBlob(1, is);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null,"Image uploded sucssfully" );

    		} catch (Exception e1) {
				e1.printStackTrace();
			}
    			
		}	
    });
    btnSave.setFont(new Font("Times New Roman", Font.BOLD, 15));
    button = new JButton("Browse");
    button.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 255, 0), new Color(0, 204, 255), new Color(0, 0, 0)));
    button.setBackground(new Color(204, 102, 102));
    button.setBounds(133, 391, 100, 40);
    panel.add(button);
    button.setFont(new Font("Times New Roman", Font.BOLD, 15));
    Photolabel = new JLabel();
    Photolabel.setBounds(106, 125, 194, 199);
    panel.add(Photolabel);
    
    txtSelect = new JLabel();
    txtSelect.setBounds(74, 50, 86, 20);
    panel.add(txtSelect);
    txtSelect.setHorizontalAlignment(SwingConstants.CENTER);
    txtSelect.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtSelect.setText("Select");
    
    JComboBox comboBox = new JComboBox();
    comboBox.setBounds(181, 44, 208, 32);
    panel.add(comboBox);
    comboBox.setBackground(new Color(204, 153, 153));
    comboBox.addItemListener(new ItemListener() {
    	public void itemStateChanged(ItemEvent e) {
    		FecultyRegister fr=new FecultyRegister();
    		fr.main(null);;
    		dispose();
    	}
    });
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Student Ragistration", "FecultyRagistration"}));
    comboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
       
       button.addActionListener(new ActionListener() {

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
    
    JPanel panel_1 = new JPanel();
    panel_1.setBackground(new Color(0, 204, 102));
    panel_1.setBounds(427, 188, 631, 504);
    getContentPane().add(panel_1);
    panel_1.setLayout(null);
    
    txtLastName_1 = new JLabel();
    txtLastName_1.setBounds(77, 100, 86, 18);
    panel_1.add(txtLastName_1);
    txtLastName_1.setText("Last Name*");
    txtLastName_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    txtFistName_1 = new JLabel();
    txtFistName_1.setBounds(77, 58, 86, 20);
    panel_1.add(txtFistName_1);
    txtFistName_1.setText("Fist Name*");
    txtFistName_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    textField_9 = new JLabel();
    textField_9.setBounds(77, 152, 81, 26);
    panel_1.add(textField_9);
    textField_9.setText("Gender*");
    textField_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    rdbtnNewRadioButton1 = new JRadioButton("male");
    rdbtnNewRadioButton1.setBounds(190, 139, 103, 21);
    panel_1.add(rdbtnNewRadioButton1);
    buttonGroup.add(rdbtnNewRadioButton1);
    rdbtnNewRadioButton1.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    rdbtnNewRadioButton2 = new JRadioButton("female");
    rdbtnNewRadioButton2.setBounds(190, 177, 103, 21);
    panel_1.add(rdbtnNewRadioButton2);
    buttonGroup.add(rdbtnNewRadioButton2);
    rdbtnNewRadioButton2.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    txtDob_1 = new JLabel();
    txtDob_1.setBounds(77, 211, 86, 20);
    panel_1.add(txtDob_1);
    txtDob_1.setText("DOB*");
    txtDob_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    txtMobileNo_1 = new JLabel();
    txtMobileNo_1.setBounds(77, 265, 86, 20);
    panel_1.add(txtMobileNo_1);
    txtMobileNo_1.setText("Mobile no*");
    txtMobileNo_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    textField_14 = new JLabel();
    textField_14.setBounds(77, 311, 95, 26);
    panel_1.add(textField_14);
    textField_14.setText("Password*");
    textField_14.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    txtEmailId_1 = new JLabel();
    txtEmailId_1.setBounds(77, 367, 86, 20);
    panel_1.add(txtEmailId_1);
    txtEmailId_1.setText("Email Id");
    txtEmailId_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    JButton Sinup = new JButton("Sing up");
    Sinup.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 255, 0), new Color(0, 204, 255), new Color(0, 0, 0)));
    Sinup.setBounds(91, 424, 148, 40);
    panel_1.add(Sinup);
    Sinup.addActionListener(new ActionListener() {
    	

		//private Object JRadioButtonFemale;
		public void actionPerformed(ActionEvent e) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
				 String query = "INSERT INTO Registretion1 values (?,?,?,?,?,?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				 PS.setString(1, txtFistname.getText());
				 PS.setString(2, txtlastname.getText());
				 if (rdbtnNewRadioButton1.isSelected()) 
					 	PS.setString(3, rdbtnNewRadioButton1.getText());
				 else 
					 	PS.setString(3, rdbtnNewRadioButton2.getText());
				 PS.setString(4, txtDob.getText());
				 PS.setString(5, txtmobile.getText());
				 PS.setString(6, txtpasswordField_1.getText());
				 PS.setString(7, txteamil.getText());
				 
				InputStream is=new FileInputStream(new File(s));
						PS.setBlob(8, is);
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(Sinup, "Student Registretion is succsesfull.....");
				 setVisible(false);
				 new Login().setVisible(true);
				 PS.close();
				 connection.close();
			}
			catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
			
			
        }			    });
    Sinup.setForeground(Color.BLACK);
    Sinup.setFont(new Font("Tahoma", Font.BOLD, 18));
    Sinup.setBackground(new Color(0, 153, 51));
    
    JButton Login = new JButton("Login");
    Login.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 255, 0), new Color(0, 204, 255), new Color(0, 0, 0)));
    Login.setBounds(354, 423, 125, 40);
    panel_1.add(Login);
    Login.setFont(new Font("Tahoma", Font.BOLD, 20));
    Login.setBackground(new Color(0, 255, 51));
    
    lblNewLabel = new JLabel("Student Registration");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
    lblNewLabel.setBounds(10, 0, 450, 47);
    panel_1.add(lblNewLabel);
    
    txtlastname = new JTextField();
    txtlastname.setForeground(new Color(0, 0, 204));
    txtlastname.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtlastname.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyReleased(KeyEvent e) {
    		String p="^[a-zA-Z]{0,30}$";
    		Pattern pe=Pattern.compile(p);
    		Matcher mt=pe.matcher(txtlastname.getText());
    		if (!mt.matches()) {
    			llab.setText("Last is incorrect");
				
			}
    		else {
				llab.setText(null);
			}
    	}
    });
    txtlastname.setBounds(190, 98, 243, 26);
    panel_1.add(txtlastname);
    txtlastname.setColumns(10);
    
    txtFistname = new JTextField();
    txtFistname.setForeground(new Color(0, 0, 204));
    txtFistname.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtFistname.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyReleased(KeyEvent e) {
    		String p="^[a-zA-Z]{0,30}$";
    		Pattern pe=Pattern.compile(p);
    		Matcher mt=pe.matcher(txtFistname.getText());
    		if (!mt.matches()) {
    			nlab.setText("Name is incorrect");
				
			}
    		else {
				nlab.setText(null);
			}
    	}
    });
    txtFistname.setBounds(190, 57, 243, 26);
    panel_1.add(txtFistname);
    txtFistname.setColumns(10);
    
    txtmobile = new JTextField();
    txtmobile.setForeground(new Color(0, 0, 204));
    txtmobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtmobile.setBounds(190, 264, 243, 26);
    panel_1.add(txtmobile);
    txtmobile.setColumns(10);
    
    txtDob = new JTextField();
    txtDob.setForeground(new Color(0, 0, 204));
    txtDob.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtDob.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyReleased(KeyEvent e) {
    		String p="[/-0-9]{0,10}[0-9]";
    		Pattern pe=Pattern.compile(p); 
    		Matcher mt=pe.matcher(txtDob.getText());
    		if (!mt.matches()) {
    			dlab.setText("DOB is incorrect");
				
			}
    		else {
				dlab.setText(null);
			}
    	}
    });
    txtDob.setBounds(190, 209, 243, 28);
    panel_1.add(txtDob);
    txtDob.setColumns(10);
    
    txtpasswordField_1 = new JPasswordField();
    txtpasswordField_1.setForeground(new Color(0, 0, 204));
    txtpasswordField_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtpasswordField_1.setBounds(190, 313, 243, 26);
    panel_1.add(txtpasswordField_1);
    
    txteamil = new JTextField();
    txteamil.setForeground(new Color(0, 0, 204));
    txteamil.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txteamil.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyReleased(KeyEvent e) {
    		
    	}
    });
    txteamil.setBounds(190, 365, 243, 27);
    panel_1.add(txteamil);
    txteamil.setColumns(10);
    
    elab = new JLabel("");
    elab.setForeground(new Color(255, 0, 0));
    elab.setFont(new Font("Times New Roman", Font.BOLD, 15));
    elab.setBounds(455, 367, 128, 25);
    panel_1.add(elab);
    
    nlab = new JLabel("");
    nlab.setForeground(Color.RED);
    nlab.setFont(new Font("Times New Roman", Font.BOLD, 15));
    nlab.setBounds(455, 58, 128, 25);
    panel_1.add(nlab);
    
    llab = new JLabel("");
    llab.setForeground(Color.RED);
    llab.setFont(new Font("Times New Roman", Font.BOLD, 15));
    llab.setBounds(455, 100, 128, 25);
    panel_1.add(llab);
    
    dlab = new JLabel("");
    dlab.setForeground(Color.RED);
    dlab.setFont(new Font("Times New Roman", Font.BOLD, 15));
    dlab.setBounds(455, 206, 128, 25);
    panel_1.add(dlab);
    
    btnExit = new JButton("Exit");
    btnExit.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		dispose();
    	}
    });
    btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
    btnExit.setBackground(new Color(255, 69, 0));
    btnExit.setBounds(506, 0, 125, 40);
    panel_1.add(btnExit);
    
    JPanel panel_2 = new JPanel();
    panel_2.setLayout(null);
    panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel_2.setBackground(new Color(135, 206, 235));
    panel_2.setBounds(10, 22, 1059, 156);
    getContentPane().add(panel_2);
    
    EraLogo = new JLabel();
    path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
    EraLogo.setBounds(36, 10, 194, 136);
    ImageIcon imageIcon1=new ImageIcon(path);
	Image imgImage1=imageIcon1.getImage();
	Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon image1=new ImageIcon(newiImage1);
	EraLogo.setIcon(image1);
	panel_2.add(EraLogo);
    
    JLabel lblNewLabel_2 = new JLabel("Era University Lucknow");
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2.setForeground(new Color(0, 0, 153));
    lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 60));
    lblNewLabel_2.setBounds(190, 10, 782, 62);
    panel_2.add(lblNewLabel_2);
    
    JLabel lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
    lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
    lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
    lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblSarfarazganjHardoiRoad.setBounds(176, 64, 783, 35);
    panel_2.add(lblSarfarazganjHardoiRoad);
    
    lblNewLabel_1 = new JLabel("Welcome To Education Management System");
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
    lblNewLabel_1.setBounds(243, 85, 686, 56);
    panel_2.add(lblNewLabel_1);
    
   
    
  
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
    
    public static void Registration(){
    	
        new Registration();
    }
   }
