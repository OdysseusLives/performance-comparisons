package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25217 {
    private final Productionnull_25217 production = new Productionnull_25217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}