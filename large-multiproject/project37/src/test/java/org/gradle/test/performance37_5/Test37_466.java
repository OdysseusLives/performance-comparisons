package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_466 {
    private final Production37_466 production = new Production37_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}