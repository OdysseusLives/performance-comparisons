package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_280 {
    private final Production21_280 production = new Production21_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}