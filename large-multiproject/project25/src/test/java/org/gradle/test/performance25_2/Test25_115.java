package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_115 {
    private final Production25_115 production = new Production25_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}