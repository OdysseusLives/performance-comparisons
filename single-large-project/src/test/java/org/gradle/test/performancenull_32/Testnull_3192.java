package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3192 {
    private final Productionnull_3192 production = new Productionnull_3192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}