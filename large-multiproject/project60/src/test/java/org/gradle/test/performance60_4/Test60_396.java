package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_396 {
    private final Production60_396 production = new Production60_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}