package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23973 {
    private final Productionnull_23973 production = new Productionnull_23973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}