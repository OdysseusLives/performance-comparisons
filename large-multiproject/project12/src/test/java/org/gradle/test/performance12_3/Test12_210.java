package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_210 {
    private final Production12_210 production = new Production12_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}