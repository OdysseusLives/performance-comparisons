package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_492 {
    private final Production50_492 production = new Production50_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}