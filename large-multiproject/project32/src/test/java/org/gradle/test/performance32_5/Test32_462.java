package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_462 {
    private final Production32_462 production = new Production32_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}