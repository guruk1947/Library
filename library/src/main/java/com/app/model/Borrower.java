package com.app.model;

public class Borrower {
	private int borrower_id;
	private String borrower_first_name;
	private String borrower_last_name;
	private String borrower_contact_number;
	private int book_id_1;
	private int book_id_2;
	private int book_id_3;
	public int getBorrower_id() {
		return borrower_id;
	}
	public void setBorrower_id(int borrower_id) {
		this.borrower_id = borrower_id;
	}
	public String getBorrower_first_name() {
		return borrower_first_name;
	}
	public void setBorrower_first_name(String borrower_first_name) {
		this.borrower_first_name = borrower_first_name;
	}
	public String getBorrower_last_name() {
		return borrower_last_name;
	}
	public void setBorrower_last_name(String borrower_last_name) {
		this.borrower_last_name = borrower_last_name;
	}
	public String getborrower_contact_number() {
		return borrower_contact_number;
	}
	public void setborrower_contact_number(String borrower_contact_number) {
		this.borrower_contact_number = borrower_contact_number;
	}
	public int getBook_id_1() {
		return book_id_1;
	}
	public void setBook_id_1(int book_id_1) {
		this.book_id_1 = book_id_1;
	}
	public int getBook_id_2() {
		return book_id_2;
	}
	public void setBook_id_2(int book_id_2) {
		this.book_id_2 = book_id_2;
	}
	public int getBook_id_3() {
		return book_id_3;
	}
	public void setBook_id_3(int book_id_3) {
		this.book_id_3 = book_id_3;
	}
	
}
