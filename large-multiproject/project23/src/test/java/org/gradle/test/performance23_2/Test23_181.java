package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_181 {
    private final Production23_181 production = new Production23_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}