package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23496 {
    private final Productionnull_23496 production = new Productionnull_23496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}