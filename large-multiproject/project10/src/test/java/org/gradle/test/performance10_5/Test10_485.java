package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_485 {
    private final Production10_485 production = new Production10_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}