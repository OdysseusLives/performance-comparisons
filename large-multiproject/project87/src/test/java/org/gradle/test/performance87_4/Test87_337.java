package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_337 {
    private final Production87_337 production = new Production87_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}