package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_323 {
    private final Production40_323 production = new Production40_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}