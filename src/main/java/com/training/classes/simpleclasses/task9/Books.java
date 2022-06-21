package com.training.classes.simpleclasses.task9;

import java.util.ArrayList;
import java.util.List;

public class Books {

	private List<Book> books = new ArrayList<>();

	public Books(List<Book> books) {
		this.books = books;
	}

	public Books() {}

	public List<Book> getBooks() {
		return new ArrayList<>(books);
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBookByIndex(int index) {
		books.remove(index);
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return " " + books.toString();
	}

	public Books getBooksByAuthor(String author) {
		Books result = new Books();
		for (Book book : books) {
			if (book.getAuthors().contains(author)) {
				result.addBook(book);
			}
		}
		return result;
	}

	public Books getBooksByPublishingHouse(String publihingHouse) {
		Books result = new Books();
		for (Book book : books) {
			if (book.getPublishingHouse().equals(publihingHouse)) {
				result.addBook(book);
			}
		}
		return result;
	}

	public Books getBooksAfterSpecifiedYear(int year) {
		Books result = new Books();
		for (Book book : books) {
			if (book.getPublishingYear() > year) {
				result.addBook(book);
			}
		}
		return result;
	}

}
