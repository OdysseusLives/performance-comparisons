package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_243 {
    private final Production20_243 production = new Production20_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}