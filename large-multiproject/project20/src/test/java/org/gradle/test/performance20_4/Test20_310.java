package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_310 {
    private final Production20_310 production = new Production20_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}