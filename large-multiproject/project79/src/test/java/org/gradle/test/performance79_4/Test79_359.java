package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_359 {
    private final Production79_359 production = new Production79_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}