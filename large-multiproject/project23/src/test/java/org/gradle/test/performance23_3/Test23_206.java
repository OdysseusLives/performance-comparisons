package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_206 {
    private final Production23_206 production = new Production23_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}