package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_279 {
    private final Production48_279 production = new Production48_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}