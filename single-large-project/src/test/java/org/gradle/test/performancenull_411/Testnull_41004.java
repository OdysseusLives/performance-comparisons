package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41004 {
    private final Productionnull_41004 production = new Productionnull_41004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}