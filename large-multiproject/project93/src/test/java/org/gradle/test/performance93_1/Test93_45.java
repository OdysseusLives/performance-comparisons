package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_45 {
    private final Production93_45 production = new Production93_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}