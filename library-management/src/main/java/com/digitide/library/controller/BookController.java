package com.digitide.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitide.library.entity.Book;
import com.digitide.library.service.BookServiceInterfaceImpl;

@RestController
public class BookController {

	@Autowired
	private BookServiceInterfaceImpl bookservice;

	@PostMapping("/create")
	public ResponseEntity<Book> createBooks(@RequestBody  Book book) {

		Book book2 = bookservice.createBook(book);

		return new ResponseEntity<>(book2, HttpStatus.CREATED);

	}

	@PutMapping("/update")
	public ResponseEntity<Book> updateBook(@RequestBody Book book) {
		Book updateBook = bookservice.updateBook(book);

		return new ResponseEntity<>(updateBook, HttpStatus.CREATED);

	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteBook(@RequestParam(value = "bookid") int id) {

		String deleteBookById = bookservice.deleteBookById(id);

		return new ResponseEntity<>(deleteBookById, HttpStatus.OK);

	}

	@GetMapping("/getbook")
	public ResponseEntity<Book> getBook(

			@RequestParam(value = "bookid") int id) {

		Book bookById = bookservice.getBookById(id);

		return new ResponseEntity<>(bookById, HttpStatus.OK);

	}

}
