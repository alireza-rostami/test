package com.rostami.tutorial.javaee.ejb.cdi.test1;

import java.util.Date;

public class Book {
	private String title;
	private Float price;
	private String description;
	private String isbn;
	private Date instanciationDate;
	

	/**
	 * 
	 * @param title
	 * @param price
	 * @param description
	 */
	public Book(String title, Float price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}

	// ======================================
	// = Getters & Setters =
	// ======================================

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setInstanciationDate(Date instanciationDate) {
		this.instanciationDate = instanciationDate;
	}

	public Date getInstanciationDate() {
		return instanciationDate;
	}

	// ======================================
	// = hash, equals, toString =
	// ======================================

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Book");
		sb.append(", title='").append(title).append('\'');
		sb.append(", price=").append(price);
		sb.append(", description='").append(description).append('\'');
		sb.append(", isbn='").append(isbn).append('\'');
		sb.append('}');
		return sb.toString();
	}

}
