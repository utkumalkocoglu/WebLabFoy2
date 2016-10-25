package com.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionDAO {
	public static Connection getConnection() {
		Connection connectStatus = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connectStatus = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/foy2?useUnicode=true&characterEncoding=utf-8", "root", "");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}		
		return connectStatus;
	}
}
