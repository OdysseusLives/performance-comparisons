package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_197 {
    private final Production39_197 production = new Production39_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}