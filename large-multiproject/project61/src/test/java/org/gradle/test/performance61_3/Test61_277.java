package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_277 {
    private final Production61_277 production = new Production61_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}