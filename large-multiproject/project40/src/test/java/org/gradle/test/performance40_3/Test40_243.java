package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_243 {
    private final Production40_243 production = new Production40_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}