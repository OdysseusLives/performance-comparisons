package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_297 {
    private final Production67_297 production = new Production67_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}