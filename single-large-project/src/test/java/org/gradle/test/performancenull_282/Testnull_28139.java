package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28139 {
    private final Productionnull_28139 production = new Productionnull_28139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}