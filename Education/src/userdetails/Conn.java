package userdetails;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conn {
//Connection conn;
public static  Connection getConnection() {
	Connection conn=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","ramkumar");
		JOptionPane.showMessageDialog(null,"Database Connection sucssesful MYSQLconnect getconn Method" );
		
		//return connection;
	} catch (Exception e) {
		conn=null;
		//JOptionPane.showMessageDialog(null,"Error in MYSQLconnect getconn Method" +e);
	}
	return conn;
}
public static Connection connect() {
	// TODO Auto-generated method stub
	return null;
}
}




/*import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {   
     public static Connection connect()
    {
     Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");                                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDatabaseNameHere?","DatabaseUserNameHere","DatabasePasswordHere");   
 } 
catch (Exception e) 
    {
        System.out.println("inter.DBConnect.connect()");
    }
   return con;
}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}   
     
}*/