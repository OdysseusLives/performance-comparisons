package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41295 {
    private final Productionnull_41295 production = new Productionnull_41295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}