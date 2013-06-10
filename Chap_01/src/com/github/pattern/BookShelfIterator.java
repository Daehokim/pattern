package com.github.pattern;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {
	private BookShelf shelf;
	private int index;

	public BookShelfIterator(BookShelf shelf) {
		this.shelf = shelf;
		index = 0;
	}
	@Override
	public boolean hasNext() {		
		// TODO Auto-generated method stub
		if(index < shelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Book next() {
		// TODO Auto-generated method stub
		return shelf.getBook(index++);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		shelf.remove();
	}
}
