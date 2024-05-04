package userdetails;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Rebuttion extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/*
	 * Launch the application.
	 */
	public static void main(String[] args){
		//UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		try {
			Rebuttion dialog = new Rebuttion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog. 
	 */
	public Rebuttion() {
		setBackground(new Color(0, 206, 209));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\home-icon.png"));
		setTitle("Log in");
		setBounds(600, 150, 379, 310);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 165, 0));
		contentPanel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnNewButton = new JButton("Student Regestretion");
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
			btnNewButton.setBackground(new Color(135, 206, 235));
			btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Registration r=new Registration();
					r.Registration();
					r.setBounds(100, 100, 1300, 840);
					//r.dispose();
					
					JOptionPane.showMessageDialog(null, "Student Regestretion Form is Open");
					//new Registration().setVisible(true);
					//Rebuttion rbu=new Rebuttion();
					//rbu.dispose();
				}
			});
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
			btnNewButton.setBounds(73, 70, 214, 41);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnFecultyRegestretion = new JButton("Feculty Regestretion");
			btnFecultyRegestretion.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\contet.png"));
			btnFecultyRegestretion.setBackground(new Color(255, 222, 173));
			btnFecultyRegestretion.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			btnFecultyRegestretion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FecultyRegister fR=new FecultyRegister();
					fR.main(null);
					JOptionPane.showMessageDialog(null, "Feculty Regestretion Form is Open");
				}
			});
			btnFecultyRegestretion.setFont(new Font("Times New Roman", Font.BOLD, 18));
			btnFecultyRegestretion.setBounds(73, 132, 214, 41);
			contentPanel.add(btnFecultyRegestretion);
		}
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\Knob-Valid-Green-icon.png"));
		btnLogIn.setBackground(new Color(154, 205, 50));
		btnLogIn.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login rI=new Login();
				rI.main(null);	
			}
		});
		btnLogIn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLogIn.setBounds(73, 197, 214, 41);
		contentPanel.add(btnLogIn);
		{
			JButton btnExit = new JButton("");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnExit.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\cancel-icon.png"));
			btnExit.setFont(new Font("Times New Roman", Font.BOLD, 18));
			btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			btnExit.setBackground(new Color(250, 128, 114));
			btnExit.setBounds(298, 10, 57, 41);
			contentPanel.add(btnExit);
		}
	}
}
