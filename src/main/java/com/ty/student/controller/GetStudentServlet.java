package com.ty.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.student.dao.StudentDao;
import com.ty.student.dto.Student;


public class GetStudentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		StudentDao dao=new StudentDao();
		List<Student> users=dao.getAllStudents();
	
		
		req.setAttribute("myStudent", users);
		RequestDispatcher dispatcher=req.getRequestDispatcher("DisplayStudent.jsp");
		dispatcher.forward(req, resp);
	}
}
