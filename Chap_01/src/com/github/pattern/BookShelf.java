package com.github.pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Aggregate {
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public int getLength() {
		// TODO Auto-generated method stub
		return bookList.size();
	}

	public Book getBook(int i) {
		// TODO Auto-generated method stub
		return bookList.get(i);
	}

	public void remove() {
		bookList.remove(bookList.size() - 1);
		// TODO Auto-generated method stub
		
	}
}
