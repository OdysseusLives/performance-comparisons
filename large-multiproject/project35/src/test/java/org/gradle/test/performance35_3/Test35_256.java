package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_256 {
    private final Production35_256 production = new Production35_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}