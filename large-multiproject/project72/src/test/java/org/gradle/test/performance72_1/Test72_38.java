package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_38 {
    private final Production72_38 production = new Production72_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}