package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18876 {
    private final Productionnull_18876 production = new Productionnull_18876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}