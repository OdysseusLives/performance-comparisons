package org.gradle.test.performancenull_145;

import static org.junit.Assert.*;

public class Testnull_14500 {
    private final Productionnull_14500 production = new Productionnull_14500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}