/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rostami.tutorial.javaee.interfaces.myTest;

import javax.ejb.Remote;

/**
 *
 * @author Alireza
 */
@Remote
public interface GreetingServiceSBInterface {
    
    public String getGreetingMsg();
    
}
