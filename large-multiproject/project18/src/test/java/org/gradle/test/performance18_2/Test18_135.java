package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_135 {
    private final Production18_135 production = new Production18_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}