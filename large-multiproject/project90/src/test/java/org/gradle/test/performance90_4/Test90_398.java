package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_398 {
    private final Production90_398 production = new Production90_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}