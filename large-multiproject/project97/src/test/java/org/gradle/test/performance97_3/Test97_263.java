package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_263 {
    private final Production97_263 production = new Production97_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}