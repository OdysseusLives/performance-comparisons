package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_194 {
    private final Production48_194 production = new Production48_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}