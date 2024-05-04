package userdetails;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.security.spec.MGF1ParameterSpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class Login extends JFrame{
    JButton btnLogin ;
    JLabel label;
    JTextField txtfname;
    private JButton btnNewButton;
    private JLabel lblEmailId;
    private JTextField txtemail;
    private JButton btnLogin_1;
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JLabel EraLogo;
    private JLabel lblNewLabel_2;
    private JLabel lblSarfarazganjHardoiRoad;
	private String path;
	private JPasswordField txtpass;
	private JCheckBox chckbxNewCheckBox;

    public Login(){
    super("retrieve image from database in java");
    setTitle("Login");
    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\Client_Male_Light.png"));
    setResizable(false);
    setBounds(100, 100, 1300, 850);
    
    getContentPane().setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(255, 250, 205));
    
    panel = new JPanel();
    panel.setBackground(new Color(204, 204, 255));
    panel.setBounds(10, 476, 871, 124);
    getContentPane().add(panel);
    panel.setLayout(null);
    
    JButton btnForgetPasswoard = new JButton("Forget passwoard");
    btnForgetPasswoard.setBackground(new Color(255, 51, 102));
    btnForgetPasswoard.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 102), new Color(255, 0, 0), new Color(255, 0, 153), new Color(255, 255, 0)));
    btnForgetPasswoard.setBounds(20, 43, 233, 40);
    panel.add(btnForgetPasswoard);
    btnForgetPasswoard.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		Forget_Password nForget_Password=new Forget_Password();
			nForget_Password.ForP();
			dispose();
    	}
    });
    btnForgetPasswoard.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\dialog-error-icon.png"));
    btnForgetPasswoard.setFont(new Font("Tahoma", Font.BOLD, 17));
    
    btnLogin_1 = new JButton("Login");
    btnLogin_1.setBackground(new Color(102, 255, 153));
    btnLogin_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 102), new Color(255, 0, 0), new Color(255, 0, 153), new Color(255, 255, 0)));
    btnLogin_1.setBounds(340, 43, 242, 40);
    panel.add(btnLogin_1);
    btnLogin_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		String email=txtemail.getText();
    		String pass=txtpass.getText();
    		if (email.trim().equals("")|| email.trim().equals("")||
    				pass.trim().equals("")|| pass.trim().equals("")) 
    		{
    			JOptionPane.showMessageDialog(null, "All Fields Compulsory to Fill"  +"Chek Missing Fields");
				
			}
    		else {
				try {
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");

                    PreparedStatement ps = (PreparedStatement) con
                        .prepareStatement("Select Fistname, pass from Registretion1 where Email=? and Pass=?");
					ps.setString(1, email);
					ps.setString(2, pass);
					
					ResultSet rs=ps.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Welcome to Education Management System");
						project p=new project();
						p.main(null);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Email Id And Passwoard is Incorrect");
					}
					
				} 
				catch (Exception e2) {
					e2.printStackTrace();
				}
			}
    		
     }
    });
    btnLogin_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
    btnLogin_1.setFont(new Font("Tahoma", Font.BOLD, 17));
    
    btnNewButton = new JButton("Close");
    btnNewButton.setBackground(new Color(255, 51, 51));
    btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 102), new Color(255, 0, 0), new Color(255, 0, 153), new Color(255, 255, 0)));
    btnNewButton.setBounds(678, 43, 168, 40);
    panel.add(btnNewButton);
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		dispose();
    	}
    });
    btnNewButton.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\cancel-icon.png"));
    btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
    
    panel_1 = new JPanel();
    panel_1.setBackground(new Color(204, 51, 102));
    panel_1.setBounds(320, 113, 544, 355);
    getContentPane().add(panel_1);
    panel_1.setLayout(null);
    
    JLabel lblNewLabel_1 = new JLabel("Student Login");
    lblNewLabel_1.setBounds(0, 10, 316, 52);
    panel_1.add(lblNewLabel_1);
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
    
    JButton btnLogin_1_1 = new JButton("Feculty Login");
    btnLogin_1_1.setBackground(new Color(51, 255, 204));
    btnLogin_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 102), new Color(255, 0, 0), new Color(255, 0, 153), new Color(255, 255, 0)));
    btnLogin_1_1.setBounds(318, 20, 216, 40);
    panel_1.add(btnLogin_1_1);
    btnLogin_1_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		FecultyLogin fl=new FecultyLogin();
    		fl.main(null);
    		
    	}
    });
    btnLogin_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
    
    JLabel lblNewLabel = new JLabel("Fistname*");
    lblNewLabel.setBounds(38, 101, 109, 28);
    panel_1.add(lblNewLabel);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
    
    lblEmailId = new JLabel("Email ID*");
    lblEmailId.setBounds(38, 139, 109, 28);
    panel_1.add(lblEmailId);
    lblEmailId.setFont(new Font("Times New Roman", Font.BOLD, 17));
    
    JLabel lblPassword = new JLabel("Password*");
    lblPassword.setBounds(38, 171, 109, 28);
    panel_1.add(lblPassword);
    lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 17));
    
    txtemail = new JTextField();
    txtemail.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtemail.setCaretColor(new Color(0, 102, 204));
    txtemail.setBounds(157, 139, 308, 28);
    panel_1.add(txtemail);
    
    txtfname = new JTextField();
    txtfname.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtfname.setCaretColor(new Color(0, 102, 204));
    txtfname.setBounds(157, 104, 308, 28);
    panel_1.add(txtfname);
    btnLogin = new JButton("Verify The Registered User*");
    btnLogin.setBackground(new Color(102, 204, 102));
    btnLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 102), new Color(255, 0, 0), new Color(255, 0, 153), new Color(255, 255, 0)));
    btnLogin.setBounds(24, 248, 480, 40);
    panel_1.add(btnLogin);
    btnLogin.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\Knob-Valid-Green-icon.png"));
    btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
    
    txtpass = new JPasswordField();
    txtpass.setBounds(157, 174, 308, 28);
    panel_1.add(txtpass);
    
    chckbxNewCheckBox = new JCheckBox("Show Password");
    chckbxNewCheckBox.setBackground(new Color(255, 153, 51));
    chckbxNewCheckBox.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		if (chckbxNewCheckBox.isSelected()) {
				txtpass.setEchoChar((char)0);
			} else {
				txtpass.setEchoChar('*');
			}
    	}
    });
    chckbxNewCheckBox.setForeground(new Color(255, 0, 0));
    chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
    chckbxNewCheckBox.setBounds(157, 208, 168, 21);
    panel_1.add(chckbxNewCheckBox);
    
    panel_2 = new JPanel();
    panel_2.setBackground(new Color(102, 153, 204));
    panel_2.setBounds(25, 111, 285, 361);
    getContentPane().add(panel_2);
    panel_2.setLayout(null);
    
    label = new JLabel();
    label.setBounds(35, 68, 207, 238);
    panel_2.add(label);
    
    panel_3 = new JPanel();
    panel_3.setLayout(null);
    panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel_3.setBackground(new Color(135, 206, 235));
    panel_3.setBounds(0, 4, 910, 99);
    getContentPane().add(panel_3);
    
    EraLogo = new JLabel();
    path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
    EraLogo.setBounds(23, 10, 130, 79);
    ImageIcon imageIcon1=new ImageIcon(path);
	Image imgImage1=imageIcon1.getImage();
	Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon image1=new ImageIcon(newiImage1);
	EraLogo.setIcon(image1);
    panel_3.add(EraLogo);
    
    lblNewLabel_2 = new JLabel("Era University Lucknow");
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2.setForeground(new Color(0, 0, 153));
    lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 60));
    lblNewLabel_2.setBounds(96, 0, 782, 62);
    panel_3.add(lblNewLabel_2);
    
    lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
    lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
    lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
    lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblSarfarazganjHardoiRoad.setBounds(82, 54, 783, 35);
    panel_3.add(lblSarfarazganjHardoiRoad);
    
    btnLogin.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        	 String pass = txtpass.getText();
             String Email = txtfname.getText();
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from Registretion1 where Fistname = '"+txtfname.getText()+"'");
                if(rs.next()){
                    byte[] img = rs.getBytes("Image");
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
    setSize(924,647);
    setVisible(true);
    } 
     
    public static void main(String[] args){
        new Login();
        
    }
   }

