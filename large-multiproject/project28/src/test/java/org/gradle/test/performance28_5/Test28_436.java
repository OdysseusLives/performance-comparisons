package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_436 {
    private final Production28_436 production = new Production28_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}