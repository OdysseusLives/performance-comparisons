package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_245 {
    private final Production22_245 production = new Production22_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}