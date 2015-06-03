/**
 * 
 */
package com.rostami.tutorial.javaee.interfaces;

import javax.ejb.Remote;

/**
 * @author Alireza
 *
 */
@Remote
public interface GetAndPutIF {
	
	public void put(String put);
	public String get();
	public void run();

}
