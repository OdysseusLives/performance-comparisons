package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_281 {
    private final Production66_281 production = new Production66_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}