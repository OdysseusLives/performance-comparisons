package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_422 {
    private final Production75_422 production = new Production75_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}