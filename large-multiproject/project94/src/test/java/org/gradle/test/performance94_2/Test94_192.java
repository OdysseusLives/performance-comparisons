package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_192 {
    private final Production94_192 production = new Production94_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}