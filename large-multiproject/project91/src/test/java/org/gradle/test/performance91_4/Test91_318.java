package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_318 {
    private final Production91_318 production = new Production91_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}