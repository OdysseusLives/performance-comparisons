package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41003 {
    private final Productionnull_41003 production = new Productionnull_41003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}