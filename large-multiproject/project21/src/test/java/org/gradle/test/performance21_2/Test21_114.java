package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_114 {
    private final Production21_114 production = new Production21_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}