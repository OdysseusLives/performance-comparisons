package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_110 {
    private final Production48_110 production = new Production48_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}