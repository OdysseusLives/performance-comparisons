package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_445 {
    private final Production87_445 production = new Production87_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}