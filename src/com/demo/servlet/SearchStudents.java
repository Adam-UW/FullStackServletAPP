package com.demo.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.dal.StudentDao;
import com.demo.entities.Students;

 
@WebServlet("/search")
public class SearchStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StudentDao studentDao= new StudentDao();
	private ArrayList<Students> list;
	Students student;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		student=null;
		System.out.println("search students got hit!!!");
		if(request.getParameter("search2").isEmpty()) {
			System.out.println("broo");
			request.getRequestDispatcher("MainServlet").forward(request, response);
		}
		int id=Integer.parseInt(request.getParameter("search2"));

		System.out.println(id);
		
		list= studentDao.findall();	
//		System.out.println(list.contains(search));
		for(Students l: list) {
			if(l.getStudent_id()== id) {
				System.out.println("Yes!!");
				student=l;
			}
		}
		
		System.out.println("before the block ::"+ student);
		
		if(student==null) {
			System.out.println("Inside if");
			System.out.println(student);
			request.getRequestDispatcher("error.jsp").forward(request,response);	
		}else {
			System.out.println("Inside else");
			System.out.println(student);
//			HttpSession session= request.getSession();
//			session.setAttribute("student", student);
			request.setAttribute("student", student);
			request.getRequestDispatcher("search.jsp").forward(request,response);
		}
		
	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
