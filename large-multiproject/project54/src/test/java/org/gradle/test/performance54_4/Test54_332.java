package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_332 {
    private final Production54_332 production = new Production54_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}