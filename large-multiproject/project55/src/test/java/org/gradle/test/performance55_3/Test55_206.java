package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_206 {
    private final Production55_206 production = new Production55_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}