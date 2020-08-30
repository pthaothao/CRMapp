package com.myclass.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static String url="jdbc:mysql://localhost:3306/crm";
	private static String username="root";
	private static String password="123456";
	public static Connection getConnection() {
		//Sử dụng lớp driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Success");
			return connection;
		} catch (ClassNotFoundException e) {
			System.out.println("Không tìm thấy Driver!");
		}catch (SQLException e) {
			System.out.println("Không tìm thấy Database!");
		}
		
		return null;
	}
}
