package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_256 {
    private final Production63_256 production = new Production63_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}