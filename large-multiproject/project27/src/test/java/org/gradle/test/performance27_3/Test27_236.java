package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_236 {
    private final Production27_236 production = new Production27_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}