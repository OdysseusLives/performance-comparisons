package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_41 {
    private final Production92_41 production = new Production92_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}