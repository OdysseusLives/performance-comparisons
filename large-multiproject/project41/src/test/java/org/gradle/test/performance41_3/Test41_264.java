package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_264 {
    private final Production41_264 production = new Production41_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}