package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37255 {
    private final Productionnull_37255 production = new Productionnull_37255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}