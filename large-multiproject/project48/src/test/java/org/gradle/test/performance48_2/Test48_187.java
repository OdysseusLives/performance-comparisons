package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_187 {
    private final Production48_187 production = new Production48_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}