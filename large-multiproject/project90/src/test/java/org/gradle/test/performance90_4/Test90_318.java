package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_318 {
    private final Production90_318 production = new Production90_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}