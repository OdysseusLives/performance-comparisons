package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_56 {
    private final Production86_56 production = new Production86_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}