package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1488 {
    private final Productionnull_1488 production = new Productionnull_1488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}