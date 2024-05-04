package pdf;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;

import userdetails.project;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class viewRecipt extends JFrame{
    JButton btnView ;
    JLabel label;
    JTextField jtf;
    private JPanel panel;
    private JLabel lblNewLabel;
    private JSeparator separator;
    private JLabel lblNewLabel_1;
    private JSeparator separator_1;
    private JButton btnBack;
    private JPanel panel_1;
    private JButton btnNewButton;

    public viewRecipt(){
    super("retrieve image from database in java");
    setBackground(new Color(51, 51, 204));
    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
    setTitle("Veiw Recipt");
    setBounds(100,100, 1000, 1000);
    label = new JLabel();
    label.setBounds(30,97,976,485);
    getContentPane().add(label);
    
    getContentPane().setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(255, 255, 204));
    
    panel = new JPanel();
    panel.setBackground(new Color(153, 255, 153));
    panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
    panel.setBounds(10, 10, 1018, 718);
    getContentPane().add(panel);
    panel.setLayout(null);
    
    lblNewLabel = new JLabel("View Recipt");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblNewLabel.setBounds(168, 19, 604, 36);
    panel.add(lblNewLabel);
    
    separator = new JSeparator();
    separator.setForeground(new Color(0, 0, 204));
    separator.setBounds(10, 75, 940, 2);
    panel.add(separator);
    
    lblNewLabel_1 = new JLabel(" Name:");
    lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
    lblNewLabel_1.setBounds(172, 619, 92, 36);
    panel.add(lblNewLabel_1);
    
    jtf = new JTextField();
    jtf.setFont(new Font("Times New Roman", Font.BOLD, 15));
    jtf.setForeground(new Color(51, 0, 255));
    jtf.setBounds(262, 630, 227, 20);
    panel.add(jtf);
    
    btnView = new JButton("View ");
    btnView.setBackground(new Color(51, 153, 255));
    btnView.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    btnView.setForeground(new Color(0, 0, 0));
    btnView.setFont(new Font("Times New Roman", Font.BOLD, 25));
    btnView.setBounds(586, 619, 166, 40);
    panel.add(btnView);
    
    separator_1 = new JSeparator();
    separator_1.setForeground(new Color(0, 0, 204));
    separator_1.setBounds(10, 588, 940, 12);
    panel.add(separator_1);
    
    btnBack = new JButton("Back");
    btnBack.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		project.main(null);
    		dispose();
    	}
    });
    btnBack.setForeground(Color.BLACK);
    btnBack.setFont(new Font("Times New Roman", Font.BOLD, 25));
    btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    btnBack.setBackground(new Color(255, 99, 71));
    btnBack.setBounds(929, 0, 79, 35);
    panel.add(btnBack);
    
    panel_1 = new JPanel();
    panel_1.setBackground(new Color(135, 206, 235));
    panel_1.setBounds(10, 81, 998, 497);
    panel.add(panel_1);
    panel_1.setLayout(null);
    
    btnNewButton = new JButton("Dawnload");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.47,0.47);
                
                panel_1.print(g2);
         
               
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
            boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){
	ex.printStackTrace();
}
        }

    	}
    });
    btnNewButton.setVerticalAlignment(SwingConstants.TOP);
    btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
    btnNewButton.setBackground(new Color(51, 255, 102));
    btnNewButton.setBounds(827, 619, 152, 36);
    panel.add(btnNewButton);
    
    btnView.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        
        	try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payment","root","ramkumar");
                Statement st = con.createStatement();
                //ResultSet rs = st.executeQuery("select * from myimages where ID = '"+jtf.getText()+"'");
                ResultSet rs = st.executeQuery("select * from FeeRecipt where Name = '"+jtf.getText()+"'");
                if(rs.next()){
                    byte[] img = rs.getBytes("Upload_Recipt");



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
    setLocationRelativeTo(null);
    setSize(1052,798);
    setVisible(true);
    } 
     
    public static void main(String[] args){
        new viewRecipt();
    }
   }


