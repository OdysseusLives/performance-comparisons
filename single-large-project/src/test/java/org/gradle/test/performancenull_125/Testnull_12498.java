package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12498 {
    private final Productionnull_12498 production = new Productionnull_12498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}