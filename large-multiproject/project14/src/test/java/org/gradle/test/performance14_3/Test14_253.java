package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_253 {
    private final Production14_253 production = new Production14_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}