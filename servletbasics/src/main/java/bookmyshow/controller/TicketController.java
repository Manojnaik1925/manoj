package bookmyshow.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookmyshow.dao.CustomerDao;
import bookmyshow.dto.TicketDetailsDto;
@WebServlet("/ticket")
public class TicketController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String moviename=req.getParameter("moviename");
	String theatername=req.getParameter("theatername");
	String lang=req.getParameter("lang");
	String seatno=req.getParameter("seatno");
	String d1=req.getParameter("no_of_ticket");
	int no_of_ticket=Integer.parseInt(d1);
	String d2=req.getParameter("cost");
	double cost=Double.parseDouble(d2);
	
	TicketDetailsDto detailsDto=new TicketDetailsDto();
	detailsDto.setMoviename(moviename);
	detailsDto.setTheatername(theatername);
	detailsDto.setLang(lang);
	detailsDto.setSeatno(seatno);
	detailsDto.setNo_of_ticket(no_of_ticket);
	detailsDto.setCost(no_of_ticket*cost);
	
	CustomerDao customerDao=new CustomerDao();
	customerDao.insertTicketDetails(detailsDto);
}
}
