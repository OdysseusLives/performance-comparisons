package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34923 {
    private final Productionnull_34923 production = new Productionnull_34923("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}