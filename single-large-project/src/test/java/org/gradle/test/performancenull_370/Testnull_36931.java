package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36931 {
    private final Productionnull_36931 production = new Productionnull_36931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}