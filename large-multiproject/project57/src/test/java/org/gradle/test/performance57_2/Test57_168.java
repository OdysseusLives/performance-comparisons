package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_168 {
    private final Production57_168 production = new Production57_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}