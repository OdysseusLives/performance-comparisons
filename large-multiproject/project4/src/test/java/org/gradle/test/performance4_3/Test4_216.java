package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_216 {
    private final Production4_216 production = new Production4_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}