package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_70 {
    private final Production61_70 production = new Production61_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}