package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.Book;

public class BookDAO {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con= null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");
		con= DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/group059_campus","group059","welcome");
		System.out.println("Connection Established");
		return con;
	}
	public static int addBook(Book b) {
		int i=0;
		try {
			Connection con= getConnection();
			PreparedStatement stmt=con.prepareStatement("insert into lib_books(title, author, genre, total_books, available_books) values(?,?,?,?,?)");
			stmt.setString(1, b.getBook_title());
			stmt.setString(2, b.getBook_author());
			stmt.setString(3, b.getBook_genre());
			stmt.setInt(4, b.getTotal_books());
			stmt.setInt(5, b.getTotal_books());
			i=stmt.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in addBook");
			e.printStackTrace();
		}
		
		return i;
	}
	public static Book searchBook(int book_id) {
		Book b=null;
		ResultSet rs=null;
		try {
			Connection con = getConnection();
			PreparedStatement stmt=con.prepareStatement("select * from lib_books where book_id=?");
			stmt.setInt(1, book_id);
			rs=stmt.executeQuery();
			if(rs.next()) {
				b.setBook_id(book_id);
				b.setBook_title(rs.getString(2));
				b.setBook_author(rs.getString(3));
				b.setBook_genre(rs.getString(4));
				b.setTotal_books(rs.getInt(5));
				b.setAvailable_books(rs.getInt(6));
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in searchBook 1");
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error in searchBook 2");
			e.printStackTrace();
		}
		return b;
	}
	public static int updateBook(int book_id, int available_books) {
		int i=0;
		try {
			Connection con = getConnection();
			PreparedStatement stmt=con.prepareStatement("update lib_books set available_books=? where book_id=?");
			stmt.setInt(1, available_books);
			stmt.setInt(2, book_id);
			i=stmt.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in updateBook 1");
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error in updateBook 2");
			e.printStackTrace();
		}
		return i;
	}
	public static int deleteBook(int book_id) {
		int i=0;
		try {
			Connection con = getConnection();
			PreparedStatement stmt=con.prepareStatement("delete from lib_books where book_id=?");
			stmt.setInt(1, book_id);
			i=stmt.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in updateBook 1");
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error in updateBook 2");
			e.printStackTrace();
		}
		return i;
	}
}
