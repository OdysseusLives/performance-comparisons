package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13299 {
    private final Productionnull_13299 production = new Productionnull_13299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}