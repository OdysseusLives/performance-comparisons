package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_462 {
    private final Production75_462 production = new Production75_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}