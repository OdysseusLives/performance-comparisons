package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_132 {
    private final Production31_132 production = new Production31_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}