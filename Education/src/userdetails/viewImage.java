package userdetails;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

import Home.Admission1;

import java.awt.Font;

public class viewImage extends JFrame{
    JButton btnView ;
    JLabel label;
    JTextField txtFileName;
    private JLabel lblNewLabel;
    private JLabel lblFileName;
    private JButton btnBack;

    public viewImage(){
    super("retrieve image from database in java");
    setBounds(200, 100, 600, 900);
    btnView = new JButton("View");
    btnView.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnView.setBounds(488,281,100,40);
    
    txtFileName = new JTextField();
    txtFileName.setBounds(215,293,162,20);
    
    label = new JLabel();
    label.setBounds(165,71,284,170);
    
    getContentPane().add(btnView);
    getContentPane().add(label);
    getContentPane().add(txtFileName);
    
    btnView.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
                Statement st = con.createStatement();
                //ResultSet rs = st.executeQuery("select * from myimages where ID = '"+jtf.getText()+"'");
                ResultSet rs = st.executeQuery("select * from Document where File_name = '"+txtFileName.getText()+"'");
                if(rs.next()){
                    byte[] img = rs.getBytes("Doc_FILe");



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
    
    getContentPane().setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(153, 255, 204));
    
    lblNewLabel = new JLabel("View Document");
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setBounds(120, 20, 392, 20);
    getContentPane().add(lblNewLabel);
    
    lblFileName = new JLabel("File Name:*");
    lblFileName.setHorizontalAlignment(SwingConstants.CENTER);
    lblFileName.setFont(new Font("Times New Roman", Font.BOLD, 20));
    lblFileName.setBounds(21, 290, 184, 20);
    getContentPane().add(lblFileName);
    
    btnBack = new JButton("Back");
    btnBack.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		Admission1.main(null);
    		dispose();
    	}
    });
    btnBack.setBackground(new Color(255, 69, 0));
    btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnBack.setBounds(586, 0, 100, 40);
    getContentPane().add(btnBack);
    setLocationRelativeTo(null);
    setSize(700,400);
    setVisible(true);
    } 
     
    public static void main(String[] args){
        new viewImage();
    }
   }

