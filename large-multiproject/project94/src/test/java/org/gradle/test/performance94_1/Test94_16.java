package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_16 {
    private final Production94_16 production = new Production94_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}