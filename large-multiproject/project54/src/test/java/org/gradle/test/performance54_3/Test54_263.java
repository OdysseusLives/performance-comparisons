package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_263 {
    private final Production54_263 production = new Production54_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}