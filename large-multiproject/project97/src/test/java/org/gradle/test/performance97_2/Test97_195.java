package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_195 {
    private final Production97_195 production = new Production97_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}