package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12004 {
    private final Productionnull_12004 production = new Productionnull_12004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}