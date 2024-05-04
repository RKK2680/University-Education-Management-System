package Image;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class F_R_Info extends JPanel {
	public static void main(String[] args) {
		
	}
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldRe;
	
	/**
	 * Create the panel.
	 */
	public F_R_Info() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no1=Integer.parseInt(textField1.getText());
				int no2=Integer.parseInt(textField2.getText());
				textFieldRe.setText("sum of two no"+(no1+no2));
			}
		});
		btnNewButton.setBounds(83, 206, 93, 30);
		add(btnNewButton);
		
		textField1 = new JTextField();
		textField1.setBounds(59, 55, 133, 43);
		add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(59, 132, 133, 43);
		add(textField2);
		
		textFieldRe = new JTextField();
		textFieldRe.setColumns(10);
		textFieldRe.setBounds(207, 97, 295, 43);
		add(textFieldRe);

	

}
}