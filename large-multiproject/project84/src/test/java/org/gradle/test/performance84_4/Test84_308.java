package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_308 {
    private final Production84_308 production = new Production84_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}