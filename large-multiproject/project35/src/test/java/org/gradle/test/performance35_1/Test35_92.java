package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_92 {
    private final Production35_92 production = new Production35_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}