package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_381 {
    private final Production97_381 production = new Production97_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}