package com.gaoyu.service.impl;

import com.gaoyu.dao.impl.AdminDaoImpl;
import com.gaoyu.entity.Admin;
import com.gaoyu.service.AdminService;

/**
 * creat by gaoyu
 * 2017-9-27
 */
public class AdminServiceImpl implements AdminService {
    //��¼����
	@Override
	public  Admin login(String user, String pwd) {
		//����dao�����淽��
		AdminDaoImpl adi = new AdminDaoImpl();
		Admin admin = adi.findUser(user, pwd);
		return admin;
	}

}
