package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34001 {
    private final Productionnull_34001 production = new Productionnull_34001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}