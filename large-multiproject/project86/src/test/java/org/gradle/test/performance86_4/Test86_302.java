package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_302 {
    private final Production86_302 production = new Production86_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}