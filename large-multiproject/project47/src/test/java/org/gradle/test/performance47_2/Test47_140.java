package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_140 {
    private final Production47_140 production = new Production47_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}