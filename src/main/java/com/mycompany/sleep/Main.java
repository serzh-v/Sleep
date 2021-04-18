package com.mycompany.sleep;

/**
 * класс, в котором реализуются представленные методы
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
