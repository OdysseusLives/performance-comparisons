package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_25 {
    private final Production23_25 production = new Production23_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}