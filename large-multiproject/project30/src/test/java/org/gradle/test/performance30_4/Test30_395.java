package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_395 {
    private final Production30_395 production = new Production30_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}