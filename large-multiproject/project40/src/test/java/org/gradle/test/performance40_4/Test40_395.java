package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_395 {
    private final Production40_395 production = new Production40_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}