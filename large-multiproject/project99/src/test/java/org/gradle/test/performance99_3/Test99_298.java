package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_298 {
    private final Production99_298 production = new Production99_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}