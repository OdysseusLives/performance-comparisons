package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22005 {
    private final Productionnull_22005 production = new Productionnull_22005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}