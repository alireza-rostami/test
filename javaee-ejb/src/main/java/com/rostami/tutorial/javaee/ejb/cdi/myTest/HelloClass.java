/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rostami.tutorial.javaee.ejb.cdi.myTest;

import com.rostami.tutorial.javaee.ejb.log.Loggable;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 *
 * @author Alireza
 */
public class HelloClass implements GreetingIF{

    private String message;
    @PostConstruct
    public void init(){
        message = "Hello. It is a message from ";
    }
    @Inject Logger logger;
    @Override
    @Loggable
    public String sayHello() {
        logger.fine("Message from hello class: "+ message+ HelloClass.class.getName());
        return message+ HelloClass.class.getName();
    }
    
}
