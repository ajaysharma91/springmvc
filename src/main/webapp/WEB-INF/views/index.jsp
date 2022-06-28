<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h2>Hello Home Page</h2>
	<h3>Request By Home Controller</h3>
	<h4>Url hit /home</h4>
	<%
		String name = (String)request.getAttribute("name");
	Integer phone = (Integer)request.getAttribute("phone");
	List<String> names = (List<String>)request.getAttribute("names");
	%>
	<h6>
		This is
		<%= name %></h6>
	<h6>
		This is
		<%= phone %></h6>

	<%
		out.println(names.get(0));
	%>
</body>
</html>
