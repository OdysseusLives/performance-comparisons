package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18059 {
    private final Productionnull_18059 production = new Productionnull_18059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}