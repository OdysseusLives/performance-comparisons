package org.gradle.test.performancenull_254;

import static org.junit.Assert.*;

public class Testnull_25373 {
    private final Productionnull_25373 production = new Productionnull_25373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}