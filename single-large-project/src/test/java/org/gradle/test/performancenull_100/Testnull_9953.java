package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9953 {
    private final Productionnull_9953 production = new Productionnull_9953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}