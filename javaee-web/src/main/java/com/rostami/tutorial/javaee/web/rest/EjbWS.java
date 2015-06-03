/**
 *
 */
package com.rostami.tutorial.javaee.web.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rostami.tutorial.javaee.interfaces.GetAndPutIF;
import com.rostami.tutorial.javaee.interfaces.BookServiceIF;
import com.rostami.tutorial.javaee.interfaces.myTest.GreetingServiceSBInterface;

/**
 * @author Alireza
 *
 */
@Path("ejbWS")
@RequestScoped
public class EjbWS {

    @EJB
    private GetAndPutIF getAndPut;
	//@EJB(mappedName="bookServiceDefaultSessionBean") private BookServiceIF bookService;
    //@EJB(mappedName="bookServiceSessionBean2_2Qualifier") private BookServiceIF bookService;
    //@EJB(mappedName="bookServiceSBMultiQualifiers") private BookServiceIF bookService;
    @EJB(mappedName = "bookServiceSBProducer")
    private BookServiceIF bookService;

    @EJB (mappedName = "greetingService") GreetingServiceSBInterface greetingServiceSB;
    
    public EjbWS() {
    }

    public void run() {
        getAndPut.put("Hi from rest");
        getAndPut.run();
    }

    @Path("testXml")
    @GET
    @Produces(MediaType.APPLICATION_XML)//@Produces("application/xml")
    public String getXml() {
        getAndPut.put("Hi from rest");
        getAndPut.run();
        return "This is a test from Grouper RESTful! " + getAndPut.get();
    }

    @Path("getBook")
    @GET
    @Produces(MediaType.APPLICATION_XML)//@Produces("application/xml")
    public String getBookResult() {
        return bookService.getResult();
    }
    
    @Path("getGreeting")
    @GET
    @Produces(MediaType.APPLICATION_XML)//@Produces("application/xml")
    public String getGreeting() {
        return greetingServiceSB.getGreetingMsg();
    }

}
