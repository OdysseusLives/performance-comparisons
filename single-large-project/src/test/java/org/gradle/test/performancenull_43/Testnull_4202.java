package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4202 {
    private final Productionnull_4202 production = new Productionnull_4202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}