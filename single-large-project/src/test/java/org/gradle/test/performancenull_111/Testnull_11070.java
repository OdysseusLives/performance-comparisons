package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11070 {
    private final Productionnull_11070 production = new Productionnull_11070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}