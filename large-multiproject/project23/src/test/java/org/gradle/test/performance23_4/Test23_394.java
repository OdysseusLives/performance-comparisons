package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_394 {
    private final Production23_394 production = new Production23_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}