package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_428 {
    private final Production99_428 production = new Production99_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}