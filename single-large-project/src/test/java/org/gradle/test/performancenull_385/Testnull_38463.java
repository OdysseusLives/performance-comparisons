package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38463 {
    private final Productionnull_38463 production = new Productionnull_38463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}