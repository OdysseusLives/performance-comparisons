package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_413 {
    private final Production26_413 production = new Production26_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}