package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_465 {
    private final Production83_465 production = new Production83_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}