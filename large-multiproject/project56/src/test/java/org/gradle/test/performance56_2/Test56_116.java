package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_116 {
    private final Production56_116 production = new Production56_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}