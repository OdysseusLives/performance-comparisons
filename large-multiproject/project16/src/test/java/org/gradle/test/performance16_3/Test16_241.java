package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_241 {
    private final Production16_241 production = new Production16_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}