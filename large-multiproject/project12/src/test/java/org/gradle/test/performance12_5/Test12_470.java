package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_470 {
    private final Production12_470 production = new Production12_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}