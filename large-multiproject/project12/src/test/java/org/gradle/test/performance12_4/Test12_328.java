package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_328 {
    private final Production12_328 production = new Production12_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}