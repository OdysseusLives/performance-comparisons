package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_226 {
    private final Production5_226 production = new Production5_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}