package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_439 {
    private final Production47_439 production = new Production47_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}