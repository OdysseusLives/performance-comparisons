package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_328 {
    private final Production26_328 production = new Production26_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}