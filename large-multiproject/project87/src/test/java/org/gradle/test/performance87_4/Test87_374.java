package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_374 {
    private final Production87_374 production = new Production87_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}