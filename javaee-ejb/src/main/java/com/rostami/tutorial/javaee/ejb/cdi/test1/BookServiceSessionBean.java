package com.rostami.tutorial.javaee.ejb.cdi.test1;

import com.rostami.tutorial.javaee.interfaces.BookServiceIF;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Session Bean implementation class RunBookSessionBean
 */
@Stateless(mappedName = "bookServiceDefaultSessionBean")
public class BookServiceSessionBean implements BookServiceIF {

	@Inject private NumberGenerator numberGenerator;
	

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
