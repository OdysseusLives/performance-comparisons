package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_301 {
    private final Production79_301 production = new Production79_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}