package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_417 {
    private final Production54_417 production = new Production54_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}