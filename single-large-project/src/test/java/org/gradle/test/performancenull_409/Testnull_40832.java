package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40832 {
    private final Productionnull_40832 production = new Productionnull_40832("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}