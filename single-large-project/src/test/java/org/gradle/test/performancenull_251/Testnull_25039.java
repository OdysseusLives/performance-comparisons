package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25039 {
    private final Productionnull_25039 production = new Productionnull_25039("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}