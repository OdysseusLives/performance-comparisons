package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_330 {
    private final Production26_330 production = new Production26_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}