package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36972 {
    private final Productionnull_36972 production = new Productionnull_36972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}