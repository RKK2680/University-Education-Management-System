package userdetails;
import java.awt.*;
 import javax.swing.*;

import java.awt.event.*;
import javax.swing.border.LineBorder;
 class Project1 extends JFrame  implements ActionListener
{
ImageIcon s[];
JLabel leble;
JButton b1,b2;
int i,l1;
JPanel p;
private JLabel lblNewLabel_1;
private JLabel EraLogo;
public static String path;
public Project1()
{
	setTitle("EDMS");
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
	getContentPane().setBackground(new Color(0, 250, 154));
    setSize(1602, 826);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    getContentPane().setLayout(null);
    s = new ImageIcon[17]; 
    s[0] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E10.jpg");
    s[1] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E0.jpg");
    s[2] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E1.jpg");
    s[3] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E2.jpg");
    s[4] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E3.jpg");
    s[5] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E4.jpg");
    s[6] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E5.jpg");
    s[7] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E6.jpg");
    s[8] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E7.jpg");
    s[9] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E8.jpg");
    s[10] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E9.jpg");
    s[11] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E10.jpg");
    s[12] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E11.jpg");
    s[13] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E12.jpg");
    s[14] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E13.jpg");
  
   
    leble = new JLabel("",JLabel.CENTER); 
    leble.setBackground(new Color(135, 206, 235));
    leble.setBounds(147, 156, 1215, 540);
    getContentPane().add(leble);
    ImageIcon imageIcon=new ImageIcon(path);
	Image imgImage=imageIcon.getImage();
	Image newiImage=imgImage.getScaledInstance(leble.getWidth(), leble.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon image=new ImageIcon(newiImage);
	leble.setIcon(s[0]);
	
    JPanel panel = new JPanel();
    panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel.setBackground(new Color(135, 206, 235));
    panel.setBounds(45, 10, 1451, 136);
    getContentPane().add(panel);
    panel.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Welcome To Education Management System");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
    lblNewLabel.setBounds(339, 79, 686, 56);
    panel.add(lblNewLabel);
    
    EraLogo = new JLabel();
    path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
    EraLogo.setBounds(90, 10, 161, 116);
    ImageIcon imageIcon1=new ImageIcon(path);
	Image imgImage1=imageIcon1.getImage();
	Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon image1=new ImageIcon(newiImage1);
	EraLogo.setIcon(image1);
    panel.add(EraLogo);
    
    JLabel lblNewLabel_2 = new JLabel("Era University Lucknow");
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2.setForeground(new Color(0, 0, 153));
    lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 60));
    lblNewLabel_2.setBounds(300, 10, 782, 44);
    panel.add(lblNewLabel_2);
    
    JLabel lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
    lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
    lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
    lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblSarfarazganjHardoiRoad.setBounds(276, 61, 783, 35);
    panel.add(lblSarfarazganjHardoiRoad);
    //leble.setIcon(s[0]);
    
    JButton btnRegistretion = new JButton("Registretion");
    btnRegistretion.setBounds(1193, 46, 138, 36);
    panel.add(btnRegistretion);
    btnRegistretion.setBackground(new Color(152, 251, 152));
    btnRegistretion.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		Rebuttion.main(null);
    		
    	}
    });
    btnRegistretion.setFont(new Font("Times New Roman", Font.BOLD, 16));
    b2=new JButton("Next");
    b2.setBackground(new Color(127, 255, 0));
    b2.setBounds(1372, 398, 124, 41);
    getContentPane().add(b2);
    b2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    b1=new JButton("Back");
    b1.setBackground(new Color(255, 127, 80));
    b1.setBounds(45, 400, 82, 36);
    getContentPane().add(b1);
    b1.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    JLabel lblGallery = new JLabel("Gallery");
    lblGallery.setHorizontalAlignment(SwingConstants.CENTER);
    lblGallery.setFont(new Font("Times New Roman", Font.BOLD, 35));
    lblGallery.setBounds(324, 723, 686, 56);
    getContentPane().add(lblGallery);
    b1.addActionListener(this);
    b2.addActionListener(this);
    
}
public  void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
        if(i==0)
        {
            JOptionPane.showMessageDialog(null,"This is First Image");
        }
        else
            {
            i=i-1;
            leble.setIcon(s[i]);
        }
    }
    if(e.getSource()==b2)
    {
        if(i==s.length-1)
        {
            JOptionPane.showMessageDialog(null,"This is LastImage");
        }
        else
            {
            i=i+1;
            leble.setIcon(s[i]);
            }
        }
     }
public static void main(String args[])
{
    Project1 obj = new Project1();
}
 }