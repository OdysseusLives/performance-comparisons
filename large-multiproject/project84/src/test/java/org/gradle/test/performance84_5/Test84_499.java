package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_499 {
    private final Production84_499 production = new Production84_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}