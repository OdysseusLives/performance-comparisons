package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_169 {
    private final Production70_169 production = new Production70_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}