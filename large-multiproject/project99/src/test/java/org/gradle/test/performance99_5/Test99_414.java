package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_414 {
    private final Production99_414 production = new Production99_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}