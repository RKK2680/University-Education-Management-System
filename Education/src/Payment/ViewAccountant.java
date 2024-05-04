package Payment;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAccountant extends JFrame {
	static ViewAccountant frame;
	public ViewAccountant() {
		getContentPane().setBackground(new Color(255, 204, 102));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\pyemnt.png"));
		setTitle("Payment");
		//Code to view data in JTable
		List<Accountant> list=AccountantDetails.view();
		int size=list.size();
		
		String data[][]=new String[size][5];
		int row=0;
		for(Accountant a:list){
			data[row][0]=String.valueOf(a.getId());
			data[row][1]=a.getName();
			data[row][2]=a.getPassword();
			data[row][3]=a.getEmail();
			data[row][4]=a.getContactno();
			row++;
		}
		String columnNames[]={"Id","Name","Password","Email","Contact No"};
		getContentPane().setLayout(null);
		
		JTable jt=new JTable(data,columnNames);
		jt.setBackground(new Color(255, 255, 153));
		jt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		JScrollPane sp=new JScrollPane(jt);
		sp.setBorder(new LineBorder(new Color(51, 51, 51), 5));
		sp.setBounds(32, 28, 894, 502);
		getContentPane().add(sp);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection.main(null);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(914, 0, 85, 31);
		getContentPane().add(btnNewButton);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1013, 598);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewAccountant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
