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
public interface BookServiceIF {
	
	public void run();
	
	public String getResult();

}
