package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_299 {
    private final Production18_299 production = new Production18_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}