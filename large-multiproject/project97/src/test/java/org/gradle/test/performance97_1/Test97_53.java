package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_53 {
    private final Production97_53 production = new Production97_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}