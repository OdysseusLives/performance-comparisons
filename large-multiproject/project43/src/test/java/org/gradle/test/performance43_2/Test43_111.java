package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_111 {
    private final Production43_111 production = new Production43_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}