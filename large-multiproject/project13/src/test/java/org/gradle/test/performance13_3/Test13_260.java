package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_260 {
    private final Production13_260 production = new Production13_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}