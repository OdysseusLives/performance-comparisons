package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31441 {
    private final Productionnull_31441 production = new Productionnull_31441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}