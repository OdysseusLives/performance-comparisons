package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33072 {
    private final Productionnull_33072 production = new Productionnull_33072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}