package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6070 {
    private final Productionnull_6070 production = new Productionnull_6070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}