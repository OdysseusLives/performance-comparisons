package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_265 {
    private final Production69_265 production = new Production69_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}