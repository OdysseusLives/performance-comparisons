package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_42 {
    private final Production84_42 production = new Production84_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}