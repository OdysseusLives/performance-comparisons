package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_287 {
    private final Production74_287 production = new Production74_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}