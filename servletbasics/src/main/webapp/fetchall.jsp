<%@page import="bookmyshow.dto.TicketDetailsDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<th>id</th>
<th>cost</th>
<th>lang</th>
<th>moviename</th>
<th>no_of_ticket</th>
<th>seatno</th>
<th>theatername</th>
</tr>
<%List<TicketDetailsDto> detailsDtos=(List<TicketDetailsDto>)request.getAttribute("fetchall");%>
<% for(TicketDetailsDto s:detailsDtos){ %>
<tr>
<td><%=s.getId() %></td>
<td><%=s.getCost() %></td>
<td><%=s.getLang() %></td>
<td><%=s.getMoviename()%></td>
<td><%=s.getNo_of_ticket() %></td>
<td><%=s.getSeatno() %></td>
<td><%=s.getTheatername() %></td>
</tr>
<%} %>
</table>
</body>
</html>