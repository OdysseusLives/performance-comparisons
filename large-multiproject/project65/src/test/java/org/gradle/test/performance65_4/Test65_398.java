package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_398 {
    private final Production65_398 production = new Production65_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}