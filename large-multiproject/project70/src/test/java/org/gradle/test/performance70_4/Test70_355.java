package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_355 {
    private final Production70_355 production = new Production70_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}