package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_147 {
    private final Production4_147 production = new Production4_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}