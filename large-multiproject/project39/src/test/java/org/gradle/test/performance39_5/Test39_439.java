package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_439 {
    private final Production39_439 production = new Production39_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}