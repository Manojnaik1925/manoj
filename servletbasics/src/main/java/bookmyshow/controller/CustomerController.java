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
@WebServlet("/signup")
public class CustomerController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String firstname=req.getParameter("firstname");
	String lastname=req.getParameter("lastname");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	String gender=req.getParameter("gender");
	
	CustomerDto customerDto=new CustomerDto();
	customerDto.setFirstname(firstname);
	customerDto.setLastname(lastname);
	customerDto.setEmail(email);
	customerDto.setGender(gender);
	customerDto.setPassword(password);
	
	CustomerDao customerDao=new CustomerDao();
	customerDao.insert(customerDto);
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("signin.html");
	dispatcher.forward(req, resp);
	
}
}
