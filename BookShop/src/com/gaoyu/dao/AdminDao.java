package com.gaoyu.dao;

import com.gaoyu.entity.Admin;

/**
 * creat by gaoyu
 * 2017-9-27
 */
public interface AdminDao {
	//µÇÂ¼²éÑ¯
	Admin findUser(String user, String pwd);
}
