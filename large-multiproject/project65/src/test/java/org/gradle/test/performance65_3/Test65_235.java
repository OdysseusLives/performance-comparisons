package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_235 {
    private final Production65_235 production = new Production65_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}