package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_483 {
    private final Production77_483 production = new Production77_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}