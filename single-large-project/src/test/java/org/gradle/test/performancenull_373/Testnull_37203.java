package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37203 {
    private final Productionnull_37203 production = new Productionnull_37203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}