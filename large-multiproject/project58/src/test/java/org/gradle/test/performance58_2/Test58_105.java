package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_105 {
    private final Production58_105 production = new Production58_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}