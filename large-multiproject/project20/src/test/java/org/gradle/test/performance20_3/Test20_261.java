package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_261 {
    private final Production20_261 production = new Production20_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}