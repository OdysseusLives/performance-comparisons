package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_55 {
    private final Production89_55 production = new Production89_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}