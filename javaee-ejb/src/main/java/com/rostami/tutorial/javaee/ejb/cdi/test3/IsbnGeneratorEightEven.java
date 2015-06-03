/**
 * 
 */
package com.rostami.tutorial.javaee.ejb.cdi.test3;

import java.util.Random;

import com.rostami.tutorial.javaee.ejb.cdi.test1.NumberGenerator;
import com.rostami.tutorial.javaee.ejb.cdi.test3.NumberOfDigits.Digits;

/**
 * @author Alireza
 *
 */
@Even @NumberOfDigits(odd = false, value = Digits.EIGHT)
public class IsbnGeneratorEightEven implements NumberGenerator {

	/* (non-Javadoc)
	 * @see com.rostami.tutorial.javaee.ejb.cdi.test1.NumberGenerator#generateNumber()
	 */
	@Override
	public String generateNumber() {
		return "8-" + Math.abs(new Random().nextInt())+"-even";
	}

}
