package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_221 {
    private final Production94_221 production = new Production94_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}