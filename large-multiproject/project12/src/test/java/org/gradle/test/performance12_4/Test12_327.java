package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_327 {
    private final Production12_327 production = new Production12_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}