package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_473 {
    private final Production41_473 production = new Production41_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}