package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49944 {
    private final Productionnull_49944 production = new Productionnull_49944("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}