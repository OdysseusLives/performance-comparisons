package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_481 {
    private final Production80_481 production = new Production80_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}