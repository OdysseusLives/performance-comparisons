package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_103 {
    private final Production57_103 production = new Production57_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}