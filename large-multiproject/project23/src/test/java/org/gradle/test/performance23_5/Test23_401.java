package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_401 {
    private final Production23_401 production = new Production23_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}