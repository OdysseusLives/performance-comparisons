package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_222 {
    private final Production48_222 production = new Production48_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}