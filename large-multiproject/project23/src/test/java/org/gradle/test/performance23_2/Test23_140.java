package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_140 {
    private final Production23_140 production = new Production23_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}