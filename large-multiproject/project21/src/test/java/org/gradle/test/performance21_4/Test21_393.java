package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_393 {
    private final Production21_393 production = new Production21_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}