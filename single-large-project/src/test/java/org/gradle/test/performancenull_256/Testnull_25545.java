package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25545 {
    private final Productionnull_25545 production = new Productionnull_25545("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}