package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_99 {
    private final Production37_99 production = new Production37_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}