package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_414 {
    private final Production29_414 production = new Production29_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}