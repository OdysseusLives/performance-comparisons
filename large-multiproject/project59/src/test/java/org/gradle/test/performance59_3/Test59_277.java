package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_277 {
    private final Production59_277 production = new Production59_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}