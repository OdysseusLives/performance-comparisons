package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_194 {
    private final Production62_194 production = new Production62_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}