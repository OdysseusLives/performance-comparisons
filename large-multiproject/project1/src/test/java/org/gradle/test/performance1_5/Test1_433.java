package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_433 {
    private final Production1_433 production = new Production1_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}