package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_430 {
    private final Production93_430 production = new Production93_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}