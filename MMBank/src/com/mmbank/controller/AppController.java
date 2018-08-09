package com.mmbank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.app")
public class AppController extends HttpServlet {
       
	private static final long serialVersionUID = 1L;

	public AppController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/addNewAccount.app":
			response.sendRedirect("addNewAccount.jsp");
			break;
		case "/add.app":
			String choice = request.getParameter("accountType");
			System.out.println(choice);
			RequestDispatcher dispatcher = null;
			
			if(choice.equals("savingaccount")) {
				dispatcher = request.getRequestDispatcher("saving.jsp");
			}else if(choice.equals("currentaccount")) {
				dispatcher = request.getRequestDispatcher("current.jsp");
			}
			dispatcher.forward(request, response);
			break;
		case "/test.app":
			response.sendRedirect("test.jsp");
			break;
		default:
			response.sendRedirect("home.jsp");
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
