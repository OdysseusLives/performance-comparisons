package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35993 {
    private final Productionnull_35993 production = new Productionnull_35993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}