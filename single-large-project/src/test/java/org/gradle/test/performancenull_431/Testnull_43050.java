package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43050 {
    private final Productionnull_43050 production = new Productionnull_43050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}