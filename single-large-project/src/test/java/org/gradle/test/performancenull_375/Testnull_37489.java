package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37489 {
    private final Productionnull_37489 production = new Productionnull_37489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}