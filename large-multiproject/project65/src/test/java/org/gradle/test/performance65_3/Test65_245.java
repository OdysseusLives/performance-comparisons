package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_245 {
    private final Production65_245 production = new Production65_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}