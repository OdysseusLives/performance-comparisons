package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_271 {
    private final Production12_271 production = new Production12_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}