package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_420 {
    private final Production38_420 production = new Production38_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}