package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_141 {
    private final Production10_141 production = new Production10_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}