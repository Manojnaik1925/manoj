package bookmyshow.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookmyshow.dao.CustomerDao;
import bookmyshow.dto.CustomerDto;
@WebServlet("/signin")
public class Signin extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String id=req.getParameter("id");
	int id1=Integer.parseInt(id);
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	CustomerDao customerDao=new CustomerDao();
	CustomerDto d1=customerDao.find(id1);
	if(d1!=null){
	if(d1.getEmail().equals(email)&&d1.getPassword().equals(password)){
		RequestDispatcher dispatcher=req.getRequestDispatcher("bookticket.html");
		dispatcher.forward(req, resp);
	}else{
		resp.getWriter().println("enter valid email and password");
	}
	}else{
		resp.getWriter().println("data not found");
	}
}
}
