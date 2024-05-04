package Home;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Image.FoodNutrition;
import userdetails.project;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class Cource extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton btnNewButton_8;
	private JPanel panel;
	private JLabel lblCourceDetails;
	private JPanel panel_1;
	private JLabel EraLogo;
	private JLabel lblNewLabel_2;
	private JLabel lblSarfarazganjHardoiRoad;
	private String path;
	private JLabel lblBachelorssInComputer;
	private JLabel lblMasterssInComputer;
	private JLabel lblBiotechnology;
	private JLabel lblBachelorssNursing;
	private JLabel lblBachelorssOfPharmecy;
	private JLabel lblBachelorssOfArts;
	private JLabel lblBachelorssOfPharmecy_2;

	/**
	 * Launch the application.
	 */
	public static void CU() {
		try {
			Cource dialog = new Cource();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cource() {
		setBounds(100, 100, 944, 577);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setToolTipText("");
		contentPanel.setBackground(new Color(176, 196, 222));
		contentPanel.setBorder(new LineBorder(new Color(51, 153, 255), 6));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(121, 175, 735, 339);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("Open Details");
		btnNewButton_7.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 165, 0), new Color(255, 182, 193), new Color(0, 0, 128)));
		btnNewButton_7.setBackground(new Color(144, 238, 144));
		btnNewButton_7.setBounds(457, 243, 140, 23);
		panel.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BPT ob =new BPT();
				ob.Bpt();
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton_6 = new JButton("Open Details");
		btnNewButton_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 165, 0), new Color(255, 182, 193), new Color(0, 0, 128)));
		btnNewButton_6.setBackground(new Color(144, 238, 144));
		btnNewButton_6.setBounds(457, 209, 140, 23);
		panel.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BA oBa =new BA();
				oBa.ba();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton_5 = new JButton("Open Details");
		btnNewButton_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 165, 0), new Color(255, 182, 193), new Color(0, 0, 128)));
		btnNewButton_5.setBackground(new Color(144, 238, 144));
		btnNewButton_5.setBounds(457, 175, 140, 23);
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pharmacy oPharmacy =new Pharmacy();
				oPharmacy.Pharma();
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton_4 = new JButton("Open Details");
		btnNewButton_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 165, 0), new Color(255, 182, 193), new Color(0, 0, 128)));
		btnNewButton_4.setBackground(new Color(144, 238, 144));
		btnNewButton_4.setBounds(457, 141, 140, 23);
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nursing oNursing =new Nursing();
				oNursing.Nurs();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton_2 = new JButton("Open Details");
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 165, 0), new Color(255, 182, 193), new Color(0, 0, 128)));
		btnNewButton_2.setBackground(new Color(144, 238, 144));
		btnNewButton_2.setBounds(457, 103, 140, 23);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Biotech oBiotechnology=new Biotech();
				oBiotechnology.Bi0t();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton_1 = new JButton("Open Details");
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 165, 0), new Color(255, 182, 193), new Color(0, 0, 128)));
		btnNewButton_1.setBackground(new Color(144, 238, 144));
		btnNewButton_1.setBounds(457, 69, 140, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MCA oMca=new MCA();
				oMca.m();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton = new JButton("Open Details");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 165, 0), new Color(255, 182, 193), new Color(0, 0, 128)));
		btnNewButton.setBackground(new Color(144, 238, 144));
		btnNewButton.setBounds(457, 35, 140, 23);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		lblBachelorssInComputer = new JLabel("Bachelors's in Computer Application");
		lblBachelorssInComputer.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBachelorssInComputer.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssInComputer.setBackground(new Color(211, 211, 211));
		lblBachelorssInComputer.setBounds(135, 35, 281, 27);
		panel.add(lblBachelorssInComputer);
		
		lblMasterssInComputer = new JLabel("Masters's in Computer Application");
		lblMasterssInComputer.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMasterssInComputer.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblMasterssInComputer.setBackground(new Color(211, 211, 211));
		lblMasterssInComputer.setBounds(134, 68, 281, 27);
		panel.add(lblMasterssInComputer);
		
		lblBiotechnology = new JLabel("Biotechnology");
		lblBiotechnology.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiotechnology.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBiotechnology.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBiotechnology.setBackground(new Color(211, 211, 211));
		lblBiotechnology.setBounds(135, 102, 281, 27);
		panel.add(lblBiotechnology);
		
		lblBachelorssNursing = new JLabel("Bachelors's Nursing");
		lblBachelorssNursing.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssNursing.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBachelorssNursing.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssNursing.setBackground(new Color(211, 211, 211));
		lblBachelorssNursing.setBounds(134, 139, 281, 27);
		panel.add(lblBachelorssNursing);
		
		lblBachelorssOfPharmecy = new JLabel("Bachelors's Of  Pharmecy");
		lblBachelorssOfPharmecy.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssOfPharmecy.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBachelorssOfPharmecy.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssOfPharmecy.setBackground(new Color(211, 211, 211));
		lblBachelorssOfPharmecy.setBounds(135, 173, 281, 27);
		panel.add(lblBachelorssOfPharmecy);
		
		lblBachelorssOfArts = new JLabel("Bachelors's Of  Arts");
		lblBachelorssOfArts.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssOfArts.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBachelorssOfArts.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssOfArts.setBackground(new Color(211, 211, 211));
		lblBachelorssOfArts.setBounds(135, 207, 281, 27);
		panel.add(lblBachelorssOfArts);
		
		lblBachelorssOfPharmecy_2 = new JLabel("Bachelor of Physiotherapy");
		lblBachelorssOfPharmecy_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBachelorssOfPharmecy_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBachelorssOfPharmecy_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(238, 130, 238), new Color(0, 0, 139), new Color(255, 255, 0)));
		lblBachelorssOfPharmecy_2.setBackground(new Color(211, 211, 211));
		lblBachelorssOfPharmecy_2.setBounds(135, 239, 281, 27);
		panel.add(lblBachelorssOfPharmecy_2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BCA oBca=new BCA();
				oBca.Bca();
			}
		});
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBounds(10, 10, 920, 155);
		contentPanel.add(panel_1);
		
		EraLogo = new JLabel();
		path="C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\EUlogo.jpg";
	    EraLogo.setBounds(42, 10, 158, 95);
	    ImageIcon imageIcon1=new ImageIcon(path);
		Image imgImage1=imageIcon1.getImage();
		Image newiImage1=imgImage1.getScaledInstance(EraLogo.getWidth(), EraLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image1=new ImageIcon(newiImage1);
		EraLogo.setIcon(image1);
		panel_1.add(EraLogo);
		
		lblNewLabel_2 = new JLabel("Era University Lucknow");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 153));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_2.setBounds(128, 0, 666, 62);
		panel_1.add(lblNewLabel_2);
		
		lblSarfarazganjHardoiRoad = new JLabel("Sarfarazganj, Hardoi Road,  Lucknow 226003");
		lblSarfarazganjHardoiRoad.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarfarazganjHardoiRoad.setForeground(new Color(0, 102, 153));
		lblSarfarazganjHardoiRoad.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSarfarazganjHardoiRoad.setBounds(171, 53, 583, 35);
		panel_1.add(lblSarfarazganjHardoiRoad);
		
		btnNewButton_8 = new JButton("Back");
		btnNewButton_8.setBounds(804, 10, 106, 27);
		panel_1.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				project.main(null);
				dispose();
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_8.setBackground(new Color(255, 99, 71));
		
		lblCourceDetails = new JLabel("Cource Details");
		lblCourceDetails.setForeground(new Color(0, 0, 205));
		lblCourceDetails.setBounds(281, 85, 396, 60);
		panel_1.add(lblCourceDetails);
		lblCourceDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourceDetails.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblCourceDetails.setBorder(null);
		lblCourceDetails.setBackground(new Color(100, 149, 237));
	}
}
