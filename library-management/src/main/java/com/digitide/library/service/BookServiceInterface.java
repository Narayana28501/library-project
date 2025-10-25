package com.digitide.library.service;

import com.digitide.library.entity.Book;


public interface BookServiceInterface {

	public Book createBook(Book book);

	public Book getBookById(int id);

	public Book updateBook(Book book);

	public String deleteBookById(int id);

}
