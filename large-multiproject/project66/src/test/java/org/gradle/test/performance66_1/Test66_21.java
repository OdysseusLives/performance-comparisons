package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_21 {
    private final Production66_21 production = new Production66_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}