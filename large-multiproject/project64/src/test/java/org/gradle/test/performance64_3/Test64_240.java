package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_240 {
    private final Production64_240 production = new Production64_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}