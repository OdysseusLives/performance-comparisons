package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_472 {
    private final Production96_472 production = new Production96_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}