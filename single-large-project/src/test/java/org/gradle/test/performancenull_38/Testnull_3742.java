package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3742 {
    private final Productionnull_3742 production = new Productionnull_3742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}