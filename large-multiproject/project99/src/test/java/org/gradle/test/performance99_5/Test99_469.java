package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_469 {
    private final Production99_469 production = new Production99_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}