package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47266 {
    private final Productionnull_47266 production = new Productionnull_47266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}