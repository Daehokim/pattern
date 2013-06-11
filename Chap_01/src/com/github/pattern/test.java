package com.github.pattern;

import java.util.Iterator;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf shelf = new BookShelf();
		shelf.addBook(new Book("Test:1"));
		shelf.addBook(new Book("Test:2"));
		shelf.addBook(new Book("Test:3"));
		shelf.addBook(new Book("Test:4"));
		
		Iterator iter = shelf.getIterator();
		
		while(iter.hasNext()) {
			Book book = (Book)iter.next();
			System.out.println(book.getName());
		}
				
	}

}
