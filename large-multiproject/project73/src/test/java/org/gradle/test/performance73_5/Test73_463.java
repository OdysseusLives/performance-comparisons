package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_463 {
    private final Production73_463 production = new Production73_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}