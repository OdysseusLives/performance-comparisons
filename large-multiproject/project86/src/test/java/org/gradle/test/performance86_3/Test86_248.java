package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_248 {
    private final Production86_248 production = new Production86_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}