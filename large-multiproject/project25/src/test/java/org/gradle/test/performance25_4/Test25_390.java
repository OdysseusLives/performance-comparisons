package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_390 {
    private final Production25_390 production = new Production25_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}