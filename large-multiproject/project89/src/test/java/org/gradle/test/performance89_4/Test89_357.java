package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_357 {
    private final Production89_357 production = new Production89_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}