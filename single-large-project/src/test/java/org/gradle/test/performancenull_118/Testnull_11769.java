package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11769 {
    private final Productionnull_11769 production = new Productionnull_11769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}