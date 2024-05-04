package Image;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Img extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTable tableEmp;
	private File file;
	private JLabel Lablep;
	private JTextField textDOC;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Img frame = new Img();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Img() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Information ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 46, 649, 247);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Name = new JLabel("    Name");
		Name.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Name.setBounds(43, 53, 90, 23);
		panel.add(Name);
		
		JLabel lblPhoto = new JLabel("Select Photo");
		lblPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoto.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPhoto.setBounds(43, 140, 90, 23);
		panel.add(lblPhoto);
		
		txtname = new JTextField();
		txtname.setText("Enter your Name");
		txtname.setForeground(SystemColor.textHighlight);
		txtname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtname.setBounds(182, 52, 249, 23);
		panel.add(txtname);
		txtname.setColumns(10);
		
		JButton btnbrowser = new JButton("Browser");
		btnbrowser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnbrowser_actionPerformed( e);
				
				
			}
		});
		btnbrowser.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnbrowser.setBounds(182, 140, 314, 21);
		panel.add(btnbrowser);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSave_actionPerformed( e);
				
			}
		});
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSave.setBounds(243, 173, 314, 21);
		panel.add(btnSave);
		
		JLabel lblDocumentName = new JLabel("Document Name");
		lblDocumentName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDocumentName.setBounds(27, 86, 150, 23);
		panel.add(lblDocumentName);
		
		textDOC = new JTextField();
		textDOC.setText("Enter your Name");
		textDOC.setForeground(SystemColor.textHighlight);
		textDOC.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textDOC.setColumns(10);
		textDOC.setBounds(182, 85, 249, 23);
		panel.add(textDOC);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 306, 639, 216);
		contentPane.add(scrollPane);
		
		tableEmp = new JTable();
		scrollPane.setViewportView(tableEmp);
		loadData();
	}
	private void loadData() {
		emp1 e1=new emp1();
		DefaultTableModel dtm1=new DefaultTableModel();
		dtm1.addColumn("Name");
		dtm1.addColumn("Photo");
		for(emp e :emp1.findAll() ) {
			dtm1.addRow(new Object[] {
					e.getName(),
					e.getPhoto()
			});
		}
		tableEmp.setModel(dtm1);
		tableEmp.getTableHeader().setReorderingAllowed(false);
		tableEmp.getColumnModel().getColumn(1).setCellRenderer(new ImageRender());
		tableEmp.setRowHeight(100);
		//tableEmp.setRowHeight();
	}
	private class ImageRender extends DefaultTableCellRenderer {
		public Component getTableCellRendererComponent(JTable table,Object value,
				boolean isSelected,boolean hasfocus,int row,int column) {
			
			byte[] by=(byte[]) value;
			ImageIcon mi=new ImageIcon(by);
			setIcon(mi);
			
			return this;
		}
	}
	
	public void btnSave_actionPerformed(ActionEvent e) {
		try {
		emp1 e1=new emp1();
		emp e2=new emp();
		e2.setName(txtname.getText().trim());
		e2.setPhoto(Files.readAllBytes(this.file.toPath()));
		if(e1.create(e2)) {
			JOptionPane.showMessageDialog(null, "succsesfull");
			loadData();
		}
		else {
			JOptionPane.showMessageDialog(null, "Failed");
		}
		} catch (IOException e3) {
			JOptionPane.showMessageDialog(null, e3.getMessage());
			//e3.printStackTrace();
		}
		
		
	}
   public void btnbrowser_actionPerformed(ActionEvent e) {
		JFileChooser FC=new JFileChooser();
		FC.setMultiSelectionEnabled(false);
		if(FC.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
			this.file=FC.getSelectedFile();
			
		}
	}
   
   public ImageIcon ResizeImage(String ImagePath)
   {
       ImageIcon MyImage = new ImageIcon(ImagePath);
       Image img = MyImage.getImage();
       Image newImg = img.getScaledInstance(Lablep.getWidth(), Lablep.getHeight(), Image.SCALE_SMOOTH);
       ImageIcon image = new ImageIcon(newImg);
       return image;
   }
}



/*

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.awt.event.ActionEvent;

public class Img extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTable tableEmp;
	private File file;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Img frame = new Img();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Img() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Information ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 46, 649, 159);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Name = new JLabel("    Name");
		Name.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Name.setBounds(27, 25, 90, 23);
		panel.add(Name);
		
		JLabel lblPhoto = new JLabel("Photo");
		lblPhoto.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPhoto.setBounds(40, 87, 90, 23);
		panel.add(lblPhoto);
		
		txtname = new JTextField();
		txtname.setText("Enter your Name");
		txtname.setForeground(SystemColor.textHighlight);
		txtname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtname.setBounds(133, 28, 249, 32);
		panel.add(txtname);
		txtname.setColumns(10);
		
		JButton btnbrowser = new JButton("Browser");
		btnbrowser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnbrowser_actionPerformed( e);
				
				
			}
		});
		btnbrowser.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnbrowser.setBounds(133, 89, 314, 21);
		panel.add(btnbrowser);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSave_actionPerformed( e);
				
			}
		});
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSave.setBounds(226, 120, 314, 21);
		panel.add(btnSave);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 215, 605, 224);
		contentPane.add(scrollPane);
		
		tableEmp = new JTable();
		scrollPane.setViewportView(tableEmp);
	}
	public void btnSave_actionPerformed(ActionEvent e) {
		try {
		emp1 e1=new emp1();
		emp e2=new emp();
		e2.setName(txtname.getText().trim());
		e2.setPhoto(Files.readAllBytes(this.file.toPath()));
		if(e1.create(e2)) {
			JOptionPane.showMessageDialog(null, "succsesfull");
		}
		else {
			JOptionPane.showMessageDialog(null, "Failed");
		}
		} catch (IOException e3) {
			JOptionPane.showMessageDialog(null, e3.getMessage());
			//e3.printStackTrace();
		}
		
		
	}
   public void btnbrowser_actionPerformed(ActionEvent e) {
		JFileChooser FC=new JFileChooser();
		FC.setMultiSelectionEnabled(false);
		if(FC.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
			this.file=FC.getSelectedFile();
		}
	}
}
*/