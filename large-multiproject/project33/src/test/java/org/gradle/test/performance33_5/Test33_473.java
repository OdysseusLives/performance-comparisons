package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_473 {
    private final Production33_473 production = new Production33_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}