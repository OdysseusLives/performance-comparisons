package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5085 {
    private final Productionnull_5085 production = new Productionnull_5085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}