package Image;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import userdetails.Conn;

public class emp1 {
	public static List<emp> findAll(){
		List<emp> emps=new ArrayList<emp>();
		try {
			
			PreparedStatement PS=Conn.getConnection().prepareStatement("select * from image;");
			ResultSet RS=PS.executeQuery();
			while(RS.next()) {
				emp e1=new emp();
				//e1.setId(RS.getInt("id"));
				e1.setName(RS.getString("Name"));
				e1.setPhoto(RS.getBytes("Photo"));
				emps.add(e1);
			}
		} catch (Exception e) {
		      emps=null;
		}
		return emps;
	}
	public boolean create(emp e1) {
		
		try {
			PreparedStatement PS=Conn.getConnection().prepareStatement(" insert into image (Name,Photo) values(?,?)");
			PS.setString(1,e1.getName());
			PS.setBytes(2, e1.getPhoto());
			return PS.executeUpdate()>0;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
		

	}
}





/*
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import userdetails.Conn;
public class test2 extends JFrame {
	Conn myc=new Conn();
	String phtoPath;
	JButton button ;
    JLabel phtolabel;
    
	private JTextField Name;
	private JButton sumbit;
	private final Action action = new SwingAction();
	

	/**
	 * Launch the application.
	 *
	public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(phtolabel.getWidth(), phtolabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test2 frame = new test2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 *
	public test2() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		 button = new JButton("Browse");
		    button.setBounds(23, 99, 100, 40);
		    button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		    phtolabel = new JLabel();
		    phtolabel.setBounds(46, 29, 63, 63);
		    getContentPane().setLayout(null);
		    getContentPane().add(button);
		    getContentPane().add(phtolabel);
		    
		    button.addActionListener(new ActionListener() {

		        public void actionPerformed(ActionEvent e) {
		        
		          JFileChooser file = new JFileChooser();
		          file.setCurrentDirectory(new File(System.getProperty("user.home")));
		          
		          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png","pdf");
		          file.addChoosableFileFilter(filter);
		      
		          int result = file.showSaveDialog(null);
		          
		          if(result == JFileChooser.APPROVE_OPTION){
		              File selectedFile = file.getSelectedFile();
		              String path = selectedFile.getAbsolutePath();
		              phtolabel.setIcon(ResizeImage(path));
		          }
		          


		          else if(result == JFileChooser.CANCEL_OPTION){
		              System.out.println("No File Select");
		          }
		        }

				/*private Icon ResizeImage(String path) {
					// TODO Auto-generated method stub
					return null;
				}*
		    });
		    

		
		Name = new JTextField();
		Name.setBounds(184, 92, 166, 20);
		getContentPane().add(Name);
		Name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setBounds(184, 67, 46, 14);
		getContentPane().add(lblNewLabel);
		
		sumbit = new JButton("sumbit");
		sumbit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String firstName = Name.getText();
				 
				 String msg = "" + firstName;
				
	               msg += " \n";
	               
	              // InputStream is=new FileInputStream(new File(phtoPath));
	              // pSt.setBlob(2, is);
				 
				 try {
					 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");

	                    //String query = "INSERT INTO test1 values('" + firstName + "','" + is + "')";

	                    Statement sta = connection.createStatement();
	                    Connection conne= myc.getConnection();
	                    InputStream iStream=new FileInputStream(new File(phtoPath));
	                    
	                    String query = "INSERT INTO Image values('" + firstName + "','" + iStream + "')";
	                    PreparedStatement pSt=conne.prepareStatement(null);
	                    pSt.setBlob(2, iStream);
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(sumbit, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(sumbit,
	                            "Welcome, " + msg + "Your account is sucessfully created");
	                    }
	                    connection.close();

				} catch (Exception e2) {
					 e2.printStackTrace();
				}
			}
		});
		sumbit.setBounds(100, 150, 194, 36);
		getContentPane().add(sumbit);

	}
	public JButton getSumbit() {
		return sumbit;
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
*/