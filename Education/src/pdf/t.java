package pdf;

import javax.swing.*;
import java.awt.*;
public class t extends JFrame {
	public t() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(127, 10, 142, 25);
		getContentPane().add(lblNewLabel);
	}
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //JFrame Creation       
        frame.setTitle("Add Image"); //Add the title to frame
        frame.getContentPane().setLayout(null); //Terminates default flow layout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminate program on close button
        frame.setBounds(100, 200, 350, 300); //Sets the position of the frame
        
        Container c = frame.getContentPane(); //Gets the content layer
        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Education\\img\\E6.jpg")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(50, 30, size.width, size.height); //Sets the location of the image
 
    c.add(label); //Adds objects to the container
        frame.setVisible(true); // Exhibit the frame
    }
}