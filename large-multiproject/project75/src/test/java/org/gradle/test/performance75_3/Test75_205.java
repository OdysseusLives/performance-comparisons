package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_205 {
    private final Production75_205 production = new Production75_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}