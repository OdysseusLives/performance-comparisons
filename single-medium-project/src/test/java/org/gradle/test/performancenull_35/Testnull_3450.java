package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3450 {
    private final Productionnull_3450 production = new Productionnull_3450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}