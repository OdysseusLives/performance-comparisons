package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_355 {
    private final Production45_355 production = new Production45_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}