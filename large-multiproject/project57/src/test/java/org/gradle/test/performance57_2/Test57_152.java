package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_152 {
    private final Production57_152 production = new Production57_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}