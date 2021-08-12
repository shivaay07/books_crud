package com.duttech.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.duttech.mvc.models.Book;
import com.duttech.mvc.repositories.BookRepository;

@Service
public class BookService {

	//Adding the book Repository as a dependency
	
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
//	return all the books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

//	create a book
	
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
//	retrieve a book
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}
		else {
			return null;
		}
	}

	public void deleteBook(Long id){
		Optional<Book> optionalDelete = bookRepository.findById(id);
		if(optionalDelete.isPresent()) {
			 bookRepository.deleteById(id);
		}
	}
		
		

	public Book updateBook(Book book) {

		return bookRepository.save(book);
		
		
	}
	

}
