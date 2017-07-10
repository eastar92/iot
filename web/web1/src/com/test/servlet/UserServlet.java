package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.service.UserService;

public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resq) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");

		String name1 = req.getParameter("name");
		String pwd1 = req.getParameter("pass");
		String op1 = req.getParameter("op");
		String id1 = req.getParameter("id");
		String pw1 = req.getParameter("pwd");
		System.out.println("input html에서 너님이 던진 값 => " + id1 + "," + pw1);

		String command = req.getParameter("command");
		if (command == null) {
			return;
		}
		UserService us = new UserService();

		if (command.equals("SIGNIN")) {
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String name = req.getParameter("name");
			String class_num = req.getParameter("class_num");
			String age = req.getParameter("age");

			System.out.println(id + "," + pwd + "," + name + "," + class_num + ", " + age);

			HashMap hm = new HashMap();
			hm.put("id", id);
			hm.put("pwd", pwd);
			hm.put("name", name);
			hm.put("class_num", class_num);
			hm.put("age", age);

			if (us.insertUser(hm)) {
				doProcess(resq, "저장 잘 됨");
			} else {
				doProcess(resq, "다시 입력해");
			}
		} else if (command.equals("DELETE")) {
			String user_num = req.getParameter("user_num");
			System.out.println("삭제할 번호 : " + user_num);
			if (us.deleteUser(user_num)) {
				doProcess(resq, "삭제됨");
			} else {
				doProcess(resq, "삭제안됨");
			}
		} else if (command.equals("UPDATE")) {
			String user_num = req.getParameter("user_num");
			System.out.println("업데이트 할 번호 : " + user_num);
			/*
			 * if (us.deleteUser(user_num)) { doProcess(resq, "삭제됨"); } else {
			 * doProcess(resq, "삭제안됨"); }
			 */
			String name = req.getParameter("name");
			String class_num = req.getParameter("class_num");
			String age = req.getParameter("age");

			HashMap hm = new HashMap();
			hm.put("name", name);
			hm.put("class_num", class_num);
			hm.put("age", age);
		}
	}

	public void dePost(HttpServletRequest req, HttpServletResponse reqs) throws IOException {

	}

	public void doProcess(HttpServletResponse resq, String writeStr) throws IOException {
		resq.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resq.getWriter();
		out.print(writeStr);

	}
}