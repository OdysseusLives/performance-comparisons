package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4162 {
    private final Productionnull_4162 production = new Productionnull_4162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}