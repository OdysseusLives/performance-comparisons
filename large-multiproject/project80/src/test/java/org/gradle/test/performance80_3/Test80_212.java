package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_212 {
    private final Production80_212 production = new Production80_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}