package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_362 {
    private final Production86_362 production = new Production86_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}