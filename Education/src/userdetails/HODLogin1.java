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

import Model.stdATENDENS;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;

public class HODLogin1 extends JFrame{
    JTextField txtfid;
    private JButton btnNewButton;
    private JButton btnLogin_1;
    private JTextField textField_1;
    private JLabel lblNewLabel_2;
    private JPanel panel;
    private JLabel EraLogo;
    private JLabel lblNewLabel_3;
    private JLabel lblSarfarazganjHardoiRoad;
	private String path;

    public HODLogin1(){
    super("retrieve image from database in java");
    setTitle("Feculty Login");
    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\Client_Male_Light.png"));
    setResizable(false);
    setBounds(100, 100, 1300, 850);
    getContentPane().setLayout(null);
    
    txtfid = new JTextField(); 
    txtfid.setForeground(new Color(255, 0, 0));
    txtfid.setFont(new Font("Times New Roman", Font.BOLD, 15));
    txtfid.setBounds(236, 166, 308, 28);
    getContentPane().add(txtfid);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(255, 250, 205));
    
    JLabel lblNewLabel = new JLabel("HOD Passworad*");
    lblNewLabel.setBounds(88, 163, 155, 28);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
    getContentPane().add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("Feculty Login");
    lblNewLabel_1.setBounds(87, 104, 572, 52);
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
    getContentPane().add(lblNewLabel_1);
    
    btnNewButton = new JButton("Close");
    btnNewButton.setBounds(643, 77, 109, 28);
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		project.main(null);
    		dispose();
    	}
    });
    btnNewButton.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\cancel-icon.png"));
    btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
    getContentPane().add(btnNewButton);
    
    btnLogin_1 = new JButton("Login");
    btnLogin_1.setBackground(new Color(51, 255, 153));
    btnLogin_1.setBounds(245, 232, 242, 40);
    btnLogin_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		String fid=txtfid.getText();
    		//String pass=txtpass.getText();
    		if (fid.trim().equals("")|| fid.trim().equals(""))
    		{
    			JOptionPane.showMessageDialog(null, "Chek Missing Fields");
				
			}
    		else {
				try {
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");

                    PreparedStatement ps = (PreparedStatement) con
                        .prepareStatement("Select Pass from FecultyRegistretion where Pass=? ");
					ps.setString(1,fid);
					//ps.setString(2, pass);
					
					ResultSet rs=ps.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, " Welcome HOD ");
						FecultyInfo p=new FecultyInfo();
						p.main(null);
						p.show();
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, " Password is Incorrect" + " "+"Login Only HOD");
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
    getContentPane().add(btnLogin_1);
    
    textField_1 = new JTextField();
    textField_1.setBounds(82, 216, 577, 79);
    textField_1.setEnabled(false);
    textField_1.setEditable(false);
    textField_1.setColumns(10);
    getContentPane().add(textField_1);
    
    lblNewLabel_2 = new JLabel(" *Login Only HOD");
    lblNewLabel_2.setForeground(new Color(255, 69, 0));
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblNewLabel_2.setBounds(187, 322, 340, 28);
    getContentPane().add(lblNewLabel_2);
    
    panel = new JPanel();
    panel.setLayout(null);
    panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel.setBackground(new Color(135, 206, 235));
    panel.setBounds(0, 0, 752, 79);
    getContentPane().add(panel);
    
    EraLogo = new JLabel();
    path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
    EraLogo.setBounds(41, 10, 106, 59);
    ImageIcon imageIcon1=new ImageIcon(path);
	Image imgImage1=imageIcon1.getImage();
	Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon image1=new ImageIcon(newiImage1);
	EraLogo.setIcon(image1);
    panel.add(EraLogo);
    
    lblNewLabel_3 = new JLabel("Era University Lucknow");
    lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_3.setForeground(new Color(0, 0, 153));
    lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 45));
    lblNewLabel_3.setBounds(134, 0, 582, 53);
    panel.add(lblNewLabel_3);
    
    lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
    lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
    lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
    lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 20));
    lblSarfarazganjHardoiRoad.setBounds(228, 44, 390, 35);
    panel.add(lblSarfarazganjHardoiRoad);
    setLocationRelativeTo(null);
    setSize(766,426);
    setVisible(true);
    } 
     
    public static void main(String[] args){
        new HODLogin1();
        
    }
    
   }

