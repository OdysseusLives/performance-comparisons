package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30951 {
    private final Productionnull_30951 production = new Productionnull_30951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}