package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_457 {
    private final Production56_457 production = new Production56_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}