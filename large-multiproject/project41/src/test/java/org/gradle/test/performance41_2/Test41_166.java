package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_166 {
    private final Production41_166 production = new Production41_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}