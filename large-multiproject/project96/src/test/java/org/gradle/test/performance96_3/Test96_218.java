package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_218 {
    private final Production96_218 production = new Production96_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}