package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21159 {
    private final Productionnull_21159 production = new Productionnull_21159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}