package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_160 {
    private final Production47_160 production = new Production47_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}