package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_44 {
    private final Production25_44 production = new Production25_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}