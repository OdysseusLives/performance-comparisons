package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_322 {
    private final Production21_322 production = new Production21_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}