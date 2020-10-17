package com.demo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dal.StudentDao;
import com.demo.entities.Students;

/**
 * Servlet implementation class UpdateStudents
 */
@WebServlet("/update")
public class UpdateStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StudentDao studentDao= new StudentDao();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("update students got hit!!!");
		
			request.getRequestDispatcher("update-item.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ID=Integer.parseInt(request.getParameter("studentid"));
		String email= request.getParameter("email");
		
		Students student= new Students();
		student.setStudent_id(ID);
		student.setEmail(email);
		
		System.out.println(ID + "   " +email);
		
		studentDao.update(student);
		
		response.sendRedirect("view");	
	}

}
