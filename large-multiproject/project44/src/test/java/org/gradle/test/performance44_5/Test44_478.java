package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_478 {
    private final Production44_478 production = new Production44_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}