package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_46 {
    private final Production70_46 production = new Production70_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}