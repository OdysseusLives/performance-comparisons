package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_153 {
    private final Production67_153 production = new Production67_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}