package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_478 {
    private final Production43_478 production = new Production43_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}