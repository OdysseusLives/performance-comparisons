package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_480 {
    private final Production26_480 production = new Production26_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}