package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_124 {
    private final Production21_124 production = new Production21_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}