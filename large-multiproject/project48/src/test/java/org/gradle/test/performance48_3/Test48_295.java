package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_295 {
    private final Production48_295 production = new Production48_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}