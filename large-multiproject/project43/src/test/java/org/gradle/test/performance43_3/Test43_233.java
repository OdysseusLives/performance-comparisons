package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_233 {
    private final Production43_233 production = new Production43_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}