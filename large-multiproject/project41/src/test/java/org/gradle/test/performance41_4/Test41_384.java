package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_384 {
    private final Production41_384 production = new Production41_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}