package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_376 {
    private final Production59_376 production = new Production59_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}