package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_311 {
    private final Production58_311 production = new Production58_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}