package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_96 {
    private final Production12_96 production = new Production12_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}