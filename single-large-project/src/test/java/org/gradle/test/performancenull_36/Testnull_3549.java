package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3549 {
    private final Productionnull_3549 production = new Productionnull_3549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}