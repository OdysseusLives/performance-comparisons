package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41402 {
    private final Productionnull_41402 production = new Productionnull_41402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}