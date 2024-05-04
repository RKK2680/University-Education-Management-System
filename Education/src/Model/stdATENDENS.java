package Model;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.*;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import userdetails.Login;
import userdetails.NewStudent;
import userdetails.Query;
import userdetails.project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class stdATENDENS extends JFrame{
    JButton btnView ;
    JLabel label;
    JTextField textFid;
    private JLabel lblNewLabel;
    private JLabel lblFileName;
    private JPanel panel_1;
    private JLabel lblNewLabel_1;
    private JTextField textFname;
    private JLabel lblNewLabel_1_1;
    private JTextField textFDob;
    private JLabel lblNewLabel_1_2;
    private JLabel lblNewLabel_1_4;
    private JLabel lblNewLabel_1_8;
    private JLabel lblNewLabel_1_4_1;
    private JLabel lblNewLabel_1_9;
    private JTextField textT_M_P_S;
    private JTextField textS_Name;
    private JLabel lblNewLabel_1_11;
    private JLabel lblNewLabel_1_12;
    private JPanel panel_2;
    private JLabel lblNewLabel_1_3;
    private JScrollPane scrollPane;
    private JTable table1;
    private JLabel lblNewLabel_1_5;
    private JLabel lblNewLabel_1_6;
    private JLabel lblNewLabel_1_7;
    private JLabel lblNewLabel_1_13;
    private JLabel lblNewLabel_1_14;
    private JComboBox comboBoxC_M;
    private JComboBox comboBoxC_D;
    private JComboBox comboBoxC_F_N;
    private JComboBox comboBoxC_F_P;
    private JComboBox comboBoxC_A_N;
    private JSeparator separator;
    private JComboBox comboBoxS_P_S;
    private JLabel lblNewLabel_1_15;
    private JTextField textDate_C;
    private JTextField textT_M_C;
    private JLabel lblNewLabel_1_15_2;
    private JButton btnView_2;
    private JButton btnNewButton_2;
    private JButton btnNewButton_1;
    private JScrollPane scrollPane_1;
    private JScrollPane scrollPane_2;
    private JLabel lblNewLabel_1_15_4;
    private JLabel lblNewLabel_1_15_5;
    private JButton btnView_4;
    private JTable table_1;
    private JLabel lblNewLabel_1_10;
    private JTextField textmobile;
    private JTextField textEmail;
	private JComboBox comboBoxDEp;
	private JComboBox comboBoxWork;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBoxC_C_Tin;
	private JComboBox comboBoxC_C_Tout;
	private JTable table3;
	private JButton btnNewButtonP_S;
	private JRadioButton rdbtnNewRadioButtonP;
	private JRadioButton rdbtnNewRadioButtonA;
	private JButton btnNewButton;
	private JTextField text_I_C_S;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JRadioButton rdbtnyes;
	private JRadioButton rdbtnNo;
	private JButton btnNewButton_3;
	private JButton btnView_1;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;

    public stdATENDENS(){
    super("retrieve image from database in java");
    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
    setTitle("Feculty Informmation  & Attendence");
    getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
    getContentPane().setForeground(new Color(204, 102, 255));
    setBounds(000, 000, 1600, 900);
    getContentPane().setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(153, 255, 204));
    
    lblNewLabel = new JLabel("Faculty Information & Attendence");
    lblNewLabel.setBounds(512, 10, 504, 36);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    getContentPane().add(lblNewLabel);
    
    panel_2 = new JPanel();
    panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
    panel_2.setBackground(new Color(102, 204, 255));
    panel_2.setBounds(10, 56, 534, 305);
    getContentPane().add(panel_2);
    panel_2.setLayout(null);
    
    textFid = new JTextField();
    textFid.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textFid.setForeground(new Color(0, 0, 102));
    textFid.setBounds(194, 20, 147, 23);
    panel_2.add(textFid);
    
    lblFileName = new JLabel("Feculty ID:");
    lblFileName.setBounds(20, 20, 152, 20);
    panel_2.add(lblFileName);
    lblFileName.setHorizontalAlignment(SwingConstants.CENTER);
    lblFileName.setFont(new Font("Times New Roman", Font.BOLD, 20));
    btnView = new JButton("Serach");
    btnView.setBackground(new Color(107, 142, 35));
    btnView.setForeground(new Color(0, 0, 0));
    btnView.setBounds(375, 11, 100, 40);
    panel_2.add(btnView);
    btnView.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    textFname = new JTextField();
    textFname.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textFname.setForeground(new Color(0, 0, 102));
    textFname.setBounds(331, 97, 179, 26);
    panel_2.add(textFname);
    textFname.setColumns(10);
    
    textFDob = new JTextField();
    textFDob.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textFDob.setForeground(new Color(0, 0, 102));
    textFDob.setBounds(331, 133, 179, 26);
    panel_2.add(textFDob);
    textFDob.setColumns(10);
    
    lblNewLabel_1_9 = new JLabel("Work");
    lblNewLabel_1_9.setBounds(268, 170, 67, 26);
    panel_2.add(lblNewLabel_1_9);
    lblNewLabel_1_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    lblNewLabel_1_1 = new JLabel(" DOB");
    lblNewLabel_1_1.setBounds(268, 134, 54, 26);
    panel_2.add(lblNewLabel_1_1);
    lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    lblNewLabel_1 = new JLabel("Name");
    lblNewLabel_1.setBounds(274, 97, 54, 26);
    panel_2.add(lblNewLabel_1);
    lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    label = new JLabel();
    label.setBounds(20, 61, 211, 200);
    panel_2.add(label);
    
    lblNewLabel_1_3 = new JLabel("Departments");
    lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_3.setBounds(241, 61, 100, 26);
    panel_2.add(lblNewLabel_1_3);
    
    lblNewLabel_1_10 = new JLabel("Email");
    lblNewLabel_1_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_10.setBounds(268, 233, 67, 26);
    panel_2.add(lblNewLabel_1_10);
    
    textmobile = new JTextField();
    textmobile.setForeground(new Color(0, 0, 102));
    textmobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textmobile.setColumns(10);
    textmobile.setBounds(331, 197, 179, 26);
    panel_2.add(textmobile);
    
    JLabel lblNewLabel_1_17_1 = new JLabel("Mobile");
    lblNewLabel_1_17_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_17_1.setBounds(268, 197, 67, 26);
    panel_2.add(lblNewLabel_1_17_1);
    
    textEmail = new JTextField();
    textEmail.setForeground(new Color(0, 0, 102));
    textEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
    textEmail.setColumns(10);
    textEmail.setBounds(331, 233, 179, 26);
    panel_2.add(textEmail);
    
     comboBoxDEp = new JComboBox();
    comboBoxDEp.setModel(new DefaultComboBoxModel(new String[] {"Computer Scinence Department", "Biotech Department", "Food & Nutrition", "Libral & Art", "Pharmecy", "Nursing"}));
    comboBoxDEp.setMaximumRowCount(10);
    comboBoxDEp.setForeground(Color.BLACK);
    comboBoxDEp.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxDEp.setBackground(new Color(255, 182, 193));
    comboBoxDEp.setBounds(331, 61, 179, 26);
    panel_2.add(comboBoxDEp);
    
     comboBoxWork = new JComboBox();
    comboBoxWork.setModel(new DefaultComboBoxModel(new String[] {"Head Of Depertment (HOD)", "Senior Associate Prof.", "Junior Associate Prof.", "Senior Assistaint Prof.", "Junior Assistaint Prof.", "Lecturer", "Lab Assistent", "Office Assistent", "Clark", "Worker"}));
    comboBoxWork.setMaximumRowCount(10);
    comboBoxWork.setForeground(Color.BLACK);
    comboBoxWork.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxWork.setBackground(new Color(255, 182, 193));
    comboBoxWork.setBounds(331, 167, 179, 23);
    panel_2.add(comboBoxWork);
    
    btnView_4 = new JButton("Update");
    btnView_4.setBackground(new Color(124, 252, 0));
    btnView_4.setBounds(299, 269, 200, 26);
    panel_2.add(btnView_4);
    btnView_4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		try {
    			Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
	    		String sql="update FecultyRegistretion set Department=?,Fecultyname=?,DOB=?,FecultyWork=?,Mobile=?,Email=?  where FecultyID = ?";
	    		PreparedStatement Ps=conn.prepareStatement(sql);
	    		String Dep=comboBoxDEp.getSelectedItem().toString();
				 Ps.setString(1, Dep);
				 Ps.setString(2, textFname.getText());
				 Ps.setString(3, textFDob.getText());
				 String FW=comboBoxDEp.getSelectedItem().toString();
				 Ps.setString(4, FW);
				 Ps.setString(5, textmobile.getText());
				 Ps.setString(6, textEmail.getText());
				 Ps.setString(7, textFid.getText());
				 Ps.executeUpdate();
    		JOptionPane.showMessageDialog(null, "Profile is Updeted Sucsesfuly....");
    		conn.close();
    		}
	    	  catch (Exception e2) {
				e2.printStackTrace();
			}
    	}
    });
    btnView_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    btnView.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
                Statement st = con.createStatement();
                //ResultSet rs = st.executeQuery("select * from myimages where ID = '"+jtf.getText()+"'");
                ResultSet rs = st.executeQuery("select * from FecultyRegistretion where FecultyID = '"+textFid.getText()+"'");
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
            showTable();
        }
    });
    
    panel_1 = new JPanel();
    panel_1.setForeground(new Color(0, 0, 128));
    panel_1.setBackground(new Color(255, 222, 173));
    panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
    panel_1.setBounds(555, 56, 956, 332);
    getContentPane().add(panel_1);
    panel_1.setLayout(null);
    
    lblNewLabel_1_2 = new JLabel("Subjects");
    lblNewLabel_1_2.setForeground(new Color(255, 0, 0));
    lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_2.setBounds(41, 122, 108, 26);
    panel_1.add(lblNewLabel_1_2);
    
    lblNewLabel_1_8 = new JLabel("Prsent Student %");
    lblNewLabel_1_8.setForeground(new Color(255, 0, 0));
    lblNewLabel_1_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_8.setBounds(267, 177, 149, 26);
    panel_1.add(lblNewLabel_1_8);
    
    lblNewLabel_1_4_1 = new JLabel(" IN        OUT");
    lblNewLabel_1_4_1.setForeground(new Color(0, 0, 128));
    lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_4_1.setBounds(817, 22, 101, 14);
    panel_1.add(lblNewLabel_1_4_1);
    
     comboBoxC_C_Tin = new JComboBox();
    comboBoxC_C_Tin.setBackground(new Color(255, 182, 193));
    comboBoxC_C_Tin.setForeground(new Color(0, 0, 0));
    comboBoxC_C_Tin.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00", "03:00", "04:00"}));
    comboBoxC_C_Tin.setMaximumRowCount(10);
    comboBoxC_C_Tin.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxC_C_Tin.setBounds(784, 46, 72, 26);
    panel_1.add(comboBoxC_C_Tin);
    
    comboBoxC_C_Tout = new JComboBox();
    comboBoxC_C_Tout.setBackground(new Color(255, 182, 193));
    comboBoxC_C_Tout.setForeground(new Color(0, 0, 0));
    comboBoxC_C_Tout.setModel(new DefaultComboBoxModel(new String[] {"10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00(Lunch Over)", "03:00", "04:00", "05:00"}));
    comboBoxC_C_Tout.setMaximumRowCount(10);
    comboBoxC_C_Tout.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxC_C_Tout.setBounds(862, 46, 84, 26);
    panel_1.add(comboBoxC_C_Tout);
    
    textT_M_P_S = new JTextField();
    textT_M_P_S.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textT_M_P_S.setForeground(new Color(0, 0, 0));
    textT_M_P_S.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textT_M_P_S.setColumns(10);
    textT_M_P_S.setBounds(267, 204, 115, 26);
    panel_1.add(textT_M_P_S);
    
    textS_Name = new JTextField();
    textS_Name.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textS_Name.setForeground(new Color(0, 0, 0));
    textS_Name.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textS_Name.setColumns(10);
    textS_Name.setBounds(20, 214, 160, 26);
    panel_1.add(textS_Name);
    
    lblNewLabel_1_11 = new JLabel("Day");
    lblNewLabel_1_11.setForeground(new Color(0, 0, 128));
    lblNewLabel_1_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_11.setBounds(141, 10, 57, 26);
    panel_1.add(lblNewLabel_1_11);
    
    lblNewLabel_1_12 = new JLabel("Month");
    lblNewLabel_1_12.setForeground(new Color(0, 0, 128));
    lblNewLabel_1_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_12.setBounds(31, 10, 72, 26);
    panel_1.add(lblNewLabel_1_12);
    
     btnNewButton = new JButton("Save");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		Classinfo();
    		cassinfoshowteble();
    		
    	}
    });
    btnNewButton.setBackground(new Color(51, 204, 102));
    btnNewButton.setForeground(new Color(0, 0, 0));
    btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton.setBounds(849, 94, 97, 40);
    panel_1.add(btnNewButton);
    
    lblNewLabel_1_5 = new JLabel("Date");
    lblNewLabel_1_5.setForeground(new Color(0, 0, 128));
    lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_5.setBounds(231, 9, 57, 26);
    panel_1.add(lblNewLabel_1_5);
    
    lblNewLabel_1_6 = new JLabel("Feculty Name");
    lblNewLabel_1_6.setForeground(new Color(0, 0, 128));
    lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_6.setBounds(340, 10, 122, 26);
    panel_1.add(lblNewLabel_1_6);
    
    lblNewLabel_1_7 = new JLabel("Assignment Name");
    lblNewLabel_1_7.setForeground(new Color(0, 0, 128));
    lblNewLabel_1_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_7.setBounds(638, 10, 136, 26);
    panel_1.add(lblNewLabel_1_7);
    
    lblNewLabel_1_13 = new JLabel("Feculty Prsent");
    lblNewLabel_1_13.setForeground(new Color(0, 0, 128));
    lblNewLabel_1_13.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_13.setBounds(512, 10, 101, 26);
    panel_1.add(lblNewLabel_1_13);
    
    lblNewLabel_1_14 = new JLabel("Student Name");
    lblNewLabel_1_14.setForeground(new Color(255, 0, 0));
    lblNewLabel_1_14.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_14.setBounds(20, 187, 115, 26);
    panel_1.add(lblNewLabel_1_14);
    
    lblNewLabel_1_4 = new JLabel("Class Time");
    lblNewLabel_1_4.setForeground(new Color(0, 0, 128));
    lblNewLabel_1_4.setBounds(817, 0, 108, 26);
    panel_1.add(lblNewLabel_1_4);
    lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    comboBoxC_M = new JComboBox();
    comboBoxC_M.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
    comboBoxC_M.setMaximumRowCount(10);
    comboBoxC_M.setForeground(new Color(0, 0, 0));
    comboBoxC_M.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxC_M.setBackground(new Color(255, 182, 193));
    comboBoxC_M.setBounds(10, 46, 93, 26);
    panel_1.add(comboBoxC_M);
    
    comboBoxC_D = new JComboBox();
    comboBoxC_D.setModel(new DefaultComboBoxModel(new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}));
    comboBoxC_D.setMaximumRowCount(10);
    comboBoxC_D.setForeground(Color.BLACK);
    comboBoxC_D.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxC_D.setBackground(new Color(255, 182, 193));
    comboBoxC_D.setBounds(113, 46, 93, 26);
    panel_1.add(comboBoxC_D);
    
    comboBoxC_F_N = new JComboBox();
    comboBoxC_F_N.setModel(new DefaultComboBoxModel(new String[] {"Dr.Moh.Islam", "Dr.S.A.A Rizvi", "Dr.Shaweta Vikram", "Mr.Moh.Arif", "Mr.Saqaib Ali", "Mr.Nafees Faruki", "Mr.Abhisek", "Mis.Simran Raza"}));
    comboBoxC_F_N.setMaximumRowCount(10);
    comboBoxC_F_N.setForeground(Color.BLACK);
    comboBoxC_F_N.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxC_F_N.setBackground(new Color(255, 182, 193));
    comboBoxC_F_N.setBounds(324, 46, 186, 26);
    panel_1.add(comboBoxC_F_N);
    
    comboBoxC_F_P = new JComboBox();
    comboBoxC_F_P.setModel(new DefaultComboBoxModel(new String[] {"Absent", "Prsent", "Short Leve", "Hafe Leve", "Department Metting"}));
    comboBoxC_F_P.setMaximumRowCount(10);
    comboBoxC_F_P.setForeground(Color.BLACK);
    comboBoxC_F_P.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxC_F_P.setBackground(new Color(255, 182, 193));
    comboBoxC_F_P.setBounds(520, 46, 108, 26);
    panel_1.add(comboBoxC_F_P);
    
    comboBoxC_A_N = new JComboBox();
    comboBoxC_A_N.setModel(new DefaultComboBoxModel(new String[] {"Class Test", "Quize", "Viva", "Subject Assinment "}));
    comboBoxC_A_N.setMaximumRowCount(10);
    comboBoxC_A_N.setForeground(Color.BLACK);
    comboBoxC_A_N.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxC_A_N.setBackground(new Color(255, 182, 193));
    comboBoxC_A_N.setBounds(638, 46, 136, 26);
    panel_1.add(comboBoxC_A_N);
    
    separator = new JSeparator();
    separator.setBackground(new Color(0, 0, 128));
    separator.setBorder(new LineBorder(new Color(0, 0, 0)));
    separator.setForeground(new Color(0, 0, 128));
    separator.setBounds(10, 102, 829, 18);
    panel_1.add(separator);
    
    comboBoxS_P_S = new JComboBox();
    comboBoxS_P_S.setModel(new DefaultComboBoxModel(new String[] {"Programing in C", "Food Nutrion and Hygine", "Fundamental of Mathematics", "Profesnol Comunication", "Multimedia Bsed Graphic Design", "Computre Fundamental ", "Digital Electronics", "Data Structure Using  C++", "Data Structure Using  C++ (Lab)", "Opreting System", "Graph Theory", "Advance Profesnol Comunication", "System Desing And Analysis", "Java Programing ", "Java Programing (Lab)", "Database Management System(DBMS)", "Database Management System(DBMS Lab)", "Prensples OfManagement & Business Organization", "Computer Networks", "Software Engeniaring", "Multimedia & Animation Based Project", "Animation", "Advance Java Programing ", "Advance Java Programing (Lab)", "Introduction to Python Programing", "Python Programing( Lab)", "Wireless Networking", "Computer Networks", "Software Engeniaring", "Cloud Computing", ".Net Fremwork", ".Net Fremwork(Lab)", "Web Technology", "Web Technology(Lab)", "Information Cyber Security & Low", "Indistrial Food Service Management", "Sofft Skil Class", "Indistrial Training", "Mini Project", "Libery", "Open Session", "Open Elective Class", "Half Day Off", "Others"}));
    comboBoxS_P_S.setMaximumRowCount(50);
    comboBoxS_P_S.setForeground(Color.BLACK);
    comboBoxS_P_S.setFont(new Font("Times New Roman", Font.BOLD, 14));
    comboBoxS_P_S.setBackground(new Color(255, 182, 193));
    comboBoxS_P_S.setBounds(10, 149, 211, 26);
    panel_1.add(comboBoxS_P_S);
    
    lblNewLabel_1_15 = new JLabel("Student Activevity");
    lblNewLabel_1_15.setForeground(new Color(255, 0, 0));
    lblNewLabel_1_15.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_15.setBounds(31, 250, 136, 26);
    panel_1.add(lblNewLabel_1_15);
    
     rdbtnNewRadioButtonP = new JRadioButton("Prsent");
    buttonGroup.add(rdbtnNewRadioButtonP);
    rdbtnNewRadioButtonP.setFont(new Font("Times New Roman", Font.BOLD, 14));
    rdbtnNewRadioButtonP.setBounds(10, 280, 93, 26);
    panel_1.add(rdbtnNewRadioButtonP);
    
    rdbtnNewRadioButtonA = new JRadioButton("Absent");
    buttonGroup.add(rdbtnNewRadioButtonA);
    rdbtnNewRadioButtonA.setFont(new Font("Times New Roman", Font.BOLD, 14));
    rdbtnNewRadioButtonA.setBounds(120, 280, 101, 26);
    panel_1.add(rdbtnNewRadioButtonA);
    
    textDate_C = new JTextField();
    textDate_C.setForeground(Color.BLACK);
    textDate_C.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textDate_C.setColumns(10);
    textDate_C.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textDate_C.setBounds(216, 46, 103, 26);
    panel_1.add(textDate_C);
    
    JLabel lblNewLabel_1_15_1 = new JLabel("Prsent Student %");
    lblNewLabel_1_15_1.setForeground(new Color(255, 0, 0));
    lblNewLabel_1_15_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_15_1.setBounds(267, 240, 136, 26);
    panel_1.add(lblNewLabel_1_15_1);
    
    textT_M_C = new JTextField();
    textT_M_C.setForeground(Color.BLACK);
    textT_M_C.setFont(new Font("Times New Roman", Font.BOLD, 14));
    textT_M_C.setColumns(10);
    textT_M_C.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    textT_M_C.setBounds(264, 150, 122, 26);
    panel_1.add(textT_M_C);
    
    lblNewLabel_1_15_2 = new JLabel(" Total Monthly Class");
    lblNewLabel_1_15_2.setForeground(new Color(255, 0, 0));
    lblNewLabel_1_15_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_15_2.setBounds(254, 122, 167, 26);
    panel_1.add(lblNewLabel_1_15_2);
    
    btnView_2 = new JButton("View");
    btnView_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		showICardTable();
    	}
    });
    btnView_2.setForeground(Color.BLACK);
    btnView_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnView_2.setBackground(new Color(51, 204, 102));
    btnView_2.setBounds(735, 247, 84, 33);
    panel_1.add(btnView_2);
    
    btnNewButton_2 = new JButton("Save");
    btnNewButton_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		Persentage();
    		Pessentage();
    	}
    });
    btnNewButton_2.setForeground(Color.BLACK);
    btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_2.setBackground(new Color(51, 204, 102));
    btnNewButton_2.setBounds(735, 174, 84, 33);
    panel_1.add(btnNewButton_2);
    
    btnNewButton_1 = new JButton("View");
    btnNewButton_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		cassinfoshowteble();
    	}
    });
    btnNewButton_1.setForeground(Color.BLACK);
    btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_1.setBackground(new Color(51, 204, 102));
    btnNewButton_1.setBounds(849, 144, 97, 31);
    panel_1.add(btnNewButton_1);
    
    JSeparator separator_1 = new JSeparator();
    separator_1.setBackground(new Color(255, 255, 255));
    separator_1.setForeground(new Color(0, 0, 139));
    separator_1.setOrientation(SwingConstants.VERTICAL);
    separator_1.setBounds(228, 122, 14, 200);
    panel_1.add(separator_1);
    
    JSeparator separator_1_1 = new JSeparator();
    separator_1_1.setOrientation(SwingConstants.VERTICAL);
    separator_1_1.setForeground(new Color(0, 0, 139));
    separator_1_1.setBackground(Color.WHITE);
    separator_1_1.setBounds(416, 115, 14, 200);
    panel_1.add(separator_1_1);
    
    JSeparator separator_1_3 = new JSeparator();
    separator_1_3.setOrientation(SwingConstants.VERTICAL);
    separator_1_3.setForeground(new Color(0, 0, 139));
    separator_1_3.setBackground(Color.WHITE);
    separator_1_3.setBounds(838, 122, 14, 159);
    panel_1.add(separator_1_3);
    
    btnNewButtonP_S = new JButton("");
    btnNewButtonP_S.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {   
			double no1=Double.parseDouble(textT_M_C.getText());
			double no2=Double.parseDouble(textT_M_P_S.getText());
			btnNewButtonP_S.setText(" "+(no2/no1)*100+"%");
    	}
    });
    btnNewButtonP_S.setBackground(new Color(255, 182, 193));
    btnNewButtonP_S.setFont(new Font("Times New Roman", Font.BOLD, 18));
    btnNewButtonP_S.setForeground(new Color(0, 0, 128));
    btnNewButtonP_S.setBounds(267, 270, 115, 40);
    panel_1.add(btnNewButtonP_S);
    
    text_I_C_S = new JTextField();
    text_I_C_S.setForeground(Color.BLACK);
    text_I_C_S.setFont(new Font("Times New Roman", Font.BOLD, 14));
    text_I_C_S.setColumns(10);
    text_I_C_S.setBorder(new LineBorder(new Color(0, 0, 0), 2));
    text_I_C_S.setBounds(460, 175, 230, 26);
    panel_1.add(text_I_C_S);
    
    JLabel lblNewLabel_1_15_2_1 = new JLabel("Student Name (I card ) ");
    lblNewLabel_1_15_2_1.setForeground(Color.RED);
    lblNewLabel_1_15_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_15_2_1.setBounds(484, 147, 167, 26);
    panel_1.add(lblNewLabel_1_15_2_1);
    
    rdbtnyes = new JRadioButton("Yes");
    buttonGroup_2.add(rdbtnyes);
    rdbtnyes.setFont(new Font("Times New Roman", Font.BOLD, 14));
    rdbtnyes.setBounds(479, 250, 93, 26);
    panel_1.add(rdbtnyes);
    
    JLabel lblNewLabel_1_15_3 = new JLabel("I Card Avalible");
    lblNewLabel_1_15_3.setForeground(Color.RED);
    lblNewLabel_1_15_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lblNewLabel_1_15_3.setBounds(515, 213, 136, 26);
    panel_1.add(lblNewLabel_1_15_3);
    
    rdbtnNo = new JRadioButton("No");
    buttonGroup_2.add(rdbtnNo);
    rdbtnNo.setFont(new Font("Times New Roman", Font.BOLD, 14));
    rdbtnNo.setBounds(589, 250, 101, 26);
    panel_1.add(rdbtnNo);
    
    btnNewButton_3 = new JButton("ICard");
    btnNewButton_3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		StudentIcard.main(null);
    		dispose();
    		
    	}
    });
    btnNewButton_3.setForeground(Color.BLACK);
    btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_3.setBackground(new Color(51, 204, 102));
    btnNewButton_3.setBounds(849, 187, 97, 35);
    panel_1.add(btnNewButton_3);
    
    btnNewButton_4 = new JButton("New Student");
    btnNewButton_4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		NewStudent.main(null);
    		dispose();
    	}
    });
    btnNewButton_4.setForeground(Color.BLACK);
    btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_4.setBackground(new Color(51, 204, 102));
    btnNewButton_4.setBounds(663, 289, 136, 33);
    panel_1.add(btnNewButton_4);
    
    btnNewButton_5 = new JButton("Result");
    btnNewButton_5.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		FistyearResult.main(null);
    		dispose();
    	}
    });
    btnNewButton_5.setForeground(Color.BLACK);
    btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_5.setBackground(new Color(51, 204, 102));
    btnNewButton_5.setBounds(817, 289, 129, 33);
    panel_1.add(btnNewButton_5);
    
    btnNewButton_6 = new JButton("Query");
    btnNewButton_6.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		Query.main(null);
    	}
    });
    btnNewButton_6.setForeground(Color.BLACK);
    btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnNewButton_6.setBackground(new Color(51, 204, 102));
    btnNewButton_6.setBounds(849, 232, 97, 35);
    panel_1.add(btnNewButton_6);
    
    scrollPane = new JScrollPane();
    scrollPane.setBounds(12, 388, 532, 433);
    getContentPane().add(scrollPane);
    
    table1 = new JTable();
    table1.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		DefaultTableModel dtm=(DefaultTableModel) table1.getModel();
    		int i = table1.getSelectedRow();
    		
    		comboBoxDEp.setSelectedItem(("Department"));
            textFname.setText((String)dtm.getValueAt(i, 2));
            textFDob.setText((String)dtm.getValueAt(i, 3));
            comboBoxWork.setSelectedItem(("FecultyWork"));
            textmobile.setText((String)dtm.getValueAt(i, 5));
            textEmail.setText((String)dtm.getValueAt(i, 6));
    		
    	}
    });
    table1.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyPressed(KeyEvent e) {
    		
    		DefaultTableModel dtm=(DefaultTableModel) table1.getModel();
    		int i = table1.getSelectedRow();
    		
    		comboBoxDEp.setSelectedItem(("Department"));
            textFname.setText((String)dtm.getValueAt(i, 0));
            textFDob.setText((String)dtm.getValueAt(i, 1));
            comboBoxWork.setSelectedItem(("FecultyWork"));
            textmobile.setText((String)dtm.getValueAt(i, 2));
            textEmail.setText((String)dtm.getValueAt(i, 3));
    		
    		/*int row=table1.getSelectedRow();
    		String selection=table1.getModel().getValueAt(row, 0).toString();
    		String sql="select Department,FecultyID,Fecultyname,Gender,DOB,FecultyWork,Mobile,Email from FecultyRegistretion where FecultyID = "+selection;
    		try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
				 PreparedStatement PS=connection.prepareStatement(sql) ;
				 ResultSet rs=PS.executeQuery();
				 
				 if (rs.next()) {
					 textFid.setText(rs.getString("FecultyID"));
					 comboBoxDEp.setSelectedItem(rs.getString("Department"));
					 textFname.setText(rs.getString("Fecultyname"));
					 textGender.setText(rs.getString("Gender"));
					 textFDob.setText(rs.getString("DOB"));
					 comboBoxWork.setSelectedItem(rs.getString("FecultyWork"));
					 textmobile.setText(rs.getString("Mobile"));
					 textEmail.setText(rs.getString("Email"));
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}*
    		DefaultTableModel dtm=(DefaultTableModel) table1.getModel();
    		/*int selectedRowIndex=table1.getSelectedRow();
    		textFid.setText(dtm.getValueAt(selectedRowIndex, 0).toString());
    		//comboBoxDEp.setSe(dtm.getValueAt(selectedRowIndex, 1).toString());
    		textFname.setText(dtm.getValueAt(selectedRowIndex, 3).toString());
    		textGender.setText(dtm.getValueAt(selectedRowIndex, 4).toString());
    		textFDob.setText(dtm.getValueAt(selectedRowIndex, 5).toString());
    		//textwork.setText(dtm.getValueAt(selectedRowIndex, 0).toString());
    		textmobile.setText(dtm.getValueAt(selectedRowIndex, 7).toString());
    		textEmail.setText(dtm.getValueAt(selectedRowIndex, 8).toString());*
    		
    		int i = table1.getSelectedRow();
            textFname.setText((String)dtm.getValueAt(i, 0));
            textEmail.setText((String)dtm.getValueAt(i, 1));
            textFDob.setText((String)dtm.getValueAt(i, 2));
            textmobile.setText((String)dtm.getValueAt(i, 3));*/
    		
    	}
    });
    scrollPane.setViewportView(table1);
    
    scrollPane_1 = new JScrollPane();
    scrollPane_1.setBounds(552, 413, 959, 174);
    getContentPane().add(scrollPane_1);
    
    table3 = new JTable();
    scrollPane_1.setViewportView(table3);
    
    scrollPane_2 = new JScrollPane();
    scrollPane_2.setBounds(555, 630, 956, 191);
    getContentPane().add(scrollPane_2);
    
    table_1 = new JTable();
    scrollPane_2.setViewportView(table_1);
    
    lblNewLabel_1_15_4 = new JLabel("Class Information");
    lblNewLabel_1_15_4.setForeground(new Color(255, 69, 0));
    lblNewLabel_1_15_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
    lblNewLabel_1_15_4.setBounds(564, 388, 206, 26);
    getContentPane().add(lblNewLabel_1_15_4);
    
    lblNewLabel_1_15_5 = new JLabel("Student Persentage %  Information");
    lblNewLabel_1_15_5.setForeground(new Color(255, 69, 0));
    lblNewLabel_1_15_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
    lblNewLabel_1_15_5.setBounds(554, 595, 349, 26);
    getContentPane().add(lblNewLabel_1_15_5);
    
    btnView_1 = new JButton("Exit");
    btnView_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		project.main(null);
    		dispose();
    	}
    });
    btnView_1.setForeground(Color.BLACK);
    btnView_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
    btnView_1.setBackground(new Color(255, 99, 71));
    btnView_1.setBounds(1438, 0, 84, 33);
    getContentPane().add(btnView_1);
    setLocationRelativeTo(null);
    setSize(1536,962);
    setVisible(true);
    } 
   public void showTable() {
	   try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
			Statement St=connection.createStatement();
			String qString="select Department,FecultyID,Fecultyname,Gender,DOB,FecultyWork,Mobile,Email from FecultyRegistretion";
			ResultSet rs=St.executeQuery(qString);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel tbl=(DefaultTableModel)table1.getModel(); 
			int cols=rsmd.getColumnCount();
			String[] coolName=new String[cols];
			for(int i=0;i<cols;i++)
			coolName[i]=rsmd.getColumnName(i+1);
			tbl.setColumnIdentifiers(coolName);
			String FID,DPN,FN,FDOB,FW,FG,FM,FE;
			while(rs.next()) {
				
				FID=rs.getString(1);
				DPN=rs.getString(2);
				FN=rs.getString(3);
				FDOB=rs.getString(4);
				FW=rs.getString(5);
				FG=rs.getString(6);
				FM=rs.getString(7);
				FE=rs.getString(8);
				String[]rowStrings= {FID,DPN,FN,FDOB,FW,FG,FM,FE};
				tbl.addRow(rowStrings);
			}
			St.close();
			connection.close();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	   
}
   
   public void Classinfo() {
	   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			 String query = "INSERT INTO ClassInfo values (?,?,?,?,?,?,?,?)";
			 PreparedStatement PS=connection.prepareStatement(query) ;
			 String month=comboBoxC_M.getSelectedItem().toString();
			 PS.setString(1, month);
			 String Day=comboBoxC_D.getSelectedItem().toString();
			 PS.setString(2,Day);
			 PS.setString(3, textDate_C.getText());
			 String Fname=comboBoxC_F_N.getSelectedItem().toString();
			 PS.setString(4, Fname);
			 String FP=comboBoxC_F_P.getSelectedItem().toString();
			 PS.setString(5, FP);
			 String Assing=comboBoxC_A_N.getSelectedItem().toString();
			 PS.setString(6,Assing);
			 String Classtime=comboBoxC_C_Tin.getSelectedItem().toString();
			 PS.setString(7, Classtime);
			 String Classtimeout=comboBoxC_C_Tout.getSelectedItem().toString();
			 PS.setString(8, Classtimeout);
		
			 int i=PS.executeUpdate();
			 JOptionPane.showMessageDialog(null, "Class Information Updated");
			 PS.close();
			 connection.close();
			 
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
			/*if (rdbtnNewRadioButtonMale.isSelected()) 
				 	PS.setString(3, rdbtnNewRadioButtonMale.getText());
			 else 
				 	PS.setString(3, rdbtnFemale.getText());*/
		}
	   
}
  public void cassinfoshowteble() {
	  try {
		   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			Statement St=connection.createStatement();
			String qString="select * from ClassInfo";
			ResultSet rs=St.executeQuery(qString);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel tbl=(DefaultTableModel)table3.getModel(); 
			int cols=rsmd.getColumnCount();
			String[] coolName=new String[cols];
			for(int i=0;i<cols;i++)
			coolName[i]=rsmd.getColumnName(i+1);
			tbl.setColumnIdentifiers(coolName);
			String FID,DPN,FN,FDOB,FW,FG,FM,FE;
			while(rs.next()) {
				
				FID=rs.getString(1);
				DPN=rs.getString(2);
				FN=rs.getString(3);
				FDOB=rs.getString(4);
				FW=rs.getString(5);
				FG=rs.getString(6);
				FM=rs.getString(7);
				FE=rs.getString(8);
				String[]rowStrings= {FID,DPN,FN,FDOB,FW,FG,FM,FE};
				tbl.addRow(rowStrings);
			}
			St.close();
			connection.close();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
}
  public void Persentage() {
	   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			 String query = "INSERT INTO Persentage values (?,?,?,?,?,?,?,?)";
			 PreparedStatement PS=connection.prepareStatement(query) ;
			 String Sub=comboBoxS_P_S.getSelectedItem().toString();
			 PS.setString(1, Sub);
			 PS.setString(2, textS_Name.getText());
			 if (rdbtnNewRadioButtonP.isSelected()) 
				 	PS.setString(3, rdbtnNewRadioButtonP.getText());
			 else 
				 	PS.setString(3, rdbtnNewRadioButtonA.getText());
			 PS.setString(4, textT_M_C.getText());
			 PS.setString(5, textT_M_P_S.getText());
			 PS.setString(6, btnNewButtonP_S.getText());
			 PS.setString(7, text_I_C_S.getText());
			 if (rdbtnyes.isSelected()) 
				 	PS.setString(8, rdbtnyes.getText());
			 else 
				 	PS.setString(8, rdbtnNo.getText());
		
			 int i=PS.executeUpdate();
			 JOptionPane.showMessageDialog(null, "Attendence Information Uplode");
			 PS.close();
			 connection.close();
			 
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
			/*if (rdbtnNewRadioButtonMale.isSelected()) 
				 	PS.setString(3, rdbtnNewRadioButtonMale.getText());
			 else 
				 	PS.setString(3, rdbtnFemale.getText());*/
		}
	   
}
  public void Pessentage() {
	  try {
		   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			Statement St=connection.createStatement();
			String qString="select Subject, StudentName, Studentactiv, Total_M_C, P_std, Std_P from Persentage";
			ResultSet rs=St.executeQuery(qString);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel tbl=(DefaultTableModel)table_1.getModel(); 
			int cols=rsmd.getColumnCount();
			String[] coolName=new String[cols];
			for(int i=0;i<cols;i++)
			coolName[i]=rsmd.getColumnName(i+1);
			tbl.setColumnIdentifiers(coolName);
			String FID,DPN,FN,FDOB,FW,FG;
			while(rs.next()) {
				
				FID=rs.getString(1);
				DPN=rs.getString(2);
				FN=rs.getString(3);
				FDOB=rs.getString(4);
				FW=rs.getString(5);
				FG=rs.getString(6);
				String[]rowStrings= { FID,DPN,FN,FDOB,FW,FG };
				tbl.addRow(rowStrings);
			}
			St.close();
			connection.close();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
}
  public void showICardTable() {
	   try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
			Statement St=connection.createStatement();
			String qString="select Student_ICard_Name, ICard_Avalible from Persentage";
			ResultSet rs=St.executeQuery(qString);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel tbl=(DefaultTableModel)table_1.getModel(); 
			int cols=rsmd.getColumnCount();
			String[] coolName=new String[cols];
			for(int i=0;i<cols;i++)
			coolName[i]=rsmd.getColumnName(i+1);
			tbl.setColumnIdentifiers(coolName); 
			String FID,DPN,FN,FDOB,FW,FG,FM,FE;
			while(rs.next()) {
				
				FID=rs.getString(1);
				DPN=rs.getString(2);
				String[]rowStrings= {FID,DPN};
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
        new stdATENDENS();
    }
   }
