package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_259 {
    private final Production98_259 production = new Production98_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}