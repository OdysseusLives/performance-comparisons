package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_213 {
    private final Production32_213 production = new Production32_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}