package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2309 {
    private final Productionnull_2309 production = new Productionnull_2309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}