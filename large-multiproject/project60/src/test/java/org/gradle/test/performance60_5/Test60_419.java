package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_419 {
    private final Production60_419 production = new Production60_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}