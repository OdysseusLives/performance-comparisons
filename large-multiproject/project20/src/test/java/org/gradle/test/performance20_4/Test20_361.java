package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_361 {
    private final Production20_361 production = new Production20_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}