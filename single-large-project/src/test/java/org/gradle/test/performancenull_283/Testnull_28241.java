package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28241 {
    private final Productionnull_28241 production = new Productionnull_28241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}