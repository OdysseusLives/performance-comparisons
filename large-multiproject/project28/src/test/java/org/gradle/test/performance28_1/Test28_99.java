package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_99 {
    private final Production28_99 production = new Production28_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}