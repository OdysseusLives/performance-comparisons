package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21346 {
    private final Productionnull_21346 production = new Productionnull_21346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}