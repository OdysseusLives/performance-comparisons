package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_58 {
    private final Production66_58 production = new Production66_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}