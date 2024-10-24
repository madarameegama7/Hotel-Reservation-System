package com.bs.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/hotelreservation";
	private static String userName = "root";
	private static String password = "";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = (Connection)DriverManager.getConnection(url, userName, password);
		}catch(Exception e) {
			System.out.println("Database connectivity is failed");
		}
		
		return con;
	}
}
