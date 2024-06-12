package com.database;

import java.sql.*;
import java.util.Scanner;


public class Order {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/product","root","root");
		
		PreparedStatement pstmt=con.prepareStatement("INSERT INTO Orders VALUES(?,?)");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product Id:");
		String id=sc.next();
		
		System.out.println("Enter product Name:");
		String name=sc.next();
		
		
		pstmt.setString(1,id);
		pstmt.setString(2,name);
		
		
		int r=pstmt.executeUpdate();
		con.close();
		System.out.println(r+" record added Successfully...");
		

		
	}
}
