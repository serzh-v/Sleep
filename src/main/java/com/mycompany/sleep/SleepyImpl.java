/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sleep;

/**
 *
 * @author Dell
 */
public class SleepyImpl implements Sleepy {
    
    boolean awake = false;
    
    public void sleep() {
        awake = false;
    }
    
    public void wakeUp() {
        awake = true;
    }
    
    public void ask() {
        if (awake) {
            System.out.println("BOO");
        }
        else { 
            System.out.println("zzz...");            
        }
    }

}
