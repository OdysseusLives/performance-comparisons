package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_40 {
    private final Production54_40 production = new Production54_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}