package com.gaoyu.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gaoyu.entity.Admin;
import com.gaoyu.service.AdminService;
import com.gaoyu.service.impl.AdminServiceImpl;

/**
 * creat by gaoyu 2017-9-27
 */
@WebServlet("/servlet/Login")
public class Login extends HttpServlet {
	String user = null;
	String pwd = null;
	String check = null;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 采用简单的编码
		req.setCharacterEncoding("utf-8");
		// 获取账号密码
		user = req.getParameter("user");
		pwd = req.getParameter("pwd");
		// 获取记住密码的点击状态
		check = req.getParameter("check");
		if (user != null && pwd != null) {
			// 调用service
			AdminServiceImpl asi = new AdminServiceImpl();
			Admin admin = asi.login(user, pwd);
			if (admin == null) {
				// 账号密码不存在
				req.getRequestDispatcher("/event/loginEvent/login.jsp").forward(req,
						resp);
			} else {
				// 登陆成功
				loginSuccess(req, resp);
			}
		} else {
			// 账号密码为空
			req.getRequestDispatcher("/event/loginEvent/login.jsp")
					.forward(req, resp);
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	// 登陆成功处理
	public void loginSuccess(HttpServletRequest req, HttpServletResponse resp) {
		try {
			// 存储session,显示是谁登陆了
			HttpSession session = req.getSession();
			session.setAttribute("name", user);
			//记住密码处理
			//先对用户名转码（防止中文乱码,先转换连接码），密码
			user = URLEncoder.encode(user, "utf-8"); 
			//创建cookie
			Cookie cok = new Cookie("user", user);
			Cookie cok1 = new Cookie("pwd", pwd);
			//指定范围"/"服务器内有效
			cok.setPath("/");
			cok1.setPath("/");
			// 检查是否记密码
			if (check != null) {
				//设置最大存活时间
				cok.setMaxAge(60*60*24);
				cok1.setMaxAge(60*60*24);
			}else{
				//设置最大存活时间为0
				cok.setMaxAge(0);
				cok1.setMaxAge(0);
			}
			//添加cookie
			resp.addCookie(cok);
			resp.addCookie(cok1);
			// 跳转页面
			req.getRequestDispatcher("/frame1/frame.jsp").forward(
					req, resp);

		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
