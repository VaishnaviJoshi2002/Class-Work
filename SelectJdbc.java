package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb", "root", "root");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from customer");
		int salary;
		String id, name, desig, dept;
		System.out.println("Employee Details..");
		System.out.println("=================");
		while(rs.next()) {
			
			id=rs.getString(1);
			name=rs.getString(2);
			desig=rs.getString(3);
			dept=rs.getNString(4);
			salary=rs.getInt(5);
			System.out.println(id+"|" +name+"|" +desig+"|"+dept+"|"+salary);
		}
			 con.close();		
	}

}
