package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_125 {
    private final Production16_125 production = new Production16_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}