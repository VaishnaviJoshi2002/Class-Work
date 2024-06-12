/*WAP to perform CRUD operation on Product database based on choice given by user using switch case Using JDBC*/
package com.database;
import java.sql.*;
import java.util.Scanner;


//Product Class
public class Product {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		//Connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/product","root","root");

	    PreparedStatement pstmt=conn.prepareStatement("SELECT * FROM Orders");
			
	    Scanner sc=new Scanner(System.in);
	    while (true) {
	    	System.out.println("CRUD Operations:");
	    	System.out.println("1. Create");
	        System.out.println("2. Read");
	        System.out.println("3. Update");
	        System.out.println("4. Delete");
	        System.out.println("5. Exit\n");
	        System.out.print("Enter your choice: ");
	        
	        int choice = sc.nextInt();
	                
	        //User Choice
	        switch (choice) {
	        case 1:
	        	createProduct(conn, pstmt);
	        	break;
	        case 2:
	        	readProduct(conn, pstmt);
	        	break;
	        case 3:
	        	updateProduct(conn, pstmt);
	        	break;
	        case 4:
	        	deleteProduct(conn, pstmt);
	        	break;
	        case 5:
	        	System.out.println("Exiting...");
	        	return;
	        default:
	        	System.out.println("Invalid choice");
	        	}
	        }
	      
	}
	    
		//For Inserting values in Database createProduct().
	    static void createProduct(Connection conn, Statement stmt) throws SQLException {
	        System.out.println("Creating product...");
	        
	        PreparedStatement pstmt=conn.prepareStatement("INSERT INTO Orders VALUES(?,?)");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter product Id:");
			String id=sc.next();
			
			System.out.println("Enter product Name:");
			String name=sc.next();
			pstmt.setString(1,id);
			pstmt.setString(2,name);
			
			int r=pstmt.executeUpdate();
			System.out.println(r+" record added Successfully...");
			
	    }

	  //For Retrieving values in Database readProduct().
	    static void readProduct(Connection conn, Statement stmt) throws SQLException {
	        System.out.println("Reading product...");
	        Statement pstmt=conn.createStatement();
			ResultSet rs=pstmt.executeQuery("SELECT * FROM Orders");
			String pid;
			String productname;
			System.out.println("Product Details..");
			System.out.println("=================");
			while(rs.next()) {
				
				pid=rs.getString(1);
				productname=rs.getString(2);
				System.out.println(pid+"|" +productname );
				System.out.println("");
			}
	        
	    }

	  //For updating values in Database updateProduct().
	    static void updateProduct(Connection conn, Statement stmt) throws SQLException {
	        System.out.println("Updating product...");
	        PreparedStatement pstmt=conn.prepareStatement("UPDATE Orders SET pid=3 ,productname='LCD' WHERE pid=3;");
	      
	        System.out.println("Record updated."); 
	        pstmt.executeUpdate();
			System.out.println(" Record updated Successfully...");
	    }
	  
	    
	  //For deleting values in Database deleteProduct().
	    static void deleteProduct(Connection conn, Statement stmt) throws SQLException {
	      
	        PreparedStatement pstmt=conn.prepareStatement("DELETE FROM Orders WHERE pid=?; ");
	        int no;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number which you want to delete:");
	        no=sc.nextInt();
	        
	        pstmt.setInt(1, no); 
	        pstmt.executeUpdate(); 
	        System.out.println("Record deleted successfully.");
	        
	    }
	}


