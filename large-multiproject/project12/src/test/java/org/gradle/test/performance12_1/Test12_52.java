package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_52 {
    private final Production12_52 production = new Production12_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}