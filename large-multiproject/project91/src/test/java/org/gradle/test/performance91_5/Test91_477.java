package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_477 {
    private final Production91_477 production = new Production91_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}