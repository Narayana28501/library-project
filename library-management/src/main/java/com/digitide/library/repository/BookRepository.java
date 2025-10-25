package com.digitide.library.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digitide.library.entity.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{
	
	 // 🔹 CREATE or UPDATE
    @Override
    <S extends Book> S save(S entity);

    @Override
    <S extends Book> Iterable<S> saveAll(Iterable<S> entities);

    // 🔹 READ
    @Override
    Optional<Book> findById(Integer id);

    @Override
    Iterable<Book> findAll();

    @Override
    Iterable<Book> findAllById(Iterable<Integer> ids);

    // 🔹 COUNT
    @Override
    long count();

    // 🔹 DELETE
    @Override
    void deleteById(Integer id);

    @Override
    void delete(Book entity);

    @Override
    void deleteAllById(Iterable<? extends Integer> ids);

    @Override
    void deleteAll(Iterable<? extends Book> entities);

    @Override
    void deleteAll();

    // 🔹 CUSTOM QUERY METHOD (optional)
    Book findByBookId(int bookId);   // Find by custom field name

  
}
