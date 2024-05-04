package userdetails;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;

public class Query extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private String path;
	private JTable table;
	private JTable table_1;
	private JTextField textScroll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Query dialog = new Query();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Query() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education Management System\\img\\dialog-error-icon.png"));
		setBounds(100, 100, 1049, 513);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(152, 251, 152));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(0, 0, 1058, 115);
		contentPanel.add(panel_3);
		
		JLabel EraLogo = new JLabel();
		path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
	    EraLogo.setBounds(42, 10, 158, 95);
	    ImageIcon imageIcon1=new ImageIcon(path);
		Image imgImage1=imageIcon1.getImage();
		Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image1=new ImageIcon(newiImage1);
		EraLogo.setIcon(image1);
		panel_3.add(EraLogo);
		
		JLabel lblNewLabel_2_1 = new JLabel("Era University Lucknow");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(0, 0, 153));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 60));
		lblNewLabel_2_1.setBounds(266, 0, 782, 62);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
		lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
		lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSarfarazganjHardoiRoad.setBounds(252, 54, 783, 35);
		panel_3.add(lblSarfarazganjHardoiRoad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 181, 1035, 101);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 292, 1035, 174);
		contentPanel.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblQuery = new JLabel("Query");
		lblQuery.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuery.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblQuery.setBounds(413, 125, 175, 35);
		contentPanel.add(lblQuery);
		
		JButton btnView_1_3 = new JButton("View");
		btnView_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Query1();
				Query2();
			}
		});
		btnView_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnView_1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 0, 0), new Color(255, 51, 204), new Color(51, 255, 51)));
		btnView_1_3.setBackground(new Color(0, 204, 204));
		btnView_1_3.setBounds(837, 136, 100, 35);
		contentPanel.add(btnView_1_3);
		
		
		textScroll = new JTextField();
		textScroll.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String s=textScroll.getText();
				Serch(s);
				Serch1(s);
			}
		});
		textScroll.setForeground(new Color(255, 0, 51));
		textScroll.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textScroll.setColumns(10);
		textScroll.setBounds(145, 141, 157, 24);
		contentPanel.add(textScroll);
		
		JLabel lblSearch = new JLabel("Name");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSearch.setBounds(10, 141, 139, 24);
		contentPanel.add(lblSearch);
	}
	public void Query1() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
			Statement St=connection.createStatement() ;
			String qString="select  Name, Email, Mobile from Query";
    			ResultSet rs=St.executeQuery(qString);
    			ResultSetMetaData rsmd=rs.getMetaData();
    			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
    			int cols=rsmd.getColumnCount();
    			String[] coolName=new String[cols];
    			for(int i=0;i<cols;i++)
    			coolName[i]=rsmd.getColumnName(i+1); 
    			tbl.setColumnIdentifiers(coolName);
    			String  Name, Email, Mobile, ThardSemesterMaks, ThardSemesterResult, FinalResult;
    			while(rs.next()) {
    				
    				
    				Name=rs.getString(1);
    				Email=rs.getString(2);
    				Mobile=rs.getString(3);
    				
    				String[]rowStrings= { Name, Email, Mobile};
    				tbl.addRow(rowStrings);
    			}
    			St.close();
    			connection.close();
    		} catch (Exception e1) {
    			// TODO: handle exception
    			e1.printStackTrace();
    		}
	}
	public void Query2() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","ramkumar");
			Statement St=connection.createStatement() ;
			String qString="select Queryy from Query";
    			ResultSet rs=St.executeQuery(qString);
    			ResultSetMetaData rsmd=rs.getMetaData();
    			DefaultTableModel tbl=(DefaultTableModel)table_1.getModel(); 
    			int cols=rsmd.getColumnCount();
    			String[] coolName=new String[cols];
    			for(int i=0;i<cols;i++)
    			coolName[i]=rsmd.getColumnName(i+1); 
    			tbl.setColumnIdentifiers(coolName);
    			String  Query;
    			while(rs.next()) {
    				
    				
    				Query=rs.getString(1);
    				
    				
    				String[]rowStrings= { Query};
    				tbl.addRow(rowStrings);
    			}
    			St.close();
    			connection.close();
    		} catch (Exception e1) {
    			// TODO: handle exception
    			e1.printStackTrace();
    		}
	}
		public void Serch(String str) {
			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
			TableRowSorter<DefaultTableModel> tableRowSorter=new TableRowSorter<>(tbl);
			table.setRowSorter(tableRowSorter);
			tableRowSorter.setRowFilter(RowFilter.regexFilter(str));
			
		
	}
		public void Serch1(String str) {
			DefaultTableModel tbl=(DefaultTableModel)table_1.getModel(); 
			TableRowSorter<DefaultTableModel> tableRowSorter=new TableRowSorter<>(tbl);
			table_1.setRowSorter(tableRowSorter);
			tableRowSorter.setRowFilter(RowFilter.regexFilter(str));
			
		
	}
}
