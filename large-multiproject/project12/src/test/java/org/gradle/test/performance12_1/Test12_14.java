package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_14 {
    private final Production12_14 production = new Production12_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}