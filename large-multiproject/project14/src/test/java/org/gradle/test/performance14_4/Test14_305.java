package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_305 {
    private final Production14_305 production = new Production14_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}