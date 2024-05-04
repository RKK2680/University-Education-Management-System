package pdf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import datechooser.demo.Demo;
import datechooser.demo.steps.ShowExit;
import userdetails.project;

import com.jgoodies.looks.common.ComboBoxEditorTextField;
import com.toedter.calendar.JDateChooser;

import Model.StuAttendence;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ComLabInofo extends JFrame {

	private JPanel contentPane;
	private JTextField textPrsentSTU;
	private JTable table;
	private JDateChooser dateChooserDate;
	private JComboBox comboBoxLabTIMEout;
	private JComboBox comboBoxLabTIME;
	private JComboBox comboBoxSYSTEMNO;
	private JComboBox comboBoxLabSub;
	private JComboBox comboBoxLTechar;
	private JComboBox comboBoxDEp;
	private String path;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComLabInofo frame = new ComLabInofo();
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
	public ComLabInofo() {
		setResizable(false);
		setTitle("Computer Lab Information");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1323, 743);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 4));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(205, 133, 63));
		panel.setBounds(10, 162, 1289, 260);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Lab Department");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(96, 23, 144, 28);
		panel.add(lblNewLabel_1);
		
		 comboBoxDEp = new JComboBox();
		 comboBoxDEp.setBackground(new Color(255, 182, 193));
		comboBoxDEp.setModel(new DefaultComboBoxModel(new String[] {"Computer Scinence Department", "Biotech Department", "Food & Nutrition", "Libral & Art", "Pharmecy", "Nursing"}));
		comboBoxDEp.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxDEp.setBounds(222, 28, 198, 23);
		panel.add(comboBoxDEp);
		
		 comboBoxLTechar = new JComboBox();
		 comboBoxLTechar.setBackground(new Color(255, 182, 193));
		comboBoxLTechar.setModel(new DefaultComboBoxModel(new String[] {"Mr.Abhisek", "Dr.Moh.Islam", "Dr.S.A.A Rizvi", "Dr.Shaweta Vikram", "Mr.Moh.Arif", "Mr.Saqaib Ali", "Mr.Nafees Faruki", "mis. Hrshika Madam", "Mis.Simran Raza"}));
		comboBoxLTechar.setMaximumRowCount(15);
		comboBoxLTechar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxLTechar.setBounds(556, 28, 198, 23);
		panel.add(comboBoxLTechar);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lab Techars");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(430, 23, 144, 28);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Student Name");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(800, 23, 144, 28);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Lab Subject");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(456, 82, 144, 28);
		panel.add(lblNewLabel_1_3);
		
		 comboBoxLabSub = new JComboBox();
		 comboBoxLabSub.setBackground(new Color(255, 182, 193));
		comboBoxLabSub.setModel(new DefaultComboBoxModel(new String[] {"C Programming", "C ++", "java", "Data structure", "DBMS", "Python", "Wed Tech", "HTML CSS JAVASCRIPT", "Computer Fundamental", "Graphics Desing", "Photoshop", "Mini Project", "Major Project"}));
		comboBoxLabSub.setMaximumRowCount(15);
		comboBoxLabSub.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxLabSub.setBounds(567, 85, 198, 23);
		panel.add(comboBoxLabSub);
		
		JLabel lblNewLabel_1_4 = new JLabel("Prsent Student");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(96, 82, 144, 28);
		panel.add(lblNewLabel_1_4);
		
		comboBoxSYSTEMNO = new JComboBox();
		comboBoxSYSTEMNO.setBackground(new Color(255, 182, 193));
		comboBoxSYSTEMNO.setModel(new DefaultComboBoxModel(new String[] {"CS-01", "CS-02", "CS-03", "CS-04", "CS-05", "CS-06", "CS-07", "CS-08", "CS-09", "CS-10", "CS-11", "CS-12", "CS-13", "CS-14", "CS-15", "CS-16", "CS-17", "CS-18", "CS-19", "CS-20", "CS-21", "CS-22", "CS-23", "CS-24", "CS-25", "CS-26", "CS-27", "CS-28", "CS-29", "CS-30", "CS-31", "CS-32", "CS-33", "CS-34", "CS-35", "CS-36", "CS-37", "CS-38", "CS-39", "CS-40", "CS-41", "CS-42", "CS-43", "CS-44", "CS-45", "CS-46", "CS-47", "CS-48", "CS-49", "CS-50"}));
		comboBoxSYSTEMNO.setMaximumRowCount(50);
		comboBoxSYSTEMNO.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxSYSTEMNO.setBounds(926, 90, 198, 23);
		panel.add(comboBoxSYSTEMNO);
		
		JLabel lblNewLabel_1_5 = new JLabel("System No");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(800, 85, 144, 28);
		panel.add(lblNewLabel_1_5);
		
		 comboBoxLabTIME = new JComboBox();
		 comboBoxLabTIME.setBackground(new Color(255, 182, 193));
		comboBoxLabTIME.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00", "03:00", "04:00"}));
		comboBoxLabTIME.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxLabTIME.setBounds(200, 150, 174, 23);
		panel.add(comboBoxLabTIME);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Lab In Timing ");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(74, 145, 144, 28);
		panel.add(lblNewLabel_1_3_1);
		
		 comboBoxLabTIMEout = new JComboBox();
		 comboBoxLabTIMEout.setBackground(new Color(255, 182, 193));
		comboBoxLabTIMEout.setModel(new DefaultComboBoxModel(new String[] {"10:00", "11:00", "12:00", "01:00(Lunch Start)", "02:00(Lunch Over)", "03:00", "04:00", "05:00"}));
		comboBoxLabTIMEout.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxLabTIMEout.setBounds(588, 150, 198, 23);
		panel.add(comboBoxLabTIMEout);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Lab In Timing ");
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3_2.setBounds(462, 145, 144, 28);
		panel.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Date");
		lblNewLabel_1_5_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_5_1.setBounds(836, 147, 80, 28);
		panel.add(lblNewLabel_1_5_1);
		
		dateChooserDate = new JDateChooser();
		dateChooserDate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		dateChooserDate.setForeground(new Color(0, 0, 205));
		dateChooserDate.setBackground(new Color(152, 251, 152));
		dateChooserDate.setBounds(926, 150, 198, 23);
		panel.add(dateChooserDate);
		
		textPrsentSTU = new JTextField();
		textPrsentSTU.setForeground(new Color(0, 0, 205));
		textPrsentSTU.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textPrsentSTU.setColumns(10);
		textPrsentSTU.setBounds(224, 88, 174, 22);
		panel.add(textPrsentSTU);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Labshowteble();
			}
		});
		btnNewButton.setBackground(new Color(144, 238, 144));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(926, 210, 110, 28);
		panel.add(btnNewButton);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Labinfo();
			}
		});
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSave.setBackground(new Color(144, 238, 144));
		btnSave.setBounds(1074, 210, 110, 28);
		panel.add(btnSave);
		
		JButton btnNewButton_1 = new JButton("Attendence");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuAttendence.main(null);
				
			}
		});
		btnNewButton_1.setBackground(new Color(204, 255, 153));
		btnNewButton_1.setForeground(new Color(255, 51, 51));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(926, 24, 170, 23);
		panel.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 153, 102));
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		scrollPane.setBounds(10, 432, 1289, 264);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(10, 10, 1289, 143);
		contentPane.add(panel_3);
		
		JLabel EraLogo = new JLabel();
		path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
	    EraLogo.setBounds(23, 10, 177, 115);
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
		lblNewLabel_2.setBounds(264, 10, 782, 62);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
		lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
		lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSarfarazganjHardoiRoad.setBounds(250, 64, 783, 35);
		panel_3.add(lblSarfarazganjHardoiRoad);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(1207, 10, 72, 28);
		panel_3.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				project.main(null);
				dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnExit.setBackground(new Color(255, 99, 71));
		
		JLabel lblNewLabel = new JLabel("Computer Lab Information");
		lblNewLabel.setBounds(449, 92, 337, 41);
		panel_3.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
	}
	   public void Labinfo() {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
				 String query = "INSERT INTO Labinfo values (?,?,?,?,?,?,?,?)";
				 PreparedStatement PS=connection.prepareStatement(query) ;
				 String month=comboBoxDEp.getSelectedItem().toString();
				 PS.setString(1, month);
				 String Day=comboBoxLTechar.getSelectedItem().toString();
				 PS.setString(2,Day);
				 PS.setString(3, textPrsentSTU.getText());
				 String Fname=comboBoxLabSub.getSelectedItem().toString();
				 PS.setString(4, Fname);
				 String FP=comboBoxSYSTEMNO.getSelectedItem().toString();
				 PS.setString(5, FP);
				 String Assing=comboBoxLabTIME.getSelectedItem().toString();
				 PS.setString(6,Assing);
				 String Classtime=comboBoxLabTIMEout.getSelectedItem().toString();
				 PS.setString(7, Classtime);
				 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-y");
				 String Date=sdf.format(dateChooserDate.getDate());
				 PS.setString(8, Date);
			
				 int i=PS.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Lab Information Updated");
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
	   
	   public void Labshowteble() {
			  try {
				   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
					Statement St=connection.createStatement();
					String qString="select * from Labinfo";
					ResultSet rs=St.executeQuery(qString);
					ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
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
						String[]rowStrings= {FID,DPN,FN,FDOB,FW,FG,FM,FE,};
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
