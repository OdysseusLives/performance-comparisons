package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_260 {
    private final Production54_260 production = new Production54_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}