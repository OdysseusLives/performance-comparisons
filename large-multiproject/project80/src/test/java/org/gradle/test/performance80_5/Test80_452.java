package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_452 {
    private final Production80_452 production = new Production80_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}