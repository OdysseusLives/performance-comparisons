package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41243 {
    private final Productionnull_41243 production = new Productionnull_41243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}