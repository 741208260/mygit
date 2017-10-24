package com.gaoyu.service.impl;

import com.gaoyu.dao.impl.AdminDaoImpl;
import com.gaoyu.entity.Admin;
import com.gaoyu.service.AdminService;

/**
 * creat by gaoyu
 * 2017-9-27
 */
public class AdminServiceImpl implements AdminService {
    //登录方法
	@Override
	public  Admin login(String user, String pwd) {
		//调用dao类里面方法
		AdminDaoImpl adi = new AdminDaoImpl();
		Admin admin = adi.findUser(user, pwd);
		return admin;
	}

}
