package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_291 {
    private final Production37_291 production = new Production37_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}