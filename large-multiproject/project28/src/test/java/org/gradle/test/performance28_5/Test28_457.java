package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_457 {
    private final Production28_457 production = new Production28_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}