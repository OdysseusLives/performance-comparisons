package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_39 {
    private final Production72_39 production = new Production72_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}