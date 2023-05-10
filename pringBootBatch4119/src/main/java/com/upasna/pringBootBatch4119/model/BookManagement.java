package com.upasna.pringBootBatch4119.model;

import jakarta.persistence.*;

@Entity
@Table(name="book_mgmt")
public class BookManagement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String bookName;
	private String authName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public BookManagement(String bookName, String authName) {
		super();
		this.bookName = bookName;
		this.authName = authName;
	}
	public BookManagement() {
		
	}

}
