package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_106 {
    private final Production21_106 production = new Production21_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}