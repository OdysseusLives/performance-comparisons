package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_396 {
    private final Production26_396 production = new Production26_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}