package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2363 {
    private final Productionnull_2363 production = new Productionnull_2363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}