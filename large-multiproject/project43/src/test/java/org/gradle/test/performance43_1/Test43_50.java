package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_50 {
    private final Production43_50 production = new Production43_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}