package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_263 {
    private final Production27_263 production = new Production27_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}