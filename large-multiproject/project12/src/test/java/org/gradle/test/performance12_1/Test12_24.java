package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_24 {
    private final Production12_24 production = new Production12_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}