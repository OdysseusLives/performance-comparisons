package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_346 {
    private final Production12_346 production = new Production12_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}