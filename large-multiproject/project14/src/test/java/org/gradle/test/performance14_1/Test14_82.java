package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_82 {
    private final Production14_82 production = new Production14_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}