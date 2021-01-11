package org.example;

import java.math.BigDecimal;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        OutputThread t1 = new OutputThread();
        OutputThread t2 = new OutputThread();
        t1.start();
        t2.start();
        System.out.println("hello ");
        BigDecimal first = new BigDecimal("12.45678951");
        BigDecimal second = new BigDecimal("265.32615695496");
        first.add(second);
    }

}
