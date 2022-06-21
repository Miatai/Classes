package com.training.classes.simpleclasses.task9;

import java.util.HashSet;
import java.util.Set;

// 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
//Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
//Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.
public class Book {
	private String name;
	private Set<String> authors = new HashSet<>();
	private String publishingHouse;
	private int publishingYear;
	private int numberOfPages;
	private double price;
	private String bindingType;

	public Book(String name, Set<String> authors, String publichingHouse, int publishingYear, int numberOfPages,
			double price, String bindingType) {
		super();
		this.name = name;
		this.authors = authors;
		this.publishingHouse = publichingHouse;
		this.publishingYear = publishingYear;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public Book() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getAuthors() {
		return new HashSet<>(authors);
	}

	public void setAuthors(Set<String> authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publichingHouse) {
		this.publishingHouse = publichingHouse;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + authors + ", publishingHouse=" + publishingHouse
				+ ", publishingYear=" + publishingYear + ", numberOfPages=" + numberOfPages + ", price=" + price
				+ ", bindingType=" + bindingType + "]\n";
	}

}
