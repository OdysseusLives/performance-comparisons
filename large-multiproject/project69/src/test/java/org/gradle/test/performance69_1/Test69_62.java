package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_62 {
    private final Production69_62 production = new Production69_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}