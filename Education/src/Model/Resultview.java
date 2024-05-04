package Model;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Resultview extends JFrame {

	private JPanel contentPane;
	private JTable table4;
	private JTable table5;
	private JTable table6;
	private JTable table;
	private JTable table01;
	private JTable table1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultview frame = new Resultview();
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
	public Resultview() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\home-icon.png"));
		setTitle("Attendence Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 1554, 961);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		scrollPane.setBounds(10, 70, 745, 217);
		contentPane.add(scrollPane);
		
		table4 = new JTable();
		scrollPane.setViewportView(table4);
		
		JLabel lblSecaondSemesterAtendence = new JLabel("Fist Smester Result");
		lblSecaondSemesterAtendence.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecaondSemesterAtendence.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblSecaondSemesterAtendence.setBounds(20, 25, 271, 35);
		contentPane.add(lblSecaondSemesterAtendence);
		
		JLabel lblTheardsemesterAtendenceDeails = new JLabel("Second Semester Result");
		lblTheardsemesterAtendenceDeails.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheardsemesterAtendenceDeails.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTheardsemesterAtendenceDeails.setBounds(994, 27, 310, 35);
		contentPane.add(lblTheardsemesterAtendenceDeails);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane_1.setBounds(10, 332, 745, 230);
		contentPane.add(scrollPane_1);
		
		table5 = new JTable();
		scrollPane_1.setViewportView(table5);
		
		JButton btnView_1 = new JButton("View");
		btnView_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 0, 0), new Color(255, 51, 204), new Color(51, 255, 51)));
		btnView_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
    			Statement St=connection.createStatement() ;
    			String qString="select Roll, Name, Enrollmentno, Fathername,FistSemesterMaks, FistSemesterResult, FinalResult from FistyearResult ";
        			ResultSet rs=St.executeQuery(qString);
        			ResultSetMetaData rsmd=rs.getMetaData();
        			DefaultTableModel tbl=(DefaultTableModel)table4.getModel(); 
        			int cols=rsmd.getColumnCount();
        			String[] coolName=new String[cols];
        			for(int i=0;i<cols;i++)
        			coolName[i]=rsmd.getColumnName(i+1);
        			tbl.setColumnIdentifiers(coolName);
        			String Roll, Name, Enrollmentno, Fathername, FistSemesterMaks, FistSemesterResult, FinalResult;
        			while(rs.next()) {
        				
        				Roll=rs.getString(1);
        				Name=rs.getString(2);
        				Enrollmentno=rs.getString(3);
        				Fathername=rs.getString(4);
        				FistSemesterMaks=rs.getString(5);
        				FistSemesterResult=rs.getString(6);
        				FinalResult=rs.getString(7);
        				String[]rowStrings= {Roll, Name, Enrollmentno, Fathername, FistSemesterMaks, FistSemesterResult,FinalResult};
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
		btnView_1.setBackground(new Color(0, 204, 204));
		btnView_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1.setBounds(289, 20, 100, 40);
		contentPane.add(btnView_1);
		
		JButton btnView_1_1 = new JButton("View");
		btnView_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 0, 0), new Color(255, 51, 204), new Color(51, 255, 51)));
		btnView_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
		    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
		    			Statement St=connection.createStatement() ;
		    			String qString="select Roll, Name, Enrollmentno, Fathername,SecondSemesterMaks, SecondSemesterResult,FinalResult from FistyearResult";
		        			ResultSet rs=St.executeQuery(qString);
		        			ResultSetMetaData rsmd=rs.getMetaData();
		        			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
		        			int cols=rsmd.getColumnCount();
		        			String[] coolName=new String[cols];
		        			for(int i=0;i<cols;i++)
		        			coolName[i]=rsmd.getColumnName(i+1);
		        			tbl.setColumnIdentifiers(coolName);
		        			String Roll, Name, Enrollmentno, Fathername, SecondSemesterMaks, SecondSemesterResult, FinalResult;
		        			while(rs.next()) {
		        				   
		        				Roll=rs.getString(1);
		        				Name=rs.getString(2);
		        				Enrollmentno=rs.getString(3);
		        				Fathername=rs.getString(4);
		        				SecondSemesterMaks=rs.getString(5);
		        				SecondSemesterResult=rs.getString(6);
		        				FinalResult=rs.getString(7);
		        				String[]rowStrings= {Roll, Name, Enrollmentno, Fathername, SecondSemesterMaks, SecondSemesterMaks,FinalResult};
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
		btnView_1_1.setBackground(new Color(0, 204, 204));
		btnView_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_1.setBounds(855, 30, 100, 35);
		contentPane.add(btnView_1_1);
		
		JLabel lblTheardsemesterAtendenceDeails_1 = new JLabel(" Six Semester Result");
		lblTheardsemesterAtendenceDeails_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheardsemesterAtendenceDeails_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTheardsemesterAtendenceDeails_1.setBounds(994, 563, 339, 35);
		contentPane.add(lblTheardsemesterAtendenceDeails_1);
		
		JButton btnView_1_1_1 = new JButton("View");
		btnView_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 0, 0), new Color(255, 51, 204), new Color(51, 255, 51)));
		btnView_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
	    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
	    			Statement St=connection.createStatement() ;
	    			String qString="select Roll, Name, Enrollmentno, Fathername,SixSemesterMaks, FfithSemesterMaks,FinalResult from TheardyearResult";
	        			ResultSet rs=St.executeQuery(qString);
	        			ResultSetMetaData rsmd=rs.getMetaData();
	        			DefaultTableModel tbl=(DefaultTableModel)table1.getModel(); 
	        			int cols=rsmd.getColumnCount();
	        			String[] coolName=new String[cols];
	        			for(int i=0;i<cols;i++)
	        			coolName[i]=rsmd.getColumnName(i+1);
	        			tbl.setColumnIdentifiers(coolName);
	        			String Roll, Name, Enrollmentno, Fathername, SixSemesterMaks, SixSemesterResult, FinalResult;
	        			while(rs.next()) {
	        				  
	        				Roll=rs.getString(1);
	        				Name=rs.getString(2);
	        				Enrollmentno=rs.getString(3);
	        				Fathername=rs.getString(4);
	        				SixSemesterMaks=rs.getString(5);
	        				SixSemesterResult=rs.getString(6);
	        				FinalResult=rs.getString(7);
	        				String[]rowStrings= {Roll, Name, Enrollmentno, Fathername, SixSemesterMaks, SixSemesterResult,FinalResult};
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
		btnView_1_1_1.setBackground(new Color(0, 204, 204));
		btnView_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_1_1.setBounds(855, 565, 100, 40);
		contentPane.add(btnView_1_1_1);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane_1_1.setBounds(10, 615, 745, 220);
		contentPane.add(scrollPane_1_1);
		
		table6 = new JTable();
		scrollPane_1_1.setViewportView(table6);
		
		JButton btnView_1_2 = new JButton("Back");
		btnView_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 0, 0), new Color(255, 51, 204), new Color(51, 255, 51)));
		btnView_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FistyearResult.main(null);
				dispose();
			}
		});
		btnView_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_2.setBackground(new Color(0, 204, 204));
		btnView_1_2.setBounds(1430, 10, 100, 40);
		contentPane.add(btnView_1_2);
		
		JLabel lblTherdSemesterResult = new JLabel("Therd Semester Result");
		lblTherdSemesterResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblTherdSemesterResult.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTherdSemesterResult.setBounds(20, 291, 401, 35);
		contentPane.add(lblTherdSemesterResult);
		
		JButton btnView_1_3 = new JButton("View");
		btnView_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
	    			Statement St=connection.createStatement() ;
	    			String qString="select Roll, Name, Enrollmentno, Fathername,ThardSemesterMaks, ThardSemesterResult,FinalResult from SecondyearResult";
	        			ResultSet rs=St.executeQuery(qString);
	        			ResultSetMetaData rsmd=rs.getMetaData();
	        			DefaultTableModel tbl=(DefaultTableModel)table5.getModel(); 
	        			int cols=rsmd.getColumnCount();
	        			String[] coolName=new String[cols];
	        			for(int i=0;i<cols;i++)
	        			coolName[i]=rsmd.getColumnName(i+1);
	        			tbl.setColumnIdentifiers(coolName);
	        			String Roll, Name, Enrollmentno, Fathername, ThardSemesterMaks, ThardSemesterResult, FinalResult;
	        			while(rs.next()) {
	        				
	        				Roll=rs.getString(1);
	        				Name=rs.getString(2);
	        				Enrollmentno=rs.getString(3);
	        				Fathername=rs.getString(4);
	        				ThardSemesterMaks=rs.getString(5);
	        				ThardSemesterResult=rs.getString(6);
	        				FinalResult=rs.getString(7);
	        				String[]rowStrings= {Roll, Name, Enrollmentno, Fathername, ThardSemesterMaks, ThardSemesterResult,FinalResult};
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
		btnView_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 0, 0), new Color(255, 51, 204), new Color(51, 255, 51)));
		btnView_1_3.setBackground(new Color(0, 204, 204));
		btnView_1_3.setBounds(413, 291, 100, 35);
		contentPane.add(btnView_1_3);
		
		JButton btnView_1_1_2 = new JButton("View");
		btnView_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
	    			Statement St=connection.createStatement() ;
	    			String qString="select Roll, Name, Enrollmentno, Fathername,FurthSemesterMaks, FurthSemesterResult,FinalResult from SecondyearResult";
	        			ResultSet rs=St.executeQuery(qString);
	        			ResultSetMetaData rsmd=rs.getMetaData();
	        			DefaultTableModel tbl=(DefaultTableModel)table01.getModel(); 
	        			int cols=rsmd.getColumnCount();
	        			String[] coolName=new String[cols];
	        			for(int i=0;i<cols;i++)
	        			coolName[i]=rsmd.getColumnName(i+1);
	        			tbl.setColumnIdentifiers(coolName);
	        			String Roll, Name, Enrollmentno, Fathername, FurthSemesterMaks, FurthSemesterResult, FinalResult;
	        			while(rs.next()) {
	        				
	        				Roll=rs.getString(1);
	        				Name=rs.getString(2);
	        				Enrollmentno=rs.getString(3);
	        				Fathername=rs.getString(4);
	        				FurthSemesterMaks=rs.getString(5);
	        				FurthSemesterResult=rs.getString(6);
	        				FinalResult=rs.getString(7);
	        				String[]rowStrings= {Roll, Name, Enrollmentno, Fathername, FurthSemesterMaks, FurthSemesterResult,FinalResult};
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
		btnView_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 0, 0), new Color(255, 51, 204), new Color(51, 255, 51)));
		btnView_1_1_2.setBackground(new Color(0, 204, 204));
		btnView_1_1_2.setBounds(855, 288, 100, 40);
		contentPane.add(btnView_1_1_2);
		
		JLabel lblFourthSemesterResult = new JLabel("Fourth Semester Result");
		lblFourthSemesterResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblFourthSemesterResult.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblFourthSemesterResult.setBounds(894, 291, 499, 35);
		contentPane.add(lblFourthSemesterResult);
		
		JLabel lblSecaondSemesterAtendence_1_1 = new JLabel("Fifth Smester Result");
		lblSecaondSemesterAtendence_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecaondSemesterAtendence_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblSecaondSemesterAtendence_1_1.setBounds(20, 572, 401, 35);
		contentPane.add(lblSecaondSemesterAtendence_1_1);
		
		JButton btnView_1_3_1 = new JButton("View");
		btnView_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
	    			Statement St=connection.createStatement() ;
	    			String qString="select Roll, Name, Enrollmentno, Fathername,FfithSemesterMaks, FfithSemesterMaks,FinalResult from TheardyearResult";
	        			ResultSet rs=St.executeQuery(qString);
	        			ResultSetMetaData rsmd=rs.getMetaData();
	        			DefaultTableModel tbl=(DefaultTableModel)table6.getModel(); 
	        			int cols=rsmd.getColumnCount();
	        			String[] coolName=new String[cols];
	        			for(int i=0;i<cols;i++)
	        			coolName[i]=rsmd.getColumnName(i+1);
	        			tbl.setColumnIdentifiers(coolName);
	        			String Roll, Name, Enrollmentno, Fathername, FfithSemesterMaks, FifthSemesterResult, FinalResult;
	        			while(rs.next()) {
	        				
	        				Roll=rs.getString(1);
	        				Name=rs.getString(2);
	        				Enrollmentno=rs.getString(3);
	        				Fathername=rs.getString(4);
	        				FfithSemesterMaks=rs.getString(5);
	        				FifthSemesterResult=rs.getString(6);
	        				FinalResult=rs.getString(7);
	        				String[]rowStrings= {Roll, Name, Enrollmentno, Fathername, FfithSemesterMaks, FifthSemesterResult,FinalResult};
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
		btnView_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 0, 0), new Color(255, 51, 204), new Color(51, 255, 51)));
		btnView_1_3_1.setBackground(new Color(0, 204, 204));
		btnView_1_3_1.setBounds(413, 572, 100, 35);
		contentPane.add(btnView_1_3_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		scrollPane_2.setBounds(760, 70, 770, 217);
		contentPane.add(scrollPane_2);
		
		table = new JTable();
		scrollPane_2.setViewportView(table);
		
		JScrollPane scrollPane_1_2 = new JScrollPane();
		scrollPane_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane_1_2.setBounds(760, 332, 770, 230);
		contentPane.add(scrollPane_1_2);
		
		table01 = new JTable();
		scrollPane_1_2.setViewportView(table01);
		
		JScrollPane scrollPane_1_2_1 = new JScrollPane();
		scrollPane_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane_1_2_1.setBounds(760, 615, 770, 220);
		contentPane.add(scrollPane_1_2_1);
		
		table1 = new JTable();
		scrollPane_1_2_1.setViewportView(table1);
	}
	public void Serch(String str) {
		DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
		TableRowSorter<DefaultTableModel> tableRowSorter=new TableRowSorter<>(tbl);
		table.setRowSorter(tableRowSorter);
		tableRowSorter.setRowFilter(RowFilter.regexFilter(str));
		
	}
	public void Serch2(String str) {
		DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
		TableRowSorter<DefaultTableModel> tableRowSorter=new TableRowSorter<>(tbl);
		table.setRowSorter(tableRowSorter);
		tableRowSorter.setRowFilter(RowFilter.regexFilter(str));
		
	}
}
