package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_138 {
    private final Production96_138 production = new Production96_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}