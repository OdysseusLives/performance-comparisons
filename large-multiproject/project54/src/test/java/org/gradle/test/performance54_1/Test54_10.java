package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_10 {
    private final Production54_10 production = new Production54_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}