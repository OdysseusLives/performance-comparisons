package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_61 {
    private final Production46_61 production = new Production46_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}