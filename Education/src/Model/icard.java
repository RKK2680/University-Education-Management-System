package Model;

import java.awt.Color;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.*;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import userdetails.project;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;

public class icard extends JFrame{
    JButton btnIcardGenrete ;
    JLabel label;
    JTextField jtf;
    
    private JPanel panel;
    private JLabel EraLogo;
    public static String path;
    private JTextField textFname;
    private JTextField textFthername;
    private JTextField textCourse;
    private JTextField textmobile;
    private JTable table;
    private JTextField textlname;
    private JTextField textdob;
    private JTextField textgender;
	private JPanel panelID;
	private JLabel Sig;
    public icard(){
    super("retrieve image from database in java");
    setResizable(false);
    setBounds(100, 000, 800, 1000);
    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
    setTitle("ICard");
    
    getContentPane().setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(153, 255, 102));
    
    panel = new JPanel();
    panel.setBackground(new Color(204, 255, 204));
    panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
    panel.setBounds(20, 20, 562, 330);
    getContentPane().add(panel);
    panel.setLayout(null);
    
    label = new JLabel();
    label.setBounds(20, 107, 171, 170);
    panel.add(label);
    
    EraLogo = new JLabel();
    path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
    EraLogo.setBounds(10, 10, 107, 74);
    ImageIcon imageIcon=new ImageIcon(path);
	Image imgImage=imageIcon.getImage();
	Image newiImage=imgImage.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon image=new ImageIcon(newiImage);
	EraLogo.setIcon(image);
    panel.add(EraLogo);
    
    JSeparator separator = new JSeparator();
    separator.setBounds(10, 92, 542, 12);
    panel.add(separator);
    
    JLabel lblNewLabel = new JLabel("Era University Lucknow");
    lblNewLabel.setForeground(new Color(0, 0, 153));
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
    lblNewLabel.setBounds(128, 10, 411, 29);
    panel.add(lblNewLabel);
    
     panelID = new JPanel();
     panelID.setBounds(0, 0, 562, 330);
     panel.add(panelID);
     panelID.setLayout(null);
     panelID.setBorder(new LineBorder(new Color(0, 0, 0), 3));
     panelID.setBackground(new Color(204, 255, 204));
     
     JLabel label_1 = new JLabel();
     label_1.setBounds(20, 107, 171, 179);
     panelID.add(label_1);
     
     JLabel EraLogo_1 = new JLabel();
     EraLogo_1.setBounds(11, 10, 107, 74);
     panelID.add(EraLogo_1);
     
     JSeparator separator_1 = new JSeparator();
     separator_1.setBounds(10, 92, 542, 12);
     panelID.add(separator_1);
     
     JLabel lblNewLabel_1 = new JLabel("Era University Lucknow");
     lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
     lblNewLabel_1.setForeground(new Color(0, 0, 153));
     lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
     lblNewLabel_1.setBounds(128, 10, 411, 29);
     panelID.add(lblNewLabel_1);
     
     JLabel lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
     lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
     lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
     lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 20));
     lblSarfarazganjHardoiRoad.setBounds(127, 34, 411, 35);
     panelID.add(lblSarfarazganjHardoiRoad);
     
     JLabel lblPh = new JLabel("Ph.0522-6600777");
     lblPh.setHorizontalAlignment(SwingConstants.CENTER);
     lblPh.setForeground(new Color(0, 102, 153));
     lblPh.setFont(new Font("Times New Roman", Font.BOLD, 20));
     lblPh.setBounds(127, 60, 411, 29);
     panelID.add(lblPh);
     
     JLabel lblNewLabel_2 = new JLabel("Name");
     lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
     lblNewLabel_2.setBounds(225, 107, 91, 23);
     panelID.add(lblNewLabel_2);
     
     JLabel lblNewLabel_2_1 = new JLabel("Father Name");
     lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
     lblNewLabel_2_1.setBounds(223, 196, 107, 23);
     panelID.add(lblNewLabel_2_1);
     
     JLabel lblNewLabel_2_2 = new JLabel("Course");
     lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
     lblNewLabel_2_2.setBounds(223, 230, 107, 23);
     panelID.add(lblNewLabel_2_2);
     
     JLabel lblNewLabel_2_3 = new JLabel("Mobile No:");
     lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
     lblNewLabel_2_3.setBounds(225, 263, 91, 23);
     panelID.add(lblNewLabel_2_3);
     
     textFname = new JTextField();
     textFname.setForeground(new Color(0, 0, 102));
     textFname.setFont(new Font("Times New Roman", Font.BOLD, 15));
     textFname.setBounds(333, 99, 98, 23);
     panelID.add(textFname);
     
     textFthername = new JTextField();
     textFthername.setForeground(new Color(0, 0, 102));
     textFthername.setFont(new Font("Times New Roman", Font.BOLD, 15));
     textFthername.setBounds(334, 197, 205, 24);
     panelID.add(textFthername);
     
     textCourse = new JTextField();
     textCourse.setForeground(new Color(0, 0, 102));
     textCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
     textCourse.setBounds(334, 230, 205, 23);
     panelID.add(textCourse);
     
     textmobile = new JTextField();
     textmobile.setForeground(new Color(0, 0, 102));
     textmobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
     textmobile.setBounds(334, 263, 205, 23);
     panelID.add(textmobile);
     
     textlname = new JTextField();
     textlname.setForeground(new Color(0, 0, 102));
     textlname.setFont(new Font("Times New Roman", Font.BOLD, 15));
     textlname.setBounds(432, 99, 107, 23);
     panelID.add(textlname);
     
     JLabel lblNewLabel_2_1_1 = new JLabel("Date Of Barth");
     lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
     lblNewLabel_2_1_1.setBounds(223, 131, 107, 23);
     panelID.add(lblNewLabel_2_1_1);
     
     textdob = new JTextField();
     textdob.setForeground(new Color(0, 0, 102));
     textdob.setFont(new Font("Times New Roman", Font.BOLD, 15));
     textdob.setBounds(334, 132, 205, 24);
     panelID.add(textdob);
     
     JLabel lblNewLabel_2_1_2 = new JLabel("Gender");
     lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
     lblNewLabel_2_1_2.setBounds(223, 163, 107, 23);
     panelID.add(lblNewLabel_2_1_2);
     
     textgender = new JTextField();
     textgender.setForeground(new Color(0, 0, 102));
     textgender.setFont(new Font("Times New Roman", Font.BOLD, 15));
     textgender.setBounds(334, 163, 205, 24);
     panelID.add(textgender);
     
      Sig = new JLabel("");
     Sig.setFont(new Font("Times New Roman", Font.BOLD, 15));
     Sig.setBounds(10, 284, 216, 35);
     panelID.add(Sig);
    
    btnIcardGenrete = new JButton("ICard Genrete");
    btnIcardGenrete.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnIcardGenrete.setBackground(new Color(153, 153, 255));
    btnIcardGenrete.setBounds(620, 138, 190, 40);
    getContentPane().add(btnIcardGenrete);
    
    jtf = new JTextField();
    jtf.setBounds(598, 97, 232, 31);
    getContentPane().add(jtf);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(10, 360, 837, 346);
    getContentPane().add(scrollPane);
    
    table = new JTable();
    table.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
    		int i = table.getSelectedRow();
            textFname.setText((String)dtm.getValueAt(i, 0));
            textlname.setText((String)dtm.getValueAt(i, 1));
            textdob.setText((String)dtm.getValueAt(i, 2));
            textgender.setText((String)dtm.getValueAt(i, 3));
            textFthername.setText((String)dtm.getValueAt(i, 4));
            textCourse.setText((String)dtm.getValueAt(i, 5));
            textmobile.setText((String)dtm.getValueAt(i, 6));
    	}
    });
    scrollPane.setViewportView(table);
    
    JButton btnIcardDataView = new JButton("ICard Data View");
    btnIcardDataView.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		IcardTable();
    		
    	}
    });
    btnIcardDataView.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnIcardDataView.setBackground(new Color(153, 153, 255));
    btnIcardDataView.setBounds(620, 188, 190, 40);
    getContentPane().add(btnIcardDataView);
    
    JButton btnPrint = new JButton("ICard Print");
    btnPrint.addActionListener(new ActionListener() {
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
                
                panel.print(g2);
         
               
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
    btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnPrint.setBackground(new Color(153, 153, 255));
    btnPrint.setBounds(620, 288, 190, 40);
    getContentPane().add(btnPrint);
    
    JLabel lblNewLabel_2_1_1_1 = new JLabel("Student Fistname:");
    lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
    lblNewLabel_2_1_1_1.setBounds(598, 46, 249, 31);
    getContentPane().add(lblNewLabel_2_1_1_1);
    
    JButton btnExit = new JButton("Exit");
    btnExit.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		//stdATENDENS std=new stdATENDENS();
    		//std.main(null);
    		project.main(null);
    		dispose();
    		
    	}
    });
    btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnExit.setBackground(new Color(153, 153, 255));
    btnExit.setBounds(776, 10, 71, 27);
    getContentPane().add(btnExit);
    
    btnIcardGenrete.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
                Statement st = con.createStatement();
                //ResultSet rs = st.executeQuery("select * from myimages where ID = '"+jtf.getText()+"'");
                ResultSet rs = st.executeQuery("select * from StudentAdmission where Fistname = '"+jtf.getText()+"'");
                if(rs.next()){
                    byte[] img = rs.getBytes("Image");



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
    setSize(871,753);
    setVisible(true);
    } 
  
         	


	public void IcardTable() {
 	   try {
 			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","ramkumar");
 			Statement St=connection.createStatement();
 			String qString="select Fistname, Lastname,DOB,Gender,Fathername,Course,Mobile from StudentAdmission";
 			ResultSet rs=St.executeQuery(qString);
 			ResultSetMetaData rsmd=rs.getMetaData();
 			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
 			int cols=rsmd.getColumnCount();
 			String[] coolName=new String[cols]; 
 			for(int i=0;i<cols;i++)
 			coolName[i]=rsmd.getColumnName(i+1);
 			tbl.setColumnIdentifiers(coolName);
 			String FID,DPN,FN,FDOB,FW,FG,FM;
 			while(rs.next()) {
 				
 				FID=rs.getString(1);
 				DPN=rs.getString(2);
 				FN=rs.getString(3);
 				FDOB=rs.getString(4);
 				FW=rs.getString(5);
 				FG=rs.getString(6);
 				FM=rs.getString(7);
 				String[]rowStrings= {FID,DPN,FN,FDOB,FW,FG,FM};
 				tbl.addRow(rowStrings);
 			}
 			St.close();
 			connection.close();
 		} catch (Exception e1) {
 			// TODO: handle exception
 			e1.printStackTrace();
 		}
	} 
	
    public static void main(String[] args){
        new icard();
    }
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Sig.getWidth(), Sig.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
   }


