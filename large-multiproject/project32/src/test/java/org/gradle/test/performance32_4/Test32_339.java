package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_339 {
    private final Production32_339 production = new Production32_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}