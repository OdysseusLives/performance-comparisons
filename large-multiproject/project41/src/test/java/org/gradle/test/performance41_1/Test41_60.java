package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_60 {
    private final Production41_60 production = new Production41_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}