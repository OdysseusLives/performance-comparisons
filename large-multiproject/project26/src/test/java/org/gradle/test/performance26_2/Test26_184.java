package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_184 {
    private final Production26_184 production = new Production26_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}