package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_440 {
    private final Production97_440 production = new Production97_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}