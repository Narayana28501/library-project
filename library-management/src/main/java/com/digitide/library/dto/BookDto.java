package com.digitide.library.dto;

public class BookDto {

	private String bookName;
	private String bookAuthor;
	private String isAvailable;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDto(String bookName, String bookAuthor, String isAvailable) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.isAvailable = isAvailable;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

}
