package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22445 {
    private final Productionnull_22445 production = new Productionnull_22445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}