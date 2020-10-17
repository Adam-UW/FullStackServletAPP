package com.demo.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbCon {
	
	private static Connection con= null;
	private static String TABLE_EM = "employee";
	private static String TABLE_ST = "students";
	private static String LOGIN = "login";
	
	private static final String URL= "jdbc:mysql://localhost:3306/"+TABLE_ST;
	private static final String USER= "root";
	private static final String PASSWORD= "12345aa";
	
	public static Connection getConnection() {
		if(con == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con= DriverManager.getConnection(URL, USER, PASSWORD);
				
			} catch(Exception e) {
				e.printStackTrace();
				
			}
		}
		
	    System.out.println("Connection established......");
	      //Creating a Statement object
	    
//	    try {
//		      Statement stmt = con.createStatement();
//		      //Retrieving the data
//		      ResultSet rs = stmt.executeQuery("Show tables");
//		      System.out.println("Tables in the current database: ");
//		      while(rs.next()) {
//		         System.out.print(rs.getString(1));
//		         System.out.println();
//		      }
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		
		return con;
	}
	
	
	public static void closeConnection() {
		try {
			
			if(con != null && ! con.isClosed()) {
				con.close();
			}
			con=null;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
