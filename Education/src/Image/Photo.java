package Image;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Photo {
public static void main(String []args) {
	String url="jdbc:mysql://localhost:3306/Attendence";
	String user="root";
	String Pass="ramkumar";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection(url,user,Pass);
	String Query="insert into StudentAttendence values(?)";
	PreparedStatement ps=conn.prepareStatement(Query);
	
	JFileChooser FC=new JFileChooser();
	FC.showOpenDialog(null);
	File F=FC.getSelectedFile();
	
	FileInputStream fi=new FileInputStream(F);
	ps.setInt(1, 1);
	ps.setBinaryStream(2, fi, fi.available());
	ps.executeUpdate();
	JOptionPane.showMessageDialog(null, "image sucsesfully uploded");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
