package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_226 {
    private final Production38_226 production = new Production38_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}