package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_218 {
    private final Production73_218 production = new Production73_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}