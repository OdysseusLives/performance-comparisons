package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_452 {
    private final Production3_452 production = new Production3_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}