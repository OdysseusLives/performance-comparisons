package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_440 {
    private final Production28_440 production = new Production28_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}