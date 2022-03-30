package com.jpa.book.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.book.books.Books;

public interface BookRepo extends CrudRepository <Books,Integer> {
	public Books findById(int id);
	 

}
