package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_448 {
    private final Production51_448 production = new Production51_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}