package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_403 {
    private final Production32_403 production = new Production32_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}