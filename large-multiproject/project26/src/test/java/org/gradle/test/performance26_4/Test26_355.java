package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_355 {
    private final Production26_355 production = new Production26_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}