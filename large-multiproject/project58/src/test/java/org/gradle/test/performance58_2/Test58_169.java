package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_169 {
    private final Production58_169 production = new Production58_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}