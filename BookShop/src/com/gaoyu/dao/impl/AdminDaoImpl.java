package com.gaoyu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gaoyu.dao.AdminDao;
import com.gaoyu.entity.Admin;
import com.gaoyu.util.DButil;

/**
 * creat by gaoyu
 * 2017-9-27
 */
public class AdminDaoImpl implements AdminDao {

	@Override
	public Admin findUser(String user,String pwd) {
		//调用Util连接数据库，获取连接
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Admin admin = null;
		//查询语句
		String sql = "select * from person where p_name = '"+user+"'and p_pwd = '"+pwd+"'";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			//便利读取
			if(rs.next()){
				int p_id = rs.getInt("p_id");
				String p_name = rs.getString("p_name");
				String p_pwd = rs.getString("p_pwd");
				float p_tel = rs.getFloat("p_tel");
				String p_addr = rs.getString("p_addr");
				//封装对象
				admin = new Admin(p_id, p_name, p_pwd, p_tel, p_addr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DButil.closeSource(rs, ps, conn);
		}
				
		return admin;
	}

}
