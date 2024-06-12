package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");//step1
		
		//step2
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		
		//step3
		Statement stmt=con.createStatement();
		
		//step4 execute statement
		int a=stmt.executeUpdate("insert into studentdetails values(103 ,'Rahul','Pune')");
		
		System.out.println("Successfully added student" +a);
		
		//step5
		con.close();

	}

}
