package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_156 {
    private final Production14_156 production = new Production14_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}