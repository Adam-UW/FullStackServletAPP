package com.demo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.dal.StudentDao;
import com.demo.entities.Students;
import com.demo.utilities.DbCon;

/**
 * Servlet implementation class AddStudents
 */
@WebServlet("/add-item")
public class AddStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StudentDao studentDao= new StudentDao();
	ArrayList list= new ArrayList();
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("add students got hit!!!");
		
		request.getRequestDispatcher("add-item.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Students student= new Students();
		student.setStudent_name(request.getParameter("studentname"));
		student.setEmail(request.getParameter("studentemail"));
		student.setMajor(request.getParameter("major"));
		student.setClass_type(request.getParameter("classname"));
		String [] genders= {request.getParameter("genderm"), request.getParameter("genderf"), request.getParameter("gendero")};
		System.out.println(Arrays.toString(genders));
		for(String s: genders) {
			if(s != null) {
				student.setGender(s);
				System.out.println("inside loop " + s);
			}
		}
		HttpSession session = request.getSession();
		session.setAttribute("list",student);
		System.out.println(student);
		
		studentDao.save(student);
		
		
		response.sendRedirect("view");
			
	}

}
