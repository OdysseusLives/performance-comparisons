package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_184 {
    private final Production91_184 production = new Production91_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}