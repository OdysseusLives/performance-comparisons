package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_290 {
    private final Production62_290 production = new Production62_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}