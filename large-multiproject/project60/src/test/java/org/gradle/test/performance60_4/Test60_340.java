package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_340 {
    private final Production60_340 production = new Production60_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}