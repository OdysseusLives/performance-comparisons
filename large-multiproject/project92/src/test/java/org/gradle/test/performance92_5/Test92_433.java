package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_433 {
    private final Production92_433 production = new Production92_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}