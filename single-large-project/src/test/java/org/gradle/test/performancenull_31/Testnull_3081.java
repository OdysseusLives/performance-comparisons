package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3081 {
    private final Productionnull_3081 production = new Productionnull_3081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}