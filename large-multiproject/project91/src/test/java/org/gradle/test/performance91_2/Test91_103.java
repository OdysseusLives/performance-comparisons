package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_103 {
    private final Production91_103 production = new Production91_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}