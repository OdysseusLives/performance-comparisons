package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_261 {
    private final Production97_261 production = new Production97_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}