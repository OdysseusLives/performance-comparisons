package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_132 {
    private final Production26_132 production = new Production26_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}