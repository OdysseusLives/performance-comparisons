package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23160 {
    private final Productionnull_23160 production = new Productionnull_23160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}