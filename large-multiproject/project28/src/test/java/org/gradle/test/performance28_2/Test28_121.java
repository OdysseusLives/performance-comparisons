package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_121 {
    private final Production28_121 production = new Production28_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}