package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_67 {
    private final Production93_67 production = new Production93_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}