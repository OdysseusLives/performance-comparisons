package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28083 {
    private final Productionnull_28083 production = new Productionnull_28083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}