package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28471 {
    private final Productionnull_28471 production = new Productionnull_28471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}