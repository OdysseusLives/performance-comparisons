package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1461 {
    private final Productionnull_1461 production = new Productionnull_1461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}