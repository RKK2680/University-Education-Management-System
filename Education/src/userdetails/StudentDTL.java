package userdetails;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class StudentDTL extends JFrame {

	private JPanel contentPane;
	private JTable table2;
	private JTable table3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDTL frame = new StudentDTL();
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
	public StudentDTL() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\home-icon.png"));
		setTitle("Attendence Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1554, 961);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(51, 255, 204));
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		scrollPane.setBounds(10, 70, 1520, 318);
		contentPane.add(scrollPane);
		
		table2 = new JTable();
		scrollPane.setViewportView(table2);
		
		JLabel lblSecaondSemesterAtendence = new JLabel("Secaond Semester Atendence Deails");
		lblSecaondSemesterAtendence.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecaondSemesterAtendence.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblSecaondSemesterAtendence.setBounds(0, 25, 499, 35);
		contentPane.add(lblSecaondSemesterAtendence);
		
		JLabel lblTheardsemesterAtendenceDeails = new JLabel("TheardSemester Atendence Deails");
		lblTheardsemesterAtendenceDeails.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheardsemesterAtendenceDeails.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTheardsemesterAtendenceDeails.setBounds(0, 408, 499, 35);
		contentPane.add(lblTheardsemesterAtendenceDeails);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(new Color(0, 255, 204));
		scrollPane_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane_1.setBounds(10, 451, 1520, 360);
		contentPane.add(scrollPane_1);
		
		table3 = new JTable();
		scrollPane_1.setViewportView(table3);
		
		JButton btnView_1 = new JButton("View");
		btnView_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 153), new Color(255, 0, 0), new Color(255, 204, 0), new Color(102, 0, 0)));
		btnView_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
	    			Statement St=connection.createStatement() ;
	    			String qString="select * from secondsem";
	    			ResultSet rs=St.executeQuery(qString);
	    			ResultSetMetaData rsmd=rs.getMetaData();
	    			DefaultTableModel tbl=(DefaultTableModel)table2.getModel(); 
	    			int cols=rsmd.getColumnCount();
	    			String[] coolName=new String[cols];
	    			for(int i=0;i<cols;i++)
	    			coolName[i]=rsmd.getColumnName(i+1);
	    			tbl.setColumnIdentifiers(coolName);
	    			String Date, Subject_Name, Subject_Techars_Name, Class_Time_In, Class_Time_Out, Total_month_Class, Total_Prsent_Student, Persentage;
        			while(rs.next()) {
        				
        				Date=rs.getString(1);
        				Subject_Name=rs.getString(2);
        				Subject_Techars_Name=rs.getString(3);
        				Class_Time_In=rs.getString(4);
        				Class_Time_Out=rs.getString(5);
        				Total_month_Class=rs.getString(6);
        				Total_Prsent_Student=rs.getString(7);
        				Persentage=rs.getString(8);
        				
        				String[]rowStrings= {Date, Subject_Name, Subject_Techars_Name, Class_Time_In, Class_Time_Out, Total_month_Class, Total_Prsent_Student, Persentage};
        				tbl.addRow(rowStrings);
	    			}
	    			St.close();
	    			connection.close();
	    		} catch (Exception e1) {
	    			// TODO: handle exception
	    			e1.printStackTrace();
	    		}
			}
		});
		btnView_1.setBackground(new Color(51, 204, 255));
		btnView_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1.setBounds(591, 20, 100, 40);
		contentPane.add(btnView_1);
		
		JButton btnView_1_1 = new JButton("View");
		btnView_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 153), new Color(255, 0, 0), new Color(255, 204, 0), new Color(102, 0, 0)));
		btnView_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence","root","ramkumar");
	    			Statement St=connection.createStatement() ;
	    			String qString="select * from Theardsem";
	    			ResultSet rs=St.executeQuery(qString);
	    			ResultSetMetaData rsmd=rs.getMetaData();
	    			DefaultTableModel tbl=(DefaultTableModel)table3.getModel(); 
	    			int cols=rsmd.getColumnCount();
	    			String[] coolName=new String[cols];
	    			for(int i=0;i<cols;i++)
	    			coolName[i]=rsmd.getColumnName(i+1);
	    			tbl.setColumnIdentifiers(coolName);
	    			String Date, Subject_Name, Subject_Techars_Name, Class_Time_In, Class_Time_Out, Total_month_Class, Total_Prsent_Student, Persentage;
        			while(rs.next()) {
        				
        				Date=rs.getString(1);
        				Subject_Name=rs.getString(2);
        				Subject_Techars_Name=rs.getString(3);
        				Class_Time_In=rs.getString(4);
        				Class_Time_Out=rs.getString(5);
        				Total_month_Class=rs.getString(6);
        				Total_Prsent_Student=rs.getString(7);
        				Persentage=rs.getString(8);
        				
        				String[]rowStrings= {Date, Subject_Name, Subject_Techars_Name, Class_Time_In, Class_Time_Out, Total_month_Class, Total_Prsent_Student, Persentage};
        				tbl.addRow(rowStrings);
	    			}
	    			St.close();
	    			connection.close();
	    		} catch (Exception e1) {
	    			// TODO: handle exception
	    			e1.printStackTrace();
	    		}
			}
		});
		btnView_1_1.setBackground(new Color(0, 204, 255));
		btnView_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_1.setBounds(591, 403, 100, 40);
		contentPane.add(btnView_1_1);
		
		JButton btnView_1_2 = new JButton("Back");
		btnView_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentsAttendence.main(null);
				dispose();
			}
		});
		btnView_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_2.setBackground(new Color(255, 99, 71));
		btnView_1_2.setBounds(1430, 10, 100, 40);
		contentPane.add(btnView_1_2);
	}

}
