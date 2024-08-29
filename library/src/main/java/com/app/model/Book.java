package com.app.model;

public class Book {
	private int book_id;
	private String book_title;
	private String book_author;
	private String book_genre;
	private int total_books;
	private int available_books;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public int getTotal_books() {
		return total_books;
	}
	public void setTotal_books(int total_books) {
		this.total_books = total_books;
	}
	public int getAvailable_books() {
		return available_books;
	}
	public void setAvailable_books(int available_books) {
		this.available_books = available_books;
	}
	
	
}
