package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49431 {
    private final Productionnull_49431 production = new Productionnull_49431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}