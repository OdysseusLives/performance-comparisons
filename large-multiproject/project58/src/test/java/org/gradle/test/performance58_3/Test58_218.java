package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_218 {
    private final Production58_218 production = new Production58_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}