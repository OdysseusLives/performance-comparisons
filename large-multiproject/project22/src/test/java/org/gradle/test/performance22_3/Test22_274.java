package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_274 {
    private final Production22_274 production = new Production22_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}