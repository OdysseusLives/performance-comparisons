package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_359 {
    private final Production75_359 production = new Production75_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}