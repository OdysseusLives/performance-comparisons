package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_446 {
    private final Production48_446 production = new Production48_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}