package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_377 {
    private final Production32_377 production = new Production32_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}