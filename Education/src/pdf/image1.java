package pdf;


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



public class image1 extends JFrame{
   
	JButton brbtn ;
    JLabel Photolabel;
	private File file;
    String s;
    
    public image1(){
    	super();
    setBounds(100, 150, 600, 900);
    getContentPane().setBackground(new Color(204, 255, 102));
    brbtn = new JButton("Browse");
    brbtn.setBounds(156,267,156,40);
    Photolabel = new JLabel();
    Photolabel.setBounds(129,43,405,197);
    getContentPane().add(brbtn);
    getContentPane().add(Photolabel);
    
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
    
    getContentPane().setLayout(null);
    
    JButton save = new JButton("Save");
    save.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
    		try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
				PreparedStatement ps=con.prepareStatement("Insert into Document(File_name, Doc_FILe)values(?,?)");
				InputStream is=new FileInputStream(new File(s));
				/*ps.setString(1, txtid.getText());
				ps.setString(1, txtid.getText());*/
				
				ps.setBlob(1, is);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null,"Document uplode sucssfully" );
				setVisible(false);
				
    		} catch (Exception e1) {
				e1.printStackTrace();
			}
    			
		}

		
    		
    });
    save.setBounds(363, 267, 156, 40);
    getContentPane().add(save);
    
    JLabel lblNewLabel = new JLabel("Uplode Document");
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setBounds(129, 10, 428, 13);
    getContentPane().add(lblNewLabel);
    
    JLabel lblUplodeDocumentOnly = new JLabel("Uplode Document Only .JPG .JPEG .PNG");
    lblUplodeDocumentOnly.setForeground(new Color(255, 0, 51));
    lblUplodeDocumentOnly.setHorizontalAlignment(SwingConstants.CENTER);
    lblUplodeDocumentOnly.setFont(new Font("Times New Roman", Font.BOLD, 20));
    lblUplodeDocumentOnly.setBounds(106, 329, 428, 24);
    getContentPane().add(lblUplodeDocumentOnly);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(700,400);
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
        new image1();
    
    
    }
   }