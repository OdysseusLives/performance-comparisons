package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_410 {
    private final Production39_410 production = new Production39_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}