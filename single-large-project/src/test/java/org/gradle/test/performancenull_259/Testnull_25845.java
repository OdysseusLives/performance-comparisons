package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25845 {
    private final Productionnull_25845 production = new Productionnull_25845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}