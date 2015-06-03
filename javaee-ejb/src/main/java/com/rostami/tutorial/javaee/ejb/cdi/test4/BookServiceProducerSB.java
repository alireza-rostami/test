/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rostami.tutorial.javaee.ejb.cdi.test4;

import com.rostami.tutorial.javaee.ejb.cdi.test1.Book;
import com.rostami.tutorial.javaee.ejb.cdi.test1.NumberGenerator;
import com.rostami.tutorial.javaee.ejb.log.Loggable;
import com.rostami.tutorial.javaee.interfaces.BookServiceIF;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alireza
 */
@Stateless(mappedName = "bookServiceSBProducer")
public class BookServiceProducerSB implements BookServiceIF {

    @Inject @ProducesThirteenDigits 
    private NumberGenerator numberGenerator;
    @Inject 
    private Logger logger;
    
    @Override
    public void run() {
    }

    @Loggable
    public Book createBook(String title, Float price, String description) {
		Book book = new Book(title, price, description);
                logger.info("Generated ISBN : " + numberGenerator.generateNumber());
		book.setIsbn(numberGenerator.generateNumber());
		return book;
	}
    @Override
    public String getResult() {
        Book book = createBook("My Book's title bookServiceSBProducer", Float.valueOf(110), "First book");
        logger.severe(book.toString());
		return book.toString();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
