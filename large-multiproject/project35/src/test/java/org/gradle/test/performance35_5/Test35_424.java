package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_424 {
    private final Production35_424 production = new Production35_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}