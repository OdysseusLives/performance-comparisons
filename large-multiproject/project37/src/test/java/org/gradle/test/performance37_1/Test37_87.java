package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_87 {
    private final Production37_87 production = new Production37_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}