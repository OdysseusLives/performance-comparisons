package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_75 {
    private final Production86_75 production = new Production86_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}