package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49468 {
    private final Productionnull_49468 production = new Productionnull_49468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}