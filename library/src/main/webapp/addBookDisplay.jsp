<%@page import="com.app.dao.BookDAO"%>
<%@page import="com.app.model.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.html" %>
<%
	String book_title= request.getParameter("book_title");
	String book_author= request.getParameter("book_author");
	String book_genre= request.getParameter("book_genre");
	int total_books= Integer.parseInt(request.getParameter("total_books"));
	Book b= new Book();
	b.setBook_title(book_title);
	b.setBook_author(book_author);
	b.setBook_genre(book_genre);
	b.setTotal_books(total_books);
	b.setAvailable_books(total_books);
	int status= BookDAO.addBook(b);
	if(status==1){
		%>
	<h1><%= "Book Added Successfully...!!!" %></h1>
<% }else out.write("error"); %>
<div style="position: fixed; bottom: 0;"><%@ include file="Footer.html" %></div>
</body>
</html>