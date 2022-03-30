package com.jpa.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.book.books.Books;
import com.jpa.book.services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	//get all books handler
	@GetMapping("/books")
	public List<Books> getBooks() {

		return this.bookService.getAllBooks();
	}
	
	//get single books handler
	@GetMapping("/books/{id}")
	public Books getBook(@PathVariable ("id") int id)
	{
		return bookService.getBookById(id);
	}
	
	//create new books handler 
	@PostMapping("/books")
	public Books addBook(@RequestBody Books book) {
		
	Books b	=this.bookService.addBook(book);
		return b;
		
		
	}

	//delete book handler
	@DeleteMapping("books/{bookId}")
	public void deleteBook(@PathVariable ("bookId")int bookId)
	{
		this.bookService.deleteBook(bookId);
	}
}
