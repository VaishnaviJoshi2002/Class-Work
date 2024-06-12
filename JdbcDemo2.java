package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPDB","root","root");
		
		Statement stmt=con.createStatement();
		
		int i=stmt.executeUpdate("insert into empdata values(102,'Radha',500000,'Manager')");
		
		System.out.println("Successfully added record" +i);
		
		con.close();
	}

}
