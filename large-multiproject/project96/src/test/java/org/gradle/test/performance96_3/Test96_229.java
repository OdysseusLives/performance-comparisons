package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_229 {
    private final Production96_229 production = new Production96_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}