package org.example;

import java.math.BigDecimal;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        BigDecimal first = new BigDecimal("12.45678951");
        BigDecimal second = new BigDecimal("265.32615695496");
        first.add(second);
    }

}
