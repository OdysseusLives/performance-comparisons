package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20246 {
    private final Productionnull_20246 production = new Productionnull_20246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}