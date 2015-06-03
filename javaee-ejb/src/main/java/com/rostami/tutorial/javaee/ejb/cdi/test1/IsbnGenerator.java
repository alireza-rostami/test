/**
 * 
 */
package com.rostami.tutorial.javaee.ejb.cdi.test1;

import java.util.Random;

import javax.enterprise.inject.Default;

/**
 * @author Alireza
 *
 */
@Default
public class IsbnGenerator implements NumberGenerator {

	/* (non-Javadoc)
	 * @see com.rostami.tutorial.javaee.ejb.cdi.test1.NumberGenerator#generateNumber()
	 */
	@Override
	public String generateNumber() {
		return "13-84356-" + Math.abs(new Random().nextInt());
	}

}
