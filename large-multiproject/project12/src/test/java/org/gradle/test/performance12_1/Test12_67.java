package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_67 {
    private final Production12_67 production = new Production12_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}