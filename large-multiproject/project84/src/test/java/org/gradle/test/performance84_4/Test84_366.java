package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_366 {
    private final Production84_366 production = new Production84_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}