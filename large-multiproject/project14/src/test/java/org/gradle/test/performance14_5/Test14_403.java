package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_403 {
    private final Production14_403 production = new Production14_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}