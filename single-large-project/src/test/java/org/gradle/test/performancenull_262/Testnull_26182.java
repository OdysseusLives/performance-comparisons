package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26182 {
    private final Productionnull_26182 production = new Productionnull_26182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}