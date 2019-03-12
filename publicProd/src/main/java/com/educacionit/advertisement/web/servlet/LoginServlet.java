package com.educacionit.advertisement.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.advertisement.web.data.UserDao;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2038058755584810094L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");

		String password = req.getParameter("password");

		System.out.println("Email: " + email + ", Pass: " + password);

		// ServletContext ctx = request.getServletContext();
		// DbConnectionManager db = (DbConnectionManager)ctx.getAttribute("db");
		// UserDao dao = new UserDao(db.getConnection());

	}

}
