package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_84 {
    private final Production39_84 production = new Production39_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}