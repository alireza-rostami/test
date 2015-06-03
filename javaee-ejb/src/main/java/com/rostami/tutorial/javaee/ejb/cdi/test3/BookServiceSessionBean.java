package com.rostami.tutorial.javaee.ejb.cdi.test3;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.rostami.tutorial.javaee.ejb.cdi.test1.Book;
import com.rostami.tutorial.javaee.ejb.cdi.test1.NumberGenerator;
import com.rostami.tutorial.javaee.ejb.cdi.test3.NumberOfDigits.Digits;
import com.rostami.tutorial.javaee.interfaces.BookServiceIF;

/**
 * @author Alireza
 *
 */
@Stateless(mappedName = "bookServiceSB23MultiQualifier")
public class BookServiceSessionBean implements BookServiceIF {

	@Inject @Even @NumberOfDigits(odd = false, value = Digits.EIGHT) private NumberGenerator numberGenerator;
	

	public Book createBook(String title, Float price, String description) {
		Book book = new Book(title, price, description);
		book.setIsbn(numberGenerator.generateNumber());
		return book;
	}
    /**
     * Default constructor. 
     */
    public BookServiceSessionBean() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see BookServiceIF#run()
     */
    public void run() {
        // TODO Auto-generated method stub
    }
	@Override
	public String getResult() {
		Book book = createBook("My Book's title", Float.valueOf(110), "First book");
		return book.toString();
	}

}