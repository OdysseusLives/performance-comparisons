package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_126 {
    private final Production47_126 production = new Production47_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}