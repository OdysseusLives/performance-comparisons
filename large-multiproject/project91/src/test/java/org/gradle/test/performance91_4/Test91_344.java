package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_344 {
    private final Production91_344 production = new Production91_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}