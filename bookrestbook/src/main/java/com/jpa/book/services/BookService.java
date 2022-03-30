package com.jpa.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.book.books.Books;
import com.jpa.book.dao.BookRepo;


@Component
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	//private static List<Books> list= new ArrayList<>();
//	
//	static {
//		list.add(new Books(12,"Java Complete Reference","xyz"));
//		list.add(new Books(13,"Head First To Java","abc"));
//		list.add(new Books(14,"Think In Java","dom"));
//	}
	//get all books
	public List<Books> getAllBooks()
	{
		List<Books> list=(List<Books>) this.bookRepo.findAll();
		return list;
		
	}
	//get single book by id
	 public Books getBookById(int id)
	 {
		 Books book=null;
		// book=list.stream().filter(e->e.getId()==id).findFirst().get();
		 this.bookRepo.findById(id);
		 return book;
	 }
	 
	 //adding the book
	 public Books addBook(Books b)
	 {
		this.bookRepo.save(b);
		 //list.add(b);
		 return b;
	 }
	 
	 //delete books
	 public void deleteBook(int bid)
	 {
		 
		 
		 bookRepo.deleteById(bid);
//		list= list.stream().filter(book->{
//			 if(book.getId()!=bid)
//			 {
//				 return true;
//			 }else {
//				  return false;
//			 }
//		 }).collect(Collectors.toList());
	 }
	 
	public void updateBook(Books book,int bookId) {
		book.setId(bookId);
		bookRepo.save(book);
		
	}

}
