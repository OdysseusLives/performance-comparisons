package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_111 {
    private final Production42_111 production = new Production42_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}