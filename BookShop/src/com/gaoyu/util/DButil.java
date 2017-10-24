package com.gaoyu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * creat by gaoyu 2017-9-27
 */
public class DButil {
	// 获取连接
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.logicalcobwebs.proxool.ProxoolDriver");
			//这么写不行conn = DriverManager.getConnection("configure.test");
			conn = DriverManager.getConnection("proxool.test");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	// 关闭数据
	public static void closeSource(ResultSet rs ,PreparedStatement ps,Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
