package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42835 {
    private final Productionnull_42835 production = new Productionnull_42835("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}