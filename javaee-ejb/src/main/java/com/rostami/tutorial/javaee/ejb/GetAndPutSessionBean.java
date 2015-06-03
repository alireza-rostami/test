package com.rostami.tutorial.javaee.ejb;

import com.rostami.tutorial.javaee.interfaces.GetAndPutIF;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Session Bean implementation class GetAndPutSessionBean
 */
@Stateless
@LocalBean
//@Remote(GetAndPutIF.class)
@WebService
public class GetAndPutSessionBean implements GetAndPutIF {
	
	private String text;

    /**
     * Default constructor. 
     */
    public GetAndPutSessionBean() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see GetAndPutIF#put(String)
     */
    public void put(String put) {
    	text = put;
    }

	/**
     * @see GetAndPutIF#get()
     */
    public String get() {
        // TODO Auto-generated method stub
			return text;
    }

	/**
     * @see GetAndPutIF#run()
     */
    public void run() {
        System.out.println(text);
    }

}
