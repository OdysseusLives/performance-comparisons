package org.gradle.test.performancenull_389;

import static org.junit.Assert.*;

public class Testnull_38869 {
    private final Productionnull_38869 production = new Productionnull_38869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}