package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_53 {
    private final Production58_53 production = new Production58_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}