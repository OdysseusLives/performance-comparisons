package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_141 {
    private final Production41_141 production = new Production41_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}