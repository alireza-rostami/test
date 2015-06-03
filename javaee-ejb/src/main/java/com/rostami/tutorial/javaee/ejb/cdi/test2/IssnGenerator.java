/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rostami.tutorial.javaee.ejb.cdi.test2;

import com.rostami.tutorial.javaee.ejb.cdi.test1.NumberGenerator;
import java.util.Random;

/**
 *
 * @author Alireza
 */
@EightDigits
public class IssnGenerator implements NumberGenerator {

    @Override
    public String generateNumber() {
        return "8-" + Math.abs(new Random().nextInt());
    }
}
