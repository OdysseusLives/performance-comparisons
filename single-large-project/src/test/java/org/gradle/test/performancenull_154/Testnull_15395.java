package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15395 {
    private final Productionnull_15395 production = new Productionnull_15395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}