package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_383 {
    private final Production11_383 production = new Production11_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}