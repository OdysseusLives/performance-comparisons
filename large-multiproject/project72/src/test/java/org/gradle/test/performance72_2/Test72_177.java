package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_177 {
    private final Production72_177 production = new Production72_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}