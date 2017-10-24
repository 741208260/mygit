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
		// ���ü򵥵ı���
		req.setCharacterEncoding("utf-8");
		// ��ȡ�˺�����
		user = req.getParameter("user");
		pwd = req.getParameter("pwd");
		// ��ȡ��ס����ĵ��״̬
		check = req.getParameter("check");
		if (user != null && pwd != null) {
			// ����service
			AdminServiceImpl asi = new AdminServiceImpl();
			Admin admin = asi.login(user, pwd);
			if (admin == null) {
				// �˺����벻����
				req.getRequestDispatcher("/event/loginEvent/login.jsp").forward(req,
						resp);
			} else {
				// ��½�ɹ�
				loginSuccess(req, resp);
			}
		} else {
			// �˺�����Ϊ��
			req.getRequestDispatcher("/event/loginEvent/login.jsp")
					.forward(req, resp);
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	// ��½�ɹ�����
	public void loginSuccess(HttpServletRequest req, HttpServletResponse resp) {
		try {
			// �洢session,��ʾ��˭��½��
			HttpSession session = req.getSession();
			session.setAttribute("name", user);
			//��ס���봦��
			//�ȶ��û���ת�루��ֹ��������,��ת�������룩������
			user = URLEncoder.encode(user, "utf-8"); 
			//����cookie
			Cookie cok = new Cookie("user", user);
			Cookie cok1 = new Cookie("pwd", pwd);
			//ָ����Χ"/"����������Ч
			cok.setPath("/");
			cok1.setPath("/");
			// ����Ƿ������
			if (check != null) {
				//���������ʱ��
				cok.setMaxAge(60*60*24);
				cok1.setMaxAge(60*60*24);
			}else{
				//���������ʱ��Ϊ0
				cok.setMaxAge(0);
				cok1.setMaxAge(0);
			}
			//���cookie
			resp.addCookie(cok);
			resp.addCookie(cok1);
			// ��תҳ��
			req.getRequestDispatcher("/frame1/frame.jsp").forward(
					req, resp);

		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
