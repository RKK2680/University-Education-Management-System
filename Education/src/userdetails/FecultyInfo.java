package userdetails;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.BevelBorder;
import com.toedter.calendar.JDateChooser;

public class FecultyInfo extends JFrame {

	private JPanel contentPane;
	private JTextField texttotalassisment;
	private JTextField textClasses;
	private JTable table;
	private JTextField textSllery;
	private JComboBox comboBoxFeculty;
	private JComboBox comboBoxLectureTime;
	private JComboBox comboBoxHolyday;
	private JComboBox comboBoxDEP;
	private JComboBox comboBoxtimein;
	private JComboBox comboBoxtimeout;
	private JComboBox comboBoxWork;
	private String path;
	private JDateChooser dateChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FecultyInfo frame = new FecultyInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FecultyInfo() {
		setResizable(false);
		setBackground(new Color(148, 0, 211));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
		setTitle("Feculty nfo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1328, 794);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 204));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 4));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Feculty Information");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(24, 147, 323, 46);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(255, 204, 102));
		panel.setBounds(34, 203, 1248, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Feclty*");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(343, 51, 75, 28);
		panel.add(lblNewLabel_1);
		
	    comboBoxFeculty = new JComboBox();
		comboBoxFeculty.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxFeculty.setBackground(new Color(221, 160, 221));
		comboBoxFeculty.setModel(new DefaultComboBoxModel(new String[] {"Dr.Moh.Islam", "Dr.S.A.A Rizvi", "Dr.Shaweta Vikram", "Mr.Moh.Arif", "Mr.Saqaib Ali", "Mr.Nafees Faruki", "Mr.Abhisek", "Mis.Simran Raza", "New Feculty"}));
		comboBoxFeculty.setForeground(new Color(0, 0, 0));
		comboBoxFeculty.setBounds(399, 55, 187, 21);
		panel.add(comboBoxFeculty);
		
		JLabel lblNewLabel_1_1 = new JLabel("Feclty Lucture time*");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(928, 51, 138, 28);
		panel.add(lblNewLabel_1_1);
		
		 comboBoxLectureTime = new JComboBox();
		comboBoxLectureTime.setModel(new DefaultComboBoxModel(new String[] {"30 Minuts", "1 Hour", "2 Hour", "3 Hour"}));
		comboBoxLectureTime.setForeground(new Color(0, 0, 0));
		comboBoxLectureTime.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxLectureTime.setBackground(new Color(221, 160, 221));
		comboBoxLectureTime.setBounds(1066, 55, 158, 21);
		panel.add(comboBoxLectureTime);
		
		JLabel lblNewLabel_1_2 = new JLabel("Feclty Hollyday*");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(13, 143, 123, 28);
		panel.add(lblNewLabel_1_2);
		
		 comboBoxHolyday = new JComboBox();
		comboBoxHolyday.setModel(new DefaultComboBoxModel(new String[] {"No", "Personal Work", "Travling", "Out of State", "Fever", "Others"}));
		comboBoxHolyday.setForeground(new Color(0, 0, 0));
		comboBoxHolyday.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxHolyday.setBackground(new Color(221, 160, 221));
		comboBoxHolyday.setBounds(146, 147, 117, 21);
		panel.add(comboBoxHolyday);
		
		 comboBoxDEP = new JComboBox();
		comboBoxDEP.setModel(new DefaultComboBoxModel(new String[] {"Computer Scinence Department", "Biotech Department", "Food & Nutrition", "Libral & Art", "Pharmecy", "Nursing"}));
		comboBoxDEP.setForeground(new Color(0, 0, 0));
		comboBoxDEP.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxDEP.setBackground(new Color(221, 160, 221));
		comboBoxDEP.setBounds(122, 56, 187, 21);
		panel.add(comboBoxDEP);
		
		JLabel lblNewLabel_1_3 = new JLabel("Department*");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(27, 51, 92, 28);
		panel.add(lblNewLabel_1_3);
		
		 comboBoxtimein = new JComboBox();
		comboBoxtimein.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00", "03:00", "04:00"}));
		comboBoxtimein.setForeground(new Color(0, 0, 0));
		comboBoxtimein.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxtimein.setBackground(new Color(221, 160, 221));
		comboBoxtimein.setBounds(782, 147, 80, 21);
		panel.add(comboBoxtimein);
		
		JLabel lblNewLabel_1_4 = new JLabel("Feclty in Timing*");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(640, 143, 132, 28);
		panel.add(lblNewLabel_1_4);
		
		 comboBoxtimeout = new JComboBox();
		comboBoxtimeout.setModel(new DefaultComboBoxModel(new String[] {"10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00(Lunch Over)", "03:00", "04:00", "05:00"}));
		comboBoxtimeout.setForeground(new Color(0, 0, 0));
		comboBoxtimeout.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxtimeout.setBackground(new Color(221, 160, 221));
		comboBoxtimeout.setBounds(1063, 147, 99, 21);
		panel.add(comboBoxtimeout);
		
		JLabel lblNewLabel_1_7 = new JLabel("Total classes*");
		lblNewLabel_1_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_7.setBounds(545, 219, 132, 28);
		panel.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Feclty Out Timing*");
		lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_4_1.setBounds(909, 143, 132, 28);
		panel.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_7_1 = new JLabel("Total Assisment*");
		lblNewLabel_1_7_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_7_1.setBounds(239, 219, 132, 28);
		panel.add(lblNewLabel_1_7_1);
		
		texttotalassisment = new JTextField();
		texttotalassisment.setForeground(new Color(0, 0, 153));
		texttotalassisment.setFont(new Font("Times New Roman", Font.BOLD, 15));
		texttotalassisment.setBounds(361, 225, 163, 22);
		panel.add(texttotalassisment);
		texttotalassisment.setColumns(10);
		
		textClasses = new JTextField();
		textClasses.setForeground(new Color(0, 0, 153));
		textClasses.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textClasses.setColumns(10);
		textClasses.setBounds(654, 228, 163, 22);
		panel.add(textClasses);
		
		JLabel lblNewLabel_1_7_1_1 = new JLabel("Joining Date*");
		lblNewLabel_1_7_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_7_1_1.setBounds(294, 143, 109, 28);
		panel.add(lblNewLabel_1_7_1_1);
		
		JLabel lblNewLabel_1_7_1_1_1 = new JLabel("Feculty  sallery*");
		lblNewLabel_1_7_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_7_1_1_1.setBounds(13, 219, 132, 28);
		panel.add(lblNewLabel_1_7_1_1_1);
		
		textSllery = new JTextField();
		textSllery.setForeground(new Color(0, 0, 153));
		textSllery.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textSllery.setColumns(10);
		textSllery.setBounds(122, 225, 99, 22);
		panel.add(textSllery);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 204, 0), new Color(102, 255, 102), new Color(0, 0, 102)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fecultyfoshowteble();
			}
		});
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(827, 212, 109, 42);
		panel.add(btnNewButton);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 204, 0), new Color(102, 255, 102), new Color(0, 0, 102)));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fecultyinfo();
			}
		});
		btnSave.setBackground(new Color(152, 251, 152));
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSave.setBounds(946, 212, 99, 42);
		panel.add(btnSave);
		
		JButton btnNewStudent = new JButton("New Students");
		btnNewStudent.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 204, 0), new Color(102, 255, 102), new Color(0, 0, 102)));
		btnNewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewStudent.main(null);
			}
		});
		btnNewStudent.setBackground(new Color(152, 251, 152));
		btnNewStudent.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewStudent.setBounds(1057, 212, 167, 42);
		panel.add(btnNewStudent);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Designation*");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(612, 51, 138, 28);
		panel.add(lblNewLabel_1_1_1);
		
		 comboBoxWork = new JComboBox();
		comboBoxWork.setModel(new DefaultComboBoxModel(new String[] {"Senior Associate Prof.", "Junior Associate Prof.", "Senior Assistaint Prof.", "Junior Assistaint Prof.", "Lecturer", "Lab Assistent", "Office Assistent", "Clark", "Worker"}));
		comboBoxWork.setForeground(new Color(0, 0, 0));
		comboBoxWork.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxWork.setBackground(new Color(221, 160, 221));
		comboBoxWork.setBounds(731, 55, 167, 21);
		panel.add(comboBoxWork);
		
		 dateChooser = new JDateChooser();
		dateChooser.setFont(new Font("Times New Roman", Font.BOLD, 15));
		dateChooser.setForeground(new Color(0, 0, 153));
		dateChooser.setBackground(new Color(255, 153, 204));
		dateChooser.setBounds(399, 149, 158, 19);
		panel.add(dateChooser);
		
		JButton btnViewQuery = new JButton("View Query");
		btnViewQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Query.main(null);
				
			}
		});
		btnViewQuery.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnViewQuery.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 204, 0), new Color(102, 255, 102), new Color(0, 0, 102)));
		btnViewQuery.setBackground(new Color(152, 251, 152));
		btnViewQuery.setBounds(865, 258, 312, 32);
		panel.add(btnViewQuery);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(152, 251, 152));
		scrollPane.setBounds(56, 570, 1248, 167);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		table.setBackground(new Color(238, 130, 238));
		scrollPane.setViewportView(table);
		
		JLabel lblFecultyInformationDetails = new JLabel("Feculty Information Details");
		lblFecultyInformationDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecultyInformationDetails.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblFecultyInformationDetails.setBounds(31, 514, 374, 46);
		contentPane.add(lblFecultyInformationDetails);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 204, 0), new Color(102, 255, 102), new Color(0, 0, 102)));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				project.main(null);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 99, 71));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(1219, 152, 85, 28);
		contentPane.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(10, 10, 1294, 132);
		contentPane.add(panel_3);
		
		JLabel EraLogo = new JLabel();
		path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
	    EraLogo.setBounds(23, 10, 187, 112);
	    ImageIcon imageIcon1=new ImageIcon(path);
		Image imgImage1=imageIcon1.getImage();
		Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image1=new ImageIcon(newiImage1);
		EraLogo.setIcon(image1);
		panel_3.add(EraLogo);
		
		JLabel lblNewLabel_2 = new JLabel("Era University Lucknow");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 153));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 60));
		lblNewLabel_2.setBounds(245, 10, 782, 62);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
		lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
		lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSarfarazganjHardoiRoad.setBounds(220, 69, 783, 35);
		panel_3.add(lblSarfarazganjHardoiRoad);
	}
	
	public void Fecultyinfo() {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
				 String query = "INSERT INTO fecultyinfo values (?,?,?,?,?,?,?,?,?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				 String month=comboBoxDEP.getSelectedItem().toString();
				 PS.setString(1, month);
				 String Day=comboBoxFeculty.getSelectedItem().toString();
				 PS.setString(2,Day);
				 String Fname=comboBoxWork.getSelectedItem().toString();
				 PS.setString(3, Fname);
				 String FP=comboBoxLectureTime.getSelectedItem().toString();
				 PS.setString(4, FP);
				 String Assing=comboBoxHolyday.getSelectedItem().toString();
				 PS.setString(5,Assing);
				 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-y");
				 String Date=sdf.format(dateChooser.getDate());
				 PS.setString(6, Date);
				 String Classtime=comboBoxtimein.getSelectedItem().toString();
				 PS.setString(7, Classtime);
				 String Classtimeout=comboBoxtimeout.getSelectedItem().toString();
				 PS.setString(8, Classtimeout);
				 PS.setString(9, textSllery.getText());
				 PS.setString(10, texttotalassisment.getText());
				 PS.setString(11, textClasses.getText());
			
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Feculty Information Updated");
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
	public void Fecultyfoshowteble() {
		  try {
			   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
				Statement St=connection.createStatement();
				String qString="select * from fecultyinfo";
				ResultSet rs=St.executeQuery(qString);
				ResultSetMetaData rsmd=rs.getMetaData();
				DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
				int cols=rsmd.getColumnCount();
				String[] coolName=new String[cols];
				for(int i=0;i<cols;i++)
				coolName[i]=rsmd.getColumnName(i+1);
				tbl.setColumnIdentifiers(coolName);
				String FID,DPN,FN,FDOB,FW,FG,FM,FE,an,a,b;
				while(rs.next()) {
					
					FID=rs.getString(1);
					DPN=rs.getString(2);
					FN=rs.getString(3);
					FDOB=rs.getString(4);
					FW=rs.getString(5);
					FG=rs.getString(6);
					FM=rs.getString(7);
					FE=rs.getString(8);
					an=rs.getString(9);
					a=rs.getString(10);
					b=rs.getString(11);
					String[]rowStrings= {FID,DPN,FN,FDOB,FW,FG,FM,FE,an,a,b};
					tbl.addRow(rowStrings);
				}
				St.close();
				connection.close();
			} catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
	}
}

