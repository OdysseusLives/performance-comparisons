package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_337 {
    private final Production67_337 production = new Production67_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}