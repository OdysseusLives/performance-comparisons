package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_176 {
    private final Production61_176 production = new Production61_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}