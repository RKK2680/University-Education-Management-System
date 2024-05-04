package Home;
import java.awt.*;
import javax.swing.*;
import userdetails.Registration;
import userdetails.project;

import java.awt.event.*;
class Photo extends JFrame  implements ActionListener
{

ImageIcon s[];
JLabel l;
JButton b1,b2;
int i,l1;
JPanel p;
private JTextField txtWelcomeToEducation;
private JTextField textField;
private JButton b1_1;

public Photo()
{
   setSize(1386, 771);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setVisible(true);
   getContentPane().setLayout(null);
   JPanel p=new JPanel();
   p.setBounds(100, 525, 774, -42);
   p.setLayout(null);
   getContentPane().add(p);
   s = new ImageIcon[16]; 
   s[0] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E.jpg");
   s[1] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E0.jpg");
   s[2] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E1.jpg");
   s[3] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E2.jpg");
   s[4] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E3.jpg");
   s[5] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E4.jpg");
   s[6] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E5.jpg");
   s[7] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E6.jpg");
   s[8] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E7.jpg");
   s[9] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E8.jpg");
   s[10] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E9.jpg");
   s[11] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E10.jpg");
   s[12] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E11.jpg");
   s[13] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E12.jpg");
   s[14] = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\Photo\\E13.jpg");
   l = new JLabel("",JLabel.CENTER);
   l.setBackground(new Color(224, 255, 255));
   l.setBounds(20, 92, 1340, 530);
   getContentPane().add(l);
   l.setIcon(s[0]);
   b2=new JButton("Next");
   b2.setBounds(925, 667, 118, 23);
   getContentPane().add(b2);
   b2.setFont(new Font("Times New Roman", Font.BOLD, 15));
   b1=new JButton("Back");
   b1.setBounds(410, 667, 88, 23);
   getContentPane().add(b1);
   b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
   
   txtWelcomeToEducation = new JTextField();
   txtWelcomeToEducation.setEditable(false);
   txtWelcomeToEducation.setHorizontalAlignment(SwingConstants.CENTER);
   txtWelcomeToEducation.setBackground(new Color(135, 206, 250));
   txtWelcomeToEducation.setText("Gallary ");
   txtWelcomeToEducation.setFont(new Font("Times New Roman", Font.BOLD, 30));
   txtWelcomeToEducation.setBounds(318, 11, 748, 74);
   getContentPane().add(txtWelcomeToEducation);
   txtWelcomeToEducation.setColumns(10);
   
   textField = new JTextField();
   textField.setEditable(false);
   textField.setBackground(SystemColor.info);
   textField.setBounds(352, 649, 786, 61);
   getContentPane().add(textField);
   textField.setColumns(10);
   
   b1_1 = new JButton("Back");
   b1_1.addActionListener(new ActionListener() {
   	public void actionPerformed(ActionEvent e) {
   		project.main(null);
   		dispose();
   	}
   });
   b1_1.setBackground(new Color(255, 99, 71));
   b1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
   b1_1.setBounds(1272, 10, 88, 33);
   getContentPane().add(b1_1);
   b1.addActionListener(this);
   b2.addActionListener(this);
   
}
public  void actionPerformed(ActionEvent e)
{

   if(e.getSource()==b1) 
   {
       if(i==0)
       {
           JOptionPane.showMessageDialog(null,"This is First Image");
       }
       else
           {
           i=i-1;
           l.setIcon(s[i]);
       }
   }
   if(e.getSource()==b2)
   {
       if(i==s.length-1)
       {
           JOptionPane.showMessageDialog(null,"This is LastImage");
       }
       else
           {
           i=i+1;
           l.setIcon(s[i]);
           }
       }

    }
public static void main(String args[])
{
   Photo obj = new Photo();
}
}


 


