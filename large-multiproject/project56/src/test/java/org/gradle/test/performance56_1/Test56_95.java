package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_95 {
    private final Production56_95 production = new Production56_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}