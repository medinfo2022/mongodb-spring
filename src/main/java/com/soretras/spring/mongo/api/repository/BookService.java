package com.soretras.spring.mongo.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soretras.spring.mongo.api.model.Book;

@Service
public class BookService {

	@Autowired
	BookRepository bookRep;
	
	public Book save(Book book) {
		
		return bookRep.insert(book);
	}
}
