package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_299 {
    private final Production36_299 production = new Production36_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}