package org.gradle.test.performancenull_410;

import static org.junit.Assert.*;

public class Testnull_40942 {
    private final Productionnull_40942 production = new Productionnull_40942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}