package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_491 {
    private final Production83_491 production = new Production83_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}