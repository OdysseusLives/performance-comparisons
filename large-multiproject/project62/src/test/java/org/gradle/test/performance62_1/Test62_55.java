package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_55 {
    private final Production62_55 production = new Production62_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}