package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_349 {
    private final Production26_349 production = new Production26_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}