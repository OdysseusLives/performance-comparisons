package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_480 {
    private final Production79_480 production = new Production79_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}