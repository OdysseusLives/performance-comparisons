package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_78 {
    private final Production67_78 production = new Production67_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}