package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_182 {
    private final Production35_182 production = new Production35_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}