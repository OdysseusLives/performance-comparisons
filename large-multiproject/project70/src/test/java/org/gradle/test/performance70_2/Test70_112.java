package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_112 {
    private final Production70_112 production = new Production70_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}