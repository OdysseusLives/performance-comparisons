package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42806 {
    private final Productionnull_42806 production = new Productionnull_42806("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}