package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_110 {
    private final Production50_110 production = new Production50_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}