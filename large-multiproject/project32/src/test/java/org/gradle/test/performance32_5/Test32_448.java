package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_448 {
    private final Production32_448 production = new Production32_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}