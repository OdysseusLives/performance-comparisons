package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_47 {
    private final Production20_47 production = new Production20_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}