package com.mycompany.sleep;

/**
 * класс реализующий интерфейс описанный в задании
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
