package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_40 {
    private final Production40_40 production = new Production40_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}