package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_148 {
    private final Production67_148 production = new Production67_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}