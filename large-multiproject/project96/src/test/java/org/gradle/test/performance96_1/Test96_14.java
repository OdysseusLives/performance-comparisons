package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_14 {
    private final Production96_14 production = new Production96_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}