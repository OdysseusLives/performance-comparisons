package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_320 {
    private final Production75_320 production = new Production75_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}