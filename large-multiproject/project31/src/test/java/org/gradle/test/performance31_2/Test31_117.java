package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_117 {
    private final Production31_117 production = new Production31_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}