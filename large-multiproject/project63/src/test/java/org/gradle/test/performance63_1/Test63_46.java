package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_46 {
    private final Production63_46 production = new Production63_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}