package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_163 {
    private final Production69_163 production = new Production69_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}