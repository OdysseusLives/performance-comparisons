package org.gradle.test.performancenull_326;

import static org.junit.Assert.*;

public class Testnull_32563 {
    private final Productionnull_32563 production = new Productionnull_32563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}