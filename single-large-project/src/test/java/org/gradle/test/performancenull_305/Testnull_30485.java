package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30485 {
    private final Productionnull_30485 production = new Productionnull_30485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}