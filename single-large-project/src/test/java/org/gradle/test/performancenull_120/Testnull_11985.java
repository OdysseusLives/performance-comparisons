package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11985 {
    private final Productionnull_11985 production = new Productionnull_11985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}