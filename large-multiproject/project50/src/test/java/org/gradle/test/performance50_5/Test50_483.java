package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_483 {
    private final Production50_483 production = new Production50_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}