package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_284 {
    private final Production74_284 production = new Production74_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}