package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_272 {
    private final Production93_272 production = new Production93_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}