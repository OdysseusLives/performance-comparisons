package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_468 {
    private final Production97_468 production = new Production97_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}