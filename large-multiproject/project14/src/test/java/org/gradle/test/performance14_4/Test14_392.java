package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_392 {
    private final Production14_392 production = new Production14_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}