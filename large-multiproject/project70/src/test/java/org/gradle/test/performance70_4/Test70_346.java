package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_346 {
    private final Production70_346 production = new Production70_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}