package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_468 {
    private final Production89_468 production = new Production89_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}