package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46064 {
    private final Productionnull_46064 production = new Productionnull_46064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}