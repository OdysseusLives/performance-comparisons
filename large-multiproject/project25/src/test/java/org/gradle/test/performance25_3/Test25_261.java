package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_261 {
    private final Production25_261 production = new Production25_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}