package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_423 {
    private final Production25_423 production = new Production25_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}