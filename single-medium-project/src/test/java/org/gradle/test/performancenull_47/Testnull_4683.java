package org.gradle.test.performancenull_47;

import static org.junit.Assert.*;

public class Testnull_4683 {
    private final Productionnull_4683 production = new Productionnull_4683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}