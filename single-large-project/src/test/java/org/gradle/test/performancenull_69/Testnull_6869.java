package org.gradle.test.performancenull_69;

import static org.junit.Assert.*;

public class Testnull_6869 {
    private final Productionnull_6869 production = new Productionnull_6869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}