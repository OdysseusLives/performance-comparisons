package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_461 {
    private final Production98_461 production = new Production98_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}