package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_171 {
    private final Production70_171 production = new Production70_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}