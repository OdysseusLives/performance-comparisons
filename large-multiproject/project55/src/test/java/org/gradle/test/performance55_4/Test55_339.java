package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_339 {
    private final Production55_339 production = new Production55_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}