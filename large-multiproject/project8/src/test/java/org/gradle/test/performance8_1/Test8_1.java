package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_1 {
    private final Production8_1 production = new Production8_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}