package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	
	private BookRepository bookrepo;

	public void setBookRepository(BookRepository bookrepo) {
		this.bookrepo = bookrepo;
		System.out.println("setter method for bookrepo");
	}

	@Override
	public String toString() {
		return "BookService [bookrepo=" + bookrepo + "]";
	}
}
