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
public class Main {
    public static void main(String [] args) {
        Sleepy body = new SleepyImpl();
        body.sleep();
        body.ask();
        body.wakeUp();
        body.ask();
    }
}
