package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_418 {
    private final Production12_418 production = new Production12_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}