package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_463 {
    private final Production70_463 production = new Production70_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}