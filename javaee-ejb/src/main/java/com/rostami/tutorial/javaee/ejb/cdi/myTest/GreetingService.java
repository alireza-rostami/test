/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rostami.tutorial.javaee.ejb.cdi.myTest;

import com.rostami.tutorial.javaee.ejb.log.Loggable;
import com.rostami.tutorial.javaee.interfaces.myTest.GreetingServiceSBInterface;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alireza
 */
@Stateless (mappedName = "greetingService")
@Loggable
public class GreetingService implements GreetingServiceSBInterface{
    
    @Inject GreetingIF greeting;

    @Inject Logger logger;
    @Override
    public String getGreetingMsg() {
        logger.info("message from sb: "+greeting.sayHello());
        return greeting.sayHello();
    }
    
    
    
}
