package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1702 {
    private final Productionnull_1702 production = new Productionnull_1702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}