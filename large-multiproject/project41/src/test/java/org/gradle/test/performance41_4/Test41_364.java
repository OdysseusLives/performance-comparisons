package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_364 {
    private final Production41_364 production = new Production41_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}