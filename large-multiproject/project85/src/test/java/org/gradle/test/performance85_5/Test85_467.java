package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_467 {
    private final Production85_467 production = new Production85_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}