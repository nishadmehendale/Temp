package com.cg.resumebuilder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResumeBuilder")
public class ResumeBuilder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ResumeBuilder() {

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		String fname = (String) request.getParameter("firstName");
//		out.write("<h1>"+fname+"</h1>");
		Candidate candidate = new Candidate(request.getParameter("firstName"),request.getParameter("lastName"),request.getParameter("gender"),request.getParameter("highestQualification"),request.getParameter("hobbies"),request.getParameter("address"),request.getParameter("website"),request.getParameter("date"),request.getParameter("contact"),request.getParameterValues("skills"));
		request.setAttribute("c", candidate);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
