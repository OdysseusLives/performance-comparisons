package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23282 {
    private final Productionnull_23282 production = new Productionnull_23282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}