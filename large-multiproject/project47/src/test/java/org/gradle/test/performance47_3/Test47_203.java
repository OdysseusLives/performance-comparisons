package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_203 {
    private final Production47_203 production = new Production47_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}