package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_149 {
    private final Production45_149 production = new Production45_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}