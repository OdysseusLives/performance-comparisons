package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_285 {
    private final Production66_285 production = new Production66_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}