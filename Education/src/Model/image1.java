package Model;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class image1 extends JFrame 
{
	//Sample 01: Create a Text Field to Show File Name
	JTextField txtFileName = new JTextField(45);
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldRe;
	
	public image1(String title) throws HeadlessException 
	{
		super(title);
		//Sample 02: Set Size and Position
		setBounds(100, 100, 750, 542);
		Container ControlHost = getContentPane();
		
		//Sample 03: Add Controls to Frame Window
		JButton btnPickFile = new JButton("Open File");
		btnPickFile.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnPickFile.setBounds(122, 74, 125, 27);
		JLabel lbl = new JLabel("File Name: ");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl.setBounds(261, 5, 133, 13);
		txtFileName.setBounds(28, 38, 681, 27);
		txtFileName.setFont(new Font("Verdana", Font.ITALIC, 16));
		getContentPane().setLayout(null);
		ControlHost.add(lbl);
		ControlHost.add(txtFileName);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			private String s;

			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
					PreparedStatement ps=con.prepareStatement("Insert into Document(Doc)values(?)");
					InputStream is=new FileInputStream(new File(s));
					/*ps.setString(1, txtid.getText());
					ps.setString(1, txtid.getText());
					ps.setString(1, txtid.getText());*/
					ps.setBlob(1, is);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null,"Document uploded sucssfully" );

	    		} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(435, 75, 118, 27);
		getContentPane().add(btnNewButton);
		ControlHost.add(btnPickFile);
		
		textField1 = new JTextField();
		textField1.setBounds(115, 203, 147, 36);
		getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(115, 264, 147, 36);
		getContentPane().add(textField2);
		
		textFieldRe = new JTextField();
		textFieldRe.setColumns(10);
		textFieldRe.setBounds(305, 235, 326, 36);
		getContentPane().add(textFieldRe);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no1=Integer.parseInt(textField1.getText());
				int no2=Integer.parseInt(textField2.getText());
				btnNewButton_1.setText("sum "+(no1+no2));
			}
		});
		btnNewButton_1.setBounds(92, 310, 213, 50);
		getContentPane().add(btnNewButton_1);
		
		//Sample 04: Add Handler for Button
		btnPickFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JFileChooser jfc = new JFileChooser("D:\\Java");
				int UserChoice = jfc.showOpenDialog(image1.this);
				if (UserChoice == JFileChooser.APPROVE_OPTION)
				{
					File SelectedFile = jfc.getSelectedFile();
					txtFileName.setText(SelectedFile.getPath());
				}
				if (UserChoice == JFileChooser.CANCEL_OPTION)
					txtFileName.setText("No File Selected");
			}
		});
		
	}
	public static void main(String[] args) 
	{
		//Sample 05: Create Instance of JFrameDemo
		image1 frame = new image1("JFileChooser Example");
		frame.setVisible(true);
	}
}


/*
import java.awt.Font;
import java.awt.Image;
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



public class image1 extends JFrame{
    
	JButton brbtn ;
    JLabel Photolabel;
	private File file;
    String s;
    
    public image1(){
    	
    super("Set Picture Into A JLabel Using JFileChooser In Java");
    brbtn = new JButton("Browse");
    brbtn.setBounds(50,313,156,40);
    Photolabel = new JLabel();
    Photolabel.setBounds(205,56,232,204);
    getContentPane().add(brbtn);
    getContentPane().add(Photolabel);
    
    brbtn.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        	
        
        	//this.file=FC.getSelectedFile();
        JFileChooser file = new JFileChooser();
        
          file.setCurrentDirectory(new File(System.getProperty("user.home")));
          //filter the files
          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png","pdf");
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
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
				PreparedStatement ps=con.prepareStatement("Insert into Document(File_name,File_Size,File_extension,File_content)values(?,?,?,?)");
				InputStream is=new FileInputStream(new File(s));
				String fileName = file.getName();
				long fileLength = file.length();
				long fileLengthInKb=fileLength/1024;
				ps.setString(1, fileName);
				ps.setLong(2, fileLengthInKb);
				
				ps.setString(3, fileName.substring(fileName.lastIndexOf(".")+1));
				ps.setBlob(4, is);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null,"Document uploded sucssfully" );

    		} catch (Exception e1) {
				e1.printStackTrace();
			}
    			
		}	
    		
    });
    save.setBounds(422, 313, 156, 40);
    getContentPane().add(save);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
  
   }*/