package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_162 {
    private final Production26_162 production = new Production26_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}