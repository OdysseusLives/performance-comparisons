package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3059 {
    private final Productionnull_3059 production = new Productionnull_3059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}