package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_433 {
    private final Production18_433 production = new Production18_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}