package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_500 {
    private final Production69_500 production = new Production69_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}