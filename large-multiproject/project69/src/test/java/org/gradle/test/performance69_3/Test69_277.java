package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_277 {
    private final Production69_277 production = new Production69_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}