package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_474 {
    private final Production60_474 production = new Production60_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}