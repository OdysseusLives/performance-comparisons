package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_111 {
    private final Production77_111 production = new Production77_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}