package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_88 {
    private final Production41_88 production = new Production41_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}