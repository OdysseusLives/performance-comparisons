package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_38 {
    private final Production57_38 production = new Production57_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}