package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_402 {
    private final Production40_402 production = new Production40_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}