package com.digitide.library.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitide.library.entity.Book;
import com.digitide.library.repository.BookRepository;

@Service
public class BookServiceInterfaceImpl implements BookServiceInterface {

 

	@Autowired
	private BookRepository bookrepo;

    

	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub

		Book save = bookrepo.save(book);

		return save;
	}

	@Override
	public Book getBookById(int id) {
		Optional<Book> book = bookrepo.findById(id);
		if (book.isPresent()) {
			return book.get();
		}
		return null;
	}

	@Override
	public Book updateBook(Book book) {
		Integer bookId = book.getBookId();

		Book bookObj = getBookById(bookId);
		bookObj.setBookAuthor(book.getBookAuthor());
		bookObj.setBookName(book.getBookName());
		bookObj.setIsAvailable(book.getIsAvailable());

		Book save = bookrepo.save(bookObj);

		return save;
	}

	@Override
	public String deleteBookById(int id) {
	    Optional<Book> bookOpt = bookrepo.findById(id);

	    if (bookOpt.isPresent()) {
	        bookrepo.deleteById(id);
	        return "Successfully deleted book with id " + id;
	    } else {
	        return "Book not found with id " + id;
	    }
	}


}
