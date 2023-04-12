package bookmyshow.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookmyshow.dao.CustomerDao;
import bookmyshow.dto.TicketDetailsDto;
@WebServlet("/fetch")
public class FetchController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	CustomerDao customerDao=new CustomerDao();
	List<TicketDetailsDto> detailsDtos=customerDao.fetchall();
	req.setAttribute("fetchall",detailsDtos);
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("fetchall.jsp");
	dispatcher.forward(req, resp);
}
}
