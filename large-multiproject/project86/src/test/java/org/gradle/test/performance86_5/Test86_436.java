package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_436 {
    private final Production86_436 production = new Production86_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}