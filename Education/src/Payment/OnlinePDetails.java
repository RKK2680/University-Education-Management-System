package Payment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class OnlinePDetails extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textSroll;
	private String path;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlinePDetails frame = new OnlinePDetails();
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
	public OnlinePDetails() {
		setTitle("View Student");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1318, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 153));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 204), 3));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 159, 1284, 529);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Roll Number");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(29, 122, 107, 26);
		contentPane.add(lblNewLabel);
		
		textSroll = new JTextField();
		textSroll.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String s=textSroll.getText();
				Serch(s);
			}
		});
		textSroll.setForeground(new Color(255, 0, 51));
		textSroll.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textSroll.setBounds(125, 125, 157, 24);
		contentPane.add(textSroll);
		textSroll.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(0, -3, 1304, 109);
		contentPane.add(panel_3);
		
		JLabel EraLogo = new JLabel();
		 path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
		    EraLogo.setBounds(50, 10, 152, 89);
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
		lblNewLabel_2.setBounds(259, 0, 782, 62);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblSarfarazhanjHardoiRoad = new JLabel("Sarfarazhanj, Hardoi Road, Lucknow-226003 (UP) India");
		lblSarfarazhanjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazhanjHardoiRoad.setForeground(Color.BLUE);
		lblSarfarazhanjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSarfarazhanjHardoiRoad.setBounds(202, 53, 883, 29);
		panel_3.add(lblSarfarazhanjHardoiRoad);
		
		JLabel lblPhoneFax = new JLabel("Phone: 0522-6600777, Fax: 0522-2407824");
		lblPhoneFax.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneFax.setForeground(Color.BLUE);
		lblPhoneFax.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPhoneFax.setBounds(146, 80, 1006, 29);
		panel_3.add(lblPhoneFax);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AccountantSection.main(null);
				dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnBack.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 255), new Color(255, 153, 0), new Color(153, 102, 102), new Color(0, 0, 51)));
		btnBack.setBackground(new Color(255, 0, 0));
		btnBack.setBounds(1212, 10, 82, 36);
		panel_3.add(btnBack);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Student();
			}
		});
		btnView.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnView.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 255), new Color(255, 153, 0), new Color(153, 102, 102), new Color(0, 0, 51)));
		btnView.setBackground(new Color(0, 206, 209));
		btnView.setBounds(1062, 113, 170, 36);
		contentPane.add(btnView);
		
		JLabel lblOfflinePaymentDetails = new JLabel("Online Payment Details");
		lblOfflinePaymentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfflinePaymentDetails.setForeground(new Color(255, 255, 255));
		lblOfflinePaymentDetails.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblOfflinePaymentDetails.setBounds(292, 118, 678, 29);
		contentPane.add(lblOfflinePaymentDetails);
	}
	public void View_Student() {
	 	   try {
	 			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payment","root","ramkumar");
	 			Statement St=connection.createStatement();
	 			String qString="select Roll_No, Name,DO_SO,DOB,Course,Payment_Date,PaymentID,Payment_Mode,Payment_Amount from FeeRecipt";
	 			ResultSet rs=St.executeQuery(qString);
	 			ResultSetMetaData rsmd=rs.getMetaData();
	 			DefaultTableModel tbl=(DefaultTableModel)table.getModel(); 
	 			int cols=rsmd.getColumnCount();
	 			String[] coolName=new String[cols]; 
	 			for(int i=0;i<cols;i++)
	 			coolName[i]=rsmd.getColumnName(i+1);
	 			tbl.setColumnIdentifiers(coolName);//Name, DOB, DO_SO, Course, Batch, Date, PaymentID, 
	 												//Payment_Mode, Payment_Date, Upload_Recipt, Authorety_Sing_Name
	 			String FID,DPN,FN,FDOB,FW,FG,FM,FI,DP;
	 			while(rs.next()) {
	 				
	 				FID=rs.getString(1);
	 				DPN=rs.getString(2);
	 				FN=rs.getString(3);
	 				FDOB=rs.getString(4);
	 				FW=rs.getString(5);
	 				FG=rs.getString(6);
	 				FM=rs.getString(7);
	 				FI=rs.getString(8);
	 				DP=rs.getString(9);
	 				
	 				String[]rowStrings= {FID,DPN,FN,FDOB,FW,FG,FM,FI,DP,};
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
}
