package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_21 {
    private final Production42_21 production = new Production42_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}