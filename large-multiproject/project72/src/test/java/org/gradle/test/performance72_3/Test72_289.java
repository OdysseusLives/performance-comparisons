package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_289 {
    private final Production72_289 production = new Production72_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}