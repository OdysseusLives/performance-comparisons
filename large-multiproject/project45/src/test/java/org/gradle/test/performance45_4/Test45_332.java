package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_332 {
    private final Production45_332 production = new Production45_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}