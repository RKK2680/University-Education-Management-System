package userdetails;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
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

public class FecultyLogin extends JFrame{
    JButton btnLogin ;
    JLabel label;
    JTextField txtfname;
    private JButton btnNewButton;
    private JLabel lblEmailId;
    private JTextField txtemail;
    private JButton btnLogin_1;
    private JCheckBox chckbxNewCheckBox;
    private JPanel panel;
    private JLabel EraLogo;
    private JLabel lblNewLabel_2;
    private JLabel lblSarfarazganjHardoiRoad;
	private String path;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPasswordField txtpass;

    public FecultyLogin(){
    super("retrieve image from database in java");
    setTitle("Feculty Login");
    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\Client_Male_Light.png"));
    setResizable(false);
    setBounds(100, 100, 1300, 850);
    
    getContentPane().setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(0, 204, 204));
    
    panel = new JPanel();
    panel.setLayout(null);
    panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel.setBackground(new Color(135, 206, 235));
    panel.setBounds(0, 0, 910, 99);
    getContentPane().add(panel);
    
    EraLogo = new JLabel();
    path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
    EraLogo.setBounds(23, 10, 130, 79);
    ImageIcon imageIcon1=new ImageIcon(path);
	Image imgImage1=imageIcon1.getImage();
	Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon image1=new ImageIcon(newiImage1);
	EraLogo.setIcon(image1);
    panel.add(EraLogo);
    
    lblNewLabel_2 = new JLabel("Era University Lucknow");
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2.setForeground(new Color(0, 0, 153));
    lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 60));
    lblNewLabel_2.setBounds(96, 0, 782, 62);
    panel.add(lblNewLabel_2);
    
    lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
    lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
    lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
    lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblSarfarazganjHardoiRoad.setBounds(82, 54, 783, 35);
    panel.add(lblSarfarazganjHardoiRoad);
    
    panel_1 = new JPanel();
    panel_1.setBorder(new LineBorder(new Color(51, 204, 102), 4));
    panel_1.setBackground(new Color(102, 255, 153));
    panel_1.setBounds(313, 109, 587, 255);
    getContentPane().add(panel_1);
    panel_1.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Feculty ID*");
    lblNewLabel.setBounds(58, 60, 109, 28);
    panel_1.add(lblNewLabel);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
    
    txtfname = new JTextField();
    txtfname.setForeground(new Color(255, 102, 51));
    txtfname.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtfname.setBounds(177, 63, 308, 28);
    panel_1.add(txtfname);
    
    lblEmailId = new JLabel("Email ID*");
    lblEmailId.setBounds(58, 98, 109, 28);
    panel_1.add(lblEmailId);
    lblEmailId.setFont(new Font("Times New Roman", Font.BOLD, 17));
    
    txtemail = new JTextField();
    txtemail.setForeground(new Color(255, 102, 51));
    txtemail.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtemail.setBounds(177, 101, 308, 28);
    panel_1.add(txtemail);
    
    JLabel lblPassword = new JLabel("Password*");
    lblPassword.setBounds(58, 130, 109, 40);
    panel_1.add(lblPassword);
    lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 17));
    
    chckbxNewCheckBox = new JCheckBox("Show Password");
    chckbxNewCheckBox.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		if (chckbxNewCheckBox.isSelected()) {
				txtpass.setEchoChar((char)0);
			} else {
				txtpass.setEchoChar('*');
			}
    	}
    });
    chckbxNewCheckBox.setBounds(177, 167, 168, 21);
    panel_1.add(chckbxNewCheckBox);
    chckbxNewCheckBox.setForeground(Color.RED);
    chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
    chckbxNewCheckBox.setBackground(new Color(255, 153, 51));
    btnLogin = new JButton("Verify The Registered User*");
    btnLogin.setBounds(58, 194, 480, 40);
    panel_1.add(btnLogin);
    btnLogin.setBackground(new Color(51, 204, 102));
    btnLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 204), new Color(0, 0, 102), new Color(255, 0, 0), new Color(255, 204, 0)));
    btnLogin.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\Knob-Valid-Green-icon.png"));
    btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
    
    JLabel lblNewLabel_1 = new JLabel("Feculty Login");
    lblNewLabel_1.setBounds(10, 10, 242, 35);
    panel_1.add(lblNewLabel_1);
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
    lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
    
    txtpass = new JPasswordField();
    txtpass.setForeground(new Color(255, 102, 51));
    txtpass.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtpass.setBounds(177, 137, 308, 24);
    panel_1.add(txtpass);
    
    btnLogin.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        	 String pass = txtpass.getText();
             String Email = txtfname.getText();
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
                
                Statement st = con.createStatement();
                //ResultSet rs = st.executeQuery("select * from myimages where ID = '"+jtf.getText()+"'");
                ResultSet rs = st.executeQuery("select * from FecultyRegistretion where FecultyID = '"+txtfname.getText()+"'");
            
                if(rs.next()){
                	//dispose();
                    byte[] img = rs.getBytes("Image");
                   // rs.getString("Fistname");
                    ////rs.getString("Email");
                    //rs.getString("Pass");



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
    
    panel_2 = new JPanel();
    panel_2.setBorder(new LineBorder(new Color(255, 0, 0), 4));
    panel_2.setBackground(new Color(255, 153, 153));
    panel_2.setBounds(10, 109, 309, 255);
    getContentPane().add(panel_2);
    panel_2.setLayout(null);
    
    label = new JLabel();
    label.setBounds(66, 30, 174, 184);
    panel_2.add(label);
    
    panel_3 = new JPanel();
    panel_3.setBackground(new Color(255, 204, 153));
    panel_3.setBorder(new LineBorder(new Color(204, 0, 0), 4));
    panel_3.setBounds(0, 374, 910, 99);
    getContentPane().add(panel_3);
    panel_3.setLayout(null);
    
    JButton btnForgetPasswoard = new JButton("Forget passwoard");
    btnForgetPasswoard.setBounds(75, 27, 233, 40);
    panel_3.add(btnForgetPasswoard);
    btnForgetPasswoard.setBackground(new Color(255, 102, 51));
    btnForgetPasswoard.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 204), new Color(0, 0, 102), new Color(255, 0, 0), new Color(255, 204, 0)));
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
    btnLogin_1.setBounds(394, 27, 242, 40);
    panel_3.add(btnLogin_1);
    btnLogin_1.setBackground(new Color(153, 255, 153));
    btnLogin_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 204), new Color(0, 0, 102), new Color(255, 0, 0), new Color(255, 204, 0)));
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
                        .prepareStatement("Select FecultyID, pass from FecultyRegistretion where Email=? and Pass=?");
					ps.setString(1, email);
					ps.setString(2, pass);
					
					ResultSet rs=ps.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Welcome to Education Management System");
						project p=new project();
						p.main(null);
						p.show();
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
    btnNewButton.setBounds(749, 31, 122, 35);
    panel_3.add(btnNewButton);
    btnNewButton.setBackground(new Color(255, 102, 51));
    btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 204), new Color(0, 0, 102), new Color(255, 0, 0), new Color(255, 204, 0)));
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		dispose();
    	}
    });
    btnNewButton.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\cancel-icon.png"));
    btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
    setLocationRelativeTo(null);
    setSize(924,524);
    setVisible(true);
    } 
     
    public static void main(String[] args){
        new FecultyLogin();
        
    }
    
   }

