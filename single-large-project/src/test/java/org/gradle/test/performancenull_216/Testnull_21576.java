package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21576 {
    private final Productionnull_21576 production = new Productionnull_21576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}