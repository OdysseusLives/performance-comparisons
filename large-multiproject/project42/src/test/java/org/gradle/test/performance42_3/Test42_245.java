package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_245 {
    private final Production42_245 production = new Production42_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}