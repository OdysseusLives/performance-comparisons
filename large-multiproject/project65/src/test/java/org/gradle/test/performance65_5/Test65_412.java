package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_412 {
    private final Production65_412 production = new Production65_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}