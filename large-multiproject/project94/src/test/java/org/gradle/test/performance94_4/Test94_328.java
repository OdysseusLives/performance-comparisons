package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_328 {
    private final Production94_328 production = new Production94_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}