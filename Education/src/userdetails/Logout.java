package userdetails;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logout extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void log() {
		try {
			Logout dialog = new Logout(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* 
	 * Create the dialog.
	 * @param JFrame 
	 */
	public Logout(Component JFrame) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\eclipse-workspace\\Education Management System\\img\\cancel-icon.png"));
		setTitle("Logout");
		setBounds(100, 100, 712, 567);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(230, 230, 250));
		contentPanel.setBorder(new TitledBorder(new LineBorder(new Color(171, 173, 179)), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 250, 205)));
		
		//default icon, custom title
		int n = JOptionPane.showConfirmDialog(
		    JFrame,
		    "You Are Log Out This Aplication?",
		    "Log Out",
		    JOptionPane.YES_OPTION);
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextArea txtrThankYou = new JTextArea();
		txtrThankYou.setForeground(new Color(106, 90, 205));
		txtrThankYou.setBackground(new Color(224, 255, 255));
		txtrThankYou.setEditable(false);
		txtrThankYou.setText("\t\r\n\tThank You\r\nVisiting For My Education Management System \r\n    For               ( Era  University )");
		txtrThankYou.setFont(new Font("Times New Roman", Font.BOLD, 28));
		txtrThankYou.setBounds(75, 125, 600, 195);
		contentPanel.add(txtrThankYou);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 160, 122));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Project1 obp= new Project1();
						obp.main(null);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
