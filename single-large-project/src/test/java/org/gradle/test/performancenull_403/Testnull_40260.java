package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40260 {
    private final Productionnull_40260 production = new Productionnull_40260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}