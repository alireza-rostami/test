/**
 * 
 */
package com.rostami.tutorial.javaee.ejb.cdi.test4;

import javax.inject.Inject;

import com.rostami.tutorial.javaee.ejb.cdi.test1.NumberGenerator;

/**
 * @author Alireza
 *
 */
@ProducesThirteenDigits
public class IsbnGenerator implements NumberGenerator {

	@Inject @ProducesThirteenDigits
	private String prefix;
	@Inject @ProducesThirteenDigits
	private int editorNumber;
	@Inject @Randoms
	private double postfix;
	
	/* (non-Javadoc)
	 * @see com.rostami.tutorial.javaee.ejb.cdi.test1.NumberGenerator#generateNumber()
	 */
	@Override
	public String generateNumber() {
		return prefix + String.valueOf(editorNumber) + postfix;
	}

}
