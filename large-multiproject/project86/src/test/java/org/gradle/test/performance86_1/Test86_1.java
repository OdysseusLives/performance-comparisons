package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_1 {
    private final Production86_1 production = new Production86_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}