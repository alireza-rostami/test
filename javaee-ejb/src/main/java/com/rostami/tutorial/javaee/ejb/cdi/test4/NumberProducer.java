/**
 * 
 */
package com.rostami.tutorial.javaee.ejb.cdi.test4;

import javax.enterprise.inject.Produces;

import java.util.Random;

/**
 * @author Alireza
 *
 */
public class NumberProducer {

	@Produces
	@ProducesThirteenDigits
	private final String prefix13Digits = "13-";

	@Produces
	@ProducesThirteenDigits
	private final int editorNumber = 84356;

	@Produces
	@Randoms
	public double randoms() {
		return Math.abs(new Random().nextInt());
	}

}
