package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_117 {
    private final Production79_117 production = new Production79_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}