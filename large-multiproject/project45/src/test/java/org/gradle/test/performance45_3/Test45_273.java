package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_273 {
    private final Production45_273 production = new Production45_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}