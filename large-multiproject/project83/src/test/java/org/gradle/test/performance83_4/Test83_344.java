package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_344 {
    private final Production83_344 production = new Production83_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}