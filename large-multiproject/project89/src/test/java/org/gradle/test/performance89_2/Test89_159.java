package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_159 {
    private final Production89_159 production = new Production89_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}