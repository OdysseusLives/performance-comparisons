package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_31 {
    private final Production27_31 production = new Production27_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}