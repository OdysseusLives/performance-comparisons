package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_284 {
    private final Production98_284 production = new Production98_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}