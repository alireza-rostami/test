package com.rostami.tutorial.javaee.ejb.cdi.test3;

import com.rostami.tutorial.javaee.ejb.cdi.test1.Book;
import com.rostami.tutorial.javaee.ejb.cdi.test1.NumberGenerator;
import com.rostami.tutorial.javaee.ejb.cdi.test3.NumberOfDigits.Digits;
import com.rostami.tutorial.javaee.interfaces.BookServiceIF;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Session Bean implementation class BookServiceSB
 */
@Stateless(mappedName = "bookServiceSBMultiQualifiers")
public class BookServiceSB implements BookServiceIF {

	@Inject @Even @NumberOfDigits(odd = false, value = Digits.EIGHT) 
	private NumberGenerator numberGenerator;
    /**
     * Default constructor. 
     */
    public BookServiceSB() {
        // TODO Auto-generated constructor stub
    }

    public Book createBook(String title, Float price, String description) {
		Book book = new Book(title, price, description);
		book.setIsbn(numberGenerator.generateNumber());
		return book;
	}
    
	/**
     * @see BookServiceIF#getResult()
     */
    @Override
	public String getResult() {
		Book book = createBook("My Book's title", Float.valueOf(110), "First book");
		return book.toString();
	}

	/**
     * @see BookServiceIF#run()
     */
    public void run() {
        // TODO Auto-generated method stub
    }

}
