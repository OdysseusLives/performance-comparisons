package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_419 {
    private final Production32_419 production = new Production32_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}