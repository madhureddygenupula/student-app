package com.ty.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.student.dao.StudentDao;
import com.ty.student.dto.Student;

public class EditStudent extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Student student=new Student();
		
		String id=req.getParameter("id");
		String name=req.getParameter("userName");
		String email=req.getParameter("userEmail");
		String phone=req.getParameter("userPhone");
		String gender=req.getParameter("userGender");
		String age=req.getParameter("userAge");
		
		student.setName(name);
		student.setEmail(email);
		student.setPhone(Long.parseLong(phone));
		student.setGender(gender);
		student.setId(Integer.parseInt(id));
		student.setAge(Integer.parseInt(age));
		
		StudentDao dao=new StudentDao();
		dao.updateStudent(student);
		

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html><body><h1> Data Updated</h1></body></html>");

		RequestDispatcher dispatcher = req.getRequestDispatcher("EditStudent.jsp");
		dispatcher.include(req, resp);
	}
}
