package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_72 {
    private final Production97_72 production = new Production97_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}