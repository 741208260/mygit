package com.gaoyu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * creat by gaoyu
 * 2017-9-28
 */
@WebServlet("/servlet/exitLogin")
public class exitLogin extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//注销session
			request.getSession().invalidate();
			//跳转登录界面
			response.sendRedirect("/BookShop/event/loginEvent/login.jsp");
	}

}
