package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25428 {
    private final Productionnull_25428 production = new Productionnull_25428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}