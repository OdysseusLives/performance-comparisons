package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_256 {
    private final Production43_256 production = new Production43_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}