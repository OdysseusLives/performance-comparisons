package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_26 {
    private final Production46_26 production = new Production46_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}