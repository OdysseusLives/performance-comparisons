package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_275 {
    private final Production23_275 production = new Production23_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}