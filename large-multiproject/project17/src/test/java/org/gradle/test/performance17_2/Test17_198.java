package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_198 {
    private final Production17_198 production = new Production17_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}